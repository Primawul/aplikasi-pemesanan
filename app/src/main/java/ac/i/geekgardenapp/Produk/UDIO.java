package ac.i.geekgardenapp.Produk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import ac.i.geekgardenapp.R;

public class UDIO extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_udio);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Produk/UDIO (University Dashboard Indo Online).pdf")
                .enableSwipe(true)
                .load();
    }
}