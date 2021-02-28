package top.zingfeng.wanandroid.module.project.presenter;

import top.zingfeng.wanandroid.http.bean.ProjectBean;
import top.zingfeng.wanandroid.interfaces.DataCallback;
import top.zingfeng.wanandroid.module.project.model.ProjectModel;
import top.zingfeng.wanandroid.module.project.view.IProjectView;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class ProjectPresenter {

    private IProjectView miProjectView;

    public ProjectPresenter(IProjectView iProjectView) {
        miProjectView = iProjectView;
    }

    public void getProjectData(){
        ProjectModel.requestProjectData(new DataCallback<ProjectBean>() {
            @Override
            public void onSuccess(ProjectBean data) {
                miProjectView.setProjectData(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miProjectView.setProjectErrorData(errorMag);
            }
        });
    }
}
