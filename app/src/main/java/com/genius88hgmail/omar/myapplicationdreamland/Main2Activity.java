package com.genius88hgmail.omar.myapplicationdreamland;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


   public class Main2Activity extends AppCompatActivity {

        public RecyclerView rvcorses;
        public MyAdaptr adaptr;
        public RecyclerView.LayoutManager manager;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main2);

            ArrayList<listitemdata> items = new ArrayList<>();
            items.add(new listitemdata("الشرطة", "122"));
            items.add(new listitemdata("الاسعاف", "123"));
            items.add(new listitemdata("المطافي", "180"));
            items.add(new listitemdata("طوارئ الكهرباء", "121"));
            items.add(new listitemdata("طوارئ الغاز", "129"));


            rvcorses = findViewById(R.id.RView);
            adaptr = new MyAdaptr(items);
            manager = new LinearLayoutManager(Main2Activity.this);
            rvcorses.setLayoutManager(manager);
            rvcorses.setAdapter(adaptr);
            adaptr.setOnMyItemClickListener(new MyAdaptr.OnMyClickLister() {
                @Override
                public void onMyClick(int i) {


                }
            });
        }

    }
