package com.example.androiddoan.views;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.DividerItemDecoration;

import com.example.androiddoan.R;
import com.example.androiddoan.adapters.ShopListAdapter;
import com.example.androiddoan.databinding.FragmentShopBinding;
import com.example.androiddoan.models.Product;
import com.example.androiddoan.viewmodels.ShopViewModel;
import com.google.android.material.snackbar.Snackbar;

import java.util.List;


public class ShopFragment extends Fragment implements ShopListAdapter.ShopInterface {
    public static final String TAG = "ShopFragment";
    FragmentShopBinding fragmentShopBinding;
    public ShopListAdapter shopListAdapter;
    public ShopViewModel shopViewModel;
    public NavController navController;
    public ShopFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentShopBinding = FragmentShopBinding.inflate(inflater, container, false);
        return fragmentShopBinding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        shopListAdapter = new ShopListAdapter(this);
        fragmentShopBinding.shopRecyclerView.setAdapter(shopListAdapter);
        fragmentShopBinding.shopRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.VERTICAL));
        fragmentShopBinding.shopRecyclerView.addItemDecoration(new DividerItemDecoration(requireContext(), DividerItemDecoration.HORIZONTAL));
        shopViewModel = new ViewModelProvider(requireActivity()).get(ShopViewModel.class);
        shopViewModel.getProducts().observe(getViewLifecycleOwner(), new Observer<List<Product>>() {
            @Override
            public void onChanged(List<Product> products) {
                shopListAdapter.submitList(products);
            }
        });
        navController = Navigation.findNavController(view);
    }

    @Override
    public void addItem(Product product) {
//        Log.d(TAG, "add: " + product.toString());
        boolean isAdded = shopViewModel.addItemToCart(product);
        if(isAdded){
            Snackbar.make(requireView(), product.getTenMonAn() + " được thêm vào giỏ", Snackbar.LENGTH_LONG)
                    .setAction("Giỏ hàng", new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            navController.navigate(R.id.action_shopFragment_to_cartFragment);
                        }
                    })
                    .show();

        }else{
            Snackbar.make(requireView(), "Sản phẩm đã đạt giới hạn số lượng sản phẩm", Snackbar.LENGTH_LONG)
                    .show();
        }
    }

    @Override
    public void onItemClick(Product product) {
//        Log.d(TAG, "onItemClick: " + product.toString());
        shopViewModel.setProduct(product);
        navController.navigate(R.id.action_shopFragment_to_detailFragment);
    }
}