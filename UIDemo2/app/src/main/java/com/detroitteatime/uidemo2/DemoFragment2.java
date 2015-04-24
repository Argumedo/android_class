package com.detroitteatime.uidemo2;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mark on 4/23/15.
 */
public class DemoFragment2 extends Fragment {
    List<RowModel> data;
    CustomAdapter adapter;




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);


            data = new ArrayList<>();
            data.add(new RowModel("StarWars I", 0));
            data.add(new RowModel("StarWars II", 0));
            data.add(new RowModel("StarWars III", 0));
            data.add(new RowModel("StarWars IV", 5));
            data.add(new RowModel("StarWars V", 5));
            data.add(new RowModel("StarWars VI", 4));


        adapter = new CustomAdapter(getActivity(), data);
        ListView list = (ListView) view.findViewById(R.id.listview2);
        list.setAdapter(adapter);



        return view;
    }



}
