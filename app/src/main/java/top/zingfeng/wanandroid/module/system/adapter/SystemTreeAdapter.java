package top.zingfeng.wanandroid.module.system.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.http.bean.SystemTreeBean;

/**
 * @author zingfeng
 * @date On 2021/2/14
 * 体系标题适配器
 */
public class SystemTreeAdapter extends BaseQuickAdapter<SystemTreeBean.DataBean, BaseViewHolder> {

    public SystemTreeAdapter(int layoutResId, @Nullable List<SystemTreeBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, SystemTreeBean.DataBean systemBean) {
        StringBuilder content = new StringBuilder();
        for (SystemTreeBean.DataBean.ChildrenBean childrenBean: systemBean.getChildren()){
            String name = childrenBean.getName();
            content.append(name).append("    ");
        }
        baseViewHolder.setText(R.id.tv_title, systemBean.getName());
        baseViewHolder.setText(R.id.tv_content, content.toString());
    }
}
