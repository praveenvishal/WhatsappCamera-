package com.snapown.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_contact);
        ListView lv = (ListView)findViewById(R.id.contact_list);
        ContactsAdapter contactsAdapter = new ContactsAdapter(this);
        for(int i=1;i<51;i++)
        {

            contactsAdapter.addItem("Item"+i);

        }
         lv.setAdapter(contactsAdapter);





    }











}
