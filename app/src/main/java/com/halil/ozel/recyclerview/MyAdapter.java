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


     ArrayList<Manzara> mDataList; // Manzara türünde bir ArrayList tanımı
     LayoutInflater inflater; // LayoutInflater nesnesi tanımı

     // 2 parametre alan bir constructor metodu tanımlandı.İnflate işlemi yap
    public MyAdapter(Context context, ArrayList<Manzara> data) {

       // inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater = LayoutInflater.from(context);

        this.mDataList = data;
    }

    // inflate işlemi yapılan yapıyı ekleme işlemi yapılıyor.
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

    // item silme işlemleri
    public void deleteItem(int position){
        mDataList.remove(position); // elemanı listeden sil
        notifyItemRemoved(position); // elemanı ekrandan sil
        notifyItemRangeChanged(position,mDataList.size()); // silinen elemanla birlikte item değerlerini güncelle.

    }



    // item ekleme işlemleri
    public void addItem(int position,Manzara kopyalanacakManzara){

        mDataList.add(position,kopyalanacakManzara); // elemanı listeye ekle.
        notifyItemInserted(position); // elemanı ekrana ekle
        notifyItemRangeChanged(position,mDataList.size()); // eklenen elemanla birlikte item değerlerini güncelle.

        // notifyDataSetChanged(); değişlikleri inceler ve tekrardan işlemleri alır. Animasyon bulunmaz.
    }

    @Override
    public int getItemCount() {
        return mDataList.size(); // recyclerView'da ne kadar eleman var onu belirttik.
    }



    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView mManzaraBaslik,mManzaraAciklama;
        ImageView mManzaraResmi,mSilResmi,mKopyalaResmi;
        int pozisyon = 0;
        Manzara copyManzara;

        // itemlarda ne tip işlemler yapılacak onu belirtiyoruz.
        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            //elemanlar bulundu.
            mManzaraBaslik = itemView.findViewById(R.id.manzara_baslik);
            mManzaraAciklama = itemView.findViewById(R.id.manzara_aciklama);
            mManzaraResmi = itemView.findViewById(R.id.manzara_ekle);
            mSilResmi = itemView.findViewById(R.id.manzara_sil);
            mKopyalaResmi = itemView.findViewById(R.id.manzara_resim);

            // butona tıklanınca item ekleme işlemi yap
            mManzaraResmi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    addItem(pozisyon,copyManzara); // metod çağrılıp pozisyon ve manzara item değeri verildi.
                }
            });


            // butona tıklanınca silme işlemini yap.
            mSilResmi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    deleteItem(pozisyon); // metod çağrılıp pozisyon değeri verildi.
                }
            });





        }

        // her bir cell'de bulunan verileri değiştirme metodu
        public void setData(Manzara tiklanilanResim, int i) {

            // manzaraya ait resimlerin,açıklamaların,adların atandağı yerdir.
            this.mManzaraBaslik.setText(tiklanilanResim.getBaslik());
            this.mManzaraAciklama.setText(tiklanilanResim.getTanim());
            this.mKopyalaResmi.setImageResource(tiklanilanResim.getImageID());
            this.pozisyon=i;
            this.copyManzara = tiklanilanResim;
        }
    }




}
