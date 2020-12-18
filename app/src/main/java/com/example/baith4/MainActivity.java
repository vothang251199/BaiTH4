package com.example.baith4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    AdapterMon adapterMon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcv_mon);
        adapterMon = new AdapterMon();

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        recyclerView.setLayoutManager(gridLayoutManager);

        adapterMon.setData(getListMon());
        recyclerView.setAdapter(adapterMon);
    }
    private List<Mon> getListMon(){
        List<Mon> mons = new ArrayList<>();
        mons.add(new Mon(R.drawable.ic_drink1, "Đồ uống thứ nhất", "36.000đ"));
        mons.add(new Mon(R.drawable.ic_drink2, "Đồ uống thứ hai", "40.000đ"));
        mons.add(new Mon(R.drawable.ic_drink3, "Đồ uống thứ ba", "45.000đ"));
        mons.add(new Mon(R.drawable.ic_drink4, "Đồ uống thứ tư", "55.000đ"));
        mons.add(new Mon(R.drawable.ic_drink_test, "Đồ uống thứ năm", "30.000đ"));
        mons.add(new Mon(R.drawable.ic_drink1, "Đồ uống thứ sáu", "36.000đ"));
        return mons;
    }

}