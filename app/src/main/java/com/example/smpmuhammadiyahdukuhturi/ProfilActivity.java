package com.example.smpmuhammadiyahdukuhturi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
    }

    public void Iden(View view) {
        Intent intent = new Intent(ProfilActivity.this, IdentitasSklhActivity.class);
        startActivity(intent);
    }

    public void Dataleng(View view) {
        Intent intent = new Intent(ProfilActivity.this, DatalengkapActivity.class);
        startActivity(intent);
    }

    public void Datarin(View view) {
        Intent intent = new Intent(ProfilActivity.this, DatarinciActivity.class);
        startActivity(intent);
    }
}