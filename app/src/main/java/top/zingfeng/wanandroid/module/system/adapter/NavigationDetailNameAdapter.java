package top.zingfeng.wanandroid.module.system.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.http.bean.NavigationBean;

/**
 * @author zingfeng
 * @date On 2021/2/21
 */
public class NavigationDetailNameAdapter extends BaseQuickAdapter<NavigationBean.DataBean.ArticlesBean, BaseViewHolder> {

    public NavigationDetailNameAdapter(int layoutResId, @Nullable List<NavigationBean.DataBean.ArticlesBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, NavigationBean.DataBean.ArticlesBean articlesBean) {
        baseViewHolder.setText(R.id.tv_type_name, articlesBean.getTitle());
    }
}
