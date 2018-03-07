package com.mobile.appexemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuartaActivity extends AppCompatActivity {

    TextView tv1;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);

        binding();
        String aux = getIntent().getExtras().getString("nomeDiNovo");
        tv1.setText(aux);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(17);
                finish();
            }
        });

    }

    private void binding() {

        tv1 = findViewById(R.id.CampoTextoTela4);
        btn = findViewById(R.id.BotaoVoltarTela2);
    }
}
