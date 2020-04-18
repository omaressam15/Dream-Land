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

public class MyAdapterFour extends RecyclerView.Adapter<MyAdapterFour.MyViewHolderF> {
    private ArrayList<ListIteamDataFour>itemS;
    private Onclikelisaner2 licinar;
    public MyAdapterFour (ArrayList<ListIteamDataFour>itemS){

        this.itemS = itemS;
    }
    interface Onclikelisaner2{
        void onClikc(int i);
    }

    public void setOnMyClickLicinar(Onclikelisaner2 licinar ){
        this.licinar = licinar;
    }
    @NonNull
    @Override
    public MyViewHolderF onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

       View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.cardviewfour,viewGroup,false);
       MyViewHolderF  viewHolderF = new MyViewHolderF(v,licinar);

        return viewHolderF;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolderF myViewHolderF, int i) {

        myViewHolderF.TV_Four.setText(itemS.get(i).getTVfour());
        myViewHolderF.TV_Four2.setText(itemS.get(i).getTVfour2());
    }

    @Override
    public int getItemCount() {
        return itemS.size();
    }

    static class MyViewHolderF extends RecyclerView.ViewHolder {

        private ImageView IV_Four;
        private TextView TV_Four;
        private TextView TV_Four2;

    public MyViewHolderF(@NonNull final View itemView, final Onclikelisaner2 onclikelisaner2 ) {
        super(itemView);
        TV_Four = itemView.findViewById(R.id.TV_Four);
        TV_Four2 = itemView.findViewById(R.id.TV_Four2);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = getAdapterPosition();
                onclikelisaner2.onClikc(position);
                if (getPosition() == 0){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:19351"));
                    itemView.getContext().startActivity(callIntent);

                } else if (getPosition() == 1){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01119888528"));
                    itemView.getContext().startActivity(callIntent);

                } else if (getPosition() == 2){
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01001680904"));
                    itemView.getContext().startActivity(callIntent);

                } else if (getPosition()==3) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:01225587843"));
                    itemView.getContext().startActivity(callIntent);
                }
                else if (getPosition()==4) {
                    Intent callIntent = new Intent(Intent.ACTION_DIAL);
                    callIntent.setData(Uri.parse("tel:19621"));
                    itemView.getContext().startActivity(callIntent);
                }
            }
        });
    }
}

}
