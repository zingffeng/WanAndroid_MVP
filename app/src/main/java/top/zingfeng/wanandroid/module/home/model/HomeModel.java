package top.zingfeng.wanandroid.module.home.model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import top.zingfeng.wanandroid.http.BaseRetrofit;
import top.zingfeng.wanandroid.http.bean.BannerBean;
import top.zingfeng.wanandroid.http.bean.NormalArticleBean;
import top.zingfeng.wanandroid.http.service.ApiService;
import top.zingfeng.wanandroid.http.bean.TopArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/27
 */
public class HomeModel {

    public static void requestTopArticle(DataCallback<TopArticleBean> callback){
        Call<TopArticleBean> homeTopArticle = BaseRetrofit.getRetrofit().create(ApiService.class).homeTopArticle();
        homeTopArticle.enqueue(new Callback<TopArticleBean>() {
            @Override
            public void onResponse(Call<TopArticleBean> call, Response<TopArticleBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<TopArticleBean> call, Throwable t) {
                callback.onFailure("error top article");
            }
        });
    }

    public static void requestNormalArticle(Integer page, DataCallback<NormalArticleBean> callback){
        Call<NormalArticleBean> homeNormalArticle = BaseRetrofit.getRetrofit().create(ApiService.class).homeNormalArticle(page);
        homeNormalArticle.enqueue(new Callback<NormalArticleBean>() {
            @Override
            public void onResponse(Call<NormalArticleBean> call, Response<NormalArticleBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<NormalArticleBean> call, Throwable t) {
                callback.onFailure("error normal article");
            }
        });
    }

    public static void requestBannerData(DataCallback<BannerBean> callback){
        Call<BannerBean> bannerBean = BaseRetrofit.getRetrofit().create(ApiService.class).bannerData();
        bannerBean.enqueue(new Callback<BannerBean>() {
            @Override
            public void onResponse(Call<BannerBean> call, Response<BannerBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<BannerBean> call, Throwable t) {
                callback.onFailure("error banner data");
            }
        });
    }
}
