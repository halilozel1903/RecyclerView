package com.halil.ozel.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {


     ArrayList<Manzara> mDataList;
     LayoutInflater inflater;

    public MyAdapter(Context context, ArrayList<Manzara> data) {

       // inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater = LayoutInflater.from(context);

        this.mDataList = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View v = inflater.inflate(R.layout.list_item,viewGroup,false);
        MyViewHolder holder = new MyViewHolder(v);

        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {

        Manzara tiklanilanResim = mDataList.get(i);
        myViewHolder.setData(tiklanilanResim,i);

    }

    @Override
    public int getItemCount() {
        return mDataList.size();
    }



    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView mManzaraBaslik,mManzaraAciklama;
        ImageView mManzaraResmi,mSilResmi,mKopyalaResmi;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            mManzaraBaslik = itemView.findViewById(R.id.manzara_baslik);
            mManzaraAciklama = itemView.findViewById(R.id.manzara_aciklama);
            mManzaraResmi = itemView.findViewById(R.id.manzara_ekle);
            mSilResmi = itemView.findViewById(R.id.manzara_sil);
            mKopyalaResmi = itemView.findViewById(R.id.manzara_resim);

        }

        public void setData(Manzara tiklanilanResim, int i) {

            this.mManzaraBaslik.setText(tiklanilanResim.getBaslik());
            this.mManzaraAciklama.setText(tiklanilanResim.getTanim());
            this.mKopyalaResmi.setImageResource(tiklanilanResim.getImageID());
        }
    }




}
