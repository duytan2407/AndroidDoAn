package com.example.androiddoan.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.androiddoan.models.CartItem;
import com.example.androiddoan.models.Product;
import com.example.androiddoan.repositories.CartRepo;
import com.example.androiddoan.repositories.ShopRepo;

import java.util.List;

public class ShopViewModel extends ViewModel {
    ShopRepo shopRepo = new ShopRepo();
    CartRepo cartRepo = new CartRepo();
    MutableLiveData<Product> mutableProduct = new MutableLiveData<>();

    public LiveData<List<Product>> getProducts(){
        return shopRepo.getProducts();
    }

    public void setProduct(Product product){
        mutableProduct.setValue(product);
    }

    public LiveData<Product> getProduct(){
        return mutableProduct;
    }
    public LiveData<List<CartItem>> getCart(){
        return cartRepo.getCart();
    }

    public boolean addItemToCart(Product product){
        return cartRepo.addItemToCart(product);
    }
    public void removeItemFromCart(CartItem cartItem){
        cartRepo.removeItemFromCart(cartItem);
    }
    public void resetCart(){
        cartRepo.initCart();
    }
    public void changeQuantity(CartItem cartItem, int quantity){
        cartRepo.changeQuantity(cartItem, quantity);
    }
}
