package top.zingfeng.wanandroid.module.search.model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import top.zingfeng.wanandroid.http.BaseRetrofit;
import top.zingfeng.wanandroid.http.bean.SearchHotKeyBean;
import top.zingfeng.wanandroid.http.service.ApiService;
import top.zingfeng.wanandroid.interfaces.DataCallback;

/**
 * @author zingfeng
 * @date On 2021/3/1
 */
public class SearchModel {

    public static void requestHotKeyData(DataCallback<SearchHotKeyBean> callback){
        Call<SearchHotKeyBean> hotKey = BaseRetrofit.getRetrofit().create(ApiService.class).searchHotKeyList();
        hotKey.enqueue(new Callback<SearchHotKeyBean>() {
            @Override
            public void onResponse(Call<SearchHotKeyBean> call, Response<SearchHotKeyBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<SearchHotKeyBean> call, Throwable t) {
                callback.onFailure("requestHotkeyData error");
            }
        });
    }
}
