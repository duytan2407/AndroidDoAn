package com.example.androiddoan.InterfaceRepository;

import com.example.androiddoan.models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Methods {
    @GET("MonAn")
    Call<List<Product>> loadProduct();
    @GET("NuocUong")
    Call<List<Product>> loadDrink();
//    @POST("MonAn")
//    Call<ClassModel> insertClass(@Body ClassModel classModelD);
//    @PUT("MonAn/{id}")
//    Call<ClassModel> updateClass(@Path("id") String id, @Body ClassModel classModelD);
//    @DELETE("MonAn/{id}")
//    Call<ClassModel> deleteClass(@Path("id") String id);
}
