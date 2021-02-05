package cmpqrcartera.campanas.stepdefinitions;

import cmpqr.cartera.models.DataCampana;
import cmpqr.cartera.steps.RegistroCampanaSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroSacProgresivaStepDefinitions {

    @Steps
    RegistroCampanaSteps sacprogresiva;

    @Then("^Se registran los datos de la campana de servicio al cliente progresiva$")
    public void se_registran_los_datos_de_la_campana_de_servicio_al_cliente_progresiva(List<DataCampana> listadatos) throws InterruptedException {
        sacprogresiva.ingresarNombreCampana(listadatos.get(0).getNombre());
        sacprogresiva.ingresarFechaInicio(listadatos.get(0).getFechainicio());
        sacprogresiva.ingresarFechaFin(listadatos.get(0).getFechafin());
        sacprogresiva.ingresarHoraInicio(listadatos.get(0).getHorainicio());
        sacprogresiva.ingresarHoraFin(listadatos.get(0).getHorafin());
        sacprogresiva.ingresarDias(listadatos.get(0).getDias());
        sacprogresiva.actualizar(listadatos.get(0).getActualizar());
        sacprogresiva.seleccionarAreaSac(listadatos.get(0).getArea());
        sacprogresiva.seleccionarCanalProgresiva(listadatos.get(0).getCanal());
        sacprogresiva.seleccionarResponsable(listadatos.get(0).getResponsable());
        sacprogresiva.seleccionarGestion(listadatos.get(0).getGestion());
        sacprogresiva.seleccionarCampanaSacPro(listadatos.get(0).getCampanavicidial());
        sacprogresiva.registrarObservaciones(listadatos.get(0).getObservaciones());
        sacprogresiva.guardar();
    }
}
