package cmpqrcartera.mallas.stepdefinitions;

import cmpqr.cartera.models.DataMalla;
import cmpqr.cartera.steps.MallaTurnoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroMallaSacStepDefiinitions {

    @Steps
    MallaTurnoSteps mallasac;

    @Then("^Se registran los datos del turno para sac$")
    public void se_registran_los_datos_del_turno_para_sac(List<DataMalla> listadatos) {
        mallasac.seleccionarAreaSac(listadatos.get(0).getArea());
        mallasac.seleccionarAsesor(listadatos.get(0).getAsesor());
        mallasac.ingresarFechaInicial(listadatos.get(0).getFechainicio());
        mallasac.ingresarFechaFinal(listadatos.get(0).getFechafin());
        mallasac.ingresarHoraInicial(listadatos.get(0).getHorainicio());
        mallasac.ingresarHoraFinal(listadatos.get(0).getHorafin());
        mallasac.seleccionarPausa(listadatos.get(0).getPausa());
        mallasac.ingresarHoraInicialPausa(listadatos.get(0).getHorainiciopausa());
        mallasac.ingresarHoraFinalPausa(listadatos.get(0).getHorafinpausa());
        mallasac.clicGuardar();
    }

}
