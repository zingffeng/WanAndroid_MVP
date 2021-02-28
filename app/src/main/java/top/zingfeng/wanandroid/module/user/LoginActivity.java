package top.zingfeng.wanandroid.module.user;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseActivity;

/**
 * @author zingfeng
 * @date On 2021/2/26
 */
@Route(path = "/module/user/view/LoginActivity")
public class LoginActivity extends BaseActivity {

    @Override
    protected Integer setResourceId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initConfig() {
        ARouter.getInstance().inject(LoginActivity.this);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }
}