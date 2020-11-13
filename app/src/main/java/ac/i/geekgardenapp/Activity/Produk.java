package ac.i.geekgardenapp.Activity;

import ac.i.geekgardenapp.Produk.ALFERD;
import ac.i.geekgardenapp.Produk.DOM;
import ac.i.geekgardenapp.Produk.GES;
import ac.i.geekgardenapp.Produk.GeekPos;
import ac.i.geekgardenapp.Produk.MedStore;
import ac.i.geekgardenapp.Produk.NOMAD;
import ac.i.geekgardenapp.Produk.UDIO;
import ac.i.geekgardenapp.Produk.eGov;
import ac.i.geekgardenapp.R;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Produk extends AppCompatActivity {

    CardView dom , ges , geekpos , udio , nomand , medstore , alferd , egov;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produk);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        dom = findViewById(R.id.DOM);
        ges = findViewById(R.id.GES);
        geekpos = findViewById(R.id.Geekpos);
        udio = findViewById(R.id.UDIO);
        nomand = findViewById(R.id.Nomand);
        medstore = findViewById(R.id.MedStore);
        alferd = findViewById(R.id.alferd);
        egov = findViewById(R.id.eGOV);

        ges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, GES.class);
                startActivity(i);
            }
        });


        udio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, UDIO.class);
                startActivity(i);
            }
        });

        dom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, DOM.class);
                startActivity(i);
            }
        });

        alferd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, ALFERD.class);
                startActivity(i);
            }
        });

        egov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, eGov.class);
                startActivity(i);
            }
        });

        geekpos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, GeekPos.class);
                startActivity(i);
            }
        });

        medstore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, MedStore.class);
                startActivity(i);
            }
        });

        nomand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Produk.this, NOMAD.class);
                startActivity(i);
            }
        });
    }
}