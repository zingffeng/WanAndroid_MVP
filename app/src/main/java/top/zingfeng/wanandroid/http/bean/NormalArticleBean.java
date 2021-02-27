package top.zingfeng.wanandroid.http.bean;

import androidx.core.text.HtmlCompat;

import java.util.List;

import static androidx.core.text.HtmlCompat.FROM_HTML_MODE_LEGACY;

/**
 * @author zingfeng
 * @date On 2021/2/9
 */
public class NormalArticleBean {

    /**
     * data : {"curPage":1,"datas":[{"apkLink":"","audit":1,"author":"xuexiangjys","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"一个基于@Page注解非常方便的fragment页面框架","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/bae9d161-a5ee-4e2c-bbee-7b50540b5dd5.png","fresh":true,"host":"","id":17233,"link":"https://www.wanandroid.com/blog/show/2936","niceDate":"10小时前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"https://github.com/xuexiangjys/XPage","publishTime":1612801617000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1612801617000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"XPage 一个非常方便的fragment页面框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17228,"link":"https://juejin.cn/post/6926695962354122765","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612748110000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612748082000,"shareUser":"rain9155","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"揭秘kotlin协程中的CoroutineContext","type":0,"userId":12884,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17234,"link":"https://mp.weixin.qq.com/s/KRJDy4EA0Hq9pHfJnoYrWA","niceDate":"1天前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1612713600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612801877000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"嗯？发现Kotlin一个神奇的bug","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17220,"link":"https://juejin.cn/post/6924198995313033224","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612694963000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612694963000,"shareUser":"吊儿郎当","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"  &lt;&lt;Activity&gt;&gt;  的启动流程这一篇够了","type":0,"userId":2554,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17217,"link":"https://blog.csdn.net/awenyini/article/details/77898704","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612681765000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612681765000,"shareUser":"笔沫","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"HTTP文件断点续传原理解析(源码)","type":0,"userId":84580,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17216,"link":"https://juejin.cn/post/6844903878199099405","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1612664437000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612664437000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gradle系列之构建脚本基础","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17212,"link":"https://segmentfault.com/a/1190000039185619","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1612627453000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612627453000,"shareUser":"xuexiang","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"为了能让你们用上flutter,我准备做几期视频教程","type":0,"userId":42190,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17207,"link":"https://www.jianshu.com/p/e8b17f855c3b","niceDate":"2021-02-06 09:53","niceShareDate":"2021-02-06 09:53","origin":"","prefix":"","projectLink":"","publishTime":1612576409000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612576409000,"shareUser":"刘胖胖","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入卡顿优化","type":0,"userId":73657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17202,"link":"https://juejin.cn/post/6844903876177428494","niceDate":"2021-02-05 09:25","niceShareDate":"2021-02-05 09:25","origin":"","prefix":"","projectLink":"","publishTime":1612488320000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612488320000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gradle系列之Groovy基础篇","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"ShowMeThe","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"利用gradle plugin实现把需要加密的字符串存储在.So文件,实现app和library的独立加密，各自不同加密秘钥","descMd":"","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"host":"","id":17200,"link":"https://www.wanandroid.com/blog/show/2934","niceDate":"2021-02-05 00:28","niceShareDate":"2021-02-05 00:28","origin":"","prefix":"","projectLink":"https://github.com/ShowMeThe/Orca","publishTime":1612456122000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1612456122000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"利用gradle plugin实现把需要加密的字符串存储在.So文件内","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17221,"link":"https://mp.weixin.qq.com/s/Y7lvwOzc9fnFqI3Y-73nTQ","niceDate":"2021-02-05 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612454400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612708948000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"使用导航组件: 对话框目的地 | MAD Skills","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17222,"link":"https://mp.weixin.qq.com/s/CfAk72NPbXOioKgPsPQcMQ","niceDate":"2021-02-05 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612454400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612708976000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Jetpack Paging 思想在起点读书的更佳实践 | 开发者说&middot;DTalk","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17223,"link":"https://mp.weixin.qq.com/s/uqgaEo08enkgwFmX_fsSQw","niceDate":"2021-02-05 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612454400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612708993000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android AOP 利器 ，ASM 你值得拥有！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17224,"link":"https://mp.weixin.qq.com/s/7vwrG3BP2G4mFNb5vwaTfQ","niceDate":"2021-02-05 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612454400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612709007000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"处理被废弃的ButterKnife和kotlin-android-extensions有妙招","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17188,"link":"https://mp.weixin.qq.com/s/N4e6AkhNgI3mcbWFlqhYPQ","niceDate":"2021-02-04 09:25","niceShareDate":"2021-02-04 09:25","origin":"","prefix":"","projectLink":"","publishTime":1612401912000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612401912000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gradle系列之初识Gradle篇","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17196,"link":"https://mp.weixin.qq.com/s/LZ4e53SehYZs3Gg4ug3lLg","niceDate":"2021-02-04 00:00","niceShareDate":"2021-02-05 00:27","origin":"","prefix":"","projectLink":"","publishTime":1612368000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612456022000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 11 下的 ContentProvider 踩坑记","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17197,"link":"https://mp.weixin.qq.com/s/BUyoeeHEif9uYQP5xSqMdQ","niceDate":"2021-02-04 00:00","niceShareDate":"2021-02-05 00:27","origin":"","prefix":"","projectLink":"","publishTime":1612368000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612456035000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"导航组件概览 | MAD Skills","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17198,"link":"https://mp.weixin.qq.com/s/g6VC1QanbD2GItXwkR1x3A","niceDate":"2021-02-04 00:00","niceShareDate":"2021-02-05 00:27","origin":"","prefix":"","projectLink":"","publishTime":1612368000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612456050000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"解决 Android 中的 DNS 域名劫持问题","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17199,"link":"https://mp.weixin.qq.com/s/nHGZmzTAioVH9FYEqR1c9Q","niceDate":"2021-02-04 00:00","niceShareDate":"2021-02-05 00:27","origin":"","prefix":"","projectLink":"","publishTime":1612368000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612456065000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"AppCompat发布两年了，还没了解？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"jiaoyaning","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"Android 自定义方形输入框，仿滴滴验证码输入框","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/d8af8f88-8bcd-40c2-843d-836a8005bcb7.png","fresh":false,"host":"","id":17185,"link":"https://www.wanandroid.com/blog/show/2933","niceDate":"2021-02-03 23:26","niceShareDate":"2021-02-03 23:26","origin":"","prefix":"","projectLink":"https://github.com/jiaoyaning/VerificationCodeView","publishTime":1612365972000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1612365972000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"Android 自定义方形输入框，仿滴滴验证码输入框","type":0,"userId":-1,"visible":1,"zan":0}],"offset":0,"over":false,"pageCount":500,"size":20,"total":9998}
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
         * datas : [{"apkLink":"","audit":1,"author":"xuexiangjys","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"一个基于@Page注解非常方便的fragment页面框架","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/bae9d161-a5ee-4e2c-bbee-7b50540b5dd5.png","fresh":true,"host":"","id":17233,"link":"https://www.wanandroid.com/blog/show/2936","niceDate":"10小时前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"https://github.com/xuexiangjys/XPage","publishTime":1612801617000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1612801617000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"XPage 一个非常方便的fragment页面框架","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":true,"host":"","id":17228,"link":"https://juejin.cn/post/6926695962354122765","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612748110000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612748082000,"shareUser":"rain9155","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"揭秘kotlin协程中的CoroutineContext","type":0,"userId":12884,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17234,"link":"https://mp.weixin.qq.com/s/KRJDy4EA0Hq9pHfJnoYrWA","niceDate":"1天前","niceShareDate":"10小时前","origin":"","prefix":"","projectLink":"","publishTime":1612713600000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612801877000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"嗯？发现Kotlin一个神奇的bug","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17220,"link":"https://juejin.cn/post/6924198995313033224","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612694963000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612694963000,"shareUser":"吊儿郎当","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"  &lt;&lt;Activity&gt;&gt;  的启动流程这一篇够了","type":0,"userId":2554,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17217,"link":"https://blog.csdn.net/awenyini/article/details/77898704","niceDate":"1天前","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612681765000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612681765000,"shareUser":"笔沫","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"HTTP文件断点续传原理解析(源码)","type":0,"userId":84580,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17216,"link":"https://juejin.cn/post/6844903878199099405","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1612664437000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612664437000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gradle系列之构建脚本基础","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17212,"link":"https://segmentfault.com/a/1190000039185619","niceDate":"2天前","niceShareDate":"2天前","origin":"","prefix":"","projectLink":"","publishTime":1612627453000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612627453000,"shareUser":"xuexiang","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"为了能让你们用上flutter,我准备做几期视频教程","type":0,"userId":42190,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17207,"link":"https://www.jianshu.com/p/e8b17f855c3b","niceDate":"2021-02-06 09:53","niceShareDate":"2021-02-06 09:53","origin":"","prefix":"","projectLink":"","publishTime":1612576409000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612576409000,"shareUser":"刘胖胖","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"深入卡顿优化","type":0,"userId":73657,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17202,"link":"https://juejin.cn/post/6844903876177428494","niceDate":"2021-02-05 09:25","niceShareDate":"2021-02-05 09:25","origin":"","prefix":"","projectLink":"","publishTime":1612488320000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612488320000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gradle系列之Groovy基础篇","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"ShowMeThe","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"利用gradle plugin实现把需要加密的字符串存储在.So文件,实现app和library的独立加密，各自不同加密秘钥","descMd":"","envelopePic":"https://www.wanandroid.com/resources/image/pc/default_project_img.jpg","fresh":false,"host":"","id":17200,"link":"https://www.wanandroid.com/blog/show/2934","niceDate":"2021-02-05 00:28","niceShareDate":"2021-02-05 00:28","origin":"","prefix":"","projectLink":"https://github.com/ShowMeThe/Orca","publishTime":1612456122000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1612456122000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"利用gradle plugin实现把需要加密的字符串存储在.So文件内","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17221,"link":"https://mp.weixin.qq.com/s/Y7lvwOzc9fnFqI3Y-73nTQ","niceDate":"2021-02-05 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612454400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612708948000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"使用导航组件: 对话框目的地 | MAD Skills","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17222,"link":"https://mp.weixin.qq.com/s/CfAk72NPbXOioKgPsPQcMQ","niceDate":"2021-02-05 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612454400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612708976000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"Jetpack Paging 思想在起点读书的更佳实践 | 开发者说&middot;DTalk","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17223,"link":"https://mp.weixin.qq.com/s/uqgaEo08enkgwFmX_fsSQw","niceDate":"2021-02-05 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612454400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612708993000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android AOP 利器 ，ASM 你值得拥有！","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17224,"link":"https://mp.weixin.qq.com/s/7vwrG3BP2G4mFNb5vwaTfQ","niceDate":"2021-02-05 00:00","niceShareDate":"1天前","origin":"","prefix":"","projectLink":"","publishTime":1612454400000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612709007000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"处理被废弃的ButterKnife和kotlin-android-extensions有妙招","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"","canEdit":false,"chapterId":502,"chapterName":"自助","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17188,"link":"https://mp.weixin.qq.com/s/N4e6AkhNgI3mcbWFlqhYPQ","niceDate":"2021-02-04 09:25","niceShareDate":"2021-02-04 09:25","origin":"","prefix":"","projectLink":"","publishTime":1612401912000,"realSuperChapterId":493,"selfVisible":0,"shareDate":1612401912000,"shareUser":"躬行之","superChapterId":494,"superChapterName":"广场Tab","tags":[],"title":"Gradle系列之初识Gradle篇","type":0,"userId":23270,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"鸿洋","canEdit":false,"chapterId":408,"chapterName":"鸿洋","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17196,"link":"https://mp.weixin.qq.com/s/LZ4e53SehYZs3Gg4ug3lLg","niceDate":"2021-02-04 00:00","niceShareDate":"2021-02-05 00:27","origin":"","prefix":"","projectLink":"","publishTime":1612368000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612456022000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/408/1"}],"title":"Android 11 下的 ContentProvider 踩坑记","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"谷歌开发者","canEdit":false,"chapterId":415,"chapterName":"谷歌开发者","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17197,"link":"https://mp.weixin.qq.com/s/BUyoeeHEif9uYQP5xSqMdQ","niceDate":"2021-02-04 00:00","niceShareDate":"2021-02-05 00:27","origin":"","prefix":"","projectLink":"","publishTime":1612368000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612456035000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/415/1"}],"title":"导航组件概览 | MAD Skills","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"code小生","canEdit":false,"chapterId":414,"chapterName":"code小生","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17198,"link":"https://mp.weixin.qq.com/s/g6VC1QanbD2GItXwkR1x3A","niceDate":"2021-02-04 00:00","niceShareDate":"2021-02-05 00:27","origin":"","prefix":"","projectLink":"","publishTime":1612368000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612456050000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/414/1"}],"title":"解决 Android 中的 DNS 域名劫持问题","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"郭霖","canEdit":false,"chapterId":409,"chapterName":"郭霖","collect":false,"courseId":13,"desc":"","descMd":"","envelopePic":"","fresh":false,"host":"","id":17199,"link":"https://mp.weixin.qq.com/s/nHGZmzTAioVH9FYEqR1c9Q","niceDate":"2021-02-04 00:00","niceShareDate":"2021-02-05 00:27","origin":"","prefix":"","projectLink":"","publishTime":1612368000000,"realSuperChapterId":407,"selfVisible":0,"shareDate":1612456065000,"shareUser":"","superChapterId":408,"superChapterName":"公众号","tags":[{"name":"公众号","url":"/wxarticle/list/409/1"}],"title":"AppCompat发布两年了，还没了解？","type":0,"userId":-1,"visible":1,"zan":0},{"apkLink":"","audit":1,"author":"jiaoyaning","canEdit":false,"chapterId":539,"chapterName":"未分类","collect":false,"courseId":13,"desc":"Android 自定义方形输入框，仿滴滴验证码输入框","descMd":"","envelopePic":"https://www.wanandroid.com/blogimgs/d8af8f88-8bcd-40c2-843d-836a8005bcb7.png","fresh":false,"host":"","id":17185,"link":"https://www.wanandroid.com/blog/show/2933","niceDate":"2021-02-03 23:26","niceShareDate":"2021-02-03 23:26","origin":"","prefix":"","projectLink":"https://github.com/jiaoyaning/VerificationCodeView","publishTime":1612365972000,"realSuperChapterId":293,"selfVisible":0,"shareDate":1612365972000,"shareUser":"","superChapterId":294,"superChapterName":"开源项目主Tab","tags":[{"name":"项目","url":"/project/list/1?cid=539"}],"title":"Android 自定义方形输入框，仿滴滴验证码输入框","type":0,"userId":-1,"visible":1,"zan":0}]
         * offset : 0
         * over : false
         * pageCount : 500
         * size : 20
         * total : 9998
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
             * author : xuexiangjys
             * canEdit : false
             * chapterId : 539
             * chapterName : 未分类
             * collect : false
             * courseId : 13
             * desc : 一个基于@Page注解非常方便的fragment页面框架
             * descMd :
             * envelopePic : https://www.wanandroid.com/blogimgs/bae9d161-a5ee-4e2c-bbee-7b50540b5dd5.png
             * fresh : true
             * host :
             * id : 17233
             * link : https://www.wanandroid.com/blog/show/2936
             * niceDate : 10小时前
             * niceShareDate : 10小时前
             * origin :
             * prefix :
             * projectLink : https://github.com/xuexiangjys/XPage
             * publishTime : 1612801617000
             * realSuperChapterId : 293
             * selfVisible : 0
             * shareDate : 1612801617000
             * shareUser :
             * superChapterId : 294
             * superChapterName : 开源项目主Tab
             * tags : [{"name":"项目","url":"/project/list/1?cid=539"}]
             * title : XPage 一个非常方便的fragment页面框架
             * type : 0
             * userId : -1
             * visible : 1
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
            private List<TagsBean> tags;

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

            public List<TagsBean> getTags() {
                return tags;
            }

            public void setTags(List<TagsBean> tags) {
                this.tags = tags;
            }

            public static class TagsBean {
                /**
                 * name : 项目
                 * url : /project/list/1?cid=539
                 */

                private String name;
                private String url;

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }
}
