package top.zingfeng.wanandroid.module.project.model;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import top.zingfeng.wanandroid.http.BaseRetrofit;
import top.zingfeng.wanandroid.http.bean.ProjectListBean;
import top.zingfeng.wanandroid.http.service.ApiService;
import top.zingfeng.wanandroid.interfaces.DataCallback;

/**
 * @author zingfeng
 * @date On 2021/3/1
 */
public class ProjectDetailModel {

    public static void requestProjectArticleList(Integer page, Integer cid, DataCallback<ProjectListBean> callback){
        Call<ProjectListBean> projectList = BaseRetrofit.getRetrofit().create(ApiService.class).projectArticleListData(page, cid);
        projectList.enqueue(new Callback<ProjectListBean>() {
            @Override
            public void onResponse(Call<ProjectListBean> call, Response<ProjectListBean> response) {
                callback.onSuccess(response.body());
            }

            @Override
            public void onFailure(Call<ProjectListBean> call, Throwable t) {
                callback.onFailure("requestProjectArticleList error");
            }
        });
    }
}
