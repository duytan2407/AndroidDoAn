package com.example.lib.InterfaceRepository;



import com.example.lib.Model.MonAnModel;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.QueryName;

public interface Methods {
    @GET("MonAn")
    Call<List<MonAnModel>> getMonAn(
            @Query("idmien") String idmien
    );
//    @POST("MonAn")
//    Call<ClassModel> insertClass(@Body ClassModel classModelD);
//    @PUT("MonAn/{id}")
//    Call<ClassModel> updateClass(@Path("id") String id, @Body ClassModel classModelD);
//    @DELETE("MonAn/{id}")
//    Call<ClassModel> deleteClass(@Path("id") String id);
}
