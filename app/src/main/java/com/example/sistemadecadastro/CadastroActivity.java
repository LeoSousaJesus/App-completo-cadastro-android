package com.example.sistemadecadastro;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class CadastroActivity extends AppCompatActivity {

    EditText ednome, edendereco, edtelefone;
    Button btcadastrar, btcancelar_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_cadastro);

        ednome = findViewById(R.id.ednome);
        edendereco = findViewById(R.id.edendereco);
        edtelefone = findViewById(R.id.edtelefone);
        btcadastrar = findViewById(R.id.btcadastrar);
        btcancelar_cadastro = findViewById(R.id.btcancelar_cadastro);

        btcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogo = new
                        AlertDialog.Builder(CadastroActivity.this);
                dialogo.setTitle("Aviso");
                dialogo.setMessage("Cadastrar Usuário?");
                dialogo.setNegativeButton("Não", null);
                dialogo.setPositiveButton("Sim", new
                        DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                String nome = ednome.getText().toString();
                                String endereco = edendereco.getText().toString();
                                String telefone = edtelefone.getText().toString();
                                RegistrosManager.getRegistros().add(new
                                        Registro(nome, telefone, endereco));

                                (new AlertDialog.Builder(CadastroActivity.this))
                                        .setTitle("Aviso")
                                        .setMessage("Cadastro Efetuado com sucesso!")
                                        .setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                                            @Override
                                            public void onClick(DialogInterface dialogInterface, int i) {
                                                CadastroActivity.this.finish();
                                            }
                                        })
                                        .show();
                            }
                        });
                dialogo.show();
            }
        });

        btcancelar_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CadastroActivity.this.finish();
            }
        });


    }
}