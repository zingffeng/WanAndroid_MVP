package top.zingfeng.wanandroid.base;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * @author zingfeng
 * @date On 2021/2/26
 */
public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //打印日志
        ARouter.openLog();

        //开启调试
        ARouter.openDebug();

        //初始化
        ARouter.init(this);
    }
}
