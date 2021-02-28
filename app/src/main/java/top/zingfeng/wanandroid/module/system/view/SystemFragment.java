package top.zingfeng.wanandroid.module.system.view;

import android.view.View;

import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseFragment;
import top.zingfeng.wanandroid.module.system.adapter.SystemPagerAdapter;

/**
 * @author zingfeng
 * @date 2021-02-26
 */
public class SystemFragment extends BaseFragment {

    @BindView(R.id.tl_system_tab)
    TabLayout mTlSystemTab;

    @BindView(R.id.vp_system_pager)
    ViewPager mVpSystemPager;

    private SystemTreeFragment mSystemTreeFragment;
    private SystemNavigationFragment mSystemNavigationFragment;
    private FragmentTransaction mFragmentTransaction;

    @Override
    protected Integer setResourceId() {
        return R.layout.fragment_system;
    }

    @Override
    protected void initConfig(View view) {
        ButterKnife.bind(this, view);
        initTwoFragment();
        setupTab();
        setupViewPagerAdapter();
    }

    @Override
    protected void initData() {
        //initFirstFragment();
    }

    @Override
    protected void initEvent() {
        setupTabEvent();
    }

    /**
     * 初始化两个fragment
     */
    private void initTwoFragment(){
        mSystemTreeFragment = new SystemTreeFragment();
        mSystemNavigationFragment = new SystemNavigationFragment();
    }

    /**
     * 设置ViewPager适配器
     */
    private void setupViewPagerAdapter(){
        List<BaseFragment> baseFragments = new ArrayList<>();
        baseFragments.add(mSystemTreeFragment);
        baseFragments.add(mSystemNavigationFragment);
        List<String> mTitles = new ArrayList<>();
        mTitles.add(getText(R.string.system).toString());
        mTitles.add(getText(R.string.navigation).toString());
        SystemPagerAdapter systemPagerAdapter = new SystemPagerAdapter(getChildFragmentManager(), baseFragments, mTitles);
        mVpSystemPager.setAdapter(systemPagerAdapter);
    }

    /**
     * 当tab未进行任何点击事件时，默认显示第一个Fragment
     */
    private void initFirstFragment(){
        mFragmentTransaction = getChildFragmentManager().beginTransaction();
        if (!mSystemTreeFragment.isAdded()){
            mFragmentTransaction.add(R.id.fl_content, mSystemTreeFragment, "systemTypeFragment");
        }
        mFragmentTransaction.show(mSystemTreeFragment);
        mFragmentTransaction.hide(mSystemNavigationFragment);
        mFragmentTransaction.commit();
    }

    /**
     * 设置Tab导航栏
     */
    private void setupTab(){
        mTlSystemTab.setupWithViewPager(mVpSystemPager);
    }

    /**
     * 设置Tab导航栏事件
     */
    private void setupTabEvent(){
        mTlSystemTab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                mVpSystemPager.setCurrentItem(tab.getPosition());
                switch (tab.getPosition()) {
                    case 0:
//                        mSystemTypeFragment = new SystemTypeFragment();
//                        mFragmentTransaction = getChildFragmentManager().beginTransaction();
//                        if (!mSystemTypeFragment.isAdded()) {
//                            mFragmentTransaction.add(R.id.fl_content, mSystemTypeFragment, "systemTypeFragment");
//                        }
//                        mFragmentTransaction.show(mSystemTypeFragment);
//                        mFragmentTransaction.hide(mSystemNavigationFragment);
//                        mFragmentTransaction.commit();

                        break;
                    case 1:
//                        mSystemNavigationFragment = new SystemNavigationFragment();
//                        mFragmentTransaction = getChildFragmentManager().beginTransaction();
//                        if (!mSystemNavigationFragment.isAdded()) {
//                            mFragmentTransaction.add(R.id.fl_content, mSystemNavigationFragment, "systemNavigationFragment");
//                        }
//                        mFragmentTransaction.show(mSystemNavigationFragment);
//                        mFragmentTransaction.hide(mSystemTypeFragment);
//                        mFragmentTransaction.commit();

                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}