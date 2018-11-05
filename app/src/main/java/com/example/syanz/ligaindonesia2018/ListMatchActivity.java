package com.example.syanz.ligaindonesia2018;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.syanz.ligaindonesia2018.Adapter.AdapterActivity;
import com.example.syanz.ligaindonesia2018.Model.MenuModel;

import java.util.ArrayList;

public class ListMatchActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    AdapterActivity mAdapter;

    ArrayList<MenuModel> daftarMenu = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_match);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        daftarMenu.add(new MenuModel("Persib", "Persija", "Pertandingan Persib dengan Persija Pada Tanggal 30 Oktober 2018", "2", "1", R.drawable.persib, R.drawable.persija));
        daftarMenu.add(new MenuModel("Persebaya", "Persib", "Pertandingan Persebaya dengan Persib Pada Tanggal 23 Oktober 2018", "1", "1", R.drawable.persibaya, R.drawable.persib));
        daftarMenu.add(new MenuModel("Persija", "Persebaya", "Pertandingan Persija dengan Persebaya Pada Tanggal 20 Oktober 2018", "3", "3", R.drawable.persija, R.drawable.persibaya));
        daftarMenu.add(new MenuModel("Persela", "Persib", "Pertandingan Persela dengan Persib Pada Tanggal 5 Oktober 2018", "2", "0", R.drawable.ic_lamongan, R.drawable.persib));
        daftarMenu.add(new MenuModel("Persija", "Persela", "Pertandingan Persija dengan Persela Pada Tanggal 12 Oktober 2018", "2", "3", R.drawable.persija, R.drawable.ic_lamongan));
        daftarMenu.add(new MenuModel("Persela", "Persebaya", "Pertandingan Persela dengan Persebaya Pada Tanggal 31 Oktober 2018", "4", "1", R.drawable.ic_lamongan, R.drawable.persibaya));
        /*daftarMenu.add(new MenuModel("Arema", "PSM", "Pertandingan Arema dengan PSM Makasar Pada Tanggal 10 Oktober 2018", "3", "1", R.drawable.arema, R.drawable.makasar));
*/

        mRecyclerView = findViewById(R.id.rv_listmatch);
        mAdapter = new AdapterActivity(ListMatchActivity.this, daftarMenu);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

       @Override
        public boolean onCreateOptionsMenu (Menu menu){
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.main, menu);
            return true;
        }

        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            // Handle action bar item clicks here. The action bar will
            // automatically handle clicks on the Home/Up button, so long
            // as you specify a parent activity in AndroidManifest.xml.
            int id = item.getItemId();

            //noinspection SimplifiableIfStatement
            if (id == R.id.action_news) {
                Intent web = new Intent(Intent.ACTION_VIEW);
                String URL = "https://sport.detik.com/sepakbola/liga-indonesia";
                web.setData(Uri.parse(URL));
                startActivity(web);
                return true;
            } else if (id == R.id.action_home) {
                Intent intent = new Intent(ListMatchActivity.this, MainActivity.class);
                startActivity(intent);
                return true;
            }
              /*else if (id == R.id.action_exit) {
                System.exit(0);
            }*/

            return super.onOptionsItemSelected(item);
        }
    }
