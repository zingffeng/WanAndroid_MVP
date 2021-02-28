package top.zingfeng.wanandroid.module.system.view;

import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseFragment;
import top.zingfeng.wanandroid.http.bean.SystemTreeBean;
import top.zingfeng.wanandroid.http.bean.SystemTreeListBean;
import top.zingfeng.wanandroid.module.system.adapter.SystemArticleListAdapter;
import top.zingfeng.wanandroid.module.system.presenter.SystemTreeDetailListPresenter;

/**
 * @author zingfeng
 * @date 2021-02-28
 * 二级体系下的具体文章内容清单
 */
public class SystemTreeDetailListFragment extends BaseFragment implements ISystemTreeDetailListView {

    private Integer page = 0;
    /**
     * 传递的参数
     */
    private static final String ARG_PARAM1 = "param1";
    private SystemTreeBean.DataBean.ChildrenBean mChildrenBeanParam;

    private SystemTreeDetailListPresenter mSystemTreeDetailListPresenter;

    @BindView(R.id.rv_system_article)
    RecyclerView mRvSystemArticle;

    @BindView(R.id.srl_refresh)
    SmartRefreshLayout mSrlRefresh;

    private SystemArticleListAdapter mSystemArticleAdapter;

    public SystemTreeDetailListFragment(){}

    public static SystemTreeDetailListFragment newInstance(SystemTreeBean.DataBean.ChildrenBean param1){
        SystemTreeDetailListFragment fragment = new SystemTreeDetailListFragment();
        Bundle args = new Bundle();
        args.putParcelable(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mChildrenBeanParam = getArguments().getParcelable(ARG_PARAM1);
        }
    }

    @Override
    protected Integer setResourceId() {
        return R.layout.fragment_system_tree_detail_list;
    }

    @Override
    protected void initConfig(View view) {
        ButterKnife.bind(this, view);
        initRvAndAdapter();
    }

    @Override
    protected void initData() {
        if (mChildrenBeanParam != null){
            int cid = mChildrenBeanParam.getId();
            mSystemTreeDetailListPresenter = new SystemTreeDetailListPresenter(this);
            mSystemTreeDetailListPresenter.getSystemTreeList(page, cid);
        }
    }

    @Override
    protected void initEvent() {
        setupPullRefresh();
    }

    /**
     * 初始化Rv和适配器
     */
    private void initRvAndAdapter(){
        LinearLayoutManager treeDetailManager = new LinearLayoutManager(getBaseContext());
        treeDetailManager.setOrientation(RecyclerView.VERTICAL);
        mSystemArticleAdapter = new SystemArticleListAdapter(R.layout.item_system_article, null);
        mRvSystemArticle.setLayoutManager(treeDetailManager);
        mRvSystemArticle.setAdapter(mSystemArticleAdapter);
    }

    private void setupPullRefresh(){
        mSrlRefresh.setRefreshHeader(new MaterialHeader(getBaseContext()));
        mSrlRefresh.setRefreshFooter(new ClassicsFooter(getBaseContext()));
        mSrlRefresh.setOnRefreshListener(refreshLayout -> {
            if (mChildrenBeanParam != null){
                page = 0;
                int cid = mChildrenBeanParam.getId();
                mSystemTreeDetailListPresenter = new SystemTreeDetailListPresenter(this);
                mSystemTreeDetailListPresenter.getSystemTreeList(page, cid);
            }
        });
        mSrlRefresh.setOnLoadMoreListener(refreshLayout -> {
            if (mChildrenBeanParam != null){
                page = page + 1;
                int cid = mChildrenBeanParam.getId();
                mSystemTreeDetailListPresenter = new SystemTreeDetailListPresenter(this);
                mSystemTreeDetailListPresenter.getSystemTreeList(page, cid);
            }
        });
    }

    @Override
    public void setSystemTreeList(SystemTreeListBean systemTreeList) {
        mSystemArticleAdapter.addData(systemTreeList.getData().getDatas());
        mSrlRefresh.finishRefresh();
        mSrlRefresh.finishLoadMore();
    }

    @Override
    public void setSystemTreeListError(String errorMsg) {
        mSrlRefresh.finishRefresh(false);
        mSrlRefresh.finishLoadMore(false);
    }
}