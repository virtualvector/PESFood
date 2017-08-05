package reganti.example.rohithraj.pesfood;

/**
 * Created by Rohith Raj on 13-03-2016.
 */

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SingleListItem extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.single_list_item_view);

        TextView txtProduct = (TextView) findViewById(R.id.product_label);
        String[] week_one_items = getResources().getStringArray(R.array.week_one_items);
        Intent i = getIntent();
        // getting attached intent data
        String product = i.getStringExtra("product");
        switch (product)
        {
            case "Sunday":txtProduct.setText(week_one_items[0]);break;
            case "Monday":txtProduct.setText(week_one_items[1]);break;
            case "Tuesday":txtProduct.setText(week_one_items[2]);break;
            case "Wednesday":txtProduct.setText(week_one_items[3]);break;
            case "Thursday":txtProduct.setText(week_one_items[4]);break;
            case "Friday":txtProduct.setText(week_one_items[5]);break;
            case "Saturday":txtProduct.setText(week_one_items[6]);break;
        }
        // displaying selected product name
        //txtProduct.setText(product);

    }
}
