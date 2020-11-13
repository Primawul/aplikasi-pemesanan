package ac.i.geekgardenapp.Produk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import ac.i.geekgardenapp.R;

public class DOM extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dom);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Produk/DOM .pdf")
                .enableSwipe(true)
                .load();
    }
}