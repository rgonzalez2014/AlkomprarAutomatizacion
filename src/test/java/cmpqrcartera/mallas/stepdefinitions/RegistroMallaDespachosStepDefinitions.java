package cmpqrcartera.mallas.stepdefinitions;

import cmpqr.cartera.models.DataMalla;
import cmpqr.cartera.steps.MallaTurnoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroMallaDespachosStepDefinitions {

    @Steps
    MallaTurnoSteps malladespachos;

    @Then("^Se registran los datos del turno para despachos$")
    public void se_registran_los_datos_del_turno_para_despachos(List<DataMalla> listadatos) {
    malladespachos.seleccionarAreaDespachos(listadatos.get(0).getArea());
    malladespachos.seleccionarAsesor(listadatos.get(0).getAsesor());
    malladespachos.ingresarFechaInicial(listadatos.get(0).getFechainicio());
    malladespachos.ingresarFechaFinal(listadatos.get(0).getFechafin());
    malladespachos.ingresarHoraInicial(listadatos.get(0).getHorainicio());
    malladespachos.ingresarHoraFinal(listadatos.get(0).getHorafin());
    malladespachos.clicGuardar();
    }
}
