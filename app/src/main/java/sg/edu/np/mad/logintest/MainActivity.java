package sg.edu.np.mad.logintest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button project_Management_button;

    private Button study_SAA_button;
    private Button task_Time_Tracking_button;
    private Button new_Notes_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        project_Management_button = (Button) findViewById(R.id.project_Management_btn);
        project_Management_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTaskPlannerActivity();
            }
        });

        study_SAA_button = (Button) findViewById(R.id.study_SAA_btn);
        study_SAA_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStudySAActivity();
            }
        });

        task_Time_Tracking_button = (Button) findViewById(R.id.task_Time_Tracking_btn);
        task_Time_Tracking_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTaskTimeTrackingActivity();
            }
        });

        new_Notes_button = (Button) findViewById(R.id.new_Notes_btn);
        new_Notes_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNotesActivity();
            }
        });
    }
    public void openTaskPlannerActivity(){
        Intent intent = new Intent(this, TasksPlannerActivity.class);
        startActivity(intent);
    }

    public void openStudySAActivity(){
        Intent intent = new Intent(this, StudyStatisticsAnalyticsActivity.class);
        startActivity(intent);
    }

    public void openTaskTimeTrackingActivity(){
        Intent intent = new Intent (this, TaskTimeTrackingActivity.class);
        startActivity(intent);
    }

    public void openNotesActivity(){
        Intent intent = new Intent(this, NotesActivity.class);
        startActivity(intent);
    }
}