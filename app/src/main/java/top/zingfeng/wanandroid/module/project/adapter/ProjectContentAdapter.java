package top.zingfeng.wanandroid.module.project.adapter;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.http.bean.ProjectListBean;

/**
 * @author zingfeng
 * @date On 2021/2/16
 */
public class ProjectContentAdapter extends BaseQuickAdapter<ProjectListBean.DataBean.DatasBean, BaseViewHolder> {

    public ProjectContentAdapter(int layoutResId, @Nullable List<ProjectListBean.DataBean.DatasBean> datasBeans) {
        super(layoutResId, datasBeans);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, ProjectListBean.DataBean.DatasBean datasBean) {
        Glide.with(getContext()).load(datasBean.getEnvelopePic()).centerCrop().into((ImageView) baseViewHolder.getView(R.id.iv_pic));
        baseViewHolder.setText(R.id.tv_title, datasBean.getTitle());
        baseViewHolder.setText(R.id.tv_desc, datasBean.getDesc());
        baseViewHolder.setText(R.id.tv_author, datasBean.getAuthor());
        baseViewHolder.setText(R.id.tv_date, datasBean.getNiceDate());
    }
}
