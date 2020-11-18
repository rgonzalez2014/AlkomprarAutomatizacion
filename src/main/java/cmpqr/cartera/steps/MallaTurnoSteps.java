package cmpqr.cartera.steps;

import cmpqr.cartera.page.RegistroMallaTurno;
import net.thucydides.core.annotations.Step;


public class MallaTurnoSteps {

    RegistroMallaTurno mallaPOM = new RegistroMallaTurno();

    @Step
    public void abrirCRMAlkomprar() {
        mallaPOM.open();
    }

    @Step
    public void escribirUsuario(String usuario) {
        mallaPOM.registrarUsuario(usuario);
    }

    @Step
    public void escribirClave(String clave) {
        mallaPOM.registrarClave(clave);
    }

    @Step
    public void clicIngresar() {
        mallaPOM.clicIngresar();
    }

    @Step
    public void irModuloMallas() {
        mallaPOM.clicAdministracion();
        mallaPOM.clicMallaTurno();
    }

    @Step
    public void ingresarIframe() {
        mallaPOM.ingresarFrame();
    }

    @Step
    public void clicAgregar() {
        mallaPOM.clicAgregar();
    }

    @Step
    public void seleccionarAreaCartera(String cartera) {
        mallaPOM.seleccionarAreaCartera();
    }

    @Step
    public void seleccionarAreaSac(String sac) {
        mallaPOM.seleccionarAreaSac();
    }

    @Step
    public void seleccionarAreaDespachos(String despachos) {
        mallaPOM.seleccionarAreaDespachos();
    }

    @Step
    public void seleccionarAreaCredito(String credito) {
        mallaPOM.seleccionarAreaCredito();
    }

    public void seleccionarAreaOtrosIngresos(String otrosingresos) {
        mallaPOM.seleccionarAreaOtrosIngresos();
    }

    @Step
    public void seleccionarAreaTelemercadeo(String telemercadeo) {
        mallaPOM.seleccionarAreaTelemercadeo();
    }

    @Step
    public void seleccionarAsesor(String seleccionarasesor) {
        mallaPOM.seleccionarAsesor();
    }

    @Step
    public void ingresarFechaInicial(String fechainicial) {
        mallaPOM.ingresarFechaInicial(fechainicial);
    }

    @Step
    public void ingresarFechaFinal(String fechafinal) {
        mallaPOM.ingresarFechaFinal(fechafinal);
    }

    @Step
    public void ingresarHoraInicial(String horainicial) {
        mallaPOM.ingresarHoraInicial(horainicial);
    }

    @Step
    public void ingresarHoraFinal(String horafinal) {
        mallaPOM.ingresarHoraFinal(horafinal);
    }

    @Step
    public void seleccionarPausa(String seleccionarpausa) {
        mallaPOM.seleccionarPausa();
    }

    @Step
    public void ingresarHoraInicialPausa(String horainiciopausa) {
        mallaPOM.ingresarHoraInicioPausa(horainiciopausa);
    }

    @Step
    public void ingresarHoraFinalPausa(String horafinpausa) {
        mallaPOM.ingresarHoraFinPausa(horafinpausa);
    }

    @Step
    public void clicGuardar() {
        mallaPOM.clicGuardar();
    }

    @Step
    public void cerrarChrome() {
        mallaPOM.cerrarChrome();
    }

}
