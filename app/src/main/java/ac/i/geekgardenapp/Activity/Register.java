package ac.i.geekgardenapp.Activity;

import ac.i.geekgardenapp.R;
import ac.i.geekgardenapp.SharedPrefRegisUser;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Register extends AppCompatActivity {

    private EditText editText_nama, editText_email, editText_phone, editText_password;
    private Button button_regis;
    private FirebaseAuth mAuth;
    SharedPrefRegisUser sharedPrefRegisUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sharedPrefRegisUser = new SharedPrefRegisUser(Register.this);

        editText_nama=findViewById(R.id.edtnama);
        editText_email=findViewById(R.id.editEmail);
        editText_phone=findViewById(R.id.editphone);
        editText_password=findViewById(R.id.editPass);
        button_regis=findViewById(R.id.buttonAcount);
        mAuth = FirebaseAuth.getInstance();


        button_regis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = editText_nama.getText().toString();
                String email = editText_email.getText().toString();
                String password = editText_password.getText().toString();
                String notlp = editText_phone.getText().toString();
                sharedPrefRegisUser.setSpCustName(SharedPrefRegisUser.SP_CUST_NAME,nama);
                sharedPrefRegisUser.setSpCustEmail(SharedPrefRegisUser.SP_CUST_EMAIL,email);
                sharedPrefRegisUser.setSpCustPass(SharedPrefRegisUser.SP_CUST_PASS,password);
                sharedPrefRegisUser.setSpCustNoTelp(SharedPrefRegisUser.SP_CUST_NO_TELP,notlp);


                if (email.equals("")){
                    Toast.makeText(Register.this, "Masukan email",
                            Toast.LENGTH_SHORT).show();
                } else if (password.equals("")){
                    Toast.makeText(Register.this, "Masukkan password.",
                            Toast.LENGTH_SHORT).show();
                } else{  mAuth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Register.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                if (task.isSuccessful()) {
                                    // Sign in success, update UI with the signed-in user's information
                                    Intent p = new Intent(Register.this, Login.class);
                                    startActivity(p);

                                    FirebaseUser user = mAuth.getCurrentUser();
                                } else {
                                    // If sign in fails, display a message to the user.
                                    Toast.makeText(Register.this, "Authentication failed.",
                                            Toast.LENGTH_SHORT).show();
                                }

                                // ...
                            }
                        });
                }}
        });
    }

    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }
}