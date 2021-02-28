package top.zingfeng.wanandroid.module.square.presenter;

import top.zingfeng.wanandroid.http.bean.SquareArticleBean;
import top.zingfeng.wanandroid.interfaces.DataCallback;
import top.zingfeng.wanandroid.module.home.view.IHomeView;
import top.zingfeng.wanandroid.module.square.model.SquareModel;
import top.zingfeng.wanandroid.module.square.view.ISquareView;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class SquarePresenter {

    private ISquareView miSquareView;

    public SquarePresenter(ISquareView miSquareView) {
        this.miSquareView = miSquareView;
    }

    public void getSquareArticle(Integer page){
        SquareModel.requestSquareArticle(page, new DataCallback<SquareArticleBean>() {
            @Override
            public void onSuccess(SquareArticleBean data) {
                miSquareView.setSquareArticle(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miSquareView.setSquareArticleError(errorMag);
            }
        });
    }
}
