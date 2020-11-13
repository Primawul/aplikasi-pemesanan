package ac.i.geekgardenapp.Fragment;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import ac.i.geekgardenapp.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Pemesanan extends Fragment {
    EditText etnama, etemail, etperusahaan, etbudget, ettimeline, etNomorHp, etaplikasi,etjenisaplikasi,etdeskripsi;
    Button OpenWhatsapp;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pemesanan, container, false);

        etnama = view.findViewById(R.id.edtnama);
        etemail = view.findViewById(R.id.edtemail);
        etperusahaan = view.findViewById(R.id.edtperusahaan);
        etbudget = view.findViewById(R.id.edtbudget);
        ettimeline = view.findViewById(R.id.edttimeline);
        etNomorHp = view.findViewById(R.id.edtnotlp);
        etaplikasi = view.findViewById(R.id.edtaplikasi);
        etjenisaplikasi = view.findViewById(R.id.edtjenisapk);
        etdeskripsi = view.findViewById(R.id.edtdeskripsi);

        OpenWhatsapp = view.findViewById(R.id.btnkirim);
        OpenWhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**String pesan1 = etnama.getText().toString();
                 String pesan2 = etemail.getText().toString();
                 String pesan3 = etperusahaan.getText().toString();
                 String pesan4 = etbudget.getText().toString();
                 String pesan5 = ettimeline.getText().toString();
                 String pesan6 = etNomorHp.getText().toString();

                 String semuapesan = "Nama: " + pesan1 + "\n" + "Email: " + pesan2 + "\n" + "Perusahaan: " + pesan3 + "\n" + "Budget: " + pesan4 + "\n" + "Timeline: " + pesan5 + "\n" + "NomorHP: " + pesan6 + "\n" + "Budget: ";
                 Intent kirimWA = new Intent();
                 kirimWA.setAction(Intent.ACTION_SEND);
                 kirimWA.putExtra(Intent.EXTRA_TEXT, semuapesan);
                 kirimWA.putExtra("ima", "6285641187175" + "@s.whatsapp.net");
                 kirimWA.setType("text/plain");
                 kirimWA.setPackage("com.whatsapp");
                 startActivity(kirimWA);*/
                PackageManager pm = requireActivity().getPackageManager();
                try {
                    String pesan1 = etnama.getText().toString();
                    String pesan2 = etemail.getText().toString();
                    String pesan3 = etNomorHp.getText().toString();
                    String pesan4 = etperusahaan.getText().toString();
                    String pesan5 = etaplikasi.getText().toString();
                    String pesan6 = etjenisaplikasi.getText().toString();
                    String pesan7 = etdeskripsi.getText().toString();
                    String pesan8 = etbudget.getText().toString();
                    String pesan9 = ettimeline.getText().toString();


                    String semuapesan = "Nama: " + pesan1 + "\n" + "Email: " + pesan2 + "\n" +  "No Telepon: " + pesan3 + "\n" +
                            "Nama Perusahaan: " + pesan4 + "\n" +  "Nama Aplikasi: " + pesan5 + "\n" +  "Jenis Aplikasi: " + pesan6 + "\n" +
                             "Deskripsi: " + pesan7 + "\n" +
                            "Budget: " + pesan8 + "\n" +
                            "Timeline: " + pesan9 + "\n" ;

                    PackageInfo info = pm.getPackageInfo("com.whatsapp", PackageManager.GET_META_DATA);
                    String smsNumber = "6285641187175";
                    openWhatsApp(smsNumber, semuapesan);

                } catch (PackageManager.NameNotFoundException e) {
                    Toast.makeText(requireContext(), "Error/n" + e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }

            }
        });

        return view;
    }

    private void openWhatsApp(String smsNumber, String message) {
        smsNumber = smsNumber; // E164 format without '+' sign
        Intent sendIntent = new Intent(Intent.ACTION_SEND);
        sendIntent.setType("text/plain");
        sendIntent.putExtra(Intent.EXTRA_TEXT, message);
        sendIntent.putExtra("jid", smsNumber + "@s.whatsapp.net"); //phone number without "+" prefix
        sendIntent.setPackage("com.whatsapp");
        startActivity(sendIntent);
    }
};


