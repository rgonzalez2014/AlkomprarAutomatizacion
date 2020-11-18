package cmpqrcartera.televentas.stepdefinitions.cedulaciudadania;

import cmpqr.cartera.models.DataTeleventas;
import cmpqr.cartera.steps.RegistroPedidoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PedidoCredito20MinutosStepDefinitions {

    @Steps
    RegistroPedidoSteps credito;

    @Then("^Se seleccionan las fechas y el medio de pago credito$")
    public void se_seleccionan_las_fechas_y_el_medio_de_pago_credito(List<DataTeleventas> listadatos) throws InterruptedException {
        credito.seleccionarFechaEntrega();
        credito.clicGuardarFecha();
        credito.seleccionarPagoCredito(listadatos.get(0).getCredito());
        credito.ingresarFechaExpedicion(listadatos.get(0).getFechadocumento());
        credito.seleccionarActividad(listadatos.get(0).getActividad());
        credito.ingresarDescripcionActividad(listadatos.get(0).getDescripcion());
        credito.ingresarProfesion(listadatos.get(0).getProfesion());
        credito.irFinalPagina3();
        credito.ingresarCuotas(listadatos.get(0).getCuotas());
        credito.seleccionarPeriodicidad(listadatos.get(0).getPeriodicidad());
        credito.ingresarValorCuotaInicial(listadatos.get(0).getValorcuota());
        credito.adjuntarArchivo();
        credito.registrarObservaciones(listadatos.get(0).getObservaciones());
        credito.clicBotonSiguiente4();
    }
}
