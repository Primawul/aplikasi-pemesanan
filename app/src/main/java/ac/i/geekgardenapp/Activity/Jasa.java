package ac.i.geekgardenapp.Activity;

import ac.i.geekgardenapp.Jasa.KonstruksiSourceCode;
import ac.i.geekgardenapp.Jasa.ManajemenIT;
import ac.i.geekgardenapp.Jasa.PerancanganDanAnalisa;
import ac.i.geekgardenapp.Jasa.SoftwareTesting;
import ac.i.geekgardenapp.Jasa.TechnicalSupport;
import ac.i.geekgardenapp.Jasa.TrainingDanWorkshop;
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
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Jasa extends AppCompatActivity {

    CardView cvkonstruksi, cvmanajemen, cvperancangan, cvsoftware, cvtechnical, cvtraining;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jasa);

        cvkonstruksi = findViewById(R.id.konstruksi);
        cvmanajemen = findViewById(R.id.manajemen);
        cvperancangan = findViewById(R.id.perancangan);
        cvsoftware = findViewById(R.id.software);
        cvtechnical = findViewById(R.id.technical);
        cvtraining = findViewById(R.id.training);

        cvkonstruksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, KonstruksiSourceCode.class);
                startActivity(i);
            }
        });

        cvmanajemen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, ManajemenIT.class);
                startActivity(i);
            }
        });

        cvperancangan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, PerancanganDanAnalisa.class);
                startActivity(i);
            }
        });

        cvsoftware.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, SoftwareTesting.class);
                startActivity(i);
            }
        });

        cvtechnical.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, TechnicalSupport.class);
                startActivity(i);
            }
        });

        cvtraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Jasa.this, TrainingDanWorkshop.class);
                startActivity(i);
            }
        });
    }
}