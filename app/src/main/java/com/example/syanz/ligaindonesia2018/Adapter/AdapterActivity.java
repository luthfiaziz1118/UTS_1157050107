package com.example.syanz.ligaindonesia2018.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.syanz.ligaindonesia2018.DetailMainActivity;
import com.example.syanz.ligaindonesia2018.Model.MenuModel;
import com.example.syanz.ligaindonesia2018.R;

import java.util.ArrayList;

public class AdapterActivity extends RecyclerView.Adapter<AdapterActivity.ListMenuViewHolder> {

    //deklarasi global variabel
    private Context context;
    private final ArrayList<MenuModel> listResto;

    //konstruktor untuk menerima data adapter
    public AdapterActivity(Context context, ArrayList<MenuModel> listResto) {
        this.context = context;
        this.listResto = listResto;
    }

    //view holder berfungsi untuk setting list item yang digunakan
    @Override
    public ListMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_match, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mItemView.setLayoutParams(layoutParams);

        return new ListMenuViewHolder(mItemView, this);
    }

    //bind view holder berfungsi untuk set data ke view yang ditampilkan pada list item
    @Override
    public void onBindViewHolder(ListMenuViewHolder holder, int position) {
        final MenuModel mCurrent = listResto.get(position);
        holder.clubSatu.setText(mCurrent.getClubsatu());
        holder.clubDua.setText(mCurrent.getClubdua());
        holder.fotoClubSatu.setImageResource(mCurrent.getClub1());
        holder.fotoClubDua.setImageResource(mCurrent.getClub2());

    }

    //untuk menghitung jumlah data yang ada pada list
    @Override
    public int getItemCount() {
        return listResto.size();
    }

    public class ListMenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView clubSatu,clubDua,deskripsiClub,hasilsatu,hasildua;
        private ImageView fotoClubSatu,fotoClubDua;
        private CardView cv_club;

        final AdapterActivity mAdapter;

        //untuk casting view yang digunakan pada list item
        public ListMenuViewHolder(View itemView, AdapterActivity adapter) {
            super(itemView);
            cv_club = itemView.findViewById(R.id.cv_club);
            clubSatu = itemView.findViewById(R.id.tv_club1);
            clubDua= itemView.findViewById(R.id.tv_club2);
            fotoClubSatu = itemView.findViewById(R.id.iv_club1);
            fotoClubDua = itemView.findViewById(R.id.iv_club2);
            deskripsiClub = itemView.findViewById(R.id.deskripsi);
            hasilsatu=itemView.findViewById(R.id.tv_score1);
            hasildua=itemView.findViewById(R.id.tv_score2);

            this.mAdapter = adapter;
            cv_club.setOnClickListener(this);
        }

        //untuk menambah action click pada list item
        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            MenuModel element = listResto.get(mPosition);

            //intent ke main activity dengan passing data
            Intent i = new Intent(context, DetailMainActivity.class);

            i.putExtra("club1", element.getClubsatu());
            i.putExtra("club2", element.getClubdua());
            i.putExtra("foto1", element.getClub1());
            i.putExtra("foto2", element.getClub2());
            i.putExtra("ket", element.getDeskripsi());
            i.putExtra("hasil1", element.getHasil1());
            i.putExtra("hasil2", element.getHasil2());


            context.startActivity(i);
            mAdapter.notifyDataSetChanged();
        }
    }
}
