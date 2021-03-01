package top.zingfeng.wanandroid.module.search.presenter;

import top.zingfeng.wanandroid.http.bean.SearchQueryDataBean;
import top.zingfeng.wanandroid.interfaces.DataCallback;
import top.zingfeng.wanandroid.module.search.model.SearchDetailModel;
import top.zingfeng.wanandroid.module.search.view.ISearchDetailView;

/**
 * @author zingfeng
 * @date On 2021/3/1
 */
public class SearchDetailPresenter {

    private ISearchDetailView miSearchDetailView;

    public SearchDetailPresenter(ISearchDetailView miSearchDetailView) {
        this.miSearchDetailView = miSearchDetailView;
    }

    public void getRequestSearchQueryDetailData(Integer page, String keyword){
        SearchDetailModel.requestSearchQueryDetailData(page, keyword, new DataCallback<SearchQueryDataBean>() {
            @Override
            public void onSuccess(SearchQueryDataBean data) {
                miSearchDetailView.setSearchQueryDetailData(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miSearchDetailView.setSearchQueryDetailDataError(errorMag);
            }
        });
    }
}
