package com.example.tp5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rvContacts = (RecyclerView) findViewById(R.id.rvContacts);


        contacts.add(new Contact("jean", "Pierre"));
        contacts.add(new Contact("jeanne", "D'arc"));
        contacts.add(new Contact("Pierre", "Menz"));
        contacts.add(new Contact("Arthur", "Rimbaut"));
        contacts.add(new Contact("Richard", "Coeur de lion"));
        contacts.add(new Contact("Zinedine", "Zidane"));
        contacts.add(new Contact("Yannick", "Noah"));


        ContactsAdapter adapter = new ContactsAdapter(contacts);

        rvContacts.setAdapter(adapter);

        rvContacts.setLayoutManager(new LinearLayoutManager( this));
    }
}
