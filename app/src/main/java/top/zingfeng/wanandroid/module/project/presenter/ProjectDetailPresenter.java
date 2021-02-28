package top.zingfeng.wanandroid.module.project.presenter;

import top.zingfeng.wanandroid.http.bean.ProjectListBean;
import top.zingfeng.wanandroid.interfaces.DataCallback;
import top.zingfeng.wanandroid.module.project.model.ProjectDetailModel;
import top.zingfeng.wanandroid.module.project.view.IProjectDetailView;

/**
 * @author zingfeng
 * @date On 2021/3/1
 */
public class ProjectDetailPresenter {

    private IProjectDetailView miProjectDetailView;

    public ProjectDetailPresenter(IProjectDetailView iProjectDetailView) {
        this.miProjectDetailView = iProjectDetailView;
    }

    public void getProjectArticleList(Integer page, Integer cid){
        ProjectDetailModel.requestProjectArticleList(page, cid, new DataCallback<ProjectListBean>() {
            @Override
            public void onSuccess(ProjectListBean data) {
                miProjectDetailView.setProjectArticleList(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miProjectDetailView.setProjectArticleListError(errorMag);
            }
        });
    }
}
