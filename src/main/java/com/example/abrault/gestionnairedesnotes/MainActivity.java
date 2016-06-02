package com.example.abrault.gestionnairedesnotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    ListView mListView;
    String[] prenoms = new String[]{
            "Antoine", "Benoit", "Cyril", "David", "Eloise", "Florent"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mListView = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_list_item_1, prenoms);
        mListView.setAdapter(adapter);
    }





    public void buttonOnClick1(View v){
        Button button=(Button) v;
        setContentView(R.layout.gestion_des_eleves);

    }
    public void buttonOnClick2(View v){
        Button button=(Button) v;
        setContentView(R.layout.gestion_des_matieres);

    }
    public void buttonOnClick3(View v){
        Button button=(Button) v;
        setContentView(R.layout.gestion_des_devoirs);

    }
    public void buttonOnClick4(View v){
        Button button=(Button) v;
        setContentView(R.layout.gestion_des_classes);

    }
    public void buttonOnClickR(View v){
        Button button=(Button) v;
        setContentView(R.layout.activity_main);

    }
    public void buttonOnClickQ(View v){
        Button button=(Button) v;
        System.exit (0);

    }

}
