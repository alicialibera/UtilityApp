package jcu.assignment.utilityapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    SpinnerActivity spinnerActivity = new SpinnerActivity();
    Main main = new Main();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void enter(View view) {
        EditText editText = findViewById(R.id.input_text);
        int result = main.convertUnit(Integer.parseInt(editText.getText().toString()));

        TextView textView = (TextView) findViewById(R.id.output_text);
        String string;
        string = String.valueOf(result);
        textView.setText(string);
    }

    public void clear(View view) {
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