package sg.edu.np.mad.logintest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import org.eazegraph.lib.charts.PieChart;
import org.eazegraph.lib.models.PieModel;


public class TaskTimeTrackingActivity extends AppCompatActivity {
    private Button home_button;
    private PieChart donutChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        donutChart = findViewById(R.id.donutChart);

        // Create data entries for the donut chart
        ArrayList<PieEntry> entries = new ArrayList<>();
        entries.add(new PieEntry(30f, "Category 1"));
        entries.add(new PieEntry(20f, "Category 2"));
        entries.add(new PieEntry(50f, "Category 3"));

        // Create a data set with the entries
        PieDataSet dataSet = new PieDataSet(entries, "Donut Chart");
        dataSet.setColors(ColorTemplate.MATERIAL_COLORS);
        dataSet.setSliceSpace(3f);
        dataSet.setSelectionShift(5f);

        // Create a data object from the data set
        PieData data = new PieData(dataSet);

        // Set the data to the chart
        donutChart.setData(data);
        donutChart.getDescription().setEnabled(false);
        donutChart.setDrawHoleEnabled(true);
        donutChart.setHoleColor(Color.WHITE);
        donutChart.setTransparentCircleColor(Color.WHITE);
        donutChart.setTransparentCircleAlpha(110);
        donutChart.setHoleRadius(58f);
        donutChart.setTransparentCircleRadius(61f);
        donutChart.setDrawCenterText(true);
        donutChart.setCenterText("Donut Chart");
        donutChart.setCenterTextSize(18f);
        donutChart.setCenterTextColor(Color.BLACK);
        donutChart.setEntryLabelColor(Color.BLACK);
        donutChart.setEntryLabelTextSize(12f);

        // Animate the chart
        donutChart.animateY(1000);

        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_time_tracking);

        home_button = (Button) findViewById(R.id.home_btn);
        home_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });
    }

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}