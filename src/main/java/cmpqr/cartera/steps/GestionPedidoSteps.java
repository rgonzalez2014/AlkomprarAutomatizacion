package cmpqr.cartera.steps;

import cmpqr.cartera.page.GestionPedido;
import net.thucydides.core.annotations.Step;

import java.io.IOException;


public class GestionPedidoSteps {

    GestionPedido gestionPOM = new GestionPedido();

    @Step
    public void abrirCRMAlkomprar() {
        gestionPOM.open();
    }

    @Step
    public void escribirUsuario(String usuario) {
        gestionPOM.registrarUsuario(usuario);
    }

    @Step
    public void escribirClave(String clave) {
        gestionPOM.registrarClave(clave);
    }

    @Step
    public void clicIngresar() {
        gestionPOM.clicIngresar();
    }

    @Step
    public void irModuloTeleventas() {
        gestionPOM.clicPrincipal();
        gestionPOM.clicTeleventas();
    }

    @Step
    public void ingresarIframe() {
        gestionPOM.ingresarFrame();
    }

    @Step
    public void idpedido() throws IOException {
        gestionPOM.ingresarPedido();
    }

    @Step
    public void clicPedido() {
        gestionPOM.clicPedido();
    }

    @Step
    public void gestionarPedido() {
        gestionPOM.pestanaGestionar();
    }

    @Step
    public void seleccionarCasaCliente(String casaclientependiente) {
        gestionPOM.seleccionarCasaCliente(casaclientependiente);
    }

    @Step
    public void adjuntarArchivo() {
        gestionPOM.adjuntarDocumento();
    }

    @Step
    public void valorConsignacion(String valorconsignacion) {
        gestionPOM.valorConsignacion(valorconsignacion);
    }

    @Step
    public void registrarObservaciones(String observaciones_2) {
        gestionPOM.ingresarObservaciones(observaciones_2);
    }

    @Step
    public void guardarGestion() {
        gestionPOM.guardar();
    }

    @Step
    public void paginaPrincipal() throws InterruptedException {
        gestionPOM.paginaPrincipal();
    }

}
