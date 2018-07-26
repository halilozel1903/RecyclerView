package com.halil.ozel.recyclerview;

import java.util.ArrayList;

public class Manzara {

    private int imageID;
    private String baslik;
    private String tanim;

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


    public static ArrayList<Manzara>getData(){

        ArrayList<Manzara> dataList = new ArrayList<Manzara>();

        int [] resimler = {

                R.drawable.manzara1, R.drawable.manzara6,
                R.drawable.manzara2, R.drawable.manzara7,
                R.drawable.manzara3, R.drawable.manzara8,
                R.drawable.manzara4, R.drawable.manzara9,
                R.drawable.manzara5, R.drawable.manzara10,

        };


        for (int i=0;i<resimler.length;i++){

            Manzara gecici = new Manzara();
            gecici.setImageID(resimler[i]);
            gecici.setBaslik("Manzara"+i);
            gecici.setTanim("Tanım Bilgisi"+i);

            dataList.add(gecici);
        }


        return dataList;

    }



}
