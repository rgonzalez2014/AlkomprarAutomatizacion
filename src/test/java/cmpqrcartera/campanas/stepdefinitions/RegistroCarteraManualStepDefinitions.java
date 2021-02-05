package cmpqrcartera.campanas.stepdefinitions;

import cmpqr.cartera.models.DataCampana;
import cmpqr.cartera.steps.RegistroCampanaSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroCarteraManualStepDefinitions {

    @Steps
    RegistroCampanaSteps carteramanual;

    @Then("^Se registran los datos de la campana de cartera m$")
    public void se_registran_los_datos_de_la_campana_de_cartera_m(List<DataCampana> listadatos) throws InterruptedException {
        carteramanual.ingresarNombreCampana(listadatos.get(0).getNombre());
        carteramanual.ingresarFechaInicio(listadatos.get(0).getFechainicio());
        carteramanual.ingresarFechaFin(listadatos.get(0).getFechafin());
        carteramanual.ingresarHoraInicio(listadatos.get(0).getHorainicio());
        carteramanual.ingresarHoraFin(listadatos.get(0).getHorafin());
        carteramanual.ingresarDias(listadatos.get(0).getDias());
        carteramanual.actualizar(listadatos.get(0).getActualizar());
        carteramanual.seleccionarAreaCartera(listadatos.get(0).getArea());
        carteramanual.seleccionarCanalManual(listadatos.get(0).getCanal());
        carteramanual.seleccionarResponsable(listadatos.get(0).getResponsable());
        carteramanual.seleccionarGestion(listadatos.get(0).getGestion());
        carteramanual.registrarObservaciones(listadatos.get(0).getObservaciones());
        carteramanual.guardar();
    }

}
