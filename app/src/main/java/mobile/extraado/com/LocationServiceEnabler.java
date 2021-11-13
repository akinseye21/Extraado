package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class LocationServiceEnabler extends AppCompatActivity {

    Button notnow, enable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_service_enabler);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        notnow = findViewById(R.id.notnow);
        notnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LocationServiceEnabler.this, MainActivity.class);
                startActivity(i);
            }
        });

        enable = findViewById(R.id.enable);
        enable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //android pops-up the location enabler
            }
        });
    }
}
