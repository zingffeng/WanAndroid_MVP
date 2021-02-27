package top.zingfeng.wanandroid.module.home.view;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.bumptech.glide.Glide;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;
import com.youth.banner.Banner;
import com.youth.banner.adapter.BannerImageAdapter;
import com.youth.banner.holder.BannerImageHolder;
import com.youth.banner.indicator.CircleIndicator;

import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseFragment;
import top.zingfeng.wanandroid.http.bean.BannerBean;
import top.zingfeng.wanandroid.http.bean.NormalArticleBean;
import top.zingfeng.wanandroid.http.bean.TopArticleBean;
import top.zingfeng.wanandroid.module.home.adapter.HomeNormalArticleAdapter;
import top.zingfeng.wanandroid.module.home.adapter.HomeTopArticleAdapter;
import top.zingfeng.wanandroid.module.home.presenter.HomePresenter;

/**
 * @author zingfeng
 * @date 2021-02-26
 */
public class HomeFragment extends BaseFragment implements IHomeView {

    @BindView(R.id.srl_refresh)
    SmartRefreshLayout mSmartRefreshLayout;

    @BindView(R.id.home_banner)
    Banner mBanner;

    @BindView(R.id.rv_top_article)
    RecyclerView mRvTopArticle;

    @BindView(R.id.rv_normal_article)
    RecyclerView mRvNormalArticle;

    private HomeTopArticleAdapter mTopArticleAdapter;
    private HomeNormalArticleAdapter mNormalArticleAdapter;

    private Integer page = 0;

    private HomePresenter mHomePresenter;

    @Override
    protected Integer setResourceId() {
        return R.layout.fragment_home;
    }

    @Override
    protected void initConfig(View view) {
        ButterKnife.bind(this, view);
        initRvTopArticle();
        initRvNormalArticle();
    }

    @Override
    protected void initData() {
        mHomePresenter = new HomePresenter(this);
        mHomePresenter.getHomeTopArticle();
        mHomePresenter.getHomeNormalArticle(page);
        mHomePresenter.getHomeBanner();
    }

    @Override
    protected void initEvent() {
        setupPullRefresh();
    }

    /**
     * 初始化顶置Adapter适配器和RecyclerView
     */
    private void initRvTopArticle(){
        LinearLayoutManager topManager = new LinearLayoutManager(getBaseContext());
        topManager.setOrientation(RecyclerView.VERTICAL);
        mTopArticleAdapter = new HomeTopArticleAdapter(R.layout.item_home_top_article, null);
        mRvTopArticle.setLayoutManager(topManager);
        mRvTopArticle.setAdapter(mTopArticleAdapter);
    }

    /**
     * 初始化顶置Adapter适配器和RecyclerView
     */
    private void initRvNormalArticle(){
        LinearLayoutManager normalManager = new LinearLayoutManager(getBaseContext());
        normalManager.setOrientation(RecyclerView.VERTICAL);
        mNormalArticleAdapter = new HomeNormalArticleAdapter(R.layout.item_home_normal_article, null);
        mRvNormalArticle.setLayoutManager(normalManager);
        mRvNormalArticle.setAdapter(mNormalArticleAdapter);
    }

    /**
     * 设置下拉刷新控件
     */
    private void setupPullRefresh(){
        mSmartRefreshLayout.setRefreshHeader(new MaterialHeader(getBaseContext()));
        mSmartRefreshLayout.setRefreshFooter(new ClassicsFooter(getBaseContext()));
        mSmartRefreshLayout.setOnRefreshListener(refreshLayout -> {
            mHomePresenter.getHomeTopArticle();
            mHomePresenter.getHomeNormalArticle(page);
        });
        mSmartRefreshLayout.setOnLoadMoreListener(refreshLayout -> {
            mHomePresenter.getHomeNormalArticle(page);
        });
    }

    @Override
    public void setHomeTopArticle(TopArticleBean topArticleBean) {
        page = 0;
        mTopArticleAdapter.setNewInstance(topArticleBean.getData());
        mTopArticleAdapter.notifyDataSetChanged();
        mSmartRefreshLayout.finishRefresh();
        mSmartRefreshLayout.finishLoadMore();
    }

    @Override
    public void setHomeTopArticleError(String msg) {
        mSmartRefreshLayout.finishRefresh(false);
        mSmartRefreshLayout.finishLoadMore(false);
    }

    @Override
    public void setHomeNormalArticle(NormalArticleBean normalArticle) {
        page = page + 1;
        mNormalArticleAdapter.addData(normalArticle.getData().getDatas());
        mNormalArticleAdapter.notifyDataSetChanged();
        mSmartRefreshLayout.finishRefresh();
        mSmartRefreshLayout.finishLoadMore();
    }

    @Override
    public void setHomeNormalArticleError(String errorMsg) {
        mSmartRefreshLayout.finishRefresh(false);
        mSmartRefreshLayout.finishLoadMore(false);
    }

    @Override
    public void setBanner(BannerBean bannerBean) {
        mBanner.setAdapter(new BannerImageAdapter<BannerBean.DataBean>(bannerBean.getData()) {
            @Override
            public void onBindView(BannerImageHolder holder, BannerBean.DataBean data, int position, int size) {
                holder.imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                //图片加载自己实现
                Glide.with(holder.itemView)
                        .load(data.getImagePath())
                        .into(holder.imageView);
//                mBanner.setOnBannerListener((data1, position) -> {
//                    ARouter.getInstance()
//                            .build("/view/ArticleDetailActivity")
//                            .withString("title", response.body().getData().get(position1).getTitle())
//                            .withString("url", response.body().getData().get(position1).getUrl())
//                            .navigation();
//                });
            }
        }).addBannerLifecycleObserver(getViewLifecycleOwner()) //添加生命周期观察者
                .setIndicator(new CircleIndicator(getBaseContext()));;
    }

    @Override
    public void setBannerError(String errorMsg) {

    }
}