package com.halil.ozel.recyclerview;

import java.util.ArrayList;

/*
 RecyclerView'da gösterilecek yapıların bilgilerini vermiş olduğumuz sınıftır.
 */

public class Manzara {

    private int imageID; // imageID değerini tutan bir değişken tanımı
    private String baslik; // String türde bir baslık değişkeni
    private String tanim; // Resim açıklaması ile ilgili değişken


    // Yukarıda tanımlanan değişkenlerin Getter - Setter Metodları oluşturuldu.

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getBaslik() {
        return baslik;
    }

    public void setBaslik(String baslik) {
        this.baslik = baslik;
    }

    public String getTanim() {
        return tanim;
    }

    public void setTanim(String tanim) {
        this.tanim = tanim;
    }


    // ArrayList işlemlerini yapacağımız bir metod tanımladık.
    public static ArrayList<Manzara>getData(){

        ArrayList<Manzara> dataList = new ArrayList<Manzara>(); // ArrayList tanımı

        // Drawable klasöründe bulunan resimleri array içine atadık.
        int [] resimler = {

                R.drawable.manzara1, R.drawable.manzara6,
                R.drawable.manzara2, R.drawable.manzara7,
                R.drawable.manzara3, R.drawable.manzara8,
                R.drawable.manzara4, R.drawable.manzara9,
                R.drawable.manzara5, R.drawable.manzara10,

        };


        // resimlerin dizisinin boyutu kadar dön
        for (int i=0;i<resimler.length;i++){

            Manzara gecici = new Manzara(); // nesne oluştur.
            gecici.setImageID(resimler[i]); // image değerlerini ata
            gecici.setBaslik("Manzara"+i); // image değerine ait başlık değerlerini ata
            gecici.setTanim("Tanım Bilgisi"+i); // image değerine ait tanımlamalari ata

            dataList.add(gecici); // bu nesneyi listeye ekle
        }


        return dataList; // bu listeyi döndür.

    }



}
