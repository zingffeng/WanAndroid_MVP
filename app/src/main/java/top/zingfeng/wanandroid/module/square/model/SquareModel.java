package top.zingfeng.wanandroid.module.square.model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import top.zingfeng.wanandroid.http.BaseRetrofit;
import top.zingfeng.wanandroid.http.bean.BannerBean;
import top.zingfeng.wanandroid.http.bean.SquareArticleBean;
import top.zingfeng.wanandroid.http.service.ApiService;
import top.zingfeng.wanandroid.interfaces.DataCallback;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class SquareModel {

    public static void requestSquareArticle(Integer page, DataCallback<SquareArticleBean> callback){
        Call<SquareArticleBean> banner = BaseRetrofit.getRetrofit().create(ApiService.class).squareArticle(page);
        banner.enqueue(new Callback<SquareArticleBean>() {
            @Override
            public void onResponse(Call<SquareArticleBean> call, Response<SquareArticleBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<SquareArticleBean> call, Throwable t) {
                callback.onFailure("requestSquareArticle error");
            }
        });
    }
}
