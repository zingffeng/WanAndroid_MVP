package top.zingfeng.wanandroid.module.search.view;

import android.widget.EditText;
import android.widget.ImageView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseActivity;
import top.zingfeng.wanandroid.http.bean.SearchHotKeyBean;
import top.zingfeng.wanandroid.http.bean.SearchQueryDataBean;
import top.zingfeng.wanandroid.module.search.adapter.SearchHotKeyAdapter;
import top.zingfeng.wanandroid.module.search.presenter.SearchPresenter;

/**
 * @author zingfeng
 * @date 2021-03-01
 */
@Route(path = "/module/search/view/SearchActivity")
public class SearchActivity extends BaseActivity implements ISearchView {

    @BindView(R.id.iv_return_last)
    ImageView mIvReturnLast;
    @OnClick(R.id.iv_return_last)
    void clickIvReturnLast(){
        finish();
    }

    @BindView(R.id.et_search_content)
    EditText mEtSearchContent;

    @BindView(R.id.iv_search)
    ImageView mIvSearch;
    @OnClick(R.id.iv_search)
    void clickIvSearch(){
        String content = mEtSearchContent.getText().toString();
        ARouter.getInstance()
                .build("/module/search/view/SearchDetailActivity")
                .withString("titleContent", content)
                .navigation();
    }

    @BindView(R.id.rv_hot_key_search)
    RecyclerView mRvHotKeySearch;
    private SearchHotKeyAdapter mSearchHotKeyAdapter;

    @Override
    protected Integer setResourceId() {
        return R.layout.activity_search;
    }

    @Override
    protected void initConfig() {
        ButterKnife.bind(this);
        ARouter.getInstance().inject(this);
    }

    @Override
    protected void initData() {
        SearchPresenter searchPresenter = new SearchPresenter(this);
        searchPresenter.getHotKeyData();
        setupRvAndAdapter();
    }

    @Override
    protected void initEvent() {

    }

    @Override
    public void setHotKeyData(SearchHotKeyBean hotKeyData) {
        mSearchHotKeyAdapter.setNewInstance(hotKeyData.getData());
        mSearchHotKeyAdapter.setOnItemClickListener((adapter, view, position) -> {
            String content = hotKeyData.getData().get(position).getName();
            ARouter.getInstance()
                    .build("/module/search/view/SearchDetailActivity")
                    .withString("titleContent", content)
                    .navigation();
        });
    }

    @Override
    public void setHotKeyDataError(String error) {

    }

    @Override
    public void setQueryData(SearchQueryDataBean searchQueryDataBean) {

    }

    @Override
    public void setQueryDataError(String error) {

    }

    private void setupRvAndAdapter(){
        GridLayoutManager hotKeyManager = new GridLayoutManager(getBaseContext(), 2);
        mSearchHotKeyAdapter = new SearchHotKeyAdapter(R.layout.item_search_hot_key, null);
        mRvHotKeySearch.setLayoutManager(hotKeyManager);
        mRvHotKeySearch.setAdapter(mSearchHotKeyAdapter);
    }
}