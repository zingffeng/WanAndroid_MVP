package top.zingfeng.wanandroid.module.project.view;

import top.zingfeng.wanandroid.http.bean.ProjectBean;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public interface IProjectView {

    /**
     * 设置项目数据
     * @param projectData 数据
     */
    void setProjectData(ProjectBean projectData);

    /**
     * 设置项目数据
     * @param errorMsg 错误数据
     */
    void setProjectErrorData(String errorMsg);
}
