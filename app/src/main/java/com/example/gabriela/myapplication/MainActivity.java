package com.example.gabriela.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed1;
EditText ed2;
EditText edR;
Button btSub;
Button bt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed1 = (EditText)findViewById(R.id.editTextValor1);
        ed2 = (EditText)findViewById(R.id.editTextValor2);
        edR = (EditText)findViewById(R.id.editTextResultado);
        bt = (Button) findViewById(R.id.buttonSoma);
        btSub = (Button)findViewById(R.id.buttonSub);


        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1+ v2;
                edR.setText(res.toString());
            }

        });

        //cria ação para o botao subtração

        btSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double v1;
                Double v2;
                Double res;
                v1 = Double.parseDouble(ed1.getText().toString());
                v2 = Double.parseDouble(ed2.getText().toString());
                res = v1- v2;
                edR.setText(res.toString());
            }
        });
    }
}
