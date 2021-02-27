package top.zingfeng.wanandroid.http;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * @author zingfeng
 * @date On 2021/2/27
 */
public class BaseRetrofit {

    public static final String BASE_URL = "https://www.wanandroid.com/";
    private static Retrofit retrofit;
    private static OkHttpClient client = new OkHttpClient.Builder()
            .build();

    private BaseRetrofit(){}

    public static synchronized Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(client)
                    .build();
        }
        return retrofit;
    }
}
