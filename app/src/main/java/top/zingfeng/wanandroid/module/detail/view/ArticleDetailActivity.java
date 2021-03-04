package top.zingfeng.wanandroid.module.detail.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.PixelFormat;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tencent.smtt.export.external.interfaces.WebResourceRequest;
import com.tencent.smtt.sdk.QbSdk;
import com.tencent.smtt.sdk.WebChromeClient;
import com.tencent.smtt.sdk.WebSettings;
import com.tencent.smtt.sdk.WebView;
import com.tencent.smtt.sdk.WebViewClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import top.zingfeng.wanandroid.R;
import top.zingfeng.wanandroid.base.BaseActivity;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
@Route(path = "/module/detail/ArticleDetailActivity")
public class ArticleDetailActivity extends BaseActivity {

    @Autowired
    String url;
    @Autowired
    String title;

    @BindView(R.id.iv_return_last)
    ImageView mIvReturnLast;

    @BindView(R.id.pb_show_progress_bar)
    ProgressBar mPbShowProgressBar;

    @BindView(R.id.tv_title)
    TextView mTvTitle;

    @BindView(R.id.wv_article_detail)
    WebView mWvArticleDetail;

    private WebSettings webSettings;

    @Override
    protected Integer setResourceId() {
        return R.layout.activity_article_detail;
    }

    @Override
    protected void initConfig() {
        ARouter.getInstance().inject(this);
        ButterKnife.bind(this);
        setupToolbar();
        setupWebkit();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initEvent() {

    }

    private void setupToolbar(){
        mTvTitle.setText(title);
        mTvTitle.setSelected(true);
        mIvReturnLast.setOnClickListener(v -> {
            finish();
        });
    }

    private void setupWebkit(){
        webSettings = mWvArticleDetail.getSettings();
        initWebView();//初始化腾讯 X5 webView
        loadWe();//腾讯 X5 加载网页

        if(mWvArticleDetail != null){
            //加载网页
            mWvArticleDetail.loadUrl(url);
        }
        mWvArticleDetail.setWebChromeClient(new WebChromeClient(){
            @Override
            public void onProgressChanged(WebView webView, int newProgress) {
                if (newProgress == 100){
                    mPbShowProgressBar.setVisibility(View.GONE);
                }else {
                    mPbShowProgressBar.setVisibility(View.VISIBLE);
                    mPbShowProgressBar.setProgress(newProgress);
                }
            }
        });
    }

    /**
     * 初始化腾讯 X5 webView
     */
    private void initWebView() {
        //优化异常上报
        com.tencent.smtt.sdk.WebView.getCrashExtraMessage(this);
        //视频为了避免闪屏和透明问题
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        //避免输入法界面弹出后遮挡输入光标的问题
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE | WindowManager.LayoutParams.SOFT_INPUT_STATE_HIDDEN);
        //非wifi情况下，主动下载x5内核
        QbSdk.setDownloadWithoutWifi(true);
        //搜集本地tbs内核信息并上报服务器，服务器返回结果决定使用哪个内核。
        QbSdk.PreInitCallback cb = new QbSdk.PreInitCallback() {
            @Override
            public void onViewInitFinished(boolean arg0) {
                //x5內核初始化完成的回调，为true表示x5内核加载成功，否则表示x5内核加载失败，会自动切换到系统内核。
                Log.i("======>","腾讯 X 5 初始化:" + arg0);
                Log.i("======>",arg0 == true ? "腾讯 X5 初始化成功！" : "腾讯 X5 初始化失败！");
            }
            @Override
            public void onCoreInitFinished() {

            }
        };
        //x5内核初始化接口
        QbSdk.initX5Environment(getApplicationContext(), cb);
    }


    /**
     * 腾讯 X5 加载网页
     */
    private void loadWe(){
        if(webSettings != null){
            webSettings.setSupportZoom(true); //支持缩放，默认为true。是下面那个的前提。
            webSettings.setBuiltInZoomControls(true); //设置内置的缩放控件。若为false，则该WebView不可缩放
            webSettings.setDisplayZoomControls(true); //隐藏原生的缩放控件
            webSettings.setBlockNetworkImage(false);//解决图片不显示
            webSettings.setLoadsImagesAutomatically(true); //支持自动加载图片
            webSettings.setDefaultTextEncodingName("utf-8");//设置编码格式
        }

        if(mWvArticleDetail != null){
            String httpHint = "http://";
            String httpsHint = "https://";
            //该界面打开更多链接
            mWvArticleDetail.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView webView, String s) {

                    if (url.startsWith(httpHint) || url.startsWith(httpsHint)){
                        webView.loadUrl(s);
                        return false;
                    }else {
                        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                        startActivity(intent);
                    }
                    return true;
                }

                @Override
                public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                    String redirectUrl = webResourceRequest.getUrl().toString();
                    if (!redirectUrl.startsWith(httpHint) || !redirectUrl.startsWith(httpsHint)) {
                        return true;
                    }
                    return super.shouldOverrideUrlLoading(webView, webResourceRequest);

                }
            });

            //监听网页的加载进度
            mWvArticleDetail.setWebChromeClient(new WebChromeClient() {
                @Override
                public void onProgressChanged(WebView webView, int i) {
                    Log.i("======>","当前 腾讯X5 网速:" + i);
                    //当前网页加载到 100% 后就显示 腾讯X5 的webView组件
                    if (i < 100) {
                        webView.setVisibility(View.GONE);
                    } else {
                        webView.setVisibility(View.VISIBLE);
                    }
                }
            });
        }
    }


    /**
     * 退出界面暂停 webView的活跃
     */
    @Override
    protected void onPause() {
        super.onPause();
        mWvArticleDetail.onPause();
        mWvArticleDetail.getSettings().setLightTouchEnabled(false);
    }


    /**
     * 销毁 放置内存泄漏
     */
    @Override
    protected void onDestroy() {
        if (this.mWvArticleDetail != null) {
            mWvArticleDetail.destroy();
        }
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mWvArticleDetail.onResume();
        mWvArticleDetail.getSettings().setJavaScriptEnabled(true);
    }
}