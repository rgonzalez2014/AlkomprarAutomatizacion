package cmpqrcartera.campanas.stepdefinitions;

import cmpqr.cartera.models.DataCampana;
import cmpqr.cartera.steps.RegistroCampanaSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroSacMensajesStepDefinitions {

    @Steps
    RegistroCampanaSteps sacmensajes;

    @Then("^Se registran los datos de la campana de servicio al cliente mensajes$")
    public void se_registran_los_datos_de_la_campana_de_servicio_al_cliente_mensajes(List<DataCampana> listadatos) {
        sacmensajes.ingresarNombreCampana(listadatos.get(0).getNombre());
        sacmensajes.ingresarFechaInicio(listadatos.get(0).getFechainicio());
        sacmensajes.ingresarFechaFin(listadatos.get(0).getFechafin());
        sacmensajes.ingresarHoraInicio(listadatos.get(0).getHorainicio());
        sacmensajes.ingresarHoraFin(listadatos.get(0).getHorafin());
        sacmensajes.ingresarDias(listadatos.get(0).getDias());
        sacmensajes.actualizar(listadatos.get(0).getActualizar());
        sacmensajes.seleccionarAreaSac(listadatos.get(0).getArea());
        sacmensajes.seleccionarCanalMensajes(listadatos.get(0).getCanal());
        sacmensajes.seleccionarResponsable(listadatos.get(0).getResponsable());
        sacmensajes.seleccionarPlantillaSac(listadatos.get(0).getPlantilla());
        sacmensajes.registrarObservaciones(listadatos.get(0).getObservaciones());
        sacmensajes.guardar();
    }
}
