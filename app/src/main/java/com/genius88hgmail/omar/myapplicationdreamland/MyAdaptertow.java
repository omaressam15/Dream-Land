package com.genius88hgmail.omar.myapplicationdreamland;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdaptertow extends RecyclerView.Adapter<MyAdaptertow.MyviewHoldertow> {
    Context mContext;
    List<Main3Activity> mData;
    private ArrayList<ListItemDataTow> itemstow;
    private OnMyclicklisnartow myclicklisnartow;

    public MyAdaptertow(ArrayList<ListItemDataTow> itemstow) {
        this.itemstow = itemstow;
    }

    interface OnMyclicklisnartow {
        void onMyClicktow(int i);
    }

    public MyAdaptertow(Context mContext,List<Main3Activity>mData){
       this.mContext = mContext;
       this.mData = mData;
    }

    public void setOnMyclicklisenrtow(OnMyclicklisnartow myclicklisnartow) {
        this.myclicklisnartow = myclicklisnartow;
    }

    @NonNull
    @Override
    public MyviewHoldertow onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View V = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewtow, viewGroup, false);
        MyviewHoldertow myviewHoldertow = new MyviewHoldertow(V, myclicklisnartow);
        return myviewHoldertow;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHoldertow myviewHoldertow, int i) {

        myviewHoldertow.photo.setImageResource(itemstow.get(i).getPhoto());
        myviewHoldertow.name.setText(itemstow.get(i).getName());
        myviewHoldertow.number.setText(itemstow.get(i).getNumber());
    }

    @Override
    public int getItemCount() {
        return itemstow.size();
    }

    static class MyviewHoldertow extends RecyclerView.ViewHolder {

        private ImageView photo;
        private TextView name;
        private TextView number;

        public MyviewHoldertow(@NonNull final View itemViewT, final OnMyclicklisnartow onMyclicklisnartow) {
            super(itemViewT);
            photo = itemViewT.findViewById(R.id.iv_card2);
            name = itemViewT.findViewById(R.id.tv_card2);
            number = itemViewT.findViewById(R.id.tv_cardveiw2);
            itemViewT.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    onMyclicklisnartow.onMyClicktow(position);
                    if (getPosition() == 0) {

                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0238581552"));
                        itemViewT.getContext().startActivity(callIntent);


                    } else if (getPosition() == 1) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01110560011"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 2) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0238580442"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 3) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01223421938"));
                        itemViewT.getContext().startActivity(callIntent);


                    } else if (getPosition() == 4) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01001436395"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 5) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01143337251"));
                        itemViewT.getContext().startActivity(callIntent);


                    } else if (getPosition() == 6) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01115113210"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 7) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01014543620"));
                        itemViewT.getContext().startActivity(callIntent);

                          } else if (getPosition() == 8) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01202883206"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 9) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01152534531"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 10) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01011279996"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 11) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01151064552"));
                        itemViewT.getContext().startActivity(callIntent);



                    }else if (getPosition() == 12) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01003503505"));
                        itemViewT.getContext().startActivity(callIntent);

                    }else if (getPosition() == 13) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01025251234"));
                        itemViewT.getContext().startActivity(callIntent);


                    } else if (getPosition() == 14) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01116779800"));
                        itemViewT.getContext().startActivity(callIntent);
                    } else if (getPosition() == 15) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01113778070"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 16) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01069203010"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 17) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01111355935"));
                        itemViewT.getContext().startActivity(callIntent);

                    } else if (getPosition() == 18) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01008416306"));
                        itemViewT.getContext().startActivity(callIntent);

                    }
                }
            });
        }
    }
}
