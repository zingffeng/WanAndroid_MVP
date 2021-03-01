package top.zingfeng.wanandroid.module.search.view;

import top.zingfeng.wanandroid.http.bean.SearchHotKeyBean;
import top.zingfeng.wanandroid.http.bean.SearchQueryDataBean;

/**
 * @author zingfeng
 * @date On 2021/3/1
 */
public interface ISearchView {

    /**
     * 设置热搜数据
     */
    void setHotKeyData(SearchHotKeyBean hotKeyData);

    /**
     * 设置热搜错误数据
     */
    void setHotKeyDataError(String error);

    /**
     * 设置搜索数据
     */
    void setQueryData(SearchQueryDataBean searchQueryDataBean);

    /**
     * 设置搜索错误数据
     */
    void setQueryDataError(String error);
}
