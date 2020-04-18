package com.genius88hgmail.omar.myapplicationdreamland;

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

public class Myadaptersix extends RecyclerView.Adapter<Myadaptersix.MyViewHolders> {

    private ArrayList<ListItemDatasix> itemsx;
    private OnMayClickLisenar lisenar;

    public Myadaptersix(List<ListItemDatasix> items) {
        this.itemsx = (ArrayList<ListItemDatasix>) items;
    }

    interface OnMayClickLisenar {
        void OnMyClick(int i);
    }

    public void setOnMyClikeLisear(OnMayClickLisenar lisear) {
        this.lisenar = lisear;
    }

    @NonNull
    @Override
    public MyViewHolders onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewfive, viewGroup, false);
        MyViewHolders viewHolders = new MyViewHolders(v, lisenar);
        return viewHolders;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolders myViewHolders, int i) {


        myViewHolders.ivflag.setImageResource(itemsx.get(i).getFlag());
        myViewHolders.tvflag.setText(itemsx.get(i).getTvflag());
        myViewHolders.tvflag19.setText(itemsx.get(i).getTvflag18());
    }

    @Override
    public int getItemCount() {
        return itemsx.size();
    }

    static class MyViewHolders extends RecyclerView.ViewHolder {

        private ImageView ivflag;
        private TextView tvflag;
        private TextView tvflag19;

        public MyViewHolders(@NonNull final View itemView, final OnMayClickLisenar lisenar) {
            super(itemView);

            ivflag = itemView.findViewById(R.id.iv_flag);
            tvflag = itemView.findViewById(R.id.tv_flag);
            tvflag19 = itemView.findViewById(R.id.tv_falg18);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    int positon = getAdapterPosition();
                    lisenar.OnMyClick(positon);

                    if (getPosition() == 0) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:16176"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 1) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0238553273"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 2) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0238553274"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 3) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0238553275"));
                        itemView.getContext().startActivity(callIntent);


                    } else if (getPosition() == 4) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0238553278"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 5) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01027800036"));
                        itemView.getContext().startActivity(callIntent);


                    } else if (getPosition() == 6) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01000055466"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 7) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01221011222"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 8) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01204999936"));
                        itemView.getContext().startActivity(callIntent);
                    } else if (getPosition() == 9) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01000147749"));
                        itemView.getContext().startActivity(callIntent);
                    }
                }
            });
        }
    }
}
