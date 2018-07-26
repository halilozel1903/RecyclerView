package com.halil.ozel.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView; // recyclerView tanımlaması

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView); // tanımlanan veriyi bulma
        MyAdapter myAdapter = new MyAdapter(this, Manzara.getData()); // adapter oluşturma
        recyclerView.setAdapter(myAdapter); // RecyclerView'e adapter'i ekle


        // LayoutManager oluştur. Özelliklerini ayarladık.
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL); // dikey olacak
        recyclerView.setLayoutManager(linearLayoutManager); // eklendi.

    }

    // Menu olusturma işlemi yapıldı.
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.layout_menu, menu); // menuyu tanıttık.
        return super.onCreateOptionsMenu(menu);
    }


    // menude bulunan elemanlara tıklanınca ne olması gerekiyor onlarla ilgili işlemler
    @Override
    public boolean onOptionsItemSelected(MenuItem item)

    {

        int id = item.getItemId(); // id değerleri alındı.


        // id değerleri karşılaştırılıyor.
        switch (id) {

            case R.id.linearViewHorizontal:
                LinearLayoutManager linearLayoutHorizontalManager = new LinearLayoutManager(this);
                linearLayoutHorizontalManager.setOrientation(LinearLayoutManager.HORIZONTAL);
                recyclerView.setLayoutManager(linearLayoutHorizontalManager);
                break;

            case R.id.linearViewVertical:
                LinearLayoutManager linearLayoutVerticalManager = new LinearLayoutManager(this);
                linearLayoutVerticalManager.setOrientation(LinearLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(linearLayoutVerticalManager);
                break;

            case R.id.gridView:
                GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
                recyclerView.setLayoutManager(gridLayoutManager);
                break;

            case R.id.staggeredViewHorizontal:

                StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
                recyclerView.setLayoutManager(staggeredGridLayoutManager);

                break;


            case R.id.staggeredViewVertical:

                StaggeredGridLayoutManager staggeredGridLayoutManager2 = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
                recyclerView.setLayoutManager(staggeredGridLayoutManager2);


                break;


        }

        return super.onOptionsItemSelected(item);
    }
}
