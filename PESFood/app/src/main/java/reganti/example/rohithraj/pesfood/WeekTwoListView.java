package reganti.example.rohithraj.pesfood;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by Rohith Raj on 13-03-2016.
 */
public class WeekTwoListView extends ListActivity {


        @Override
        public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);

            // storing string resources into Array
            String[] adobe_products = getResources().getStringArray(R.array.week_two_days);

            // Binding resources Array to ListAdapter
            this.setListAdapter(new ArrayAdapter<String>(this, R.layout.list_item, R.id.label, adobe_products));

            ListView lv = getListView();

            // listening to single list item on click
            lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {

                    // selected item
                    String product = ((TextView) view).getText().toString();
                    Intent i = new Intent(getApplicationContext(), SingleListItem2.class);
                    i.putExtra("product", product);
                    startActivity(i);
                    // Launching new Activity on selecting single List Item
                    //Intent i = new Intent(getApplicationContext(), SingleListItem.class);
                    // sending data to new activity
                    //i.putExtra("product", product);
                    //startActivity(i);

                }
            });

        }
    }

