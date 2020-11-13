package ac.i.geekgardenapp.Jasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

import ac.i.geekgardenapp.R;

public class TrainingDanWorkshop extends AppCompatActivity {
    private PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_dan_workshop);

        pdfView = findViewById(R.id.pdfView);
        pdfView.fromAsset("Jasa/Training & Workshop.pdf")
                .enableSwipe(true)
                .load();
    }
}