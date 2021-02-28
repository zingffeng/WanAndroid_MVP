package top.zingfeng.wanandroid.module.project.view;

import android.view.View;

import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseFragment;
import top.zingfeng.wanandroid.http.bean.ProjectBean;
import top.zingfeng.wanandroid.module.project.adapter.ProjectPagerAdapter;
import top.zingfeng.wanandroid.module.project.presenter.ProjectPresenter;

/**
 * @author zingfeng
 * @date 2021-02-26
 */
public class ProjectFragment extends BaseFragment implements IProjectView {

    @BindView(R.id.tl_project_tab)
    TabLayout mTlProjectTab;

    @BindView(R.id.vp_project_pager)
    ViewPager mVpProjectPager;
    private ProjectPagerAdapter mProjectPagerAdapter;

    @Override
    protected Integer setResourceId() {
        return R.layout.fragment_project;
    }

    @Override
    protected void initConfig(View view) {
        ButterKnife.bind(this, view);
        setupTab();
    }

    @Override
    protected void initData() {
        ProjectPresenter projectPresenter = new ProjectPresenter(this);
        projectPresenter.getProjectData();

    }

    @Override
    protected void initEvent() {

    }

    @Override
    public void setProjectData(ProjectBean projectData) {
        List<ProjectBean.DataBean> data = projectData.getData();
        setupViewPager(data);
    }

    @Override
    public void setProjectErrorData(String errorMsg) {

    }

    private void setupTab(){
        mTlProjectTab.setupWithViewPager(mVpProjectPager);
    }

    private void setupViewPager(List<ProjectBean.DataBean> dataBeans){
        List<BaseFragment> baseFragmentLists = new ArrayList<>();
        List<String> mTitles = new ArrayList<>();
        for (ProjectBean.DataBean dataBean: dataBeans){
            String name = dataBean.getName();
            baseFragmentLists.add(ProjectDetailFragment.newInstance(dataBean));
            mTitles.add(name);
        }
        mProjectPagerAdapter = new ProjectPagerAdapter(getChildFragmentManager(), baseFragmentLists, mTitles);
        mVpProjectPager.setAdapter(mProjectPagerAdapter);
    }
}