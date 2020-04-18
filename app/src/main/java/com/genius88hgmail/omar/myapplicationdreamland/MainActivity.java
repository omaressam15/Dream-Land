package com.genius88hgmail.omar.myapplicationdreamland;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class MainActivity extends AppCompatActivity {
    GridView androidGridView;
    private InterstitialAd mInterstitialAd;
    private AdView mAdView;
    CollapsingToolbarLayout collapsingToolbarLayoutAndroid;
    CoordinatorLayout rootLayoutAndroid;
    private TextView Emergency;
    String[] gridViewString = {"طوارئ", "السنترالشمالي", "السنترالغربي", "طوارئ وخدمات","فلاج مول"
    };

    int[] gridViewImageId = {R.drawable.emergency, R.drawable.dliveryicon, R.drawable.dliveryicon, R.drawable.dreamland,R.drawable.flag19
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // final String [] gridViewString = getResources().getStringArray(R.array.gridViewString);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-2215062627887475/8542463217");

        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().addTestDevice (AdRequest.DEVICE_ID_EMULATOR) .build ();
        mAdView.loadAd(adRequest);


        Toolbar toolbar = findViewById(R.id.anim_toolbar);
        setSupportActionBar(toolbar);
        CustomGridViewActivity adapterViewAndroid = new CustomGridViewActivity(MainActivity.this, gridViewString, gridViewImageId);
        androidGridView = (GridView) findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                final Intent intent;
                switch (position) {
                    case 0:
                        mInterstitialAd.show();
                        Intent mainIntent1 = new Intent(MainActivity.this, Main2Activity.class);
                        MainActivity.this.startActivity(mainIntent1);
                        break;

                        case 1:
                            mInterstitialAd.show();
                            Intent mainIntent2 = new Intent(MainActivity.this, Main3Activity.class);
                            MainActivity.this.startActivity(mainIntent2);
                            break;

                      case 2:
                          mInterstitialAd.show();
                          Intent mainIntent4 = new Intent(MainActivity.this, Main4Activity.class);
                        MainActivity.this.startActivity(mainIntent4);
                        break;

                      case 3:
                          mInterstitialAd.show();
                          Intent mainIntent3 = new Intent(MainActivity.this, Main5Activity.class);
                        MainActivity.this.startActivity(mainIntent3);
                        break;
                        case 4:
                            mInterstitialAd.show();
                            Intent mainIntent5 = new Intent(MainActivity.this, Main6Activity.class);
                        MainActivity.this.startActivity(mainIntent5);
                            break;

                }
            }
        });
        mInterstitialAd  = new InterstitialAd(this);
        MobileAds.initialize(this,"ca-app-pub-2215062627887475~1497308212");
        mInterstitialAd.setAdUnitId("ca-app-pub-2215062627887475/1961053086");
        mInterstitialAd.loadAd(new AdRequest.Builder().build());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater convertor = getMenuInflater();
        convertor.inflate(R.menu.menu, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id==R.id.app_exit){
            AlertDialog.Builder alert = new AlertDialog.Builder(MainActivity.this);
            alert.setTitle(R.string.exit);
            alert.setMessage(R.string.name4);
            alert.setPositiveButton(R.string.YES, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            alert.setNegativeButton(R.string.No,null);
            alert.setCancelable(false);
            alert.show();

        } if (id==R.id.facebook){
            Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://messaging/+100001030816929"));
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }
}




