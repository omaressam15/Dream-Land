package com.genius88hgmail.omar.myapplicationdreamland;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main5Activity extends AppCompatActivity {

    private RecyclerView rvEMSR;
    private MyAdapterFour adapterFour;
    private RecyclerView.LayoutManager manager4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ArrayList<ListIteamDataFour> IteamS = new ArrayList<>();
        IteamS.add(new ListIteamDataFour("مستشفي دريم","19351"));
        IteamS.add(new ListIteamDataFour("طوارئ امن الاسكان","01119888528"));
        IteamS.add(new ListIteamDataFour("طوارئ صيانة الاسكان 24 ساعة","01001680904"));
        IteamS.add(new ListIteamDataFour("مكافحه ثعابين و حيوانات و زواحف","01225587843"));
        IteamS.add(new ListIteamDataFour("ادارة التسويق المبعات","19621"));


        rvEMSR = findViewById(R.id.RView24);
        adapterFour = new MyAdapterFour(IteamS);
        manager4 = new LinearLayoutManager(Main5Activity.this);
        rvEMSR.setAdapter(adapterFour);
        rvEMSR.setLayoutManager(manager4);
        adapterFour.setOnMyClickLicinar(new MyAdapterFour.Onclikelisaner2() {
            @Override
            public void onClikc(int i) {

            }
        });
    }
}
