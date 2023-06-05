package com.example.damsem10_toastsnackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnToast, btnSnackBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Vinculamos
        btnToast = findViewById(R.id.button_Toast);
        btnSnackBar = findViewById(R.id.buttonSnackBar);

        // Evento Click
        btnToast.setOnClickListener(this);
        btnSnackBar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.button_Toast){
            Toast.makeText(this, "Mensaje de Tipo Toast", Toast.LENGTH_LONG).show();
        }else if(v.getId()==R.id.buttonSnackBar){
            Snackbar.make(v,"Mensaje de Tipo SnackBar",Snackbar.LENGTH_LONG).show();
        }
    }
}