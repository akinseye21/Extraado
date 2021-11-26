package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Dialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class NotificationEnabler extends AppCompatActivity {

    Dialog myDialog;

    Button enableNotifi, dontEnableNotifi;
    TextView skip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification_enabler);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        enableNotifi = findViewById(R.id.enable);
        dontEnableNotifi = findViewById(R.id.notnow);
        dontEnableNotifi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotificationEnabler.this, SplashScreen.class);
                startActivity(intent);
            }
        });

        skip = findViewById(R.id.skip);
        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NotificationEnabler.this, SplashScreen.class);
                startActivity(intent);
            }
        });

        myDialog = new Dialog(this);
    }

    public void Showpopup(View v){
        LinearLayout dontallow, allow;
        myDialog.setContentView(R.layout.custom_notification_enabler);
        dontallow = myDialog.findViewById(R.id.dontallow);
        allow = myDialog.findViewById(R.id.allow);

        dontallow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
                System.out.println("Notification permission  not granted");
                Toast.makeText(getApplicationContext(),  "Notification  permission not granted.", Toast.LENGTH_SHORT).show();

                Intent i = new Intent(NotificationEnabler.this, SplashScreen.class);
                startActivity(i);
            }
        });

        allow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ActivityCompat.requestPermissions(NotificationEnabler.this, new String[]{Manifest.permission.ACCESS_NOTIFICATION_POLICY}, 2);
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults) {
        switch (requestCode) {
            case 2:
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0 &&
                        grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    // Permission is granted. Continue the action or workflow
                    // in your app.
                    System.out.println("Notification permission  is granted");
                    Toast.makeText(this,  "Notification  permission is granted.", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(NotificationEnabler.this, SplashScreen.class);
                    startActivity(i);
                }  else {
                    // Explain to the user that the feature is unavailable because
                    // the features requires a permission that the user has denied.
                    // At the same time, respect the user's decision. Don't link to
                    // system settings in an effort to convince the user to change
                    // their decision.
                    System.out.println("Notification permission  not granted");
                    Toast.makeText(this,  "Notification  permission not granted.", Toast.LENGTH_SHORT).show();

                    Intent i = new Intent(NotificationEnabler.this, SplashScreen.class);
                    startActivity(i);
                }
                return;
        }
        // Other 'case' lines to check for other
        // permissions this app might request.
    }


    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
