package cmpqrcartera.televentas.stepdefinitions.cedulaciudadania;

import cmpqr.cartera.models.DataTeleventas;
import cmpqr.cartera.steps.RegistroPedidoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PedidoPayuPstTcStepDefinitions {

    @Steps
    RegistroPedidoSteps payu;

    @Then("^Se seleccionan las fechas y el medio de pago payu Pse-Tc$")
    public void se_seleccionan_las_fechas_y_el_medio_de_pago_payu_Pse_Tc(List<DataTeleventas> listadatos) throws InterruptedException {
        payu.seleccionarFechaEntrega();
        payu.clicGuardarFecha();
        payu.seleccionarPagoPayu(listadatos.get(0).getPayu());
        payu.seleccionarPseTc(listadatos.get(0).getTipopago());
        payu.irFinalPagina3();
        payu.registrarObservaciones(listadatos.get(0).getObservaciones());
        payu.clicBotonSiguiente4();
    }
}
