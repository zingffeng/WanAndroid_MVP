package top.zingfeng.wanandroid.module.system.presenter;

import top.zingfeng.wanandroid.http.bean.SystemTreeBean;
import top.zingfeng.wanandroid.interfaces.DataCallback;
import top.zingfeng.wanandroid.module.system.model.SystemTreeModel;
import top.zingfeng.wanandroid.module.system.view.ISystemTreeView;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class SystemTreePresenter {

    private ISystemTreeView miSystemTreeView;

    public SystemTreePresenter(ISystemTreeView iSystemTreeView) {
        this.miSystemTreeView = iSystemTreeView;
    }

    public void getSystemTree(){
        SystemTreeModel.requestSystemTree(new DataCallback<SystemTreeBean>() {
            @Override
            public void onSuccess(SystemTreeBean data) {
                miSystemTreeView.setSystemTree(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miSystemTreeView.setSystemTypeDataError(errorMag);
            }
        });
    }
}
