package top.zingfeng.wanandroid.module.search.view;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseActivity;
import top.zingfeng.wanandroid.http.bean.SearchHistoryBean;
import top.zingfeng.wanandroid.http.bean.SearchHotKeyBean;
import top.zingfeng.wanandroid.http.bean.SearchQueryDataBean;
import top.zingfeng.wanandroid.module.search.adapter.SearchHistoryAdapter;
import top.zingfeng.wanandroid.module.search.adapter.SearchHotKeyAdapter;
import top.zingfeng.wanandroid.module.search.db.SearchHistoryHelper;
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

    @BindView(R.id.tv_clear_history)
    TextView mTvClearHistory;
    @OnClick(R.id.tv_clear_history)
    /**
     * 清除数据库
     */
    void clickTvClearHistory(){
        mSearchHistoryHelper = new SearchHistoryHelper(SearchActivity.this, "app_db",null, 1);
        mWritableDatabase = mSearchHistoryHelper.getReadableDatabase();
        mWritableDatabase.execSQL("drop table search_history");
        mSearchHistoryHelper.onCreate(mWritableDatabase);
        mSearchHistoryAdapter.setNewInstance(null);
        mSearchHistoryAdapter.notifyDataSetChanged();
    }

    @BindView(R.id.et_search_content)
    EditText mEtSearchContent;

    @BindView(R.id.iv_search)
    ImageView mIvSearch;
    @OnClick(R.id.iv_search)
    void clickIvSearch(){
        String content = mEtSearchContent.getText().toString();
        save2Database(content);
        ARouter.getInstance()
                .build("/module/search/view/SearchDetailActivity")
                .withString("titleContent", content)
                .navigation();
    }

    @BindView(R.id.rv_hot_key_search)
    RecyclerView mRvHotKeySearch;
    private SearchHotKeyAdapter mSearchHotKeyAdapter;

    @BindView(R.id.rv_search_history)
    RecyclerView mRvSearchHistory;
    private SearchHistoryAdapter mSearchHistoryAdapter;

    private SearchHistoryHelper mSearchHistoryHelper;
    private SQLiteDatabase mWritableDatabase;

    @Override
    protected void onResume() {
        super.onResume();
        mSearchHistoryHelper = new SearchHistoryHelper(getBaseContext(), "app_db",null, 1);
        mWritableDatabase = mSearchHistoryHelper.getWritableDatabase();
        Cursor cursor = mWritableDatabase.query("search_history", null, null, null, null, null, "id DESC");
        List<SearchHistoryBean> historyDataBeans = new ArrayList<>();
        if (cursor.moveToFirst()){
            do {
                Integer id = cursor.getInt(cursor.getColumnIndex("id"));
                String historyName = cursor.getString(cursor.getColumnIndex("history_name"));
                SearchHistoryBean historyDataBean = new SearchHistoryBean();
                historyDataBean.setId(id);
                historyDataBean.setName(historyName);
                historyDataBeans.add(historyDataBean);
            } while (cursor.moveToNext());
        }
        cursor.close();
        mSearchHistoryAdapter.setNewInstance(historyDataBeans);
        mSearchHistoryAdapter.notifyDataSetChanged();
    }

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
            save2Database(content);
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

        //数据库信息显示
        LinearLayoutManager historyManager = new LinearLayoutManager(getBaseContext());
        historyManager.setOrientation(RecyclerView.VERTICAL);
        mSearchHistoryAdapter = new SearchHistoryAdapter(R.layout.item_search_history, null);
        mRvSearchHistory.setLayoutManager(historyManager);
        mRvSearchHistory.setAdapter(mSearchHistoryAdapter);
    }

    /**
     * 保存数据至数据库
     * @param content
     */
    private void save2Database(String content){
        mSearchHistoryHelper = new SearchHistoryHelper(SearchActivity.this, "app_db", null, 1);
        mWritableDatabase = mSearchHistoryHelper.getWritableDatabase();
        Cursor cursor = mWritableDatabase.query("search_history", null, "history_name = ?", new String[]{content}, null, null, "id DESC");
        int count = cursor.getCount();
        if (count == 0){
            ContentValues values = new ContentValues();
            values.put("history_name", content);
            mWritableDatabase.insert("search_history", null, values);
        }
        cursor.close();
        mWritableDatabase.close();
    }
}