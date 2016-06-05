package com.app.my.screent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void onNextClick(View view){
        Intent intent=new Intent(this,SubActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                int num;
                String tempSt1, tempSt2;
                String numst;
                EditText number1 = (EditText) findViewById(R.id.editText2);
                EditText number2 = (EditText) findViewById(R.id.editText3);
                EditText resul = (EditText) findViewById(R.id.editText);


                tempSt1 = number1.getText().toString();
                tempSt2 = number2.getText().toString();

                num = Integer.parseInt(tempSt1) + Integer.parseInt(tempSt2);
                numst=String.valueOf(num);

                resul.setText(numst);
            }
        });


    }
}
