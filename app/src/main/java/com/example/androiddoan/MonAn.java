package com.example.androiddoan;

import static com.example.lib.RetrofitClient.getRetrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import com.example.androiddoan.Adapter.MonAnAdapter;
import com.example.lib.InterfaceRepository.Methods;
import com.example.lib.Model.MonAnModel;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MonAn extends AppCompatActivity {
    ListView listView;
    MonAnAdapter monanAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon_an);
        getMonAn();
    }

    private void getMonAn() {
        Methods methods = getRetrofit().create(Methods.class);
        Call<List<MonAnModel>> call = methods.getMonAn("MB");
        call.enqueue(new Callback<List<MonAnModel>>() {
            @Override
            public void onResponse(Call<List<MonAnModel>> call, Response<List<MonAnModel>> response) {
                List<MonAnModel> data = response.body();
                monanAdapter = new MonAnAdapter(MonAn.this, R.layout.layout_list_monan);
                listView = findViewById(R.id.Danhsach);
                for (MonAnModel dt : data) {
//                    Log.v("log:", dt.getTenMonAn());
                    monanAdapter.add(dt);
                }
                listView.setAdapter(monanAdapter);
//                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                    @Override
//                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                        ClassModel classModelD = (ClassModel)classAdapter.getItem(position);
//                        Intent intent = new Intent(MainActivity.this, DetailActivity.class);
//                        intent.putExtra("class", classModelD);
////                        Log.v("log:", classModelD.getTenMonAn());
//                        startActivity(intent);
//                    }
//                });
            }

            @Override
            public void onFailure(Call<List<MonAnModel>> call, Throwable t) {
                Log.v("log:", t.getMessage());
            }
        });
    }
}
