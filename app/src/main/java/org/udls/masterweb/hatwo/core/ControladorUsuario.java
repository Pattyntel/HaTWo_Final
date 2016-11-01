package org.udls.masterweb.hatwo.core;

import org.udls.masterweb.hatwo.model.Usuario;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pattyntel on 12/10/2016.
 */
public class ControladorUsuario
{
    List<Usuario> usuarios;

    public ControladorUsuario()
    {
        usuarios = new ArrayList<>();
        crearUsuariosEnMemoria();
    }

    private void crearUsuariosEnMemoria(){
        Usuario aTemp = new Usuario();
        try
        {
            aTemp.setId(1);
            aTemp.setNombre("Patricia Carballo");
            aTemp.setEmail("pattytnelcarballo@gmail.com");
            aTemp.setPassword("patty123");
            aTemp.setTelefono("477-128-0884");
            usuarios.add(aTemp);

            aTemp = new Usuario();
            aTemp.setId(2);
            aTemp.setNombre("Otro");
            aTemp.setEmail("otro@gmail.com");
            aTemp.setPassword("otro123");
            aTemp.setTelefono("477-166-3754");
            usuarios.add(aTemp);

            aTemp = new Usuario();
            aTemp.setId(3);
            aTemp.setNombre("P");
            aTemp.setEmail("p@gmail.com");
            aTemp.setPassword("p123");
            aTemp.setTelefono("477-166-3754");
            usuarios.add(aTemp);
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }

    }

   /* public List<Usuario> getUsuarios(){
        return usuarios;
    }*/

    public Usuario validarUsuario(String correo, String password)
    {
        for (Usuario u: usuarios)
            if (u.getEmail().equals(correo) && u.getPassword().equals(password))
                return u;
        return null;
    }

}
