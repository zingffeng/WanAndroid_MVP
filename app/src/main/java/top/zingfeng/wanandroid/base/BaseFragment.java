package top.zingfeng.wanandroid.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/**
 * @author zingfeng
 * @date On 2021/2/27
 */
public abstract class BaseFragment extends Fragment {

    private Context mContext;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(setResourceId(), container, false);
        initConfig(view);
        initData();
        initEvent();
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mContext = context;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mContext = null;
    }

    public Context getBaseContext() {
        return mContext;
    }

    /**
     * 设置布局Id
     * @return 返回布局Id
     */
    protected abstract Integer setResourceId();

    /**
     * 初始化配置
     * @param view
     */
    protected abstract void initConfig(View view);

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 初始化事件
     */
    protected abstract void initEvent();
}
