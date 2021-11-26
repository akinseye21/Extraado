package mobile.extraado.com;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CalendarView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class BookingPage extends AppCompatActivity {

    RelativeLayout date_picker, time_picker;
    TextView theDate;

    Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_page);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        myDialog = new Dialog(this);


        theDate = findViewById(R.id.thedate);

    }

    public void ShowDatePopup(View view) {
        CalendarView calendarView;
        myDialog.setContentView(R.layout.custom_calendar_popup);
        calendarView = myDialog.findViewById(R.id.calendarView);

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
}
