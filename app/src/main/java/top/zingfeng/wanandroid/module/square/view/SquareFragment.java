package top.zingfeng.wanandroid.module.square.view;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseFragment;
import top.zingfeng.wanandroid.http.bean.SquareArticleBean;
import top.zingfeng.wanandroid.module.square.adapter.SquareArticleAdapter;
import top.zingfeng.wanandroid.module.square.presenter.SquarePresenter;

/**
 * @author zingfeng
 * @date 2021-02-26
 */
public class SquareFragment extends BaseFragment implements ISquareView{

    @BindView(R.id.srl_refresh)
    SmartRefreshLayout mSrlRefresh;

    @BindView(R.id.rv_square_article)
    RecyclerView mRvSquareArticle;

    private SquareArticleAdapter mSquareArticleAdapter;

    private Integer page = 0;
    private SquarePresenter mSquarePresenter;

    @Override
    protected Integer setResourceId() {
        return R.layout.fragment_square;
    }

    @Override
    protected void initConfig(View view) {
        ButterKnife.bind(this, view);
        initRvAndAdSquareArticle();
    }

    @Override
    protected void initData() {
        mSquarePresenter = new SquarePresenter(this);
        mSquarePresenter.getSquareArticle(page);
    }

    @Override
    protected void initEvent() {
        setupPullRefreshEvent();
    }

    /**
     * 初始化Rv和适配器
     */
    private void initRvAndAdSquareArticle(){
        LinearLayoutManager squareArticle = new LinearLayoutManager(getBaseContext());
        squareArticle.setOrientation(RecyclerView.VERTICAL);
        mSquareArticleAdapter = new SquareArticleAdapter(R.layout.item_square_article, null);
        mRvSquareArticle.setLayoutManager(squareArticle);
        mRvSquareArticle.setAdapter(mSquareArticleAdapter);
    }

    /**
     * 设置下拉刷新控件
     */
    private void setupPullRefreshEvent(){
        mSrlRefresh.setRefreshHeader(new MaterialHeader(getBaseContext()));
        mSrlRefresh.setRefreshFooter(new ClassicsFooter(getBaseContext()));
        mSrlRefresh.setOnRefreshListener(refreshLayout -> {
            page = 0;
            mSquarePresenter.getSquareArticle(page);
        });
        mSrlRefresh.setOnLoadMoreListener(refreshLayout -> {
            page = page + 1;
            mSquarePresenter.getSquareArticle(page);
        });
    }

    @Override
    public void setSquareArticle(SquareArticleBean squareArticle) {
        mSquareArticleAdapter.addData(squareArticle.getData().getDatas());
        mSquareArticleAdapter.notifyDataSetChanged();
        mSrlRefresh.finishRefresh();
        mSrlRefresh.finishLoadMore();
        mSquareArticleAdapter.setOnItemClickListener((adapter, view, position) -> {
            ARouter.getInstance()
                    .build("/module/detail/ArticleDetailActivity")
                    .withString("url", squareArticle.getData().getDatas().get(position).getLink())
                    .withString("title", squareArticle.getData().getDatas().get(position).getTitle())
                    .navigation();
        });
    }

    @Override
    public void setSquareArticleError(String errorMsg) {
        mSrlRefresh.finishRefresh(false);
        mSrlRefresh.finishLoadMore(false);
    }
}