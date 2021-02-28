package top.zingfeng.wanandroid.module.square.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.http.bean.SquareArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/12
 */
public class SquareArticleAdapter extends BaseQuickAdapter<SquareArticleBean.DataBean.DatasBean, BaseViewHolder> {

    public SquareArticleAdapter(int layoutResId, @Nullable List<SquareArticleBean.DataBean.DatasBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, SquareArticleBean.DataBean.DatasBean datasBean) {
        String author = datasBean.getAuthor();
        String shareUser = datasBean.getShareUser();
        String title = datasBean.getTitle();
        String sort = datasBean.getChapterName() + " / " + datasBean.getSuperChapterName();
        String time = datasBean.getNiceDate();
        boolean fresh = datasBean.isFresh();
        List<?> tags = datasBean.getTags();
        baseViewHolder.setGone(R.id.tv_top, true);
        if (fresh){
            baseViewHolder.setVisible(R.id.tv_new, true);
        }else {
            baseViewHolder.setGone(R.id.tv_new, true);
        }
        if (!tags.isEmpty()){
            baseViewHolder.setVisible(R.id.tv_published_site, true);
        }
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
