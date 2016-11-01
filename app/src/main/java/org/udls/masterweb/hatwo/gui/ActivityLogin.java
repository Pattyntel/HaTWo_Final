package org.udls.masterweb.hatwo.gui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.udls.masterweb.hatwo.R;
import org.udls.masterweb.hatwo.core.ControladorUsuario;

public class ActivityLogin extends Activity {

    EditText txtEmail;
    EditText txtPassword;
    Button btnLogin;
    Button btnRegistarse;

    ControladorUsuario controladorUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inicializarComponentes();
    }

    /**
     * Este método se invoca dentro del método onCreate(...).
     * Aquí relacionaremos nuestros objetos que representan controles visuales
     * con aquellos que definimos en el layout xml (activity_main.xml)
     */
    private void inicializarComponentes()
    {
        txtEmail=(EditText) findViewById(R.id.txtEmail);
        txtPassword = (EditText) findViewById(R.id.txtPassword);
        btnLogin = (Button) findViewById(R.id.btnLogin);
        btnRegistarse = (Button) findViewById(R.id.btnRegistrarse);

        controladorUsuario = new ControladorUsuario();

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                ValidarUsuario();
            }
        });

        btnRegistarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Registrarse();
            }
        });
    }

    /**
     * Este método lo invocamos cuando el usuario pulsa el botón "Entrar"
     */
    private void ValidarUsuario(){
        String correo = txtEmail.getText().toString();
        String contraseña = txtPassword.getText().toString();
        Intent intent = new Intent(this, ActivityMain.class);
        intent.putExtra("usuario", correo);
        intent.putExtra("contraseña", contraseña);
        startActivity(intent);
    }

    private void Registrarse(){
        Intent intent = new Intent(this, ActivityAltaUsuario.class);
        startActivity(intent);
    }
}
