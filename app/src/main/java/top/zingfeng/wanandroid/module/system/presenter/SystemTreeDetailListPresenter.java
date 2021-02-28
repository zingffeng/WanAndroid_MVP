package top.zingfeng.wanandroid.module.system.presenter;

import top.zingfeng.wanandroid.http.bean.SystemTreeListBean;
import top.zingfeng.wanandroid.interfaces.DataCallback;
import top.zingfeng.wanandroid.module.system.model.SystemTreeDetailListModel;
import top.zingfeng.wanandroid.module.system.view.ISystemTreeDetailListView;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public class SystemTreeDetailListPresenter {

    private ISystemTreeDetailListView miSystemTreeDetailListView;

    public SystemTreeDetailListPresenter(ISystemTreeDetailListView iSystemTreeDetailListView) {
        this.miSystemTreeDetailListView = iSystemTreeDetailListView;
    }

    public void getSystemTreeList(Integer page, Integer cid){
        SystemTreeDetailListModel.requestSystemTree(page, cid, new DataCallback<SystemTreeListBean>() {
            @Override
            public void onSuccess(SystemTreeListBean data) {
                miSystemTreeDetailListView.setSystemTreeList(data);
            }

            @Override
            public void onFailure(String errorMag) {
                miSystemTreeDetailListView.setSystemTreeListError(errorMag);
            }
        });
    }
}
