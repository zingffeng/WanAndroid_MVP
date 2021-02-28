package top.zingfeng.wanandroid.module.square.view;

import top.zingfeng.wanandroid.http.bean.SquareArticleBean;

/**
 * @author zingfeng
 * @date On 2021/2/28
 */
public interface ISquareView {

    /**
     * 设置广场获取数据
     * @param squareArticle 数据
     */
    void setSquareArticle(SquareArticleBean squareArticle);

    /**
     * 设置广场获取错误数据
     * @param errorMsg 错误信息数据
     */
    void setSquareArticleError(String errorMsg);
}
