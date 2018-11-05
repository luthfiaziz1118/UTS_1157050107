package com.example.syanz.ligaindonesia2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMainActivity extends AppCompatActivity {

    private ImageView foto1,foto2;
    private TextView namaClub1,namaClub2,hasil1,hasil2,deskripsi;
    String Club1,Club2,Score1,Score2,Ket;
    int gambar1,gambar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_main);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        foto1=findViewById(R.id.iv_club1_detail);
        foto2=findViewById(R.id.iv_club2_detail);
        namaClub1=findViewById(R.id.tv_club1_detail);
        namaClub2=findViewById(R.id.tv_club2_detail);
        hasil1=findViewById(R.id.tv_score1);
        hasil2=findViewById(R.id.tv_score2);
        deskripsi=findViewById(R.id.deskripsi);

        Club1=getIntent().getStringExtra("club1");
        namaClub1.setText(Club1);
        Club2=getIntent().getStringExtra("club2");
        namaClub2.setText(Club2);
        Score1=getIntent().getStringExtra("hasil1");
        hasil1.setText(Score1);
        Score2=getIntent().getStringExtra("hasil2");
        hasil2.setText(Score2);
        Ket=getIntent().getStringExtra("ket");
        deskripsi.setText(Ket);
        gambar1=getIntent().getIntExtra("foto1",0);
        foto1.setImageResource(gambar1);
        gambar2=getIntent().getIntExtra("foto2",0);
        foto2.setImageResource(gambar2);


    }
}
