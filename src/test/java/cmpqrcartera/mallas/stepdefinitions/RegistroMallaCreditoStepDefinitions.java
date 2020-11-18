package cmpqrcartera.mallas.stepdefinitions;

import cmpqr.cartera.models.DataMalla;
import cmpqr.cartera.steps.MallaTurnoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroMallaCreditoStepDefinitions {

    @Steps
    MallaTurnoSteps mallacredito;


    @Then("^Se registran los datos del turno para credito$")
    public void se_registran_los_datos_del_turno_para_credito(List<DataMalla> listadatos) {
        mallacredito.seleccionarAreaCredito(listadatos.get(0).getArea());
        mallacredito.seleccionarAsesor(listadatos.get(0).getAsesor());
        mallacredito.ingresarFechaInicial(listadatos.get(0).getFechainicio());
        mallacredito.ingresarFechaFinal(listadatos.get(0).getFechafin());
        mallacredito.ingresarHoraInicial(listadatos.get(0).getHorainicio());
        mallacredito.ingresarHoraFinal(listadatos.get(0).getHorafin());
        mallacredito.seleccionarPausa(listadatos.get(0).getPausa());
        mallacredito.ingresarHoraInicialPausa(listadatos.get(0).getHorainiciopausa());
        mallacredito.ingresarHoraFinalPausa(listadatos.get(0).getHorafinpausa());
        mallacredito.clicGuardar();
    }
}
