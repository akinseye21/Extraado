package mobile.extraado.com;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TimePicker;

public class BookingPage extends AppCompatActivity {

    TextView theDate, time_t;
    int hour, minute;
    Button book, closePage;

    Dialog myDialog, myDialog2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_page);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        myDialog = new Dialog(this);
        myDialog2 = new Dialog(this);

        closePage = findViewById(R.id.closePage);
        closePage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BookingPage.super.onBackPressed();
            }
        });
        theDate = findViewById(R.id.thedate);
        book = findViewById(R.id.book);
        book.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void ShowDatePopup(View view) {
        CalendarView calendarView;
        Button close;

        myDialog.setContentView(R.layout.custom_calendar_popup);
        calendarView = myDialog.findViewById(R.id.calendarView);
        close = myDialog.findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });


        //set popup view to bottom of screen
        WindowManager.LayoutParams wlmp1 = myDialog.getWindow().getAttributes();
        wlmp1.gravity = Gravity.BOTTOM;

        //set width to fill
        WindowManager.LayoutParams lp1 = new WindowManager.LayoutParams();
        Window window = myDialog.getWindow();
        lp1.copyFrom(window.getAttributes());
        lp1.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp1.height = WindowManager.LayoutParams.WRAP_CONTENT;
        window.setAttributes(lp1);



        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                String date = (month + 1) +  "/" + dayOfMonth + "/" + year;
                theDate.setText(date);
                myDialog.dismiss();
            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowTimePopup(View view) {
        final TimePicker simpleTimePicker;
        Button close, set;
        myDialog2.setContentView(R.layout.custom_time_popup);

        simpleTimePicker = myDialog2.findViewById(R.id.simpleTimePicker);
        close = myDialog2.findViewById(R.id.close);


        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog2.dismiss();
            }
        });

        simpleTimePicker.setIs24HourView(false);
        simpleTimePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker view, int hourOfDay, int minute) {

            }
        });

        time_t = findViewById(R.id.time_t);

        set = myDialog2.findViewById(R.id.set);
        set.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {
                hour = simpleTimePicker.getHour();
                minute = simpleTimePicker.getMinute();

                time_t.setText(hour+":"+minute);
                myDialog2.dismiss();

            }
        });

        //set popup view to bottom of screen
        WindowManager.LayoutParams wlmp = myDialog2.getWindow().getAttributes();
        wlmp.gravity = Gravity.BOTTOM;

        //set width to fill
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        Window window = myDialog2.getWindow();
        lp.copyFrom(window.getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.WRAP_CONTENT;
        window.setAttributes(lp);

        myDialog2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog2.show();
    }
}
