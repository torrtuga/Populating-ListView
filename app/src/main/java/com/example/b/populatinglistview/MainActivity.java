package com.example.b.populatinglistview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] androidVersions = {"Cupcake","Donut","Eclair","Froyo","GingerBread",
        "Honeycomb","IceCreamSandwich","JellyBean","KitKat","Lollipop","Marshmallow",
        "Nougat"};  // String array containing the items to be filled

//        ListAdapter myAdapter  = new ArrayAdapter<String>(this,R.layout.row_layout,
//                R.id.textView,androidVersions);

        ListAdapter myAdapter = new CustomAdapter(this,androidVersions);
        ListView myListView = (ListView) findViewById(R.id.list_item);
        myListView.setAdapter(myAdapter);
    }
}
