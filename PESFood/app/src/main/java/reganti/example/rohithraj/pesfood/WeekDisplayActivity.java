package reganti.example.rohithraj.pesfood;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class WeekDisplayActivity extends AppCompatActivity {

    private Button mWeekOneButton;
    private Button mWeekTwoButton;
    private Button mWeekThreeButton;
    private Button mWeekFourButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_week_display);


        mWeekOneButton = (Button) findViewById(R.id.weekOneButton);
        mWeekTwoButton = (Button) findViewById(R.id.weekTwoButton);
        mWeekThreeButton = (Button) findViewById(R.id.weekThreeButton);
        mWeekFourButton = (Button) findViewById(R.id.weekFourButton);

        mWeekOneButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View V){

                Intent i=new Intent(getApplicationContext(),WeekOneListView.class);
                startActivity(i);

            }
        });

        mWeekTwoButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View V){

                Intent i=new Intent(getApplicationContext(),WeekTwoListView.class);
                startActivity(i);

            }
        });

        mWeekThreeButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View V){

                Intent i=new Intent(getApplicationContext(),WeekThreeListView.class);
                startActivity(i);

            }
        });

        mWeekFourButton.setOnClickListener(new Button.OnClickListener(){
            public void onClick(View V){

                Intent i=new Intent(getApplicationContext(),WeekFourListView.class);
                startActivity(i);

            }
        });




    }
}
