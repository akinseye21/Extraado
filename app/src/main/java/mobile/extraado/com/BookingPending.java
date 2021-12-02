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
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class BookingPending extends AppCompatActivity {

    Dialog myDialog;

    Button cancel, change, direction;
    ImageView back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_pending);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        myDialog = new Dialog(this);

        back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookingPending.super.onBackPressed();
            }
        });

        direction = findViewById(R.id.direction);
        direction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BookingPending.this, YourLocation.class);
                startActivity(i);
            }
        });

        change = findViewById(R.id.change);
        change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BookingPending.this, BookingPage.class);
                startActivity(i);
            }
        });

    }

    public void Showpopup(View v){
        Button yes, no;
        myDialog.setContentView(R.layout.custom_pending_cancel_popup);
        yes = myDialog.findViewById(R.id.yes);
        no = myDialog.findViewById(R.id.no);

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookingPending.this, "Booking Successfully cancel", Toast.LENGTH_LONG).show();
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
