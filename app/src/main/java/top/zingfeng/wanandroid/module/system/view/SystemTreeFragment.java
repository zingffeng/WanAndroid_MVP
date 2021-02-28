package top.zingfeng.wanandroid.module.system.view;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.launcher.ARouter;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseFragment;
import top.zingfeng.wanandroid.http.bean.SystemTreeBean;
import top.zingfeng.wanandroid.module.system.adapter.SystemTreeAdapter;
import top.zingfeng.wanandroid.module.system.presenter.SystemTreePresenter;

/**
 * @author zingfeng
 * @date 2021-02-28
 * 体系一级标题Fragment碎片
 */
public class SystemTreeFragment extends BaseFragment implements ISystemTreeView {

    @BindView(R.id.srl_refresh)
    SmartRefreshLayout mSrlRefresh;

    @BindView(R.id.rv_system_tree)
    RecyclerView mRvSystemTree;

    private SystemTreeAdapter mSystemTreeAdapter;

    private SystemTreePresenter mSystemTreePresenter;

    @Override
    protected Integer setResourceId() {
        return R.layout.fragment_system_tree;
    }

    @Override
    protected void initConfig(View view) {
        ButterKnife.bind(this, view);
        initRvAndAdSystemTree();
        setupPullRefresh();
    }

    @Override
    protected void initData() {
        mSystemTreePresenter = new SystemTreePresenter(this);
        mSystemTreePresenter.getSystemTree();
    }

    @Override
    protected void initEvent() {

    }

    /**
     * 初始化体系Rv和适配器
     */
    private void initRvAndAdSystemTree(){
        LinearLayoutManager systemTreeManager = new LinearLayoutManager(getBaseContext());
        systemTreeManager.setOrientation(RecyclerView.VERTICAL);
        mSystemTreeAdapter = new SystemTreeAdapter(R.layout.item_system_tree, null);
        mRvSystemTree.setLayoutManager(systemTreeManager);
        mRvSystemTree.setAdapter(mSystemTreeAdapter);
    }

    private void setupPullRefresh(){
        mSrlRefresh.setRefreshHeader(new MaterialHeader(getBaseContext()));
        mSrlRefresh.setOnRefreshListener(refreshLayout -> mSystemTreePresenter.getSystemTree());
    }

    @Override
    public void setSystemTree(SystemTreeBean systemTreeBean) {
        mSystemTreeAdapter.setNewInstance(systemTreeBean.getData());
        mSystemTreeAdapter.notifyDataSetChanged();
        mSrlRefresh.finishRefresh();
        mSystemTreeAdapter.setOnItemClickListener((adapter, view, position) -> {
            SystemTreeBean.DataBean dataBean = systemTreeBean.getData().get(position);
            ARouter.getInstance()
                    .build("/module/system/view/SystemTreeDetailActivity")
                    .withParcelable("data", dataBean)
                    .navigation();
        });
    }

    @Override
    public void setSystemTypeDataError(String errorMsg) {
        mSrlRefresh.finishRefresh(false);
    }
}