package com.snapown.android;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by smritibharti on 03/02/17.
 */

public class ContactsAdapter extends BaseAdapter

{

    private ArrayList<String> contacts =  new ArrayList<>();
    private LayoutInflater mInflater;
    public ContactsAdapter(Context context)
    {

        mInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }



    public void addItem(String item)
    {

       contacts.add(item);
        notifyDataSetChanged();
    }

    @Override
    public int getCount()
    {
        return contacts.size();
    }

    @Override
    public Object getItem(int i)
    {
        return contacts.get(i);
    }

    @Override
    public long getItemId(int i)
    {
        return i;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        System.out.println("getView " + position + " " + convertView);
        ViewHolder holder = null;
        if(convertView==null)
        {
           convertView = mInflater.inflate(R.layout.contact_item,parent,false);
            holder = new ViewHolder();
            holder.contactName = (TextView)convertView.findViewById(R.id.contact_name);
            convertView.setTag(holder);

        }
        else
        {
            holder = (ViewHolder)convertView.getTag();

        }

        holder.contactName.setText(contacts.get(position));

        return convertView;
    }


    public static class ViewHolder {

        private TextView contactName;
        private ImageView contactPicture;

    }

}
