package top.zingfeng.wanandroid.module.home.presenter;

import top.zingfeng.wanandroid.http.bean.BannerBean;
import top.zingfeng.wanandroid.http.bean.NormalArticleBean;
import top.zingfeng.wanandroid.interfaces.DataCallback;
import top.zingfeng.wanandroid.module.home.model.HomeModel;
import top.zingfeng.wanandroid.module.home.view.IHomeView;
import top.zingfeng.wanandroid.http.bean.TopArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/27
 */
public class HomePresenter  {

    private IHomeView miHomeView;

    public HomePresenter(IHomeView iHomeView) {
        this.miHomeView = iHomeView;
    }

    /**
     * 获取首页顶置文章
     */
    public void getHomeTopArticle(){
        HomeModel.requestTopArticle(new DataCallback<TopArticleBean>() {
            @Override
            public void onSuccess(TopArticleBean data) {
                miHomeView.setHomeTopArticle(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miHomeView.setHomeTopArticleError(errorMag);
            }
        });
    }

    /**
     * 获取首页普通文章
     * @param page 页数
     */
    public void getHomeNormalArticle(Integer page){
        HomeModel.requestNormalArticle(page, new DataCallback<NormalArticleBean>() {
            @Override
            public void onSuccess(NormalArticleBean data) {
                miHomeView.setHomeNormalArticle(data);
            }

            @Override
            public void onFailure(String errorMag) {

            }
        });
    }

    /**
     * 获取轮播数据
     */
    public void getHomeBanner(){
        HomeModel.requestBannerData(new DataCallback<BannerBean>() {
            @Override
            public void onSuccess(BannerBean data) {
                miHomeView.setBanner(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miHomeView.setBannerError(errorMag);
            }
        });
    }
}
