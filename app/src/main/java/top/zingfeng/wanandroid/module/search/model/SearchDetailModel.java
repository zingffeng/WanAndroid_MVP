package top.zingfeng.wanandroid.module.search.model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import top.zingfeng.wanandroid.http.BaseRetrofit;
import top.zingfeng.wanandroid.http.bean.SearchQueryDataBean;
import top.zingfeng.wanandroid.http.service.ApiService;
import top.zingfeng.wanandroid.interfaces.DataCallback;

/**
 * @author zingfeng
 * @date On 2021/3/1
 */
public class SearchDetailModel {

    public static void requestSearchQueryDetailData(Integer page, String keyword, DataCallback<SearchQueryDataBean> callback){
        Call<SearchQueryDataBean> searchQueryData = BaseRetrofit.getRetrofit().create(ApiService.class).searchQueryData(page, keyword);
        searchQueryData.enqueue(new Callback<SearchQueryDataBean>() {
            @Override
            public void onResponse(Call<SearchQueryDataBean> call, Response<SearchQueryDataBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<SearchQueryDataBean> call, Throwable t) {
                callback.onFailure("requestSearchQueryDetailData error");
            }
        });
    }
}
