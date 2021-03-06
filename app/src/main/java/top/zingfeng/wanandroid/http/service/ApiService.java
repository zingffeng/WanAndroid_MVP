package top.zingfeng.wanandroid.http.service;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import top.zingfeng.wanandroid.http.bean.BannerBean;
import top.zingfeng.wanandroid.http.bean.SearchHotKeyBean;
import top.zingfeng.wanandroid.http.bean.NavigationBean;
import top.zingfeng.wanandroid.http.bean.NormalArticleBean;
import top.zingfeng.wanandroid.http.bean.ProjectBean;
import top.zingfeng.wanandroid.http.bean.ProjectListBean;
import top.zingfeng.wanandroid.http.bean.SearchQueryDataBean;
import top.zingfeng.wanandroid.http.bean.SquareArticleBean;
import top.zingfeng.wanandroid.http.bean.SystemTreeListBean;
import top.zingfeng.wanandroid.http.bean.SystemTreeBean;
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

    /**
     * 请求体系数据
     * @return 返回请求数据
     */
    @GET(value = "/tree/json")
    Call<SystemTreeBean> systemTree();

    /**
     * 请求具体体系下的文章
     * @param page 页码
     * @param cid cid
     * @return 返回请求数据
     */
    @GET(value = "/article/list/{page}/json/")
    Call<SystemTreeListBean> systemTreeList(@Path(value = "page") Integer page, @Query(value = "cid") Integer cid);

    /**
     * 请求导航数据
     * @return 返回请求数据
     */
    @GET(value = "/navi/json")
    Call<NavigationBean> navigationList();

    /**
     * 请求项目数据
     * @return 返回数据
     */
    @GET(value = "/project/tree/json")
    Call<ProjectBean> projectData();

    /**
     * 请求项目文章具体数据
     * @param page 页数
     * @param cid cid
     * @return 返回数据
     */
    @GET(value = "/project/list/{page}/json")
    Call<ProjectListBean> projectArticleListData(@Path(value = "page") Integer page, @Query(value = "cid") Integer cid);

    /**
     * 请求热门搜索
     * @return 返回数据
     */
    @GET(value = "/hotkey/json")
    Call<SearchHotKeyBean> searchHotKeyList();

    /**
     * 搜索关键词
     * @param page 页数
     * @param k 字段
     * @return 数据
     */
    @POST(value = "/article/query/{page}/json")
    Call<SearchQueryDataBean> searchQueryData(@Path(value = "page") Integer page, @Query(value = "k") String k);
}
