package com.example.recyclerviewgambartext.models;

public class SuperHero {
    public String heroName;
    public String gambar;

    public SuperHero(String heroName, String gambar) {
        this.heroName = heroName;
        this.gambar = gambar;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }
}
