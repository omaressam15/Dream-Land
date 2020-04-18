package com.genius88hgmail.omar.myapplicationdreamland;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    private RecyclerView RViewtow;
    private MyAdaptertow myAdaptertow;
    private RecyclerView.LayoutManager layoutManagertow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ArrayList<ListItemDataTow> litemtow = new ArrayList<>();

        litemtow.add(new ListItemDataTow(R.drawable.supermarkt,"سوبر مركت ستار","Tel:0238581552" ) );
        litemtow.add(new ListItemDataTow(R.drawable.supermarkt,"سوبر مركت ستار","Mob:01110560011" ) );
        litemtow.add(new ListItemDataTow(R.drawable.pharmacy,"صيدلية رانيا", "Tel:0238580442" ) );
        litemtow.add(new ListItemDataTow(R.drawable.pharmacy,"صيدلية رانيا","Mob:01223421938" ) );
        litemtow.add(new ListItemDataTow(R.drawable.drycleaning,"مغسلة","Mob:01001436395" ) );
        litemtow.add(new ListItemDataTow(R.drawable.drycleaning,"  مغسلة","Mob:01143337251" ) );
        litemtow.add(new ListItemDataTow(R.drawable.cartoonbakery,"مذاق العبد","Mob:01115113210"));
        litemtow.add(new ListItemDataTow(R.drawable.cartoonbakery,"مذاق العبد","Mob:01014543620"));
        litemtow.add(new ListItemDataTow(R.drawable.coffee,"Cafe Restaurant dream","Mob:01202883206"));
        litemtow.add(new ListItemDataTow(R.drawable.coffee,"Cafe Restaurant dream","Mob:01152534531"));
        litemtow.add(new ListItemDataTow(R.drawable.fawry,"فوري و خدامات الحكوميه","Mob:01011279996"));
        litemtow.add(new ListItemDataTow(R.drawable.fawry,"فوري و خدامات الحكوميه","Mob:01151064552"));
        litemtow.add(new ListItemDataTow(R.drawable.lavitahanny," منتجات لافيتا من شركه اولاد عيسى عسل و زيت زيتون و تمر \n Healthy products for a better life.","Mob:01003503505" ));
        litemtow.add(new ListItemDataTow(R.drawable.ahmadessa," منتجات لافيتا من شركه اولاد عيسى عسل و زيت زيتون و تمر \n Healthy products for a better life.","Mob:01025251234" ));
        litemtow.add(new ListItemDataTow(R.drawable.hairdresse,"كوافير صبري","Mob:01116779800" ) );
        litemtow.add(new ListItemDataTow(R.drawable.vegetables,"بيت الريف","Mob:01113778070" ) );
        litemtow.add(new ListItemDataTow(R.drawable.pet,"پت شوب","Mob:01069203010" ) );
        litemtow.add(new ListItemDataTow(R.drawable.xerox,"Xerox ","Mob:01111355935" ) );
        litemtow.add(new ListItemDataTow(R.drawable.barbershop,"حلاق دريم لاند","Mob:01008416306" ) );

        RViewtow = findViewById(R.id.RViewtow);
        myAdaptertow = new MyAdaptertow(litemtow);
        layoutManagertow = new LinearLayoutManager(Main3Activity.this);
        RViewtow.setAdapter(myAdaptertow);
        RViewtow.setLayoutManager(layoutManagertow);



        myAdaptertow.setOnMyclicklisenrtow(new MyAdaptertow.OnMyclicklisnartow() {
            @Override
            public void onMyClicktow(int i) {

            }
        });
    }
}
