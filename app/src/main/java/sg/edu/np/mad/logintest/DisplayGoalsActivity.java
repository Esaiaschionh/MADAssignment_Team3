package sg.edu.np.mad.logintest;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DisplayGoalsActivity extends AppCompatActivity {

    private List<Goal> goalList;
    private GoalAdapter goalAdapter;

    private GoalDatabaseHelper databaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_goals);

        RecyclerView recyclerViewGoals = findViewById(R.id.recyclerViewGoals);
        recyclerViewGoals.setLayoutManager(new LinearLayoutManager(this));

        databaseHelper = new GoalDatabaseHelper(this);
        goalList = databaseHelper.getAllGoals();
        goalAdapter = new GoalAdapter(goalList);
        recyclerViewGoals.setAdapter(goalAdapter);
    }

    private List<Goal> retrieveGoals() {
        return databaseHelper.getAllGoals();
    }
}
