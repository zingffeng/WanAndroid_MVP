package top.zingfeng.wanandroid.module.system.presenter;

import top.zingfeng.wanandroid.http.bean.NavigationBean;
import top.zingfeng.wanandroid.interfaces.DataCallback;
import top.zingfeng.wanandroid.module.system.model.NavigationModel;
import top.zingfeng.wanandroid.module.system.view.INavigationView;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class NavigationPresenter {

    private INavigationView miNavigationView;

    public NavigationPresenter(INavigationView mNavigationView) {
        this.miNavigationView = mNavigationView;
    }

    public void getRequestNavigationListData(){
        NavigationModel.requestNavigationListData(new DataCallback<NavigationBean>() {
            @Override
            public void onSuccess(NavigationBean data) {
                miNavigationView.setNavigationListData(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miNavigationView.setNavigationListErrorData(errorMag);
            }
        });
    }
}
