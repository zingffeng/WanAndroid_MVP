package top.zingfeng.wanandroid.http.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import top.zingfeng.wanandroid.http.bean.BannerBean;
import top.zingfeng.wanandroid.http.bean.NormalArticleBean;
import top.zingfeng.wanandroid.http.bean.SquareArticleBean;
import top.zingfeng.wanandroid.http.bean.TopArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/9
 */
public interface ApiService {

    /**
     * 请求首页文章
     * @param page 页码
     * @return 返回请求数据
     */
    @GET(value = "/article/list/{page}/json")
    Call<NormalArticleBean> homeNormalArticle(@Path(value = "page") Integer page);

    /**
     * 请求首页顶置文章
     * @return 返回请求数据
     */
    @GET(value = "/article/top/json")
    Call<TopArticleBean> homeTopArticle();

    /**
     * 请求首页轮播
     * @return 返回请求数据
     */
    @GET(value = "/banner/json")
    Call<BannerBean> bannerData();

    /**
     * 请求首页文章
     * @param page 页码
     * @return 返回请求数据
     */
    @GET(value = "/user_article/list/{page}/json")
    Call<SquareArticleBean> squareArticle(@Path(value = "page") Integer page);
}
