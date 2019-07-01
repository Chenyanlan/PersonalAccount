package com.zucc.cyl31501391.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.zucc.cyl31501391.Bean.RecordBean;
import com.zucc.cyl31501391.R;

import java.util.LinkedList;

public class ListViewAdapter extends BaseAdapter {

    private LinkedList<RecordBean> records = new LinkedList<>();
    private LayoutInflater mInflater ;
    private Context mContext;

    public ListViewAdapter(Context context){
        this.mContext = context;
        mInflater = LayoutInflater.from(mContext);
    }
    public void setData(LinkedList<RecordBean> records){
        this.records = records;
        notifyDataSetChanged();
    }
    @Override
    public int getCount() {
        return records.size();
    }

    @Override
    public Object getItem(int i) {
        return records.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder ;
        if(view==null){
            view = mInflater.inflate(R.layout.cell_list_view,null);
            RecordBean recordBean =(RecordBean) getItem(i);
            holder = new ViewHolder(view,recordBean);
            view.setTag(holder);
        }else {
            holder =(ViewHolder) view.getTag();

        }
        return view;
    }
}

class ViewHolder{

    TextView remarkTV;
    TextView amountTV;
    TextView timeTV;
    ImageView categoryIcon;
    public ViewHolder(View itemView,RecordBean record){
        remarkTV = itemView.findViewById(R.id.textView_remark);
        amountTV = itemView.findViewById(R.id.textView_amount);
        timeTV = itemView.findViewById(R.id.textView_time);
        categoryIcon = itemView.findViewById(R.id.imageView_category);

        //remarkTV.setText(record.getRemark());

    }
}