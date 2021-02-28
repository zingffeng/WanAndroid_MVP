package top.zingfeng.wanandroid.module.system.view;

import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseFragment;
import top.zingfeng.wanandroid.http.bean.NavigationBean;
import top.zingfeng.wanandroid.module.system.adapter.NavigationDetailAdapter;
import top.zingfeng.wanandroid.module.system.adapter.NavigationTypeAdapter;
import top.zingfeng.wanandroid.module.system.presenter.NavigationPresenter;

/**
 * @author zingfeng
 * @date 2021-02-28
 */
public class SystemNavigationFragment extends BaseFragment implements INavigationView {

    @BindView(R.id.rv_nav_type)
    RecyclerView mRvNavType;
    @BindView(R.id.rv_nav_detail)
    RecyclerView mRvNavDetail;

    private NavigationTypeAdapter mNavigationTypeAdapter;
    private NavigationDetailAdapter mNavigationDetailAdapter;

    @Override
    protected Integer setResourceId() {
        return R.layout.fragment_system_navigation;
    }

    @Override
    protected void initConfig(View view) {
        ButterKnife.bind(this, view);
        initRvAndAdapter();
    }

    @Override
    protected void initData() {
        NavigationPresenter navigationPresenter = new NavigationPresenter(this);
        navigationPresenter.getRequestNavigationListData();
    }

    @Override
    protected void initEvent() {
        leftSideClickEvent();
    }

    /**
     * 初始化Rv和适配器
     */
    private void initRvAndAdapter(){
        LinearLayoutManager typeManager = new LinearLayoutManager(getBaseContext());
        typeManager.setOrientation(RecyclerView.VERTICAL);
        mNavigationTypeAdapter = new NavigationTypeAdapter(R.layout.item_navigation_type, null);
        mRvNavType.setLayoutManager(typeManager);
        mRvNavType.setAdapter(mNavigationTypeAdapter);

        LinearLayoutManager detailManager = new LinearLayoutManager(getBaseContext());
        detailManager.setOrientation(RecyclerView.VERTICAL);
        mNavigationDetailAdapter = new NavigationDetailAdapter(R.layout.item_navigation_detail, null);
        mRvNavDetail.setLayoutManager(detailManager);
        mRvNavDetail.setAdapter(mNavigationDetailAdapter);
    }

    /**
     * 左侧导航栏点击事件
     */
    private void leftSideClickEvent(){
        mNavigationTypeAdapter.setOnItemClickListener((adapter, view, position) -> {
            mNavigationTypeAdapter.setPosition(position);
            mNavigationTypeAdapter.notifyDataSetChanged();
            mRvNavDetail.smoothScrollToPosition(position);
        });
    }

    @Override
    public void setNavigationListData(NavigationBean navigationData) {
        List<String> types = new ArrayList<>();
        List<NavigationBean.DataBean> data = navigationData.getData();
        for (NavigationBean.DataBean dataBean: data){
            types.add(dataBean.getName());
        }
        mNavigationTypeAdapter.setNewInstance(types);
        mNavigationDetailAdapter.setNewInstance(navigationData.getData());
    }

    @Override
    public void setNavigationListErrorData(String data) {

    }
}