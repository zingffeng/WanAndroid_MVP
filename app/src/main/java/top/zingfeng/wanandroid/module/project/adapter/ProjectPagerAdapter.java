package top.zingfeng.wanandroid.module.project.adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import top.zingfeng.wanandroid.base.BaseFragment;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class ProjectPagerAdapter extends FragmentPagerAdapter {

    private List<BaseFragment> mBaseFragments;
    private List<String> mTitles;

    public ProjectPagerAdapter(@NonNull FragmentManager fm, List<BaseFragment> baseFragments, List<String> titles) {
        super(fm);
        this.mBaseFragments = baseFragments;
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
