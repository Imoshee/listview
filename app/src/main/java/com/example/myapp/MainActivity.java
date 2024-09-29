package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    private ListView listView;
    Button btn;
    private ArrayList<Integer> imagList=new ArrayList<>();
    private ImageView image;
    private ArrayList<String> arr = new ArrayList<String>();
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imagList=new ArrayList<>();

         image=findViewById(R.id.im);
         listView = findViewById(R.id.list);

         imagList.add(R.drawable.bananas);
         imagList.add(R.drawable.apple);
         imagList.add(R.drawable.cherries);
         imagList.add(R.drawable.pineapple);
         imagList.add(R.drawable.watermelon);
         imagList.add(R.drawable.strawberry);
         arr.add("bananas");
         arr.add("apple");
         arr.add("cherries");
         arr.add("pineapple");
         arr.add("watermelon");
         arr.add("strawberry");



        listView.setOnItemClickListener(this);
        ArrayAdapter<String> adapter= new ArrayAdapter<String>
                (this,android.R.layout.simple_list_item_1,arr);
        listView.setAdapter(adapter);

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {


        image.setImageResource(imagList.get(i));
        Toast.makeText(this,arr.get(i)+"  was clicked",Toast.LENGTH_SHORT).show();


    }
}