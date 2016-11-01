package org.udls.masterweb.hatwo.gui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.EditText;

import org.udls.masterweb.hatwo.R;
import org.udls.masterweb.hatwo.core.ControladorUsuario;

public class ActivityListaServicios extends Activity {

    EditText txtServicio;
    Button btnBuscarServicio;
    RecyclerView rclvServicios;

    ControladorUsuario controladorUsuario;
   // AdapterServicio adapterServicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_servicios);
        inicializarComponentes();
    }

    private void inicializarComponentes(){
     //   txtServicio =
    }
}
