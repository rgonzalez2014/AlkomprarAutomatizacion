package cmpqr.cartera.steps;

import cmpqr.cartera.page.RegistroPedido;
import net.thucydides.core.annotations.Step;

import java.io.FileNotFoundException;


public class RegistroPedidoSteps {

    RegistroPedido pedidoPOM = new RegistroPedido();

    @Step
    public void abrirCRMAlkomprar() {
        pedidoPOM.open();
    }

    @Step
    public void escribirUsuario(String usuario) {
        pedidoPOM.registrarUsuario(usuario);
    }

    @Step
    public void escribirClave(String clave) {
        pedidoPOM.registrarClave(clave);
    }

    @Step
    public void clicIngresar() {
        pedidoPOM.clicIngresar();
    }

    @Step
    public void irModuloTeleventas() {
        pedidoPOM.clicPrincipal();
        pedidoPOM.clicTeleventas();
    }

    @Step
    public void ingresarIframe() {
        pedidoPOM.ingresarFrame();
    }

    @Step
    public void clicCrear() {
        pedidoPOM.clicCrear();
    }

    @Step
    public void seleccionarUnidadVenta(String unidadventa) {
        pedidoPOM.seleccionarUnidadVenta(unidadventa);
    }

    @Step
    public void seleccionarFacturacion(String facturacionelectronica) {
        pedidoPOM.seleccionarFacturacion(facturacionelectronica);
    }

    @Step
    public void seleccionarTipoDocumento(String tipodocumento) {
        pedidoPOM.seleccionarTipoDoc(tipodocumento);
    }

    @Step
    public void ingresarNumeroIdentificacion(String numerodocumento) {
        pedidoPOM.registrarDocumento(numerodocumento);
    }

    @Step
    public void buscarDocumento() throws InterruptedException {
        pedidoPOM.clicBuscar();
    }

    @Step
    public void ingresarPrimerNombre(String primernombre) {
        pedidoPOM.registrarPrimerNombre(primernombre);
    }

    @Step
    public void ingresarSegundoNombre(String segundonombre) {
        pedidoPOM.registrarSegundoNombre(segundonombre);
    }

    @Step
    public void ingresarPrimerApellido(String primerapellido) {
        pedidoPOM.registrarPrimerApellido(primerapellido);
    }

    @Step
    public void ingresarSegundoApellido(String segundoapellido) {
        pedidoPOM.registrarSegundoApellido(segundoapellido);
    }

    @Step
    public void ingresarRazonSocial(String razonsocial) {
        pedidoPOM.registrarRazonSocial(razonsocial);
    }

    @Step
    public void irFinalPagina1() {
        pedidoPOM.paginaFinal1();
    }

    @Step
    public void seleccionarCiudad(String ciudad) {
        pedidoPOM.seleccionarCiudad(ciudad);
    }

    @Step
    public void ingresarDireccion(String direccion) throws InterruptedException {
        pedidoPOM.registrarDireccion(direccion);
    }

    @Step
    public void clicEnGeoreferenciar() throws InterruptedException {
        pedidoPOM.clicGeoreferenciar();
    }

    @Step
    public void ingresarBarrio(String barrio) {
        pedidoPOM.registrarBarrio(barrio);
    }

    @Step
    public void ingresarCelular(String celular) {
        pedidoPOM.registrarCelular(celular);
    }

    @Step
    public void ingresarFijo(String fijo) {
        pedidoPOM.registrarFijo(fijo);
    }

    @Step
    public void ingresarEmail(String email) {
        pedidoPOM.registrarEmail(email);
    }

    @Step
    public void seleccionarGenero(String genero) {
        pedidoPOM.seleccionarGenero(genero);
    }

    @Step
    public void seleccionarHabeas(String habeas) {
        pedidoPOM.seleccionarHabeasData(habeas);
    }

    @Step
    public void clicBotonSiguiente1() {
        pedidoPOM.clicSiguiente1();
    }

    @Step
    public void clienteEnvio() throws InterruptedException {
        pedidoPOM.formularioClienteEnvio();
    }

    @Step
    public void irFinalPagina2() {
        pedidoPOM.paginaFinal2();
    }

    @Step
    public void clicBotonSiguiente2() {
        pedidoPOM.clicSiguiente2();
    }

    @Step
    public void ingresarEan(String ean) throws InterruptedException {
        pedidoPOM.ingresarEan(ean);
    }

    @Step
    public void clicBuscarEan() {
        pedidoPOM.clicBuscarEan();
    }

    @Step
    public void ingresarCantidad(String cantidad) {
        pedidoPOM.ingresarCantidad(cantidad);
    }

    @Step
    public void agregarCarrito() throws InterruptedException {
        pedidoPOM.clicAgregarCarrito();
    }

    @Step
    public void clicBotonSiguiente3() throws InterruptedException {
        pedidoPOM.clicSiguienteProductos();
    }

    @Step
    public void seleccionarFechaEntrega() {
        pedidoPOM.seleccionarFechaEntrega();
    }

    @Step
    public void clicGuardarFecha() throws InterruptedException {
        pedidoPOM.clicGuardarFecha();
    }

    @Step
    public void seleccionarPagoBono(String bono) {
        pedidoPOM.seleccionarPagoBono(bono);
    }

    @Step
    public void seleccionarPagoConsignacion(String consignacion) {
        pedidoPOM.seleccionarPagoConsignacion(consignacion);
    }

    @Step
    public void seleccionarPagoOrdenCompra(String ordencompra) {
        pedidoPOM.seleccionarPagoOrdenCompra(ordencompra);
    }

    @Step
    public void seleccionarPagoCredito(String credito) {
        pedidoPOM.seleccionarPagoCredito(credito);
    }

    @Step
    public void irFinalPagina3() {
        pedidoPOM.paginaFinal3();
    }

    @Step
    public void adjuntarArchivo() {
        pedidoPOM.adjuntarDocummento();
    }

    @Step
    public void clicConsignacion() {
        pedidoPOM.clicCheckConsignacion();
    }

    @Step
    public void seleccionarPagoPayu(String payu) {
        pedidoPOM.seleccionarPagoPayU(payu);
    }

    @Step
    public void seleccionarPseTc(String psetc) {
        pedidoPOM.seleccionarPseTC(psetc);
    }

    @Step
    public void seleccionarBalEfecCons(String balefeccons) {
        pedidoPOM.seleccionarBalEfecCons(balefeccons);
    }

    @Step
    public void registrarObservaciones(String observacion) {
        pedidoPOM.registrarObservaciones(observacion);
    }

    @Step
    public void ingresarFechaExpedicion(String fechadocumento) throws InterruptedException {
        pedidoPOM.registrarfechaDocumento(fechadocumento);
    }

    @Step
    public void seleccionarActividad(String actividad) throws InterruptedException {
        pedidoPOM.seleccionarActividad(actividad);
    }

    @Step
    public void ingresarDescripcionActividad(String descripcion) throws InterruptedException {
        pedidoPOM.ingresarDescripcion(descripcion);
    }

    @Step
    public void ingresarProfesion(String profesion) {
        pedidoPOM.ingresarProfesion(profesion);
    }

    @Step
    public void ingresarCuotas(String cuotas) {
        pedidoPOM.ingresarCantidadCuotas(cuotas);
    }

    @Step
    public void seleccionarPeriodicidad(String periodicidad) {
        pedidoPOM.seleccionarPeriodicidad(periodicidad);
    }

    @Step
    public void ingresarValorCuotaInicial(String valorcuota) {
        pedidoPOM.ingresarValorCuota(valorcuota);
    }

    @Step
    public void clicBotonSiguiente4() throws InterruptedException {
        pedidoPOM.clicSiguiente4();
    }

    @Step
    public void pedidoCreado() throws FileNotFoundException {
        pedidoPOM.pedidoCreado();
    }

    @Step
    public void cerrarNavegador() throws InterruptedException {
        pedidoPOM.cerrarChrome();
    }
}
