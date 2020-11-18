package cmpqrcartera.mallas.stepdefinitions;

import cmpqr.cartera.models.DataMalla;
import cmpqr.cartera.steps.MallaTurnoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroMallaTelemercadeoStepDefinitions {

    @Steps
    MallaTurnoSteps mallatel;

    @Then("^Se registran los datos del turno para telemercadeo$")
    public void se_registran_los_datos_del_turno_para_telemercadeo(List<DataMalla> listadatos) {
        mallatel.seleccionarAreaTelemercadeo(listadatos.get(0).getArea());
        mallatel.seleccionarAsesor(listadatos.get(0).getAsesor());
        mallatel.ingresarFechaInicial(listadatos.get(0).getFechainicio());
        mallatel.ingresarFechaFinal(listadatos.get(0).getFechafin());
        mallatel.ingresarHoraInicial(listadatos.get(0).getHorainicio());
        mallatel.ingresarHoraFinal(listadatos.get(0).getHorafin());
        mallatel.seleccionarPausa(listadatos.get(0).getPausa());
        mallatel.ingresarHoraInicialPausa(listadatos.get(0).getHorainiciopausa());
        mallatel.ingresarHoraFinalPausa(listadatos.get(0).getHorafinpausa());
        mallatel.clicGuardar();
    }
}
