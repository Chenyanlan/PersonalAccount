package com.zucc.cyl31501391;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.zucc.cyl31501391.Adapter.ListViewAdapter;
import com.zucc.cyl31501391.Bean.RecordBean;

import java.util.LinkedList;

public class MainFragment extends Fragment {
    private View rootView;

    private TextView textView;
    private ListView listView;
    private ListViewAdapter listViewAdapter;

    private LinkedList<RecordBean> records = new LinkedList<>();

    private String date="";
    public MainFragment(String date){
        this.date =  date;
        records.add(new RecordBean());
        records.add(new RecordBean());
        records.add(new RecordBean());
        records.add(new RecordBean());

    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment,container,false);
        initView();
        return rootView;
    }
    private  void  initView(){
        textView =(TextView) rootView.findViewById(R.id.day_text);
        listView =(ListView) rootView.findViewById(R.id.listview);
        textView.setText(date);
        listViewAdapter = new ListViewAdapter(getContext());
        listViewAdapter.setData(records);
        listView.setAdapter(listViewAdapter);
        if (listViewAdapter.getCount()>0){
            rootView.findViewById(R.id.no_record_layout).setVisibility(View.INVISIBLE);
        }
    }
}
