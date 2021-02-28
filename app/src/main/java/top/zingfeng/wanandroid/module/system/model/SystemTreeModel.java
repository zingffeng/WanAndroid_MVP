package top.zingfeng.wanandroid.module.system.model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import top.zingfeng.wanandroid.http.BaseRetrofit;
import top.zingfeng.wanandroid.http.bean.SystemTreeBean;
import top.zingfeng.wanandroid.http.service.ApiService;
import top.zingfeng.wanandroid.interfaces.DataCallback;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class SystemTreeModel {

    public static void requestSystemTree(DataCallback<SystemTreeBean> callback){
        Call<SystemTreeBean> systemTree = BaseRetrofit.getRetrofit().create(ApiService.class).systemTree();
        systemTree.enqueue(new Callback<SystemTreeBean>() {
            @Override
            public void onResponse(Call<SystemTreeBean> call, Response<SystemTreeBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<SystemTreeBean> call, Throwable t) {
                callback.onFailure("requestSystemTree error");
            }
        });
    }
}
