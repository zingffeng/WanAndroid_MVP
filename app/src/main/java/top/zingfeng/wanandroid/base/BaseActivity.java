package top.zingfeng.wanandroid.base;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

/**
 * @author zingfeng
 * @date On 2021/2/26
 */
public abstract class BaseActivity extends AppCompatActivity {

    private String TAG = "WanAndroidTAG";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setResourceId());
        Log.d(TAG, "onCreate: " + this.getClass().getSimpleName());
        initConfig();
        initData();
        initEvent();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: " + this.getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: " + this.getClass().getSimpleName());
    }

    /**
     * 设置布局Id
     * @return 返回布局Id
     */
    protected abstract Integer setResourceId();

    /**
     * 初始化配置
     */
    protected abstract void initConfig();

    /**
     * 初始化数据
     */
    protected abstract void initData();

    /**
     * 初始化事件
     */
    protected abstract void initEvent();
}
