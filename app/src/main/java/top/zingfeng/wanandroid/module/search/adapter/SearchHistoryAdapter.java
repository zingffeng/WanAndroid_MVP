package top.zingfeng.wanandroid.module.search.adapter;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.http.bean.SearchHistoryBean;

/**
 * @author zingfeng
 * @date On 2021/2/20
 */
public class SearchHistoryAdapter extends BaseQuickAdapter<SearchHistoryBean, BaseViewHolder> {

    public SearchHistoryAdapter(int layoutResId, @Nullable List<SearchHistoryBean> data) {
        super(layoutResId, data);
    }

    @Override
    protected void convert(@NotNull BaseViewHolder baseViewHolder, SearchHistoryBean historyDataBean) {
        baseViewHolder.setText(R.id.tv_search_name, historyDataBean.getName());
    }
}
