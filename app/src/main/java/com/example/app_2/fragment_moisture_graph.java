package com.example.app_2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

import java.util.ArrayList;


public class fragment_moisture_graph extends Fragment {

    private LineChart test2;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_ph_graph_fragment, container, false);
        test2 = (LineChart) view.findViewById(R.id.linechart);
        test2.setDragEnabled(true);
        test2.setScaleEnabled(false);

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
        test2.setData(data);
        test2.invalidate();
        return view;
        //return inflater.inflate(R.layout.fragment_ph_graph_fragment, container, false);
    }
}