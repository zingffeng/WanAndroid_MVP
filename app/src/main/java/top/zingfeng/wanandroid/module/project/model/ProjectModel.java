package top.zingfeng.wanandroid.module.project.model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import top.zingfeng.wanandroid.http.BaseRetrofit;
import top.zingfeng.wanandroid.http.bean.ProjectBean;
import top.zingfeng.wanandroid.http.service.ApiService;
import top.zingfeng.wanandroid.interfaces.DataCallback;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class ProjectModel {

    public static void requestProjectData(DataCallback<ProjectBean> callback){
        Call<ProjectBean> projectData = BaseRetrofit.getRetrofit().create(ApiService.class).projectData();
        projectData.enqueue(new Callback<ProjectBean>() {
            @Override
            public void onResponse(Call<ProjectBean> call, Response<ProjectBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<ProjectBean> call, Throwable t) {
                callback.onFailure("requestProjectData error");
            }
        });
    }
}
