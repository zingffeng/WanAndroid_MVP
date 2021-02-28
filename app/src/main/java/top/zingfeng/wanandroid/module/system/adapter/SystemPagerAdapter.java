package top.zingfeng.wanandroid.module.system.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseFragment;

/**
 * @author zingfeng
 * @date On 2021/2/28
 * 体系模块中ViewPager适配器
 */
public class SystemPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> mBaseFragments;
    private List<String> mTitles;

    public SystemPagerAdapter(@NonNull FragmentManager fm, List<BaseFragment> fragments, List<String> titles) {
        super(fm);
        this.mBaseFragments = fragments;
        this.mTitles = titles;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mBaseFragments.get(position);
    }

    @Override
    public int getCount() {
        return mBaseFragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTitles.get(position);
    }
}
