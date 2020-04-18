package com.genius88hgmail.omar.myapplicationdreamland;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Main6Activity extends AppCompatActivity {

    // public int [] flag = {R.drawable.seoudilogo,R.drawable.seoudilogo,R.drawable.seoudilogo,R.drawable.seoudilogo,R.drawable.seoudilogo,
    //   R.drawable.salesucre,R.drawable.burger,R.drawable.salamanka,R.drawable.baladina};

    //  private ArrayList <ListItemDatasix> items = new ArrayList<>();
    private RecyclerView Rvfalg19;
    private Myadaptersix adpter19;
    private RecyclerView.LayoutManager layoutManager19;

    private String[] tvflag18;
    private String[] tvflag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        ArrayList<ListItemDatasix> items = new ArrayList<>();
        items.add(new ListItemDatasix(R.drawable.seoudilogo, "سعودي", "16176"));
        items.add(new ListItemDatasix(R.drawable.seoudilogo, "سعودي", "0238553273"));
        items.add(new ListItemDatasix(R.drawable.seoudilogo, "سعودي", "0238553274"));
        items.add(new ListItemDatasix(R.drawable.seoudilogo, "سعودي", "0238553275"));
        items.add(new ListItemDatasix(R.drawable.seoudilogo, "سعودي", "0238553278"));
        items.add(new ListItemDatasix(R.drawable.pharmacy, "صيدليات سيف ", "01027800036"));
        items.add(new ListItemDatasix(R.drawable.salesucre, "ساليه سوكريه", "01000055466"));
        items.add(new ListItemDatasix(R.drawable.burger, "برجر فاكتوري", "01221011222"));
        items.add(new ListItemDatasix(R.drawable.salamanka, "سلامنكا", "01204999936"));
        items.add(new ListItemDatasix(R.drawable.baladina, "بلدينا", "01000147749"));

        tvflag18 = getResources().getStringArray(R.array.tvflag18);
        tvflag = getResources().getStringArray(R.array.tvflag);
        Rvfalg19 = findViewById(R.id.RVflag19);
        layoutManager19 = new LinearLayoutManager(Main6Activity.this);
        //Rvfalg19 .setHasFixedSize(true);
        Rvfalg19.setLayoutManager(layoutManager19);
        //   getflagMall();
        adpter19 = new Myadaptersix(items);
        Rvfalg19.setAdapter(adpter19);


        adpter19.setOnMyClikeLisear(new Myadaptersix.OnMayClickLisenar() {
            @Override
            public void OnMyClick(int i) {

            }
        });

    }
    // private void getflagMall() {
    //    for (int i = 0; i < 10; i++) {
    //     ListItemDatasix cardSet = new ListItemDatasix();
    //     cardSet.setFlag(flag [i]);
    //     cardSet.setTvflag( tvflag [i]);
    //    cardSet.setTvflag18( tvflag18 [i]);
    //    items.add(cardSet);
}
//   }
//}
