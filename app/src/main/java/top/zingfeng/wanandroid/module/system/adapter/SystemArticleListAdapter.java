package top.zingfeng.wanandroid.module.system.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.http.bean.SystemTreeListBean;

/**
 * @author zingfeng
 * @date On 2021/2/16
 */
public class SystemArticleListAdapter extends BaseQuickAdapter<SystemTreeListBean.DataBean.DatasBean, BaseViewHolder> {

    public SystemArticleListAdapter(int layoutResId, @Nullable List<SystemTreeListBean.DataBean.DatasBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, SystemTreeListBean.DataBean.DatasBean datasBean) {
        String author = datasBean.getAuthor();
        String shareUser = datasBean.getShareUser();
        String title = datasBean.getTitle();
        String sort = datasBean.getChapterName() + " / " + datasBean.getSuperChapterName();
        String time = datasBean.getNiceDate();
        if (author.isEmpty()){
            baseViewHolder.setGone(R.id.ll_author, true);
            baseViewHolder.setVisible(R.id.ll_share, true);
        }else {
            baseViewHolder.setVisible(R.id.ll_author, true);
            baseViewHolder.setGone(R.id.ll_share, true);
        }
        baseViewHolder.setText(R.id.tv_sharer, shareUser);
        baseViewHolder.setText(R.id.tv_author, author);
        baseViewHolder.setText(R.id.tv_title, title);
        baseViewHolder.setText(R.id.tv_sort, sort);
        baseViewHolder.setText(R.id.tv_time, time);
    }
}
