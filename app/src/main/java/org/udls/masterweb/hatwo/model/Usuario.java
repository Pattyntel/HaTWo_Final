package org.udls.masterweb.hatwo.model;

/**
 * Created by Pattyntel on 12/10/2016.
 */
public class Usuario
{
    //Los datos del usuario:
    private int id;
    private String nombre;
    private String email;
    private String password;
    private String telefono;
    private String sexo;


    public Usuario()
    {

    }

    public Usuario(int id, String nombre, String email, String password, String telefono)
    {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.telefono = telefono;
        this.sexo = sexo;
    }

    //Getters y Setters:
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() { return sexo; }

    public void setSexo(String sexo) { this.sexo = sexo; }
}
