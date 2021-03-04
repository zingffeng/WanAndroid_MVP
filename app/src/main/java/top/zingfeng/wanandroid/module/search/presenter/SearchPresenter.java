package top.zingfeng.wanandroid.module.search.presenter;

import top.zingfeng.wanandroid.http.bean.SearchHotKeyBean;
import top.zingfeng.wanandroid.interfaces.DataCallback;
import top.zingfeng.wanandroid.module.search.model.SearchModel;
import top.zingfeng.wanandroid.module.search.view.ISearchView;

/**
 * @author zingfeng
 * @date On 2021/3/1
 */
public class SearchPresenter {

    private ISearchView miSearchView;

    public SearchPresenter(ISearchView iSearchView) {
        miSearchView = iSearchView;
    }

    public void getHotKeyData(){
        SearchModel.requestHotKeyData(new DataCallback<SearchHotKeyBean>() {
            @Override
            public void onSuccess(SearchHotKeyBean data) {
                miSearchView.setHotKeyData(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miSearchView.setHotKeyDataError(errorMag);
            }
        });
    }

    public void getData(){
        SearchModel.requestHotKeyData(new DataCallback<SearchHotKeyBean>() {
            @Override
            public void onSuccess(SearchHotKeyBean data) {
                miSearchView.setHotKeyData(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miSearchView.setHotKeyDataError(errorMag);
            }
        });
    }
}
