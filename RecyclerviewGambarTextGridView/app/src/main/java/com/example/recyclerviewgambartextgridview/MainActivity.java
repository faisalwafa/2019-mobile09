package com.example.recyclerviewgambartextgridview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclerviewgambartextgridview.adapters.SuperHeroAdapter;
import com.example.recyclerviewgambartextgridview.models.SuperHero;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView rvSuperHero;
    List<SuperHero> listSuperHero = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvSuperHero = findViewById(R.id.rvSuperHero);
        SuperHero hero = new SuperHero("Earthshaker", "https://gamepedia.cursecdn.com/dota2_gamepedia/a/a5/Earthshaker_icon.png?version=7f16a63e5ed6a7ec7a3889dd4aea354d");
        listSuperHero.add(hero);

        hero = new SuperHero("Invoker", "https://www.dotafire.com/images/hero/icon/invoker.png");
        listSuperHero.add(hero);

        hero = new SuperHero("Axe", "https://gamepedia.cursecdn.com/dota2_gamepedia/2/23/Axe_icon.png");
        listSuperHero.add(hero);

        hero = new SuperHero("Drow", "https://gamepedia.cursecdn.com/dota2_gamepedia/8/80/Drow_Ranger_icon.png");
        listSuperHero.add(hero);

        hero = new SuperHero("Lina", "https://gamepedia.cursecdn.com/dota2_gamepedia/3/35/Lina_icon.png?version=2bc137c161b17cd86674d29d0a0ed261");
        listSuperHero.add(hero);

        hero = new SuperHero("Anti-Mage", "https://gamepedia.cursecdn.com/dota2_gamepedia/8/8e/Anti-Mage_icon.png?version=f55b1d31df2c842ebd3e6121f4dc513d");
        listSuperHero.add(hero);

        SuperHeroAdapter superHeroAdapter = new SuperHeroAdapter(listSuperHero);
        rvSuperHero.setAdapter(superHeroAdapter);
        rvSuperHero.setLayoutManager(new GridLayoutManager(this, 2));

    }
}
