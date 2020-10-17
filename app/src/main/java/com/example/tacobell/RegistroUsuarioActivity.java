package com.example.tacobell;

import android.os.Bundle;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class RegistroUsuarioActivity extends AppCompatActivity {

    EditText campoID, campoNombre, campoDPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoDPI = (EditText) findViewById(R.id.campoID);

    }
}
