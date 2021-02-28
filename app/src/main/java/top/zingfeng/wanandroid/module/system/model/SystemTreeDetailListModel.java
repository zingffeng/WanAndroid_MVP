package top.zingfeng.wanandroid.module.system.model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import top.zingfeng.wanandroid.http.BaseRetrofit;
import top.zingfeng.wanandroid.http.bean.SystemTreeBean;
import top.zingfeng.wanandroid.http.bean.SystemTreeListBean;
import top.zingfeng.wanandroid.http.service.ApiService;
import top.zingfeng.wanandroid.interfaces.DataCallback;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class SystemTreeDetailListModel {

    public static void requestSystemTree(Integer page, Integer cid, DataCallback<SystemTreeListBean> callback){
        Call<SystemTreeListBean> systemTreeBeanCall = BaseRetrofit.getRetrofit().create(ApiService.class).systemTreeList(page, cid);
        systemTreeBeanCall.enqueue(new Callback<SystemTreeListBean>() {
            @Override
            public void onResponse(Call<SystemTreeListBean> call, Response<SystemTreeListBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<SystemTreeListBean> call, Throwable t) {
                callback.onFailure("requestSystemTree error");
            }
        });
    }
}
