package top.zingfeng.wanandroid.module.project.view;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
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
import top.zingfeng.wanandroid.http.bean.ProjectBean;
import top.zingfeng.wanandroid.http.bean.ProjectListBean;
import top.zingfeng.wanandroid.module.project.adapter.ProjectContentAdapter;
import top.zingfeng.wanandroid.module.project.presenter.ProjectDetailPresenter;

/**
 * @author zingfeng
 * @date 2021-02-26
 */
public class ProjectDetailFragment extends BaseFragment implements IProjectDetailView {

    private static final String ARG_PARAM1 = "param1";
    private ProjectBean.DataBean mDataBean;

    private Integer page = 1;

    @BindView(R.id.srl_refresh)
    SmartRefreshLayout mSrlRefresh;

    @BindView(R.id.rv_project_content)
    RecyclerView mRvProjectContent;
    private ProjectContentAdapter mProjectContentAdapter;

    public ProjectDetailFragment() {
        // Required empty public constructor
    }

    public static ProjectDetailFragment newInstance(ProjectBean.DataBean param1) {
        ProjectDetailFragment fragment = new ProjectDetailFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mDataBean = getArguments().getParcelable(ARG_PARAM1);
        }
    }

    @Override
    protected Integer setResourceId() {
        return R.layout.fragment_project_detail;
    }

    @Override
    protected void initConfig(View view) {
        ButterKnife.bind(this, view);
        setRvAndAdapter();
        setupPullRefresh();
    }

    @Override
    protected void initData() {
        if (mDataBean != null){
            int cid = mDataBean.getId();
            ProjectDetailPresenter projectDetailPresenter = new ProjectDetailPresenter(this);
            projectDetailPresenter.getProjectArticleList(page, cid);
        }
    }

    @Override
    protected void initEvent() {

    }

    @Override
    public void setProjectArticleList(ProjectListBean projectArticleList) {
        mProjectContentAdapter.setOnItemClickListener((adapter, view, position) -> {
            ARouter.getInstance()
                    .build("/module/detail/ArticleDetailActivity")
                    .withString("url",  projectArticleList.getData().getDatas().get(position).getLink() )
                    .withString("title", projectArticleList.getData().getDatas().get(position).getTitle())
                    .navigation();
        });
        mProjectContentAdapter.addData(projectArticleList.getData().getDatas());
        mProjectContentAdapter.notifyDataSetChanged();
        mSrlRefresh.finishRefresh();
        mSrlRefresh.finishLoadMore();
    }

    @Override
    public void setProjectArticleListError(String error) {
        mSrlRefresh.finishRefresh(false);
        mSrlRefresh.finishLoadMore(false);
    }

    private void setRvAndAdapter(){
        LinearLayoutManager projectDetailManager = new LinearLayoutManager(getBaseContext());
        projectDetailManager.setOrientation(RecyclerView.VERTICAL);
        mProjectContentAdapter = new ProjectContentAdapter(R.layout.item_project_content, null);
        mRvProjectContent.setLayoutManager(projectDetailManager);
        mRvProjectContent.setAdapter(mProjectContentAdapter);

    }

    private void setupPullRefresh(){
        mSrlRefresh.setRefreshHeader(new MaterialHeader(getBaseContext()));
        mSrlRefresh.setRefreshFooter(new ClassicsFooter(getBaseContext()));
        mSrlRefresh.setOnRefreshListener(refreshLayout -> {
            if (mDataBean != null){
                int cid = mDataBean.getId();
                page = 1;
                ProjectDetailPresenter projectDetailPresenter = new ProjectDetailPresenter(this);
                projectDetailPresenter.getProjectArticleList(page, cid);
            }
        });
        mSrlRefresh.setOnLoadMoreListener(refreshLayout -> {
            if (mDataBean != null){
                int cid = mDataBean.getId();
                page = page + 1;
                ProjectDetailPresenter projectDetailPresenter = new ProjectDetailPresenter(this);
                projectDetailPresenter.getProjectArticleList(page, cid);
            }
        });
    }
}