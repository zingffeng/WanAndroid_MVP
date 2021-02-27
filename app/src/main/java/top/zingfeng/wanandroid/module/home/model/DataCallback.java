package top.zingfeng.wanandroid.module.home.model;

/**
 * @author zingfeng
 * @date On 2021/2/27
 */
public interface DataCallback<T> {
    /**
     * 请求数据成功
     * @param data 数据
     */
    void onSuccess(T data);

    /**
     * 请求数据失败
     * @param errorMag 错误信息
     */
    void onFailure(String errorMag);
}
