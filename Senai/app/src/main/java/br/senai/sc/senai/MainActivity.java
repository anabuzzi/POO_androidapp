package br.senai.sc.senai;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    //sobrescrevendo um método que é implementado lá pela activity
    // chama o onCreate da super classe e na sequência define qual o arquivo de layout que será utilizado
    // "r.layout" aponta para pasta "res" e para "layout" onde está activity_main.xml

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickShowBtn(View btn){

        EditText editText = findViewById(R.id.et_texto);
        EditText editText3 = findViewById(R.id.et_texto3);
        //variável do tipo EditText, definida pelos IDs citados que estão em activity_main.xml

        String button1 = editText.getText().toString();
        //variável do tipo texto de nome button 1 que recebe o texto digitado retornando uma representação string do objeto
        String button2 = editText3.getText().toString();
        //variável do tipo texto de nome button 3 que recebe o texto digitado retornando uma representação string do objeto


        String result = button1 + ' ' + button2;
        // concatenação das duas strings em uma única frase

        Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
        //mostra na tela o resultado (result)


    }


    public void onClickClear (View btn){

        EditText editText = findViewById(R.id.et_texto);
        EditText editText3 = findViewById(R.id.et_texto3);

        editText.getText().clear();
        // apaga o campo correspondente ao primeiro botão
        editText3.getText().clear();
        // apaga o campo correspondente ao segundo botão


    }

}