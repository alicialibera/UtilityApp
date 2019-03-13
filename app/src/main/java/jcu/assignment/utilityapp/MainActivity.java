package jcu.assignment.utilityapp;

import android.content.Context;
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
//        TextView textView = (TextView) findViewById(R.id.output_text);
        int result = main.convertUnit(Integer.parseInt(editText.getText().toString()));
        System.out.println(result);
//        textView.setText(result);
    }

    public void clear(View view) {
        finish();
        overridePendingTransition( 0, 0);
        startActivity(getIntent());
        overridePendingTransition( 0, 0);
    }
}
//References
//https://developer.android.com/guide/topics/ui/controls/spinner#java