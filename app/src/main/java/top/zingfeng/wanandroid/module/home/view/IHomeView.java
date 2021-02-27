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

    void setBanner(BannerBean bannerBean);

    void setBannerError(String errorMsg);
}
