package com.example.androiddoan.repositories;

import static com.example.androiddoan.RetrofitClient.getRetrofit;

import android.util.Log;
import android.widget.Toast;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.androiddoan.InterfaceRepository.Methods;
import com.example.androiddoan.RetrofitClient;
import com.example.androiddoan.models.Product;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ShopRepo {
    public MutableLiveData<List<Product>> mutableProductList;
    public LiveData<List<Product>> getProducts(){
        if(mutableProductList == null){
            mutableProductList = new MutableLiveData<>();
            loadProduct();
        }
        return mutableProductList;
    }
    public void loadProduct() {
//        List<Product> productList = new ArrayList<>();
        Methods methods = RetrofitClient.getRetrofit().create(Methods.class);
        Call<List<Product>> call = methods.loadProduct();
        call.enqueue(new Callback<List<Product>>() {
            @Override
            public void onResponse(Call<List<Product>> call, Response<List<Product>> response) {
                mutableProductList.setValue(response.body());
            }

            @Override
            public void onFailure(Call<List<Product>> call, Throwable t) {
                Log.d("Error", t.toString());
            }
        });
    }

}
