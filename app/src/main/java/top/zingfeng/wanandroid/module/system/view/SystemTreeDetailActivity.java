package top.zingfeng.wanandroid.module.system.view;

import android.widget.ImageView;
import android.widget.TextView;

import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseActivity;
import top.zingfeng.wanandroid.base.BaseFragment;
import top.zingfeng.wanandroid.http.bean.SystemTreeBean;
import top.zingfeng.wanandroid.module.system.adapter.SystemTreeDetailPagerAdapter;

/**
 * @author zingfeng
 * @date 2021-02-28
 * 二级体系（显示具体内容）
 */
@Route(path = "/module/system/view/SystemTreeDetailActivity")
public class SystemTreeDetailActivity extends BaseActivity {

    @Autowired
    SystemTreeBean.DataBean data;

    @BindView(R.id.tv_title)
    TextView mTvTitle;

    @BindView(R.id.iv_back)
    ImageView mIvBack;
    @OnClick(R.id.iv_back)
    void mIvBackClick(){
        finish();
    }

    @BindView(R.id.tl_system_tree_detail_tab)
    TabLayout mTbSystemTreeDetail;

    @BindView(R.id.vp_system_tree_detail_pager)
    ViewPager mVpSystemTreeDetailPager;

    private SystemTreeDetailPagerAdapter mSystemTreeDetailPagerAdapter;

    @Override
    protected Integer setResourceId() {
        return R.layout.activity_system_tree_detail;
    }

    @Override
    protected void initConfig() {
        ARouter.getInstance().inject(SystemTreeDetailActivity.this);
        ButterKnife.bind(SystemTreeDetailActivity.this);
    }

    @Override
    protected void initData() {
        setToolBarTitle();
        setupTab();
        setupViewPager();
    }

    @Override
    protected void initEvent() {

    }

    /**
     * 设置顶部标题名
     */
    private void setToolBarTitle(){
        mTvTitle.setText(data.getName());
    }

    /**
     * 设置Tab导航栏
     */
    private void setupTab(){
        mTbSystemTreeDetail.setupWithViewPager(mVpSystemTreeDetailPager);
    }

    private void setupViewPager(){
        List<BaseFragment> baseFragments = new ArrayList<>();
        List<String> titles = new ArrayList<>();
        for (int i = 0; i < data.getChildren().size(); i++){
            baseFragments.add(SystemTreeDetailListFragment.newInstance(data.getChildren().get(i)));
            titles.add(data.getChildren().get(i).getName());
        }
        mSystemTreeDetailPagerAdapter = new SystemTreeDetailPagerAdapter(getSupportFragmentManager(), baseFragments, titles);
        mVpSystemTreeDetailPager.setAdapter(mSystemTreeDetailPagerAdapter);
    }
}