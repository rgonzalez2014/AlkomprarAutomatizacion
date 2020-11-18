package cmpqrcartera.campanas.stepdefinitions;

import cmpqr.cartera.models.DataCampana;
import cmpqr.cartera.steps.RegistroCampanaSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroCarteraPredictivaStepDefinitions {

    @Steps
    RegistroCampanaSteps carterapredictiva;

    @Given("^Se despliega la pagina CRM Alkomprar$")
    public void se_despliega_la_pagina_CRM_Alkomprar() {
        carterapredictiva.abrirCRMAlkomprar();
    }

    @Given("^El administrador ingresa las credenciales$")
    public void el_administrador_ingresa_las_credenciales(List<DataCampana> lista) {
        carterapredictiva.escribirUsuario(lista.get(0).getUsuario());
        carterapredictiva.escribirClave(lista.get(0).getPassword());
    }

    @When("^Se ingresa al modulo campanas$")
    public void se_ingresa_al_modulo_campanas() {
        carterapredictiva.clicIngresar();
        carterapredictiva.irModuloCampanas();
    }

    @When("^Se hace clic en crear$")
    public void se_hace_clic_en_crear() {
        carterapredictiva.ingresarIframe();
        carterapredictiva.clicCrear();
    }

    @Then("^Se registran los datos de la campana de cartera predictiva$")
    public void se_registran_los_datos_de_la_campana_de_cartera_predictiva(List<DataCampana> listadatos) {
        carterapredictiva.ingresarNombreCampana(listadatos.get(0).getNombre());
        carterapredictiva.ingresarFechaInicio(listadatos.get(0).getFechainicio());
        carterapredictiva.ingresarFechaFin(listadatos.get(0).getFechafin());
        carterapredictiva.ingresarHoraInicio(listadatos.get(0).getHorainicio());
        carterapredictiva.ingresarHoraFin(listadatos.get(0).getHorafin());
        carterapredictiva.ingresarDias(listadatos.get(0).getDias());
        carterapredictiva.actualizar(listadatos.get(0).getActualizar());
        carterapredictiva.seleccionarAreaCartera(listadatos.get(0).getArea());
        carterapredictiva.seleccionarCanalPredictiva(listadatos.get(0).getCanal());
        carterapredictiva.seleccionarResponsable(listadatos.get(0).getResponsable());
        carterapredictiva.seleccionarGestion(listadatos.get(0).getGestion());
        carterapredictiva.seleccionarCampanaCartPred(listadatos.get(0).getCampanavicidial());
        carterapredictiva.registrarObservaciones(listadatos.get(0).getObservaciones());
        carterapredictiva.guardar();
    }

    @Then("^Y al guardar se presenta la pagina principal$")
    public void y_al_guardar_se_presenta_la_pagina_principal() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        carterapredictiva.cerrarChrome();
    }
}
