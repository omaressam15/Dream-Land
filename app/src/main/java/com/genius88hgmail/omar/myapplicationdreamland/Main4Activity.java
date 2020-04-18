package com.genius88hgmail.omar.myapplicationdreamland;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main4Activity extends AppCompatActivity {

    private RecyclerView RView10 ;
    private MyAdaptrthree adaptrthree;
    private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        ArrayList<Listitamdatathree>itemss = new ArrayList<>();
        itemss.add(new Listitamdatathree(R.drawable.pharmacy,"صيدلية مصر","Tel: 0238580023"));
        itemss.add(new Listitamdatathree(R.drawable.pharmacy,"صيدلية مصر","Tel: 0238580024"));
        itemss.add(new Listitamdatathree(R.drawable.pharmacy,"صيدلية مصر","Mob: 01011002713"));
        itemss.add(new Listitamdatathree(R.drawable.pharmacy,"صيدلية مصر","Mob: 01066471665"));
        itemss.add(new Listitamdatathree(R.drawable.vegetables,"اسواق دريم","Mob: 01018084809"));
        itemss.add(new Listitamdatathree(R.drawable.supermarkt,"البهجة مركت","Tel: 0238580770"));
        itemss.add(new Listitamdatathree(R.drawable.cartoonbakery,"Au Delice bakery","Mob: 01122808080"));
        itemss.add(new Listitamdatathree(R.drawable.zitwalamon,"زيت و ليمون","Mob: 01208414444"));
        itemss.add(new Listitamdatathree(R.drawable.drycleaning,"سندس كلين","Mob: 01004381753"));
        itemss.add(new Listitamdatathree(R.drawable.steak,"جزارة دريم","Mob: 01001777957"));
        itemss.add(new Listitamdatathree(R.drawable.steak,"جزارة دريم","Mob: 01152730027"));
        itemss.add(new Listitamdatathree(R.drawable.steak,"جزارة دريم","Mob: 01118036360"));
        itemss.add(new Listitamdatathree(R.drawable.chicken,"دجاج العبد","Mob: 01126000215"));
        itemss.add(new Listitamdatathree(R.drawable.chicken,"دجاج العبد","Mob: 01126000214"));
        itemss.add(new Listitamdatathree(R.drawable.barbershop,"حلاق دريم لاند","Mob: 01001496358"));

        RView10 = findViewById(R.id.RView10);
        adaptrthree = new  MyAdaptrthree(itemss);
        layoutManager = new LinearLayoutManager(Main4Activity. this );
        RView10.setAdapter(adaptrthree);
        RView10.setLayoutManager(layoutManager);
        adaptrthree.setOnMyItemClickLisenar(new MyAdaptrthree.OnMyClickLisenar() {
            @Override
            public void onMyClick(int i) {

            }
        });
    }
}
