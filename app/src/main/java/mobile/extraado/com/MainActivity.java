package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class MainActivity extends AppCompatActivity {

    Button women, men, unisex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        women = findViewById(R.id.women);
        men = findViewById(R.id.men);
        unisex = findViewById(R.id.unisex);

        women.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NotificationEnabler.class);
                startActivity(i);
                Animatoo.animateSplit(MainActivity.this);
            }
        });

        men.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NotificationEnabler.class);
                startActivity(i);
                Animatoo.animateSplit(MainActivity.this);
            }
        });

        unisex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, NotificationEnabler.class);
                startActivity(i);
                Animatoo.animateSplit(MainActivity.this);
            }
        });

    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
