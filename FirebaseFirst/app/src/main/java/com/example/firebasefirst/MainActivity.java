package com.example.firebasefirst;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText name,id,city,contactno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.button);
        name = findViewById(R.id.pname);
        id = findViewById(R.id.pid);
        city = findViewById(R.id.pcity);
        contactno = findViewById(R.id.pcontactno);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               String myid = id.getText().toString(); //125
               String mycity = city.getText().toString();
               String myname = name.getText().toString();
               String mycontactno = contactno.getText().toString();

               FirebaseDatabase db = FirebaseDatabase.getInstance();
               DatabaseReference ref = db.getReference("/patients");


               DatabaseReference ref2 = db.getReference("/doctors");
               
               DBHolder dbHolder = new DBHolder(myname,mycity,mycontactno);
               
               ref.child(myid).setValue(dbHolder);

               name.setText("");
               id.setText("");
               city.setText("");
               contactno.setText("");

               Toast.makeText(MainActivity.this, "Data is inserted", Toast.LENGTH_SHORT).show();


            }
        });
    }
}