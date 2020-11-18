package cmpqrcartera.campanas.stepdefinitions;

import cmpqr.cartera.models.DataCampana;
import cmpqr.cartera.steps.RegistroCampanaSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroSacGrabacionesStepDefinitions {

    @Steps
    RegistroCampanaSteps sacgrabaciones;

    @Then("^Se registran los datos de la campana de servicio al cliente grabaciones$")
    public void se_registran_los_datos_de_la_campana_de_servicio_al_cliente_grabaciones(List<DataCampana> listadatos) {
        sacgrabaciones.ingresarNombreCampana(listadatos.get(0).getNombre());
        sacgrabaciones.ingresarFechaInicio(listadatos.get(0).getFechainicio());
        sacgrabaciones.ingresarFechaFin(listadatos.get(0).getFechafin());
        sacgrabaciones.ingresarHoraInicio(listadatos.get(0).getHorainicio());
        sacgrabaciones.ingresarHoraFin(listadatos.get(0).getHorafin());
        sacgrabaciones.ingresarDias(listadatos.get(0).getDias());
        sacgrabaciones.actualizar(listadatos.get(0).getActualizar());
        sacgrabaciones.seleccionarAreaSac(listadatos.get(0).getArea());
        sacgrabaciones.seleccionarCanalGrabaciones(listadatos.get(0).getCanal());
        sacgrabaciones.seleccionarResponsable(listadatos.get(0).getResponsable());
        sacgrabaciones.seleccionarCampanaSacGrab(listadatos.get(0).getCampanavicidial());
        sacgrabaciones.guardar();
    }
}
