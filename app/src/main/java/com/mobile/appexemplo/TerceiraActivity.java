package com.mobile.appexemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TerceiraActivity extends AppCompatActivity {

    TextView pergunta;
    Button btnSim,btnNao;
    final  int SIM = 2;
    final  int NAO = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        binding();

        btnSim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(SIM);
                finish();
            }
        });

        btnNao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(NAO);
                finish();
            }
        });
    }

    private void binding() {
        pergunta = findViewById(R.id.Pergunta);
        btnSim = findViewById(R.id.btnSim);
        btnNao = findViewById(R.id.btnNao);
    }
}
