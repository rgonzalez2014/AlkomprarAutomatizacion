package cmpqr.cartera.models;

public class DataCreditos {

    /*Credenciales*/

    String usuario;
    String password;

    public DataCreditos(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
}
