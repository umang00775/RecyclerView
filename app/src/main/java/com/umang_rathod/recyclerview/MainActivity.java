package com.umang_rathod.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Dataset of the given structure
    ArrayList<ContactModel> arrContact = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);

        // Which type of layout we want to show
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        // Add data to the arrayList
        arrContact.add(new ContactModel(R.drawable.paimon,"Umang Rathod", "635324699"));
        arrContact.add(new ContactModel(R.drawable.paimon,"Akash Rathod", "679324699"));
        arrContact.add(new ContactModel(R.drawable.paimon,"Suresh Rathod", "679951699"));
        arrContact.add(new ContactModel(R.drawable.paimon,"Anjali Rathod", "9935375806"));
        arrContact.add(new ContactModel(R.drawable.paimon,"Dharti Rathod", "9513578526"));
        arrContact.add(new ContactModel(R.drawable.paimon,"Chicken Patel", "8698521470"));

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContact);
        recyclerView.setAdapter(adapter);
    }
}