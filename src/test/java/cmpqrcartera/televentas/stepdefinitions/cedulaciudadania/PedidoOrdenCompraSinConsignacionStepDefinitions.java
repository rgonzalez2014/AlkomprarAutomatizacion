package cmpqrcartera.televentas.stepdefinitions.cedulaciudadania;

import cmpqr.cartera.models.DataTeleventas;
import cmpqr.cartera.steps.RegistroPedidoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PedidoOrdenCompraSinConsignacionStepDefinitions {

    @Steps
    RegistroPedidoSteps pedidoorden;

    @Then("^Se seleccionan las fechas y el medio de pago orden de compra sin consignacion$")
    public void se_seleccionan_las_fechas_y_el_medio_de_pago_orden_de_compra_sin_consignacion(List<DataTeleventas> listadatos) throws InterruptedException {
        pedidoorden.seleccionarFechaEntrega();
        pedidoorden.clicGuardarFecha();
        pedidoorden.seleccionarPagoOrdenCompra(listadatos.get(0).getOrdencompra());
        pedidoorden.irFinalPagina3();
        pedidoorden.adjuntarArchivo();
        pedidoorden.registrarObservaciones(listadatos.get(0).getObservaciones());
        pedidoorden.clicBotonSiguiente4();
    }
}
