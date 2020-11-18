package cmpqrcartera.mallas.stepdefinitions;

import cmpqr.cartera.models.DataMalla;
import cmpqr.cartera.steps.MallaTurnoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroMallaOtrosIngStepDefinitions {

    @Steps
    MallaTurnoSteps mallaingresos;


    @Then("^Se registran los datos del turno para otros ingresos$")
    public void se_registran_los_datos_del_turno_para_otros_ingresos(List<DataMalla> listadatos) {
    mallaingresos.seleccionarAreaOtrosIngresos(listadatos.get(0).getArea());
    mallaingresos.seleccionarAsesor(listadatos.get(0).getAsesor());
    mallaingresos.ingresarFechaInicial(listadatos.get(0).getFechainicio());
    mallaingresos.ingresarFechaFinal(listadatos.get(0).getFechafin());
    mallaingresos.ingresarHoraInicial(listadatos.get(0).getHorainicio());
    mallaingresos.ingresarHoraFinal(listadatos.get(0).getHorafin());
    mallaingresos.seleccionarPausa(listadatos.get(0).getPausa());
    mallaingresos.ingresarHoraInicialPausa(listadatos.get(0).getHorainiciopausa());
    mallaingresos.ingresarHoraFinalPausa(listadatos.get(0).getHorafinpausa());
    mallaingresos.clicGuardar();
    }
}
