package cmpqrcartera.televentas.stepdefinitions.cedulaciudadania;

import cmpqr.cartera.models.DataTeleventas;
import cmpqr.cartera.steps.RegistroPedidoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PedidoBonoSinConsignacionStepDefinitions {

    @Steps
    RegistroPedidoSteps pedidobono;

    @Then("^Se seleccionan las fechas y el medio de pago bono sin consignacion$")
    public void se_seleccionan_las_fechas_y_el_medio_de_pago_bono_sin_consignacion(List<DataTeleventas> listadatos) throws InterruptedException {
        pedidobono.seleccionarFechaEntrega();
        pedidobono.clicGuardarFecha();
        pedidobono.seleccionarPagoBono(listadatos.get(0).getBono());
        pedidobono.irFinalPagina3();
        pedidobono.adjuntarArchivo();
        pedidobono.registrarObservaciones(listadatos.get(0).getObservaciones());
        pedidobono.clicBotonSiguiente4();
    }

}
