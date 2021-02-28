package top.zingfeng.wanandroid.module.system.model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import top.zingfeng.wanandroid.http.BaseRetrofit;
import top.zingfeng.wanandroid.http.bean.NavigationBean;
import top.zingfeng.wanandroid.http.service.ApiService;
import top.zingfeng.wanandroid.interfaces.DataCallback;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class NavigationModel {

    public static void requestNavigationListData(DataCallback<NavigationBean> callback){
        Call<NavigationBean> navigationList = BaseRetrofit.getRetrofit().create(ApiService.class).getNavigationList();
        navigationList.enqueue(new Callback<NavigationBean>() {
            @Override
            public void onResponse(Call<NavigationBean> call, Response<NavigationBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<NavigationBean> call, Throwable t) {
                callback.onFailure("requestNavigationListData error");
            }
        });
    }
}
