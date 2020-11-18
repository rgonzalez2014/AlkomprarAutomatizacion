package cmpqrcartera.mallas.stepdefinitions;


import cmpqr.cartera.models.DataMalla;
import cmpqr.cartera.steps.MallaTurnoSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;


public class RegistroMallaCarteraStepDefinitions {

    @Steps
    MallaTurnoSteps mallacartera;


    @Given("^Se despliega la pagina CRM Alkomprar$")
    public void se_despliega_la_pagina_CRM_Alkomprar() {
        mallacartera.abrirCRMAlkomprar();
    }

    @Given("^El administrador ingresa las credenciales$")
    public void el_administrador_ingresa_las_credenciales(List<DataMalla> lista) {
        mallacartera.escribirUsuario(lista.get(0).getUsuario());
        mallacartera.escribirClave(lista.get(0).getPassword());
    }

    @When("^Se ingresa al modulo mallas de turno$")
    public void se_ingresa_al_modulo_mallas_de_turno() {
        mallacartera.clicIngresar();
        mallacartera.irModuloMallas();
    }

    @When("^Se hace clic en agregar$")
    public void se_hace_clic_en_agregar() {
        mallacartera.ingresarIframe();
        mallacartera.clicAgregar();
    }

    @Then("^Se registran los datos del turno de cartera$")
    public void se_registran_los_datos_del_turno_de_cartera(List<DataMalla> listadatos) {
        mallacartera.seleccionarAreaCartera(listadatos.get(0).getArea());
        mallacartera.seleccionarAsesor(listadatos.get(0).getAsesor());
        mallacartera.ingresarFechaInicial(listadatos.get(0).getFechainicio());
        mallacartera.ingresarFechaFinal(listadatos.get(0).getFechafin());
        mallacartera.ingresarHoraInicial(listadatos.get(0).getHorainicio());
        mallacartera.ingresarHoraFinal(listadatos.get(0).getHorafin());
        mallacartera.seleccionarPausa(listadatos.get(0).getPausa());
        mallacartera.ingresarHoraInicialPausa(listadatos.get(0).getHorainiciopausa());
        mallacartera.ingresarHoraFinalPausa(listadatos.get(0).getHorafinpausa());
        mallacartera.clicGuardar();
    }

    @Then("^Se genera un mensaje$")
    public void se_genera_un_mensaje_exitoso() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        mallacartera.cerrarChrome();
    }

}
