package top.zingfeng.wanandroid.http.bean;

import androidx.core.text.HtmlCompat;

import java.util.List;

import static androidx.core.text.HtmlCompat.FROM_HTML_MODE_LEGACY;

/**
 * @author zingfeng
 * @date On 2021/2/20
 */
public class SearchQueryDataBean {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17330,"link":"https://juejin.cn/post/6930805971673415694","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1613748524000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613748524000,"shareUser":"程序员徐公","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 启动优化（二） - 拓扑排序的原理以及解题思路","type":0,"userId":5339,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17329,"link":"https://juejin.cn/post/6926794003794903048","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1613748495000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613748495000,"shareUser":"程序员徐公","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 启动优化（一） - 有向无环图","type":0,"userId":5339,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"YiPHaoYouWei","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"Toast显示 自定义图片显示","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/2439c542-19d6-4ee8-8dfc-92fd1a691064.png","fresh":true,"host":"","id":17328,"link":"https://www.wanandroid.com/blog/show/2939","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"https://github.com/YiPHaoYouWei/ToastUitl","publishTime":1613747159000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1613747159000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"<em class='highlight'>android<\/em> Toast带图片显示","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17320,"link":"https://github.com/goweii/SwipeBack","niceDate":"1小时前","niceShareDate":"5小时前","origin":"","prefix":"","projectLink":"","publishTime":1613746920000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613733844000,"shareUser":"hezihaog","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"GitHub - goweii/SwipeBack: <em class='highlight'>Android<\/em> Activity滑动返回。支持4个方向，支持下层Activity联动和自定义动效。","type":0,"userId":12932,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17318,"link":"https://juejin.cn/post/6930494048675643400","niceDate":"8小时前","niceShareDate":"8小时前","origin":"","prefix":"","projectLink":"","publishTime":1613723138000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613723138000,"shareUser":"趣阅编程","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>：JNI开发介绍与小结","type":0,"userId":13273,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17317,"link":"https://www.jianshu.com/p/545b6f67babb","niceDate":"10小时前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1613714753000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613714753000,"shareUser":"litton","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>模拟点击弹出软键盘","type":0,"userId":75480,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17316,"link":"https://www.jianshu.com/p/648ae3a38071","niceDate":"10小时前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1613714602000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613714602000,"shareUser":"litton","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 生成Dimens文件","type":0,"userId":75480,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17315,"link":"https://juejin.cn/post/6930562700128813070","niceDate":"11小时前","niceShareDate":"11小时前","origin":"","prefix":"","projectLink":"","publishTime":1613711350000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613711350000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> | 这是一份详细的 EventBus 使用教程 | 牛气冲天新年征文","type":0,"userId":20382,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17310,"link":"https://weilu.blog.csdn.net/article/details/113816175","niceDate":"11小时前","niceShareDate":"11小时前","origin":"","prefix":"","projectLink":"","publishTime":1613710519000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613710519000,"shareUser":"Ms-url","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 注解处理器使用攻略","type":0,"userId":87723,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17326,"link":"https://mp.weixin.qq.com/s/HFcvfkUmNAT-HyoFRM8f_w","niceDate":"1天前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1613664000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1613746866000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"<em class='highlight'>Android<\/em>代码覆盖工具，又是一波骚操作","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17297,"link":"https://juejin.cn/post/6919037176038555662","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1613661283000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1613612194000,"shareUser":"趣阅编程","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"2021 更新<em class='highlight'>Android<\/em>知识体系","type":0,"userId":13273,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17296,"link":"https://juejin.cn/post/6844903830665035790","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1613609495000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613609495000,"shareUser":"AprilEyon","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>桌面小部件AppWidget开发","type":0,"userId":3559,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17322,"link":"https://mp.weixin.qq.com/s/63gT2D_p6ibD69hSQMdPQA","niceDate":"2天前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1613577600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1613746783000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"玩<em class='highlight'>Android<\/em>又上线了一个新能力！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17288,"link":"https://mp.weixin.qq.com/s/XNoXaI4Jspl4Pk0wLmSA5w","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1613549920000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613549920000,"shareUser":"铁在烧","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>中关于Context的三言两语","type":0,"userId":1549,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17281,"link":"https://www.jianshu.com/p/142940cdc76b","niceDate":"2021-02-15 23:32","niceShareDate":"2021-02-15 23:32","origin":"","prefix":"","projectLink":"","publishTime":1613403128000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613403128000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"三年的<em class='highlight'>Android<\/em>开发还不会优化网络请求？年轻人，我劝你耗子尾汁","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17272,"link":"https://mp.weixin.qq.com/s/GdBoVn9rZQGMMRIdstCWYA","niceDate":"2021-02-15 12:50","niceShareDate":"2021-02-15 12:50","origin":"","prefix":"","projectLink":"","publishTime":1613364621000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613364621000,"shareUser":"铁在烧","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>自制https证书进行双向认证","type":0,"userId":1549,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17271,"link":"https://juejin.cn/post/6929099399620460551","niceDate":"2021-02-15 12:40","niceShareDate":"2021-02-15 12:40","origin":"","prefix":"","projectLink":"","publishTime":1613364048000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613364048000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>常见动画效果合集，让APP熠熠生辉，绚丽灵动","type":0,"userId":20382,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17267,"link":"https://www.jianshu.com/p/2a4cbb121422","niceDate":"2021-02-13 23:33","niceShareDate":"2021-02-13 23:33","origin":"","prefix":"","projectLink":"","publishTime":1613230427000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613230427000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"基于AGP的<em class='highlight'>Android<\/em>组件化编译插件实践","type":0,"userId":29303,"visible":0,"zan":0}],"offset":0,"over":false,"pageCount":262,"size":20,"total":5236}
     * errorCode : 0
     * errorMsg :
     */

    private DataBean data;
    private int errorCode;
    private String errorMsg;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public static class DataBean {
        /**
         * curPage : 1
         * datas : [{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17330,"link":"https://juejin.cn/post/6930805971673415694","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1613748524000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613748524000,"shareUser":"程序员徐公","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 启动优化（二） - 拓扑排序的原理以及解题思路","type":0,"userId":5339,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17329,"link":"https://juejin.cn/post/6926794003794903048","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1613748495000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613748495000,"shareUser":"程序员徐公","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 启动优化（一） - 有向无环图","type":0,"userId":5339,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"YiPHaoYouWei","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"Toast显示 自定义图片显示","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/2439c542-19d6-4ee8-8dfc-92fd1a691064.png","fresh":true,"host":"","id":17328,"link":"https://www.wanandroid.com/blog/show/2939","niceDate":"1小时前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"https://github.com/YiPHaoYouWei/ToastUitl","publishTime":1613747159000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1613747159000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"<em class='highlight'>android<\/em> Toast带图片显示","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17320,"link":"https://github.com/goweii/SwipeBack","niceDate":"1小时前","niceShareDate":"5小时前","origin":"","prefix":"","projectLink":"","publishTime":1613746920000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613733844000,"shareUser":"hezihaog","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"GitHub - goweii/SwipeBack: <em class='highlight'>Android<\/em> Activity滑动返回。支持4个方向，支持下层Activity联动和自定义动效。","type":0,"userId":12932,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17318,"link":"https://juejin.cn/post/6930494048675643400","niceDate":"8小时前","niceShareDate":"8小时前","origin":"","prefix":"","projectLink":"","publishTime":1613723138000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613723138000,"shareUser":"趣阅编程","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>：JNI开发介绍与小结","type":0,"userId":13273,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17317,"link":"https://www.jianshu.com/p/545b6f67babb","niceDate":"10小时前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1613714753000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613714753000,"shareUser":"litton","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>模拟点击弹出软键盘","type":0,"userId":75480,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17316,"link":"https://www.jianshu.com/p/648ae3a38071","niceDate":"10小时前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1613714602000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613714602000,"shareUser":"litton","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 生成Dimens文件","type":0,"userId":75480,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17315,"link":"https://juejin.cn/post/6930562700128813070","niceDate":"11小时前","niceShareDate":"11小时前","origin":"","prefix":"","projectLink":"","publishTime":1613711350000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613711350000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> | 这是一份详细的 EventBus 使用教程 | 牛气冲天新年征文","type":0,"userId":20382,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17310,"link":"https://weilu.blog.csdn.net/article/details/113816175","niceDate":"11小时前","niceShareDate":"11小时前","origin":"","prefix":"","projectLink":"","publishTime":1613710519000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613710519000,"shareUser":"Ms-url","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em> 注解处理器使用攻略","type":0,"userId":87723,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17326,"link":"https://mp.weixin.qq.com/s/HFcvfkUmNAT-HyoFRM8f_w","niceDate":"1天前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1613664000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1613746866000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"<em class='highlight'>Android<\/em>代码覆盖工具，又是一波骚操作","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":73,"chapterName":"面试相关","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17297,"link":"https://juejin.cn/post/6919037176038555662","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1613661283000,"realSuperChapterId":53,"selfVisible":0,"shareDate":1613612194000,"shareUser":"趣阅编程","superChapterId":196,"superChapterName":"热门专题","tags":[],"title":"2021 更新<em class='highlight'>Android<\/em>知识体系","type":0,"userId":13273,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17296,"link":"https://juejin.cn/post/6844903830665035790","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1613609495000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613609495000,"shareUser":"AprilEyon","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>桌面小部件AppWidget开发","type":0,"userId":3559,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17322,"link":"https://mp.weixin.qq.com/s/63gT2D_p6ibD69hSQMdPQA","niceDate":"2天前","niceShareDate":"1小时前","origin":"","prefix":"","projectLink":"","publishTime":1613577600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1613746783000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"玩<em class='highlight'>Android<\/em>又上线了一个新能力！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17288,"link":"https://mp.weixin.qq.com/s/XNoXaI4Jspl4Pk0wLmSA5w","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1613549920000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613549920000,"shareUser":"铁在烧","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>中关于Context的三言两语","type":0,"userId":1549,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17281,"link":"https://www.jianshu.com/p/142940cdc76b","niceDate":"2021-02-15 23:32","niceShareDate":"2021-02-15 23:32","origin":"","prefix":"","projectLink":"","publishTime":1613403128000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613403128000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"三年的<em class='highlight'>Android<\/em>开发还不会优化网络请求？年轻人，我劝你耗子尾汁","type":0,"userId":29303,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17272,"link":"https://mp.weixin.qq.com/s/GdBoVn9rZQGMMRIdstCWYA","niceDate":"2021-02-15 12:50","niceShareDate":"2021-02-15 12:50","origin":"","prefix":"","projectLink":"","publishTime":1613364621000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613364621000,"shareUser":"铁在烧","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>自制https证书进行双向认证","type":0,"userId":1549,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17271,"link":"https://juejin.cn/post/6929099399620460551","niceDate":"2021-02-15 12:40","niceShareDate":"2021-02-15 12:40","origin":"","prefix":"","projectLink":"","publishTime":1613364048000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613364048000,"shareUser":"goweii","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"<em class='highlight'>Android<\/em>常见动画效果合集，让APP熠熠生辉，绚丽灵动","type":0,"userId":20382,"visible":0,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":494,"chapterName":"广场","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17267,"link":"https://www.jianshu.com/p/2a4cbb121422","niceDate":"2021-02-13 23:33","niceShareDate":"2021-02-13 23:33","origin":"","prefix":"","projectLink":"","publishTime":1613230427000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1613230427000,"shareUser":"深红骑士","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"基于AGP的<em class='highlight'>Android<\/em>组件化编译插件实践","type":0,"userId":29303,"visible":0,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 262
         * size : 20
         * total : 5236
         */

        private int curPage;
        private int offset;
        private boolean over;
        private int pageCount;
        private int size;
        private int total;
        private List<DatasBean> datas;

        public int getCurPage() {
            return curPage;
        }

        public void setCurPage(int curPage) {
            this.curPage = curPage;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public boolean isOver() {
            return over;
        }

        public void setOver(boolean over) {
            this.over = over;
        }

        public int getPageCount() {
            return pageCount;
        }

        public void setPageCount(int pageCount) {
            this.pageCount = pageCount;
        }

        public int getSize() {
            return size;
        }

        public void setSize(int size) {
            this.size = size;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<DatasBean> getDatas() {
            return datas;
        }

        public void setDatas(List<DatasBean> datas) {
            this.datas = datas;
        }

        public static class DatasBean {
            /**
             * apkLink :
             * audit : 1
             * author :
             * canEdit : false
             * chapterId : 494
             * chapterName : 广场
             * collect : false
             * courseId : 13
             * desc :
             * descMd :
             * envelopePic :
             * fresh : true
             * host :
             * id : 17330
             * link : https://juejin.cn/post/6930805971673415694
             * niceDate : 1小时前
             * niceShareDate : 1小时前
             * origin :
             * prefix :
             * projectLink :
             * publishTime : 1613748524000
             * realSuperChapterId : 493
             * selfVisible : 0
             * shareDate : 1613748524000
             * shareUser : 程序员徐公
             * superChapterId : 494
             * superChapterName : 广场Tab
             * tags : []
             * title : <em class='highlight'>Android</em> 启动优化（二） - 拓扑排序的原理以及解题思路
             * type : 0
             * userId : 5339
             * visible : 0
             * zan : 0
             */

            private String apkLink;
            private int audit;
            private String author;
            private boolean canEdit;
            private int chapterId;
            private String chapterName;
            private boolean collect;
            private int courseId;
            private String desc;
            private String descMd;
            private String envelopePic;
            private boolean fresh;
            private String host;
            private int id;
            private String link;
            private String niceDate;
            private String niceShareDate;
            private String origin;
            private String prefix;
            private String projectLink;
            private long publishTime;
            private int realSuperChapterId;
            private int selfVisible;
            private long shareDate;
            private String shareUser;
            private int superChapterId;
            private String superChapterName;
            private String title;
            private int type;
            private int userId;
            private int visible;
            private int zan;
            private List<?> tags;

            public String getApkLink() {
                return apkLink;
            }

            public void setApkLink(String apkLink) {
                this.apkLink = apkLink;
            }

            public int getAudit() {
                return audit;
            }

            public void setAudit(int audit) {
                this.audit = audit;
            }

            public String getAuthor() {
                return author;
            }

            public void setAuthor(String author) {
                this.author = author;
            }

            public boolean isCanEdit() {
                return canEdit;
            }

            public void setCanEdit(boolean canEdit) {
                this.canEdit = canEdit;
            }

            public int getChapterId() {
                return chapterId;
            }

            public void setChapterId(int chapterId) {
                this.chapterId = chapterId;
            }

            public String getChapterName() {
                return chapterName;
            }

            public void setChapterName(String chapterName) {
                this.chapterName = chapterName;
            }

            public boolean isCollect() {
                return collect;
            }

            public void setCollect(boolean collect) {
                this.collect = collect;
            }

            public int getCourseId() {
                return courseId;
            }

            public void setCourseId(int courseId) {
                this.courseId = courseId;
            }

            public String getDesc() {
                return desc;
            }

            public void setDesc(String desc) {
                this.desc = desc;
            }

            public String getDescMd() {
                return descMd;
            }

            public void setDescMd(String descMd) {
                this.descMd = descMd;
            }

            public String getEnvelopePic() {
                return envelopePic;
            }

            public void setEnvelopePic(String envelopePic) {
                this.envelopePic = envelopePic;
            }

            public boolean isFresh() {
                return fresh;
            }

            public void setFresh(boolean fresh) {
                this.fresh = fresh;
            }

            public String getHost() {
                return host;
            }

            public void setHost(String host) {
                this.host = host;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getLink() {
                return link;
            }

            public void setLink(String link) {
                this.link = link;
            }

            public String getNiceDate() {
                return niceDate;
            }

            public void setNiceDate(String niceDate) {
                this.niceDate = niceDate;
            }

            public String getNiceShareDate() {
                return niceShareDate;
            }

            public void setNiceShareDate(String niceShareDate) {
                this.niceShareDate = niceShareDate;
            }

            public String getOrigin() {
                return origin;
            }

            public void setOrigin(String origin) {
                this.origin = origin;
            }

            public String getPrefix() {
                return prefix;
            }

            public void setPrefix(String prefix) {
                this.prefix = prefix;
            }

            public String getProjectLink() {
                return projectLink;
            }

            public void setProjectLink(String projectLink) {
                this.projectLink = projectLink;
            }

            public long getPublishTime() {
                return publishTime;
            }

            public void setPublishTime(long publishTime) {
                this.publishTime = publishTime;
            }

            public int getRealSuperChapterId() {
                return realSuperChapterId;
            }

            public void setRealSuperChapterId(int realSuperChapterId) {
                this.realSuperChapterId = realSuperChapterId;
            }

            public int getSelfVisible() {
                return selfVisible;
            }

            public void setSelfVisible(int selfVisible) {
                this.selfVisible = selfVisible;
            }

            public long getShareDate() {
                return shareDate;
            }

            public void setShareDate(long shareDate) {
                this.shareDate = shareDate;
            }

            public String getShareUser() {
                return shareUser;
            }

            public void setShareUser(String shareUser) {
                this.shareUser = shareUser;
            }

            public int getSuperChapterId() {
                return superChapterId;
            }

            public void setSuperChapterId(int superChapterId) {
                this.superChapterId = superChapterId;
            }

            public String getSuperChapterName() {
                return superChapterName;
            }

            public void setSuperChapterName(String superChapterName) {
                this.superChapterName = superChapterName;
            }

            public String getTitle() {
                return HtmlCompat.fromHtml(title, FROM_HTML_MODE_LEGACY).toString();
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public int getType() {
                return type;
            }

            public void setType(int type) {
                this.type = type;
            }

            public int getUserId() {
                return userId;
            }

            public void setUserId(int userId) {
                this.userId = userId;
            }

            public int getVisible() {
                return visible;
            }

            public void setVisible(int visible) {
                this.visible = visible;
            }

            public int getZan() {
                return zan;
            }

            public void setZan(int zan) {
                this.zan = zan;
            }

            public List<?> getTags() {
                return tags;
            }

            public void setTags(List<?> tags) {
                this.tags = tags;
            }
        }
    }
}
