package com.example.recyclerview2;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Android Aestro(V 1.0)", "Api Level 1"));
        exampleList.add(new ExampleItem(R.drawable.ic_audio,"Android Blender(V 1.1)","Api Level 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun,"Android cupcake(V 1.5)","Api Level 3"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Android Donut(V 1.6)", "Api Level 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_audio, "Android Eclair(V 2.0-2.1)", "Api Level 5-7"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun, "Android Froyo(V 2.1-2.2.3)", "Api Level 8"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Android Gingerbread (V 2.3-2.3.7)", "Api Level 9-10"));
        exampleList.add(new ExampleItem(R.drawable.ic_audio, "Android Honeycomb(V 3.0-3.2.6)", "Api Level 11-13"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun, "Android icecream Sandwich(V 4.0-4.0.4)", "Api Level 14-15"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Andrioid Jellybean(V 4.1-4.3.1)", "Api Level 16-18"));
        exampleList.add(new ExampleItem(R.drawable.ic_audio, "Android Kitkat(V 4.4-4.4.4)", "Api Level 19-20"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun, "Android Lollipop(V 5.0-5.1.1)", "Api Level 21-22"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Android Marshmellow(V 6.0-6.0.1)", "Api Level 23"));
        exampleList.add(new ExampleItem(R.drawable.ic_audio, "Android Nougat(V 7.0)", "Api Level 24-25"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Android Oreo(V 8.0)", "Api Level 26-27"));
        exampleList.add(new ExampleItem(R.drawable.ic_audio, "Android Pie(V 9.0)", "Api Level 28"));
        exampleList.add(new ExampleItem(R.drawable.ic_sun, "Android QueenCake(V 10.0)", "Api Level 29"));
        exampleList.add(new ExampleItem(R.drawable.ic_android, "Android R(rasgulla(V 11.0)", "Api Level 30"));


        mRecyclerView = findViewById(R.id.recycler);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}