package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class LocationServiceEnabler extends AppCompatActivity {

    Button notnow, enable;
    TextView skip;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_service_enabler);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        skip = findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LocationServiceEnabler.this, MainActivity.class);
                startActivity(i);
                Animatoo.animateSplit(LocationServiceEnabler.this);
            }
        });
        notnow = findViewById(R.id.notnow);
        notnow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LocationServiceEnabler.this, MainActivity.class);
                startActivity(i);
                Animatoo.animateSplit(LocationServiceEnabler.this);
            }
        });

        enable = findViewById(R.id.enable);
        enable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //android pops-up the location enabler
                askForPermission(Manifest.permission.ACCESS_COARSE_LOCATION,1);
            }
        });
    }


    private void askForPermission(String permission, Integer requestCode) {
        if (ContextCompat.checkSelfPermission(LocationServiceEnabler.this, permission) != PackageManager.PERMISSION_GRANTED) {

            // Should we show an explanation?
            if (ActivityCompat.shouldShowRequestPermissionRationale(LocationServiceEnabler.this, permission)) {

                //This is called if user has denied the permission before
                //In this cased I am just asking the permission again
                ActivityCompat.requestPermissions(LocationServiceEnabler.this, new String[]{permission}, requestCode);

            } else {

                ActivityCompat.requestPermissions(LocationServiceEnabler.this, new String[]{permission}, requestCode);

                Intent i = new Intent(LocationServiceEnabler.this, MainActivity.class);
                startActivity(i);
                Animatoo.animateSplit(LocationServiceEnabler.this);
            }
        } else {
            System.out.println(permission+" is already granted");
            Toast.makeText(this,  "Location permission is already granted.", Toast.LENGTH_SHORT).show();

            Intent i = new Intent(LocationServiceEnabler.this, MainActivity.class);
            startActivity(i);
            Animatoo.animateSplit(LocationServiceEnabler.this);
        }
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
