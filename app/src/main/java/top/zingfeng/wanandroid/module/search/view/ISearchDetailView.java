package top.zingfeng.wanandroid.module.search.view;

import top.zingfeng.wanandroid.http.bean.SearchQueryDataBean;

/**
 * @author zingfeng
 * @date On 2021/3/1
 */
public interface ISearchDetailView {

    /**
     * 设置查询具体数据
     * @param searchQueryDetailData 数据
     */
    void setSearchQueryDetailData(SearchQueryDataBean searchQueryDetailData);

    /**
     * 设置查询具体错误数据
     * @param errorMsg 数据
     */
    void setSearchQueryDetailDataError(String errorMsg);
}
