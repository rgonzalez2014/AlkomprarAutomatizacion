package cmpqrcartera.televentas.stepdefinitions.cedulaciudadania;

import cmpqr.cartera.models.DataTeleventas;
import cmpqr.cartera.steps.RegistroPedidoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;


public class PedidoConsignacionStepDefinitions {

    @Steps
    RegistroPedidoSteps pedidoconsignacion;


    @Then("^Se seleccionan las fechas y el medio de pago consignacion$")
    public void se_seleccionan_las_fechas_y_el_medio_de_pago_consignacion(List<DataTeleventas> listadatos) throws InterruptedException {
        pedidoconsignacion.seleccionarFechaEntrega();
        pedidoconsignacion.clicGuardarFecha();
        pedidoconsignacion.seleccionarPagoConsignacion(listadatos.get(0).getConsignacion());
        pedidoconsignacion.irFinalPagina3();
        pedidoconsignacion.adjuntarArchivo();
        pedidoconsignacion.registrarObservaciones(listadatos.get(0).getObservaciones());
        pedidoconsignacion.clicBotonSiguiente4();
    }

}
