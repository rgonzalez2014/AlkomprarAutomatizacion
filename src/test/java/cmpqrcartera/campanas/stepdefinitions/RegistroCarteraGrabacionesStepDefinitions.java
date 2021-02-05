package cmpqrcartera.campanas.stepdefinitions;

import cmpqr.cartera.models.DataCampana;
import cmpqr.cartera.steps.RegistroCampanaSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroCarteraGrabacionesStepDefinitions {

    @Steps
    RegistroCampanaSteps carteragrabaciones;


    @Then("^Se registran los datos de la campana de cartera grabaciones$")
    public void se_registran_los_datos_de_la_campana_de_cartera_grabaciones(List<DataCampana> listadatos) {
        carteragrabaciones.ingresarNombreCampana(listadatos.get(0).getNombre());
        carteragrabaciones.ingresarFechaInicio(listadatos.get(0).getFechainicio());
        carteragrabaciones.ingresarFechaFin(listadatos.get(0).getFechafin());
        carteragrabaciones.ingresarHoraInicio(listadatos.get(0).getHorainicio());
        carteragrabaciones.ingresarHoraFin(listadatos.get(0).getHorafin());
        carteragrabaciones.ingresarDias(listadatos.get(0).getDias());
        carteragrabaciones.actualizar(listadatos.get(0).getActualizar());
        carteragrabaciones.seleccionarAreaCartera(listadatos.get(0).getArea());
        carteragrabaciones.seleccionarCanalGrabaciones(listadatos.get(0).getCanal());
        carteragrabaciones.seleccionarResponsable(listadatos.get(0).getResponsable());
        carteragrabaciones.seleccionarCampanaCartGrab(listadatos.get(0).getCampanavicidial());
        carteragrabaciones.registrarObservaciones(listadatos.get(0).getObservaciones());
        carteragrabaciones.guardar();
    }
}
