package top.zingfeng.wanandroid.module.system.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;

/**
 * @author zingfeng
 * @date On 2021/2/21
 */
public class NavigationTypeAdapter extends BaseQuickAdapter<String, BaseViewHolder> {

    private Integer mPosition = 0;

    public NavigationTypeAdapter(int layoutResId, @Nullable List<String> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, String s) {
        baseViewHolder.setText(R.id.tv_type, s);
        int adapterPosition = baseViewHolder.getAdapterPosition();
        if (mPosition == adapterPosition){
            baseViewHolder.setBackgroundResource(R.id.ll_nav_item, R.color.white);
        }else {
            baseViewHolder.setBackgroundResource(R.id.ll_nav_item, R.color.gray);
        }
    }

    public void setPosition(Integer position) {
        this.mPosition = position;
    }
}
