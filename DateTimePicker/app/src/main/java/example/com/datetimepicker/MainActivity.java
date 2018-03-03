package example.com.datetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button pick = (Button) findViewById(R.id.pickButton);
        pick.setOnClickListener(this);
        Button showTimePicker = (Button) findViewById(R.id.showTimePicker);
        showTimePicker.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Toast t;
        if(view.getId()==R.id.pickTime){
            TimePicker timePicker = (TimePicker) findViewById(R.id.timePicker);
            t = Toast.makeText(getApplicationContext(), "TimePicked: "+timePicker.getHour() + ":" + timePicker.getMinute() , Toast.LENGTH_SHORT);
            t.show();
        }else if(view.getId()==R.id.pickButton){
            DatePicker datePicker = (DatePicker) findViewById(R.id.datePicker2);
            t = Toast.makeText(getApplicationContext(), "DatePicked: "+datePicker.getDayOfMonth() + "/" + datePicker.getMonth() + "/" + datePicker.getYear(), Toast.LENGTH_SHORT);
            t.show();
        }if(view.getId()==R.id.showTimePicker){
            setContentView(R.layout.time_picker);
            Button pickTime = (Button)findViewById(R.id.pickTime) ;
            pickTime.setOnClickListener(this);
            Button showDatePicker = (Button) findViewById(R.id.showDatePicker);
            showDatePicker.setOnClickListener(this);
        }else if(view.getId()==R.id.showDatePicker){
            setContentView(R.layout.activity_main);
            Button pick = (Button) findViewById(R.id.pickButton);
            pick.setOnClickListener(this);
            Button showTimePicker = (Button) findViewById(R.id.showTimePicker);
            showTimePicker.setOnClickListener(this);
        }

    }
}
