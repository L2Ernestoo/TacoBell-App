package com.example.tacobell;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.strictmode.SqliteObjectLeakedViolation;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tacobell.utilidades.Utilidades;

public class RegistroUsuarioActivity extends AppCompatActivity {

    EditText campoID, campoNombre, campoDPI;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        campoID = (EditText) findViewById(R.id.campoID);
        campoDPI = (EditText) findViewById(R.id.campoDPI);
        campoNombre = (EditText) findViewById(R.id.campoNombre);

    }
    public void onClick(View view){
        registrarUsuarios();
    }

    private void registrarUsuarios() {
        ConexionSQLite conn=new ConexionSQLite(this,"bd_usuarios",null,1);

        SQLiteDatabase db = conn.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(Utilidades.CAMPO_ID,campoID.getText().toString());
        values.put(Utilidades.NOMBRE,campoNombre.getText().toString());
        values.put(Utilidades.DPI,campoDPI.getText().toString());

        Long idResultante = db.insert(Utilidades.TABLA_USUARIO, Utilidades.CAMPO_ID,values);

        Toast.makeText(getApplicationContext(),"ID Registro"+ idResultante, Toast.LENGTH_SHORT).show();

        db.close();
    }
}
