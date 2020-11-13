package ac.i.geekgardenapp.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import ac.i.geekgardenapp.Activity.EditAkun;
import ac.i.geekgardenapp.Activity.Login;
import ac.i.geekgardenapp.R;
import ac.i.geekgardenapp.SharedPrefRegisUser;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class lainlain extends Fragment {
    TextView nama,email,password,notlp;
    Button btnlogout;
    ImageView btnupdate;
    private SharedPrefRegisUser sharedPrefRegisUser;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_lainlain, container, false);
        nama=view.findViewById(R.id.username);
        email=view.findViewById(R.id.email);
        password=view.findViewById(R.id.password);
        notlp=view.findViewById(R.id.notlp);

        sharedPrefRegisUser= new SharedPrefRegisUser(getContext());

        nama.setText(sharedPrefRegisUser.getSpCustName());
        email.setText(sharedPrefRegisUser.getSpCustEmail());
        password.setText(sharedPrefRegisUser.getSpCustPass());
        notlp.setText(sharedPrefRegisUser.getSpCustNoTelp());


        btnlogout = view.findViewById(R.id.btnlogout);
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(requireContext(),Login.class);
                startActivity(i);
            }
        });

        btnupdate = view.findViewById(R.id.update);
        btnupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(requireContext(), EditAkun.class);
                startActivity(in);
            }
        });

        return view;
    }
}

