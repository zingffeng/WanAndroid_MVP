package top.zingfeng.wanandroid.module.project.view;

import top.zingfeng.wanandroid.http.bean.ProjectListBean;

/**
 * @author zingfeng
 * @date On 2021/3/1
 */
public interface IProjectDetailView {

    /**
     * 设置项目数据文章数据
     * @param projectArticleList 数据
     */
    void setProjectArticleList(ProjectListBean projectArticleList);

    /**
     * 设置项目数据文章数据
     * @param error 数据
     */
    void setProjectArticleListError(String error);
}
