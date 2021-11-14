package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

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
            }
        });

        allow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}
