package ac.i.geekgardenapp.Jasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import ac.i.geekgardenapp.R;

public class TechnicalSupport extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_support);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Jasa/Technical Support.pdf")
                .enableSwipe(true)
                .load();
    }
}