package com.livroandroid.helloandroidstudio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String login = tLogin.getText().toString();
                String senha = tSenha.getText().toString();

                if ("admin".equals(login) && "solutech".equals(senha)) {
                    alert("Bem Vindo , login efetuado com sucesso.");
                } else {
                    alert("Dados Incorretos!");
                }
            }
        });
    }

    private void alert(String s) {
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}













/* tentativa de logcat fracassada
import android.util.Log;
public class MainActivity extends AppCompatActivity{

    private static final String TAG = "livro";
    @Override

    public void oncreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v(TAG, "log de verbodr");
        Log.d(TAG, "log de debug");
        Log.i(TAG, "log de info");
        Log.w(TAG, "log de alerta");
        Log.e(TAG, "log de erro", new RuntimeException("teste de erro"));
    }
}
*/