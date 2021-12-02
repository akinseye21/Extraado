package mobile.extraado.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class LeaveReview extends AppCompatActivity {

    Button close, sendreview;
    //price
    LinearLayout price1, price2, price3, price4, price5;
    TextView price1_txt, price2_txt, price3_txt, price4_txt, price5_txt;
    ImageView price1_img, price2_img, price3_img, price4_img, price5_img;
    //service
    LinearLayout service1, service2, service3, service4, service5;
    TextView service1_txt, service2_txt, service3_txt, service4_txt, service5_txt;
    ImageView service1_img, service2_img, service3_img, service4_img, service5_img;
    //staff
    LinearLayout staff1, staff2, staff3, staff4, staff5;
    TextView staff1_txt, staff2_txt, staff3_txt, staff4_txt, staff5_txt;
    ImageView staff1_img, staff2_img, staff3_img, staff4_img, staff5_img;
    //interior
    LinearLayout inter1, inter2, inter3, inter4, inter5;
    TextView inter1_txt, inter2_txt, inter3_txt, inter4_txt, inter5_txt;
    ImageView inter1_img, inter2_img, inter3_img, inter4_img, inter5_img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leave_review);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //get linearlayout view
        price1 = findViewById(R.id.price_1);
        price2 = findViewById(R.id.price_2);
        price3 = findViewById(R.id.price_3);
        price4 = findViewById(R.id.price_4);
        price5 = findViewById(R.id.price_5);
        service1 = findViewById(R.id.service_1);
        service2 = findViewById(R.id.service_2);
        service3 = findViewById(R.id.service_3);
        service4 = findViewById(R.id.service_4);
        service5 = findViewById(R.id.service_5);
        staff1 = findViewById(R.id.staff_1);
        staff2 = findViewById(R.id.staff_2);
        staff3 = findViewById(R.id.staff_3);
        staff4 = findViewById(R.id.staff_4);
        staff5 = findViewById(R.id.staff_5);
        inter1 = findViewById(R.id.interior_1);
        inter2 = findViewById(R.id.interior_2);
        inter3 = findViewById(R.id.interior_3);
        inter4 = findViewById(R.id.interior_4);
        inter5 = findViewById(R.id.interior_5);

        //get text view
        price1_txt = findViewById(R.id.price_1_txt);
        price2_txt = findViewById(R.id.price_2_txt);
        price3_txt = findViewById(R.id.price_3_txt);
        price4_txt = findViewById(R.id.price_4_txt);
        price5_txt = findViewById(R.id.price_5_txt);
        service1_txt = findViewById(R.id.service_1_txt);
        service2_txt = findViewById(R.id.service_2_txt);
        service3_txt = findViewById(R.id.service_3_txt);
        service4_txt = findViewById(R.id.service_4_txt);
        service5_txt = findViewById(R.id.service_5_txt);
        staff1_txt = findViewById(R.id.staff_1_txt);
        staff2_txt = findViewById(R.id.staff_2_txt);
        staff3_txt = findViewById(R.id.staff_3_txt);
        staff4_txt = findViewById(R.id.staff_4_txt);
        staff5_txt = findViewById(R.id.staff_5_txt);
        inter1_txt = findViewById(R.id.interior_1_txt);
        inter2_txt = findViewById(R.id.interior_2_txt);
        inter3_txt = findViewById(R.id.interior_3_txt);
        inter4_txt = findViewById(R.id.interior_4_txt);
        inter5_txt = findViewById(R.id.interior_5_txt);

        //get image views
        price1_img = findViewById(R.id.price_1_img);
        price2_img = findViewById(R.id.price_2_img);
        price3_img = findViewById(R.id.price_3_img);
        price4_img = findViewById(R.id.price_4_img);
        price5_img = findViewById(R.id.price_5_img);
        service1_img = findViewById(R.id.service_1_img);
        service2_img = findViewById(R.id.service_2_img);
        service3_img = findViewById(R.id.service_3_img);
        service4_img = findViewById(R.id.service_4_img);
        service5_img = findViewById(R.id.service_5_img);
        staff1_img = findViewById(R.id.staff_1_img);
        staff2_img = findViewById(R.id.staff_2_img);
        staff3_img = findViewById(R.id.staff_3_img);
        staff4_img = findViewById(R.id.staff_4_img);
        staff5_img = findViewById(R.id.staff_5_img);
        inter1_img = findViewById(R.id.interior_1_img);
        inter2_img = findViewById(R.id.interior_2_img);
        inter3_img = findViewById(R.id.interior_3_img);
        inter4_img = findViewById(R.id.interior_4_img);
        inter5_img = findViewById(R.id.interior_5_img);


        //setting onclick for Price
        price1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(price1.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    price1.setBackgroundResource(R.drawable.black_layout2);
                    price1_txt.setTextColor(Color.parseColor("#ffffff"));
                    price1_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    price2.setBackgroundResource(R.drawable.white_layout3);
                    price2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price2_img.setColorFilter(null);
                    price3.setBackgroundResource(R.drawable.white_layout3);
                    price3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price3_img.setColorFilter(null);
                    price4.setBackgroundResource(R.drawable.white_layout3);
                    price4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price4_img.setColorFilter(null);
                    price5.setBackgroundResource(R.drawable.white_layout3);
                    price5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price5_img.setColorFilter(null);
                }
            }
        });
        price2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(price2.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    price2.setBackgroundResource(R.drawable.black_layout2);
                    price2_txt.setTextColor(Color.parseColor("#ffffff"));
                    price2_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    price1.setBackgroundResource(R.drawable.white_layout3);
                    price1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price1_img.setColorFilter(null);
                    price3.setBackgroundResource(R.drawable.white_layout3);
                    price3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price3_img.setColorFilter(null);
                    price4.setBackgroundResource(R.drawable.white_layout3);
                    price4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price4_img.setColorFilter(null);
                    price5.setBackgroundResource(R.drawable.white_layout3);
                    price5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price5_img.setColorFilter(null);
                }
            }
        });
        price3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(price3.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    price3.setBackgroundResource(R.drawable.black_layout2);
                    price3_txt.setTextColor(Color.parseColor("#ffffff"));
                    price3_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    price2.setBackgroundResource(R.drawable.white_layout3);
                    price2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price2_img.setColorFilter(null);
                    price1.setBackgroundResource(R.drawable.white_layout3);
                    price1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price1_img.setColorFilter(null);
                    price4.setBackgroundResource(R.drawable.white_layout3);
                    price4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price4_img.setColorFilter(null);
                    price5.setBackgroundResource(R.drawable.white_layout3);
                    price5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price5_img.setColorFilter(null);
                }
            }
        });
        price4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(price4.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    price4.setBackgroundResource(R.drawable.black_layout2);
                    price4_txt.setTextColor(Color.parseColor("#ffffff"));
                    price4_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    price2.setBackgroundResource(R.drawable.white_layout3);
                    price2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price2_img.setColorFilter(null);
                    price3.setBackgroundResource(R.drawable.white_layout3);
                    price3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price3_img.setColorFilter(null);
                    price1.setBackgroundResource(R.drawable.white_layout3);
                    price1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price1_img.setColorFilter(null);
                    price5.setBackgroundResource(R.drawable.white_layout3);
                    price5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price5_img.setColorFilter(null);
                }
            }
        });
        price5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(price5.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    price5.setBackgroundResource(R.drawable.black_layout2);
                    price5_txt.setTextColor(Color.parseColor("#ffffff"));
                    price5_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    price2.setBackgroundResource(R.drawable.white_layout3);
                    price2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price2_img.setColorFilter(null);
                    price3.setBackgroundResource(R.drawable.white_layout3);
                    price3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price3_img.setColorFilter(null);
                    price4.setBackgroundResource(R.drawable.white_layout3);
                    price4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price4_img.setColorFilter(null);
                    price1.setBackgroundResource(R.drawable.white_layout3);
                    price1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    price1_img.setColorFilter(null);
                }
            }
        });




        //setting onclick for service
        service1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(service1.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    service1.setBackgroundResource(R.drawable.black_layout2);
                    service1_txt.setTextColor(Color.parseColor("#ffffff"));
                    service1_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    service2.setBackgroundResource(R.drawable.white_layout3);
                    service2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service2_img.setColorFilter(null);
                    service3.setBackgroundResource(R.drawable.white_layout3);
                    service3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service3_img.setColorFilter(null);
                    service4.setBackgroundResource(R.drawable.white_layout3);
                    service4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service4_img.setColorFilter(null);
                    service5.setBackgroundResource(R.drawable.white_layout3);
                    service5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service5_img.setColorFilter(null);
                }
            }
        });
        service2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(service2.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    service2.setBackgroundResource(R.drawable.black_layout2);
                    service2_txt.setTextColor(Color.parseColor("#ffffff"));
                    service2_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    service1.setBackgroundResource(R.drawable.white_layout3);
                    service1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service1_img.setColorFilter(null);
                    service3.setBackgroundResource(R.drawable.white_layout3);
                    service3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service3_img.setColorFilter(null);
                    service4.setBackgroundResource(R.drawable.white_layout3);
                    service4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service4_img.setColorFilter(null);
                    service5.setBackgroundResource(R.drawable.white_layout3);
                    service5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service5_img.setColorFilter(null);
                }
            }
        });
        service3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(service3.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    service3.setBackgroundResource(R.drawable.black_layout2);
                    service3_txt.setTextColor(Color.parseColor("#ffffff"));
                    service3_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    service2.setBackgroundResource(R.drawable.white_layout3);
                    service2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service2_img.setColorFilter(null);
                    service1.setBackgroundResource(R.drawable.white_layout3);
                    service1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service1_img.setColorFilter(null);
                    service4.setBackgroundResource(R.drawable.white_layout3);
                    service4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service4_img.setColorFilter(null);
                    service5.setBackgroundResource(R.drawable.white_layout3);
                    service5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service5_img.setColorFilter(null);
                }
            }
        });
        service4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(service4.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    service4.setBackgroundResource(R.drawable.black_layout2);
                    service4_txt.setTextColor(Color.parseColor("#ffffff"));
                    service4_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    service2.setBackgroundResource(R.drawable.white_layout3);
                    service2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service2_img.setColorFilter(null);
                    service3.setBackgroundResource(R.drawable.white_layout3);
                    service3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service3_img.setColorFilter(null);
                    service1.setBackgroundResource(R.drawable.white_layout3);
                    service1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service1_img.setColorFilter(null);
                    service5.setBackgroundResource(R.drawable.white_layout3);
                    service5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service5_img.setColorFilter(null);
                }
            }
        });
        service5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(service5.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    service5.setBackgroundResource(R.drawable.black_layout2);
                    service5_txt.setTextColor(Color.parseColor("#ffffff"));
                    service5_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    service2.setBackgroundResource(R.drawable.white_layout3);
                    service2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service2_img.setColorFilter(null);
                    service3.setBackgroundResource(R.drawable.white_layout3);
                    service3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service3_img.setColorFilter(null);
                    service4.setBackgroundResource(R.drawable.white_layout3);
                    service4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service4_img.setColorFilter(null);
                    service1.setBackgroundResource(R.drawable.white_layout3);
                    service1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    service1_img.setColorFilter(null);
                }
            }
        });





        //setting onclick for staff
        staff1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(staff1.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    staff1.setBackgroundResource(R.drawable.black_layout2);
                    staff1_txt.setTextColor(Color.parseColor("#ffffff"));
                    staff1_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    staff2.setBackgroundResource(R.drawable.white_layout3);
                    staff2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff2_img.setColorFilter(null);
                    staff3.setBackgroundResource(R.drawable.white_layout3);
                    staff3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff3_img.setColorFilter(null);
                    staff4.setBackgroundResource(R.drawable.white_layout3);
                    staff4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff4_img.setColorFilter(null);
                    staff5.setBackgroundResource(R.drawable.white_layout3);
                    staff5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff5_img.setColorFilter(null);
                }
            }
        });
        staff2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(staff2.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    staff2.setBackgroundResource(R.drawable.black_layout2);
                    staff2_txt.setTextColor(Color.parseColor("#ffffff"));
                    staff2_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    staff1.setBackgroundResource(R.drawable.white_layout3);
                    staff1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff1_img.setColorFilter(null);
                    staff3.setBackgroundResource(R.drawable.white_layout3);
                    staff3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff3_img.setColorFilter(null);
                    staff4.setBackgroundResource(R.drawable.white_layout3);
                    staff4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff4_img.setColorFilter(null);
                    staff5.setBackgroundResource(R.drawable.white_layout3);
                    staff5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff5_img.setColorFilter(null);
                }
            }
        });
        staff3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(staff3.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    staff3.setBackgroundResource(R.drawable.black_layout2);
                    staff3_txt.setTextColor(Color.parseColor("#ffffff"));
                    staff3_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    staff1.setBackgroundResource(R.drawable.white_layout3);
                    staff1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff1_img.setColorFilter(null);
                    staff2.setBackgroundResource(R.drawable.white_layout3);
                    staff2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff2_img.setColorFilter(null);
                    staff4.setBackgroundResource(R.drawable.white_layout3);
                    staff4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff4_img.setColorFilter(null);
                    staff5.setBackgroundResource(R.drawable.white_layout3);
                    staff5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff5_img.setColorFilter(null);
                }
            }
        });
        staff4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(staff4.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    staff4.setBackgroundResource(R.drawable.black_layout2);
                    staff4_txt.setTextColor(Color.parseColor("#ffffff"));
                    staff4_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    staff1.setBackgroundResource(R.drawable.white_layout3);
                    staff1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff1_img.setColorFilter(null);
                    staff2.setBackgroundResource(R.drawable.white_layout3);
                    staff2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff2_img.setColorFilter(null);
                    staff3.setBackgroundResource(R.drawable.white_layout3);
                    staff3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff3_img.setColorFilter(null);
                    staff5.setBackgroundResource(R.drawable.white_layout3);
                    staff5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff5_img.setColorFilter(null);
                }
            }
        });
        staff5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(staff5.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    staff5.setBackgroundResource(R.drawable.black_layout2);
                    staff5_txt.setTextColor(Color.parseColor("#ffffff"));
                    staff5_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    staff1.setBackgroundResource(R.drawable.white_layout3);
                    staff1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff1_img.setColorFilter(null);
                    staff2.setBackgroundResource(R.drawable.white_layout3);
                    staff2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff2_img.setColorFilter(null);
                    staff4.setBackgroundResource(R.drawable.white_layout3);
                    staff4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff4_img.setColorFilter(null);
                    staff3.setBackgroundResource(R.drawable.white_layout3);
                    staff3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    staff3_img.setColorFilter(null);
                }
            }
        });





        //setting onclick for interior
        inter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inter1.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    inter1.setBackgroundResource(R.drawable.black_layout2);
                    inter1_txt.setTextColor(Color.parseColor("#ffffff"));
                    inter1_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    inter2.setBackgroundResource(R.drawable.white_layout3);
                    inter2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter2_img.setColorFilter(null);
                    inter3.setBackgroundResource(R.drawable.white_layout3);
                    inter3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter3_img.setColorFilter(null);
                    inter4.setBackgroundResource(R.drawable.white_layout3);
                    inter4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter4_img.setColorFilter(null);
                    inter5.setBackgroundResource(R.drawable.white_layout3);
                    inter5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter5_img.setColorFilter(null);
                }
            }
        });
        inter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inter2.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    inter2.setBackgroundResource(R.drawable.black_layout2);
                    inter2_txt.setTextColor(Color.parseColor("#ffffff"));
                    inter2_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    inter1.setBackgroundResource(R.drawable.white_layout3);
                    inter1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter1_img.setColorFilter(null);
                    inter3.setBackgroundResource(R.drawable.white_layout3);
                    inter3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter3_img.setColorFilter(null);
                    inter4.setBackgroundResource(R.drawable.white_layout3);
                    inter4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter4_img.setColorFilter(null);
                    inter5.setBackgroundResource(R.drawable.white_layout3);
                    inter5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter5_img.setColorFilter(null);
                }
            }
        });
        inter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inter3.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    inter3.setBackgroundResource(R.drawable.black_layout2);
                    inter3_txt.setTextColor(Color.parseColor("#ffffff"));
                    inter3_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    inter2.setBackgroundResource(R.drawable.white_layout3);
                    inter2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter2_img.setColorFilter(null);
                    inter1.setBackgroundResource(R.drawable.white_layout3);
                    inter1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter1_img.setColorFilter(null);
                    inter4.setBackgroundResource(R.drawable.white_layout3);
                    inter4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter4_img.setColorFilter(null);
                    inter5.setBackgroundResource(R.drawable.white_layout3);
                    inter5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter5_img.setColorFilter(null);
                }
            }
        });
        inter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inter4.getBackground().equals(R.drawable.black_layout2)){

                }else {
                    inter4.setBackgroundResource(R.drawable.black_layout2);
                    inter4_txt.setTextColor(Color.parseColor("#ffffff"));
                    inter4_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    inter2.setBackgroundResource(R.drawable.white_layout3);
                    inter2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter2_img.setColorFilter(null);
                    inter3.setBackgroundResource(R.drawable.white_layout3);
                    inter3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter3_img.setColorFilter(null);
                    inter1.setBackgroundResource(R.drawable.white_layout3);
                    inter1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter1_img.setColorFilter(null);
                    inter5.setBackgroundResource(R.drawable.white_layout3);
                    inter5_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter5_img.setColorFilter(null);
                }
            }
        });
        inter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(inter5.getBackground().equals(R.drawable.black_layout2)){

                }else{
                    inter5.setBackgroundResource(R.drawable.black_layout2);
                    inter5_txt.setTextColor(Color.parseColor("#ffffff"));
                    inter5_img.setColorFilter(ContextCompat.getColor(LeaveReview.this, R.color.colorAccent));
                    //other views unchecked
                    inter2.setBackgroundResource(R.drawable.white_layout3);
                    inter2_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter2_img.setColorFilter(null);
                    inter3.setBackgroundResource(R.drawable.white_layout3);
                    inter3_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter3_img.setColorFilter(null);
                    inter4.setBackgroundResource(R.drawable.white_layout3);
                    inter4_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter4_img.setColorFilter(null);
                    inter1.setBackgroundResource(R.drawable.white_layout3);
                    inter1_txt.setTextColor(Color.parseColor("#b8b7b7"));
                    inter1_img.setColorFilter(null);
                }
            }
        });





        close = findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LeaveReview.super.onBackPressed();
            }
        });

        sendreview = findViewById(R.id.sendReview);
        sendreview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LeaveReview.this, ReviewCompleted.class);
                startActivity(i);
            }
        });
    }
}
