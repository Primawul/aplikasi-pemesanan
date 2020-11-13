package ac.i.geekgardenapp.Jasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import ac.i.geekgardenapp.R;

public class SoftwareTesting extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_software_testing);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Jasa/Software Testing.pdf")
                .enableSwipe(true)
                .load();
    }
}