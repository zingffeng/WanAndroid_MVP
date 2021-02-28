package top.zingfeng.wanandroid.module.system.view;

import top.zingfeng.wanandroid.http.bean.NavigationBean;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public interface INavigationView {

    /**
     * 设置导航数据
     * @param navigationData 数据
     */
    void setNavigationListData(NavigationBean navigationData);

    /**
     * 设置导航错误数据
     * @param data 错误数据
     */
    void setNavigationListErrorData(String data);
}
