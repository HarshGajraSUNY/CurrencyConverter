package com.example.harshgajra.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView myText = null;
    public void convert(View view){

        EditText numb = (EditText) findViewById(R.id.editNumberText);
        Double n = Double.parseDouble(numb.getText().toString());
        Double r=0.0;
        r = n*66.92;
        Toast.makeText(MainActivity.this, "Rupees: " + r, Toast.LENGTH_LONG).show();
        TextView tv = (TextView)findViewById(R.id.textView2);
        tv.setText("Rupees : "+r);



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
}
