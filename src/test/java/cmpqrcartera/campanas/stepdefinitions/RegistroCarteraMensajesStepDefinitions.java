package cmpqrcartera.campanas.stepdefinitions;

import cmpqr.cartera.models.DataCampana;
import cmpqr.cartera.steps.RegistroCampanaSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroCarteraMensajesStepDefinitions {

    @Steps
    RegistroCampanaSteps carteramensajes;

    @Then("^Se registran los datos de la campana de cartera mensajes$")
    public void se_registran_los_datos_de_la_campana_de_cartera_mensajes(List<DataCampana> listadatos) {
        carteramensajes.ingresarNombreCampana(listadatos.get(0).getNombre());
        carteramensajes.ingresarFechaInicio(listadatos.get(0).getFechainicio());
        carteramensajes.ingresarFechaFin(listadatos.get(0).getFechafin());
        carteramensajes.ingresarHoraInicio(listadatos.get(0).getHorainicio());
        carteramensajes.ingresarHoraFin(listadatos.get(0).getHorafin());
        carteramensajes.ingresarDias(listadatos.get(0).getDias());
        carteramensajes.actualizar(listadatos.get(0).getActualizar());
        carteramensajes.seleccionarAreaCartera(listadatos.get(0).getArea());
        carteramensajes.seleccionarCanalMensajes(listadatos.get(0).getCanal());
        carteramensajes.seleccionarResponsable(listadatos.get(0).getResponsable());
        carteramensajes.seleccionarPlantillaCartera(listadatos.get(0).getPlantilla());
        carteramensajes.registrarObservaciones(listadatos.get(0).getObservaciones());
        carteramensajes.guardar();
    }
}
