package ac.i.geekgardenapp.Activity;

import ac.i.geekgardenapp.R;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private EditText edemail , edpassword;
    private Button btn_login;
    private TextView backregis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edemail = findViewById(R.id.edtemail);
        edpassword = findViewById(R.id.password);
        btn_login = findViewById(R.id.btnlogin);
        backregis = findViewById(R.id.tvregis);
        mAuth = FirebaseAuth.getInstance();


        btn_login.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String email = edemail.getText().toString();
                String password = edpassword.getText().toString();

                if (email.equals("")){
                    Toast.makeText(Login.this, "Masukan email",
                            Toast.LENGTH_SHORT).show();
                } else if (password.equals("")){
                    Toast.makeText(Login.this, "Masukkan password.",
                            Toast.LENGTH_SHORT).show();
                } else{
                    mAuth.signInWithEmailAndPassword(email, password)
                            .addOnCompleteListener(Login.this, new OnCompleteListener<AuthResult>() {
                                @Override
                                public void onComplete(@NonNull Task<AuthResult> task) {
                                    if (task.isSuccessful()) {
                                        // Sign in success, update UI with the signed-in user's information

                                        Intent i = new Intent(Login.this, Beranda.class);
                                        startActivity(i);

                                        FirebaseUser user = mAuth.getCurrentUser();
                                    } else {
                                        // If sign in fails, display a message to the user.
                                        Toast.makeText(Login.this, "Authentication failed.",
                                                Toast.LENGTH_SHORT).show();
                                    }

                                    // ...
                                }
                            });
                }}
        });
        backregis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Login.this,Register.class);
                startActivity(i);
            }
        });
    }


    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
    }
}