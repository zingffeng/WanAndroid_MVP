package top.zingfeng.wanandroid.ui;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseActivity;
import top.zingfeng.wanandroid.module.home.view.HomeFragment;
import top.zingfeng.wanandroid.module.project.view.ProjectFragment;
import top.zingfeng.wanandroid.module.square.view.SquareFragment;
import top.zingfeng.wanandroid.module.system.view.SystemFragment;

/**
 * @author zingfeng
 * @date 2021-02-26
 */
public class MainActivity extends BaseActivity {

    @BindView(R.id.nv_side_view)
    NavigationView mNvSideView;

    @BindView(R.id.dl_layout)
    DrawerLayout mDlLayout;

    @BindView(R.id.iv_side_nav)
    ImageView mIvSideNav;

    @BindView(R.id.tv_nav_title)
    TextView mTvNavTitle;

    @BindView(R.id.bnv_nav)
    BottomNavigationView mBnvNav;

    private FragmentTransaction mFragmentTransaction;
    private HomeFragment mHomeFragment;
    private SquareFragment mSquareFragment;
    private SystemFragment mSystemFragment;
    private ProjectFragment mProjectFragment;

    @OnClick(R.id.iv_side_nav)
    void mIvSideNavClick(){
        mDlLayout.openDrawer(GravityCompat.START);
    }

    @Override
    protected Integer setResourceId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initConfig() {
        ButterKnife.bind(MainActivity.this);
        ARouter.getInstance().inject(MainActivity.this);
    }

    @Override
    protected void initData() {
        initFragment();
        showDefaultFragment();
    }

    @Override
    protected void initEvent() {
        bottomNavigationItemListener();
    }

    /**
     * 初始化四个碎片
     */
    private void initFragment(){
        mHomeFragment = new HomeFragment();
        mSquareFragment = new SquareFragment();
        mSystemFragment = new SystemFragment();
        mProjectFragment = new ProjectFragment();
    }

    /**
     * 当未执行任何底部点击事件时，展示默认首页碎片Fragment
     */
    private void showDefaultFragment(){
        mHomeFragment = new HomeFragment();
        mFragmentTransaction = getSupportFragmentManager().beginTransaction();
        if (!mHomeFragment.isAdded()){
            mFragmentTransaction.add(R.id.fl_content, mHomeFragment, "homeFragment");
        }
        mFragmentTransaction.show(mHomeFragment);
        mFragmentTransaction.commit();
    }

    /**
     * 底部导航栏的监听事件
     */
    private void bottomNavigationItemListener(){
        mBnvNav.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()){
                case R.id.menu_home:
                    mTvNavTitle.setText(getText(R.string.home));
                    mFragmentTransaction = getSupportFragmentManager().beginTransaction();
                    if (!mHomeFragment.isAdded()){
                        mFragmentTransaction.add(R.id.fl_content, mHomeFragment, "HomeFragment");
                    }
                    mFragmentTransaction.show(mHomeFragment);
                    mFragmentTransaction.hide(mSquareFragment);
                    mFragmentTransaction.hide(mSystemFragment);
                    mFragmentTransaction.hide(mProjectFragment);
                    mFragmentTransaction.commit();
                    break;
                case R.id.menu_square:
                    mFragmentTransaction = getSupportFragmentManager().beginTransaction();
                    if (!mSquareFragment.isAdded()){
                        mFragmentTransaction.add(R.id.fl_content, mSquareFragment, "SquareFragment");
                    }
                    mFragmentTransaction.show(mSquareFragment);
                    mFragmentTransaction.hide(mHomeFragment);
                    mFragmentTransaction.hide(mSystemFragment);
                    mFragmentTransaction.hide(mProjectFragment);
                    mFragmentTransaction.commit();
                    mTvNavTitle.setText(getText(R.string.square));
                    break;
                case R.id.menu_system:
                    mTvNavTitle.setText(getText(R.string.system));
                    mFragmentTransaction = getSupportFragmentManager().beginTransaction();
                    if (!mSystemFragment.isAdded()){
                        mFragmentTransaction.add(R.id.fl_content, mSystemFragment, "SystemFragment");
                    }
                    mFragmentTransaction.show(mSystemFragment);
                    mFragmentTransaction.hide(mHomeFragment);
                    mFragmentTransaction.hide(mSquareFragment);
                    mFragmentTransaction.hide(mProjectFragment);
                    mFragmentTransaction.commit();
                    break;
                case R.id.menu_project:
                    mTvNavTitle.setText(getText(R.string.project));
                    mFragmentTransaction = getSupportFragmentManager().beginTransaction();
                    if (!mProjectFragment.isAdded()){
                        mFragmentTransaction.add(R.id.fl_content, mProjectFragment, "ProjectFragment");
                    }
                    mFragmentTransaction.show(mProjectFragment);
                    mFragmentTransaction.hide(mSystemFragment);
                    mFragmentTransaction.hide(mSquareFragment);
                    mFragmentTransaction.hide(mHomeFragment);
                    mFragmentTransaction.commit();
                default:
                    break;
            }
            return true;
        });
    }
}