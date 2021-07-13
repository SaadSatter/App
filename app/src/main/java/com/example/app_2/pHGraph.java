package com.example.app_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;

import java.util.ArrayList;

public class pHGraph extends AppCompatActivity {

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
//        for (int i = 0; i < 50; i++){
//            yValues.add(new Entry(i, (float)(i*3+2)));
//        }
        yValues.add(new Entry(0,2));
        yValues.add(new Entry(1,3));
        yValues.add(new Entry(2,5));
        yValues.add(new Entry(3,7));
        yValues.add(new Entry(4,11));
        yValues.add(new Entry(5,13));
        yValues.add(new Entry(6,17));
        LineDataSet set1 = new LineDataSet(yValues, "Data Set 1");


        ArrayList<ILineDataSet> datasets = new ArrayList<>();

        datasets.add(set1);

        LineData data = new LineData(datasets);
        test1.setData(data);
        test1.invalidate();

    }
}