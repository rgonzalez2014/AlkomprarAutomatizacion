package cmpqr.cartera.steps;

import cmpqr.cartera.page.GestionPedidoCredito;

import java.io.IOException;

public class GestionPedidoCreditoSteps {

    GestionPedidoCredito gestionPOM = new GestionPedidoCredito();

    public void abrirFabricaCreditos() {
        gestionPOM.open();
    }

    public void escribirUsuario(String usuario) throws InterruptedException {
        gestionPOM.ingresarUsuario(usuario);
    }

    public void escribirClave(String password) {
        gestionPOM.ingresarPassword(password);
    }

    public void clicIngresar() {
        gestionPOM.clicIngresar();
    }

    public void verPaginaPrincipal() throws InterruptedException {
        gestionPOM.paginaPrincipal();
    }

    public void buscarCredito() throws IOException {
        gestionPOM.buscarCredito();
    }
}
