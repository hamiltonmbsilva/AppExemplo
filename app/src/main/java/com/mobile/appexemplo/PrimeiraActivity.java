package com.mobile.appexemplo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.mobile.appexemplo.model.Pessoa;


public class PrimeiraActivity extends AppCompatActivity {

    Button BotaoTela2, BotaoTela3;
    EditText CampoNome;
    final int Segunda_Tela = 1;
    final int Terceira_Tela = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeira);

        binding();

        BotaoTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(getApplicationContext(), SegundaActivity.class);

                itn.putExtra( "nome", CampoNome.getText());
                Pessoa p = new Pessoa("Hamilton", 15,8000);

                itn.putExtra("pessoa",p);

                startActivityForResult(itn,Segunda_Tela);
            }
        });

        BotaoTela3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent itn = new Intent(getApplicationContext(), TerceiraActivity.class);

                startActivityForResult(itn,Terceira_Tela);
            }
        });
}

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == Segunda_Tela){
            Toast.makeText(getApplicationContext(),"Voltou da Tela 2", Toast.LENGTH_LONG).show();
        }else if(requestCode == Terceira_Tela){
            if(requestCode == 2){
                Toast.makeText(getApplicationContext(),"Voltou da Tela 3 e SIM", Toast.LENGTH_LONG).show();
            }else if(resultCode == 3){
                Toast.makeText(getApplicationContext(),"Voltou da Tela 3 e NÂO", Toast.LENGTH_LONG).show();
            }else
            Toast.makeText(getApplicationContext(),"Voltou da Tela 3 e voltou pelo celular", Toast.LENGTH_LONG).show();
        }

    }

    private void binding() {
        BotaoTela2 = findViewById(R.id.BotaoTela2);
        BotaoTela3 = findViewById(R.id.VoltarTela4);
        CampoNome = findViewById(R.id.CampoNome);
    }
}
