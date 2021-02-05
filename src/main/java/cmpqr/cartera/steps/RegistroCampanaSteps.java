package cmpqr.cartera.steps;

import cmpqr.cartera.page.RegistroCampana;
import net.thucydides.core.annotations.Step;

public class RegistroCampanaSteps {

    RegistroCampana campanaPOM = new RegistroCampana();

    @Step
    public void abrirCRMAlkomprar() {
        campanaPOM.open();
    }

    @Step
    public void escribirUsuario(String usuario) {
        campanaPOM.registrarUsuario(usuario);
    }

    @Step
    public void escribirClave(String clave) {
        campanaPOM.registrarClave(clave);
    }

    @Step
    public void clicIngresar() {
        campanaPOM.clicIngresar();
    }

    @Step
    public void irModuloCampanas() {
        campanaPOM.clicAdministracion();
        campanaPOM.clicCampanas();
    }

    @Step
    public void ingresarIframe() {
        campanaPOM.ingresarFrame();
    }

    @Step
    public void clicCrear() {
        campanaPOM.clicCrear();
    }

    @Step
    public void ingresarNombreCampana(String nombre) {
        campanaPOM.nombreCampana(nombre);
    }

    @Step
    public void ingresarFechaInicio(String fechaInicio) {
        campanaPOM.fechaInicio(fechaInicio);
    }

    @Step
    public void ingresarFechaFin(String fechaFin) {
        campanaPOM.fechaFin(fechaFin);
    }

    @Step
    public void ingresarHoraInicio(String horaInicio) {
        campanaPOM.horaInicio(horaInicio);
    }

    @Step
    public void ingresarHoraFin(String horaFin) {
        campanaPOM.horaFin(horaFin);
    }

    @Step
    public void ingresarDias(String dias) {
        campanaPOM.dias(dias);
    }

    @Step
    public void actualizar(String actualizar) {
        campanaPOM.actualizar(actualizar);
    }

    @Step
    public void seleccionarAreaCartera(String area) {
        campanaPOM.areaCartera(area);
    }

    @Step
    public void seleccionarAreaSac(String sac) {
        campanaPOM.areaServicioCliente(sac);
    }

    @Step
    public void seleccionarAreaCredito(String credito) {
        campanaPOM.areaCredito(credito);
    }

    @Step
    public void seleccionarAreaDespachos(String despachos) {
        campanaPOM.areaDespachos(despachos);
    }

    @Step
    public void seleccionarAreaTel(String telemercadeo) {
        campanaPOM.areaTelemercadeo(telemercadeo);
    }

    @Step
    public void seleccionarAreaOtrosIngresos(String ingresos) {
        campanaPOM.areaOtrosIngresos(ingresos);
    }

    @Step
    public void seleccionarCanalPredictiva(String predictiva) {
        campanaPOM.canalPredictiva(predictiva);
    }

    @Step
    public void seleccionarCanalProgresiva(String progresiva) {
        campanaPOM.canalProgresiva(progresiva);
    }

    @Step
    public void seleccionarCanalMensajes(String mensaje) {
        campanaPOM.canalMensaje(mensaje);
    }

    @Step
    public void seleccionarCanalGrabaciones(String grabacion) {
        campanaPOM.canalGrabacion(grabacion);
    }

    @Step
    public void seleccionarCanalManual(String manual) {
        campanaPOM.canalManual(manual);
    }

    @Step
    public void seleccionarResponsable(String responsablecampana) {
        campanaPOM.responsableCampana(responsablecampana);
    }

    @Step
    public void seleccionarGestion(String gestion) throws InterruptedException {
        campanaPOM.seleccionarGestion(gestion);
    }

    @Step
    public void seleccionarCampanaCartPred(String carterapredictiva) {
        campanaPOM.seleccionarCarteraPredictiva(carterapredictiva);
    }

    @Step
    public void seleccionarCampanaCartProg(String carteraprogresiva) {
        campanaPOM.seleccionarCarteraProgresiva(carteraprogresiva);
    }

    @Step
    public void seleccionarCampanaCartGrab(String grabcartera) {
        campanaPOM.seleccionarGrabacionCartera(grabcartera);
    }

    @Step
    public void seleccionarPlantillaCartera(String mensajecartera) {
        campanaPOM.seleccionarMensajeCartera(mensajecartera);
    }

    @Step
    public void seleccionarCampanaSacPred(String sacpredictiva) {
        campanaPOM.seleccionarSacPredictiva(sacpredictiva);
    }

    @Step
    public void seleccionarCampanaSacPro(String sacprogresiva) {
        campanaPOM.seleccionarSacProgresiva(sacprogresiva);
    }

    @Step
    public void seleccionarCampanaSacGrab(String grabsac) {
        campanaPOM.seleccionarGrabacionSac(grabsac);
    }

    @Step
    public void seleccionarPlantillaSac(String mensajesac) {
        campanaPOM.seleccionarMensajeSac(mensajesac);
    }

    @Step
    public void registrarObservaciones(String observaciones) {
        campanaPOM.observaciones(observaciones);
    }

    @Step
    public void guardar() {
        campanaPOM.clicGuardar();
    }

    @Step
    public void cerrarChrome() {
        campanaPOM.cerrarChrome();
    }
}
