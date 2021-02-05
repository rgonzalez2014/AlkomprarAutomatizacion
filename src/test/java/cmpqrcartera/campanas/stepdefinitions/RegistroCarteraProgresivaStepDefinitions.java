package cmpqrcartera.campanas.stepdefinitions;

import cmpqr.cartera.models.DataCampana;
import cmpqr.cartera.steps.RegistroCampanaSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroCarteraProgresivaStepDefinitions {

    @Steps
    RegistroCampanaSteps carteraprogresiva;


    @Then("^Se registran los datos de la campana de cartera progresiva$")
    public void se_registran_los_datos_de_la_campana_de_cartera_progresiva(List<DataCampana> listadatos) throws InterruptedException {
        carteraprogresiva.ingresarNombreCampana(listadatos.get(0).getNombre());
        carteraprogresiva.ingresarFechaInicio(listadatos.get(0).getFechainicio());
        carteraprogresiva.ingresarFechaFin(listadatos.get(0).getFechafin());
        carteraprogresiva.ingresarHoraInicio(listadatos.get(0).getHorainicio());
        carteraprogresiva.ingresarHoraFin(listadatos.get(0).getHorafin());
        carteraprogresiva.ingresarDias(listadatos.get(0).getDias());
        carteraprogresiva.actualizar(listadatos.get(0).getActualizar());
        carteraprogresiva.seleccionarAreaCartera(listadatos.get(0).getArea());
        carteraprogresiva.seleccionarCanalProgresiva(listadatos.get(0).getCanal());
        carteraprogresiva.seleccionarResponsable(listadatos.get(0).getResponsable());
        carteraprogresiva.seleccionarGestion(listadatos.get(0).getGestion());
        carteraprogresiva.seleccionarCampanaCartProg(listadatos.get(0).getCampanavicidial());
        carteraprogresiva.registrarObservaciones(listadatos.get(0).getObservaciones());
        carteraprogresiva.guardar();
    }

}
