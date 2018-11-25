package com.example.elenek.mbank.network;

import android.util.Log;

import java.io.IOException;

import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static Retrofit retrofit;
    private static final String BASE_URL = "https://api.fintech.ge/";
    private static String sessionId = null;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            OkHttpClient client = new OkHttpClient().newBuilder().addInterceptor(new Interceptor() {
                @Override
                public Response intercept(Chain chain) throws IOException {
                    Log.d("test", "ou nou");
                    Request request = chain.request();

                    HttpUrl url = request.url().newBuilder().build();
                    if(sessionId != null) {
                        url = request.url().newBuilder().addPathSegment(sessionId).build();
                    }

                    request = request.newBuilder().url(url)
                            .addHeader("content-type", "application/json; charset=utf-8")
                            .build();
                    Log.d("test", request.url().toString());
                    return chain.proceed(request);
                }
            }).build();

            retrofit = new retrofit2.Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

    public static void setSessionId(String sessionId){
        RetrofitInstance.sessionId = sessionId;
    }
}