package com.example.androiddoan.Api;

import com.example.androiddoan.Api.Model.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;

import com.example.androiddoan.Api.Model.NguoiDungModel;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiClient {
    //https://json-api-demooooo.herokuapp.com/NguoiDung?fbclid=IwAR2GA7qf_H1YmrFv_5qka-bbwioEX12iNVWi2WcoJuOK74u54zlBdnEADbY
    Gson gson = new GsonBuilder()
            .setDateFormat("yyyy-MM-dd HH:mm:ss")
            .create();


    ApiClient apiclient = new Retrofit.Builder()
            .baseUrl("https://json-api-demooooo.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build()
            .create(ApiClient.class);
    @GET("NguoiDung")
    Call<List<NguoiDungModel>> getListUsers(@Query("fbclid") String key);
    @POST("NguoiDung")
    Call<List<User>> getregister(@Body User user);
}
