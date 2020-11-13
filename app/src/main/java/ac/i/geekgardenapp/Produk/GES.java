package ac.i.geekgardenapp.Produk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import ac.i.geekgardenapp.R;

public class GES extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ges);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Produk/GES (Geek Enterprise System).pdf")
                .enableSwipe(true)
                .load();
    }
}