package com.maira.tainara.projetocalculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private Button numeroZero, numeroUm, numeroDois, numeroTres, numeroQuatro, numeroCinco, numeroSeis,
            numeroSete, numeroOito, numeroNove, ponto,soma, subtracao, multiplicacao, divisao, igual, botao_limpar;

    private TextView txtExpressao, txtResultado;
    private ImageView backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Iniciarcomponentes();
        getSupportActionBar().hide();
    }

        private void Iniciarcomponentes(){
            numeroZero = findViewById(R.id.numero_zero);
            numeroUm = findViewById(R.id.numero_um);
            numeroDois = findViewById(R.id.numero_dois);
            numeroTres = findViewById(R.id.numero_tres);
            numeroQuatro = findViewById(R.id.numero_quatro);
            numeroCinco = findViewById(R.id.numero_cinco);
            numeroSeis = findViewById(R.id.numero_seis);
            numeroSete = findViewById(R.id.numero_sete);
            numeroOito = findViewById(R.id.numero_oito);
            numeroNove = findViewById(R.id.numero_nove);
            ponto = findViewById(R.id.ponto);
            soma = findViewById(R.id.soma);
            subtracao = findViewById(R.id.subtracao);
            multiplicacao = findViewById(R.id.multiplicacao);
            divisao = findViewById(R.id.divisao);
            igual = findViewById(R.id.igual);
            botao_limpar = findViewById(R.id.bt_limpar);
            txtExpressao = findViewById(R.id.text_expressao);
            txtResultado = findViewById(R.id.text_resultado);
            backspace = findViewById(R.id.backspace);
        }

        public void AcrescentarUmaExpressao(String string, boolean limpar_dados){
                if(txtResultado.getText().equals("")){
                    txtExpressao.setText("");
                }
                if(limpar_dados){
                    txtResultado.setText("");
                    txtExpressao.append(string);
                }else{
                    txtExpressao.append(txtResultado.getText());
                    txtExpressao.append(string);
                    txtResultado.setText("");
                }
        }

    @Override
    public void onClick(View view) {

    }

}