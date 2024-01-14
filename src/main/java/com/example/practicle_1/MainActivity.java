package com.example.practicle_1;

import androidx.appcompat.app.AppCompatActivity;

import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.TableLayout;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TableLayout tl1=findViewById(R.id.tl1);

        for (i=0;i<10;i++) {
            addStudentRow(tl1, "Student " + (i + 1), "Roll " + (i + 1), "Grade " + (i + 1));

        }
}

private void addStudentRow(TableLayout tl1, String name, String roll,String grade ) {

    TableRow row = new TableRow(this);

    TextView nameTextView = createTextView(name);
    TextView rollNumberTextView = createTextView(roll);
    TextView gradeTextView = createTextView(grade);

    row.addView(nameTextView);
    row.addView(rollNumberTextView);
    row.addView(gradeTextView);
    tl1.addView(row);

}

    private TextView createTextView(String text)
    {
        TextView textView=new TextView(this);
                textView.setText(text);
                textView.setPadding(8,8,8,8);
                textView.setGravity(Gravity.CENTER);
        TableRow.LayoutParams params = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT);
                return textView;
    }




}