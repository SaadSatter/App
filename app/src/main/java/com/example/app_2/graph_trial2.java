package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;

public class graph_trial2 extends AppCompatActivity {
    private LineChart test1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph_trial2);
        test1 = (LineChart) findViewById(R.id.linechart);
//        test1.setOnChartGestureListener(GraphTest.this);
//        test1.setOnChartValueSelectedListener(GraphTest.this);
        test1.setDragEnabled(true);
        test1.setScaleEnabled(false);

        ArrayList<Entry> yValues = new ArrayList<>();
        for (int i = 0; i < 50; i++){
            yValues.add(new Entry(i, i*3+2));
        }
        LineDataSet set1 = new LineDataSet(yValues, "Data Set 1");
        set1.setFillAlpha(110);

        ArrayList<ILineDataSet> datasets = new ArrayList<>();

        datasets.add(set1);

        LineData data = new LineData(datasets);
        test1.setData(data);
    }
}