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

public class MyAdaptrthree extends RecyclerView.Adapter<MyAdaptrthree.MyviewHolderr> {
    private ArrayList<Listitamdatathree> itemss;
    private OnMyClickLisenar lisenar;

    public MyAdaptrthree(ArrayList<Listitamdatathree> itemss) {
        this.itemss = itemss;
    }

    interface OnMyClickLisenar {
        void onMyClick(int i);

    }

    public void setOnMyItemClickLisenar(OnMyClickLisenar lisenar) {
        this.lisenar = lisenar;
    }

    @NonNull
    @Override
    public MyviewHolderr onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewthree, viewGroup, false);
        MyviewHolderr myviewHolderr = new MyviewHolderr(v, lisenar);
        return myviewHolderr;
    }

    @Override
    public void onBindViewHolder(@NonNull MyviewHolderr myviewHolderr, int i) {

        myviewHolderr.iv_card10.setImageResource(itemss.get(i).getIv_card());
        myviewHolderr.tv_card10.setText(itemss.get(i).getTv_card10());
        myviewHolderr.tv_cardview10.setText(itemss.get(i).getTv_cardview10());
    }

    @Override
    public int getItemCount() {
        return itemss.size();
    }

    static class MyviewHolderr extends RecyclerView.ViewHolder {

        private ImageView iv_card10;
        private TextView tv_card10;
        private TextView tv_cardview10;

        public MyviewHolderr(@NonNull final View itemView, final OnMyClickLisenar lisenar) {
            super(itemView);
            iv_card10 = itemView.findViewById(R.id.iv_card10);
            tv_card10 = itemView.findViewById(R.id.tv_card10);
            tv_cardview10 = itemView.findViewById(R.id.tv_cardveiw10);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int position = getAdapterPosition();
                    lisenar.onMyClick(position);
                    if (getPosition() == 0) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0238580023"));
                        itemView.getContext().startActivity(callIntent);


                    } else if (getPosition() == 1) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0238580024"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 2) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01011002713"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 3) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01066471665"));
                        itemView.getContext().startActivity(callIntent);


                    } else if (getPosition() == 4) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01018084809"));
                        itemView.getContext().startActivity(callIntent);


                    } else if (getPosition() == 5) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:0238580770"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 6) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01122808080"));
                        itemView.getContext().startActivity(callIntent);


                    } else if (getPosition() == 7) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01208414444"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 8) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01004381753"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 9) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01001777957"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 10) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01152730027"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 11) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01118036360"));
                        itemView.getContext().startActivity(callIntent);


                    } else if (getPosition() == 12) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01126000215"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 13) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01126000214"));
                        itemView.getContext().startActivity(callIntent);

                    } else if (getPosition() == 14) {
                        Intent callIntent = new Intent(Intent.ACTION_DIAL);
                        callIntent.setData(Uri.parse("tel:01001496358"));
                        itemView.getContext().startActivity(callIntent);

                    }
                }
            });
        }
    }
}
