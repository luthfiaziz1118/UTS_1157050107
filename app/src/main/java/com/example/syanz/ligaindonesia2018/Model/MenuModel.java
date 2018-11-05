package com.example.syanz.ligaindonesia2018.Model;

public class MenuModel {
    String clubsatu,clubdua,deskripsi,hasil1,hasil2;
    int club1,club2;

    public MenuModel(String clubsatu, String clubdua, String deskripsi, String hasil1, String hasil2, int club1, int club2) {
        this.clubsatu = clubsatu;
        this.clubdua = clubdua;
        this.deskripsi = deskripsi;
        this.hasil1 = hasil1;
        this.hasil2 = hasil2;
        this.club1 = club1;
        this.club2 = club2;
    }

    public String getClubsatu() {
        return clubsatu;
    }

    public void setClubsatu(String clubsatu) {
        this.clubsatu = clubsatu;
    }

    public String getClubdua() {
        return clubdua;
    }

    public void setClubdua(String clubdua) {
        this.clubdua = clubdua;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getHasil1() {
        return hasil1;
    }

    public void setHasil1(String hasil1) {
        this.hasil1 = hasil1;
    }

    public String getHasil2() {
        return hasil2;
    }

    public void setHasil2(String hasil2) {
        this.hasil2 = hasil2;
    }

    public int getClub1() {
        return club1;
    }

    public void setClub1(int club1) {
        this.club1 = club1;
    }

    public int getClub2() {
        return club2;
    }

    public void setClub2(int club2) {
        this.club2 = club2;
    }
}

