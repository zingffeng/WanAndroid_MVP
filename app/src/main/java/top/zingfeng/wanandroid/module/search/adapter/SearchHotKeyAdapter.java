package top.zingfeng.wanandroid.module.search.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.http.bean.SearchHotKeyBean;

/**
 * @author zingfeng
 * @date On 2021/2/19
 */
public class SearchHotKeyAdapter extends BaseQuickAdapter<SearchHotKeyBean.DataBean, BaseViewHolder> {

    public SearchHotKeyAdapter(int layoutResId, @Nullable List<SearchHotKeyBean.DataBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, SearchHotKeyBean.DataBean dataBean) {
        baseViewHolder.setText(R.id.tv_name, dataBean.getName());
    }
}
