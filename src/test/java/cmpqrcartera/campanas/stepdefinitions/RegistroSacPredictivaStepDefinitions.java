package cmpqrcartera.campanas.stepdefinitions;

import cmpqr.cartera.models.DataCampana;
import cmpqr.cartera.steps.RegistroCampanaSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroSacPredictivaStepDefinitions {

    @Steps
    RegistroCampanaSteps sacpredictiva;


    @Then("^Se registran los datos de la campana de servicio al cliente predictiva$")
    public void se_registran_los_datos_de_la_campana_de_servicio_al_cliente_predictiva(List<DataCampana> listadatos) {
        sacpredictiva.ingresarNombreCampana(listadatos.get(0).getNombre());
        sacpredictiva.ingresarFechaInicio(listadatos.get(0).getFechainicio());
        sacpredictiva.ingresarFechaFin(listadatos.get(0).getFechafin());
        sacpredictiva.ingresarHoraInicio(listadatos.get(0).getHorainicio());
        sacpredictiva.ingresarHoraFin(listadatos.get(0).getHorafin());
        sacpredictiva.ingresarDias(listadatos.get(0).getDias());
        sacpredictiva.actualizar(listadatos.get(0).getActualizar());
        sacpredictiva.seleccionarAreaSac(listadatos.get(0).getArea());
        sacpredictiva.seleccionarCanalPredictiva(listadatos.get(0).getCanal());
        sacpredictiva.seleccionarResponsable(listadatos.get(0).getResponsable());
        sacpredictiva.seleccionarGestion(listadatos.get(0).getGestion());
        sacpredictiva.seleccionarCampanaSacPred(listadatos.get(0).getCampanavicidial());
        sacpredictiva.registrarObservaciones(listadatos.get(0).getObservaciones());
        sacpredictiva.guardar();
    }

}
