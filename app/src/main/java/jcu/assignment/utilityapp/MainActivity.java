package jcu.assignment.utilityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Main main = new Main();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner();
    }

    public void spinner() {
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.units_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    public void onClickEnter(View view) {
        EditText editText = findViewById(R.id.input_text);
        int unitInput = main.getResult(Integer.parseInt(editText.getText().toString()));

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String unitType = String.valueOf(spinner.getSelectedItem());

        String spinnerType = Main.getEquation(unitType);
        int equation = Integer.valueOf(spinnerType);
        int totalNumber = unitInput * equation;
        int result = totalNumber;

        TextView textView = (TextView) findViewById(R.id.output_text);
        String finalResult = String.valueOf(result);
        textView.setText(finalResult);
    }

    public void onClickClear(View view) {
        EditText editText = findViewById(R.id.input_text);
        editText.setText("");
        TextView textView = (TextView) findViewById(R.id.output_text);
        textView.setText("");
//        finish();
//        overridePendingTransition( 0, 0);
//        startActivity(getIntent());
//        overridePendingTransition( 0, 0);
    }
}
//References
//https://developer.android.com/guide/topics/ui/controls/spinner#java