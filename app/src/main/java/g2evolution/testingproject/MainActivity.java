package g2evolution.testingproject;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;


import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;

/**
 * This app calculates the value of experience in Android programming on the market
 */
public class MainActivity extends ActionBarActivity {



    int quantity = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//Tpast with active data for material
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        TextView valueTextView = (TextView) findViewById(R.id.price_text_view);
// textView is the TextView view that should display it
        valueTextView.setText(currentDateTimeString);
    }

    /**
     * This method is called when the calculate button is clicked.
     */
    public void calculateExperience(View view) {
        display(quantity);
        displayValue(quantity*9);
    }
    /**
     * Increment
     */
    public void increment(View view) {
        quantity = quantity + 1;
        display(quantity);

    }
    /** Decrement
     *
     */
    public void decrement(View view) {
        quantity = quantity - 1;
        display(quantity);
    }
    /**
     * This method displays the amount of experience on the screen.
     */
    private void display(int number) {
        TextView experienceTextView = (TextView) findViewById(
                R.id.quantity_text_view);

        experienceTextView.setText("" + number);
    }

    /**
     * This method displays the given value on the screen.
     */
    private void displayValue(int number) {
        TextView valueTextView = (TextView) findViewById(R.id.price_text_view);
        valueTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}