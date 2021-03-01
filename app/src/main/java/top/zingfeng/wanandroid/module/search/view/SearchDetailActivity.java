package top.zingfeng.wanandroid.module.search.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseActivity;
import top.zingfeng.wanandroid.http.bean.SearchQueryDataBean;
import top.zingfeng.wanandroid.module.search.adapter.SearchDetailAdapter;
import top.zingfeng.wanandroid.module.search.presenter.SearchDetailPresenter;

/**
 * @author zingfeng
 * @date 2021-03-01
 */
@Route(path = "/module/search/view/SearchDetailActivity")
public class SearchDetailActivity extends BaseActivity implements ISearchDetailView{

    @Autowired
    String titleContent = null;

    @BindView(R.id.iv_return_last)
    ImageView mIvReturnLast;
    @OnClick(R.id.iv_return_last)
    void clickIvReturnLast(){
        finish();
    }

    @BindView(R.id.tv_search_content)
    TextView mTvSearchContent;

    @BindView(R.id.srl_refresh)
    SmartRefreshLayout mSrlRefresh;

    @BindView(R.id.rv_search_detail)
    RecyclerView mRvSearchDetail;

    @BindView(R.id.tv_no_data)
    TextView mTvNoData;

    private SearchDetailPresenter mSearchDetailPresenter;

    private SearchDetailAdapter mSearchDetailAdapter;

    private Integer page = 0;

    @Override
    protected Integer setResourceId() {
        return R.layout.activity_search_detail;
    }

    @Override
    protected void initConfig() {
        ARouter.getInstance().inject(this);
        ButterKnife.bind(this);
    }

    @Override
    protected void initData() {
        mSearchDetailPresenter = new SearchDetailPresenter(this);
        mSearchDetailPresenter.getRequestSearchQueryDetailData(page, titleContent);
        initToolbar();
        setupRvAndAdapter();
        setupPullRefresh();
    }

    @Override
    protected void initEvent() {

    }

    private void initToolbar(){
        if (!titleContent.isEmpty()){
            mTvSearchContent.setText(titleContent);
        }else {
            mTvSearchContent.setText(getText(R.string.search_content));
        }
    }

    private void setupRvAndAdapter(){
        LinearLayoutManager detailManager = new LinearLayoutManager(getBaseContext());
        detailManager.setOrientation(RecyclerView.VERTICAL);
        mSearchDetailAdapter = new SearchDetailAdapter(R.layout.item_search_detail, null);
        mRvSearchDetail.setLayoutManager(detailManager);
        mRvSearchDetail.setAdapter(mSearchDetailAdapter);

    }

    /**
     * 设置下拉刷新和上拉加载
     */
    private void setupPullRefresh(){
        mSrlRefresh.setRefreshHeader(new MaterialHeader(getBaseContext()));
        mSrlRefresh.setRefreshFooter(new ClassicsFooter(getBaseContext()));
        mSrlRefresh.setOnRefreshListener(refreshLayout -> {
           page = 0;
           mSearchDetailPresenter.getRequestSearchQueryDetailData(page, titleContent);
        });
        mSrlRefresh.setOnLoadMoreListener(refreshLayout -> {
            page = page + 1;
            mSearchDetailPresenter.getRequestSearchQueryDetailData(page, titleContent);
        });
    }

    @Override
    public void setSearchQueryDetailData(SearchQueryDataBean searchQueryDetailData) {
        List<SearchQueryDataBean.DataBean.DatasBean> datas = searchQueryDetailData.getData().getDatas();
        if (datas.isEmpty()){
            mSrlRefresh.setVisibility(View.GONE);
            mTvNoData.setVisibility(View.VISIBLE);
        }else {
            mSrlRefresh.setVisibility(View.VISIBLE);
            mTvNoData.setVisibility(View.GONE);
            mSearchDetailAdapter.addData(datas);
            mSearchDetailAdapter.notifyDataSetChanged();
            mSrlRefresh.finishRefresh();
            mSrlRefresh.finishLoadMore();
            mSearchDetailAdapter.setOnItemClickListener((adapter, view, position) -> {
                ARouter.getInstance()
                        .build("/module/detail/ArticleDetailActivity")
                        .withString("url", datas.get(position).getLink())
                        .withString("title", datas.get(position).getTitle())
                        .navigation();
            });
        }
    }

    @Override
    public void setSearchQueryDetailDataError(String errorMsg) {
        mSrlRefresh.finishRefresh(false);
        mSrlRefresh.finishLoadMore(false);
    }
}