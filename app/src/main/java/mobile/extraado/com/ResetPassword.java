package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ResetPassword extends AppCompatActivity {

    LinearLayout back;
    EditText email;
    Button reset, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), SignIn.class);
                startActivity(i);
            }
        });

        email = findViewById(R.id.edtEmail);

        reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String gotEmail = email.getText().toString().trim();

                if(gotEmail.equals("") || !gotEmail.contains("@")){
                    Toast.makeText(getApplicationContext(), "Email is wrong. Please check and validate", Toast.LENGTH_LONG).show();
                }else{
                    Intent i = new Intent(ResetPassword.this, ResetPassword2.class);
                    i.putExtra("email", gotEmail);
                    startActivity(i);
                }


            }
        });

        cancel = findViewById(R.id.notnow);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ResetPassword.this, SignIn.class);
                startActivity(i);
            }
        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
