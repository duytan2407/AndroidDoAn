package com.example.androiddoan.repositories;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.androiddoan.models.CartItem;
import com.example.androiddoan.models.Product;

import java.util.ArrayList;
import java.util.List;

public class CartRepo {

    private MutableLiveData<List<CartItem>> mutableCart = new MutableLiveData<>();
    public LiveData<List<CartItem>> getCart(){
        if(mutableCart.getValue() == null){
            initCart();
        }
        return mutableCart;
    }

    public void initCart() {
        mutableCart.setValue(new ArrayList<CartItem>());
    }
    public boolean addItemToCart(Product product){
        if(mutableCart.getValue() == null){
            initCart();
        }
        List<CartItem> cartItemList = new ArrayList<>(mutableCart.getValue());
        for(CartItem cartItem : cartItemList){
            if(cartItem.getProduct().getId().equals(product.getId())){
                if(cartItem.getQuantity() == 3){
                    return false;
                }
                int index = cartItemList.indexOf(cartItem);
                cartItem.setQuantity(cartItem.getQuantity() + 1);
                cartItemList.set(index, cartItem);
                mutableCart.setValue(cartItemList);
                return true;
            }
        }

        CartItem cartItem = new CartItem(product, 1);
        cartItemList.add(cartItem);
        mutableCart.setValue(cartItemList);
        return true;
    }
    public void removeItemFromCart(CartItem cartItem){
        if(mutableCart.getValue() == null){
            return;
        }
        List<CartItem> cartItemList = new ArrayList<>(mutableCart.getValue());
        cartItemList.remove(cartItem);
        mutableCart.setValue(cartItemList);
    }
}
