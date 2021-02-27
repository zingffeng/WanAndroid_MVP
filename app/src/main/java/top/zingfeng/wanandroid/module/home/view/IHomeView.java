package top.zingfeng.wanandroid.module.home.view;

import top.zingfeng.wanandroid.http.bean.BannerBean;
import top.zingfeng.wanandroid.http.bean.NormalArticleBean;
import top.zingfeng.wanandroid.http.bean.TopArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/27
 */
public interface IHomeView {

    /**
     * 设置首页顶置数据
     * @param topArticleBean 数据
     */
    void setHomeTopArticle(TopArticleBean topArticleBean);

    /**
     * 设置首页顶置数据错误消息
     * @param errorMsg 数据
     */
    void setHomeTopArticleError(String errorMsg);

    /**
     * 设置首页正常数据
     * @param normalArticle 数据
     */
    void setHomeNormalArticle(NormalArticleBean normalArticle);

    /**
     * 设置首页正常数据错误消息
     * @param errorMsg 数据
     */
    void setHomeNormalArticleError(String errorMsg);

    /**
     * 设置轮播图数据
     * @param bannerBean 数据
     */
    void setBanner(BannerBean bannerBean);

    /**
     * 设置轮播图失败数据
     * @param errorMsg 数据
     */
    void setBannerError(String errorMsg);
}
