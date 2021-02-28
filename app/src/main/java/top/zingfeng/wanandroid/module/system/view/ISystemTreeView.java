package top.zingfeng.wanandroid.module.system.view;

import top.zingfeng.wanandroid.http.bean.SystemTreeBean;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public interface ISystemTreeView {

    /**
     * 设置系统类型数据
     * @param systemTreeBean 数据
     */
    void setSystemTree(SystemTreeBean systemTreeBean);

    /**
     * 设置系统类型错误信息数据
     */
    void setSystemTypeDataError(String errorMsg);
}
