package com.genius88hgmail.omar.myapplicationdreamland;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

/**
 * Created by Ahmed Naser on 1/12/2019.
 */

public class MyAdaptr extends RecyclerView.Adapter<MyAdaptr.MyviweHoler> {

    private ArrayList<listitemdata> items;
    private OnMyClickLister lister;
    public MyAdaptr (ArrayList<listitemdata> items ){
    this.items = items;
    }

     interface OnMyClickLister{
        void onMyClick(int i);
     }

     public void setOnMyItemClickListener(OnMyClickLister listener ){

        this.lister = listener;
     }


    @Override
    public MyviweHoler onCreateViewHolder(ViewGroup parent, int viewType) {
       View O = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewlistitim,parent,false );
       MyviweHoler myviweHoler = new MyviweHoler(O,lister);
        return myviweHoler;
    }

    @Override
    public void onBindViewHolder(MyviweHoler holder, int position) {

        holder.titel.setText(items.get(position).getTitel());
        holder.subtitel.setText(items.get(position).getSubtitel());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    static class MyviweHoler extends RecyclerView.ViewHolder{

        private TextView titel;
        private TextView subtitel;

        public MyviweHoler(final View itemView, final OnMyClickLister clickLister ) {
            super(itemView);
            titel = itemView.findViewById(R.id.tv_card);
            subtitel=itemView.findViewById(R.id.tv_cardveiw);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    int position = getAdapterPosition();
                    clickLister.onMyClick(position);
                    if (getPosition() == 0){
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:122"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 1){
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:123"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 2){
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:180"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition()==3){
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:121"));
                        itemView.getContext().startActivity(callIntent);

                    }else if (getPosition()==4){
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:129"));
                        itemView.getContext().startActivity(callIntent);

                    }

                    //context.startActivity(intent);
                }
            });
        }
    }
}
