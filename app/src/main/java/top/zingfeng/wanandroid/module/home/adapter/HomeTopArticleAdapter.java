package top.zingfeng.wanandroid.module.home.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.http.bean.TopArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/10
 */
public class HomeTopArticleAdapter extends BaseQuickAdapter<TopArticleBean.DataBean, BaseViewHolder> {

    public HomeTopArticleAdapter(int layoutResId, @Nullable List<TopArticleBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, TopArticleBean.DataBean dataBean) {
        String author = dataBean.getAuthor();
        String shareUser = dataBean.getShareUser();
        String title = dataBean.getTitle();
        String sort = dataBean.getChapterName() + " / " + dataBean.getSuperChapterName();
        String time = dataBean.getNiceDate();
        boolean fresh = dataBean.isFresh();
        List<?> tags = dataBean.getTags();
        if (fresh){
            baseViewHolder.setVisible(R.id.tv_new, true);
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
