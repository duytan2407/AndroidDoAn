package com.example.androiddoan.InterfaceRepository;

import com.example.androiddoan.models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface Methods {
    @GET("MonAn")
    Call<List<Product>> loadProduct();
    @GET("MonAn")
    Call<List<Product>> getClassModel();
    @POST("MonAn")
    Call<Product> insertClass(@Body Product product);
    @PUT("MonAn/{id}")
    Call<Product> updateClass(@Path("id") String id, @Body Product product);
    @DELETE("MonAn/{id}")
    Call<Product> deleteClass(@Path("id") String id);
}
