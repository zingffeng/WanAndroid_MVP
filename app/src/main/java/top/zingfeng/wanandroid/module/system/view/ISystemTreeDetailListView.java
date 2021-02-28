package top.zingfeng.wanandroid.module.system.view;

import top.zingfeng.wanandroid.http.bean.SystemTreeListBean;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public interface ISystemTreeDetailListView {

    /**
     * 设置体系具体数据文章
     * @param systemTreeList 数据
     */
    void setSystemTreeList(SystemTreeListBean systemTreeList);

    /**
     * 设置体系具体错误数据文章
     * @param errorMsg 错误信息数据
     */
    void setSystemTreeListError(String errorMsg);
}
