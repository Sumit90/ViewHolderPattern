package com.practise.http.viewholderpattern;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by e00959 on 4/9/2015.
 */
public class MyFragment extends ListFragment{

    private ArrayList<StudentPojo> studentList=null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        studentList=new ArrayList<StudentPojo>();

        String empId="E00";
        String name="Sumit";
        String address="Delhi-1100";

        for(int i=1;i<101;i++)
        {
            studentList.add(new StudentPojo(empId+i,name+i,""));
            studentList.add(new StudentPojo("","",address+i));
        }

        setListAdapter(new MyAdapter(studentList));
    }


    private class MyAdapter extends ArrayAdapter<StudentPojo>
    {
        public MyAdapter(ArrayList<StudentPojo> list)
        {
            super(getActivity(),0,list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            MyViewHolder holder;
            View v=convertView;

            if(v==null)
            {
                holder=new MyViewHolder();
                v = getActivity().getLayoutInflater().inflate(R.layout.first_file, null);
                holder.id=(TextView)v.findViewById(R.id.id_txt);
                holder.name=(TextView)v.findViewById(R.id.name_txt);
                holder.address=(TextView)v.findViewById(R.id.address_txt);

                v.setTag(holder);

            }
            else
            {
                holder=(MyViewHolder)v.getTag();
            }


            if(position%2==0) {

                holder.id.setText(studentList.get(position).getmEmpNo());
                holder.name.setText(studentList.get(position).getmEmpName());
                holder.id.setVisibility(View.VISIBLE);
                holder.name.setVisibility(View.VISIBLE);
                holder.address.setVisibility(View.GONE);

            }
            else{
                holder.id.setVisibility(View.GONE);
                holder.name.setVisibility(View.GONE);
                holder.address.setVisibility(View.VISIBLE);
                holder.address.setText(studentList.get(position).getmEmpAddress());


            }

            return v;

        }
    }

    static class MyViewHolder
    {
        TextView id;
        TextView name;
        TextView address;
    }

}
