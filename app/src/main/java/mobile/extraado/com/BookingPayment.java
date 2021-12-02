package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

import com.blogspot.atifsoftwares.animatoolib.Animatoo;

public class BookingPayment extends AppCompatActivity {

    Button closePage;
    LinearLayout book;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_payment);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        closePage = findViewById(R.id.closePage);
        closePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookingPayment.super.onBackPressed();
            }
        });

        book = findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(BookingPayment.this, BookingSuccess.class);
                startActivity(i);
                Animatoo.animateSlideLeft(BookingPayment.this);
            }
        });
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
    }
}
