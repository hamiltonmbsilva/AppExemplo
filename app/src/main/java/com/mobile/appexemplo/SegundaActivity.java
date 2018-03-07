package com.mobile.appexemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.mobile.appexemplo.model.Pessoa;

public class SegundaActivity extends AppCompatActivity {

    TextView resultado;
    Button vaiTela4,botaoVoltar;
    final int QUARTA_TELA = 1;

    final int Botao_voltar = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);
        binding();

        String auxNome = getIntent().getExtras().getString("nome");
        resultado.setText(auxNome);
        Pessoa p = (Pessoa) getIntent().getExtras().getSerializable("pessoa");

        vaiTela4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), QuartaActivity.class);

                i.putExtra("nomeDiNovo", resultado.getText().toString());

                startActivityForResult(i, QUARTA_TELA);
            }
        });

        botaoVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(Botao_voltar);
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        Toast.makeText(getApplicationContext(),"Voltou da Tela", Toast.LENGTH_LONG).show();

    }

    private void binding() {
        resultado = findViewById(R.id.tvResultado);
        vaiTela4 = findViewById(R.id.vaiTela4);
        botaoVoltar = findViewById(R.id.botaoVoltar);
    }
}
