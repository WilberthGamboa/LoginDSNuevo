package com.mycompany.logindsnuevo;

public class Usuario {
    private String login;
    private String contrasenia;

    public Usuario (String login, String contrasenia){
        this.login = login;
        this.contrasenia=contrasenia;

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    
    
    
}
