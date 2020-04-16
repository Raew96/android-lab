package com.example.android_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> target;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] values = new String[]
                {
                        "Kot", "Koń", "Gołab", "Kruk", "Dzik", "Karp", "Osioł", "Chomik", "Mysz", "Jez", "Karaluch"
                };

        this.target = new ArrayList<>();
        this.target.addAll(Arrays.asList(values));

        this.adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, this.target );

        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(this.adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return  true;
    }

    public void nowyWpis(MenuItem menu)
    {
        Intent intecja = new Intent(this, DodajWpis.class);
        startActivityForResult(intecja, 1);
    }

}
