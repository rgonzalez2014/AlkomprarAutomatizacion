package cmpqrcartera.televentas.stepdefinitions.cedulaciudadania;

import cmpqr.cartera.models.DataCreditos;

import cmpqr.cartera.steps.GestionPedidoCreditoSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.List;

public class GestionPedidoCredito20MinutosStepDefinitions {


    @Steps
    GestionPedidoCreditoSteps gestion;

    @Given("^Se despliega la pagina fabrica de creditos y se ingresan las credenciales$")
    public void se_despliega_la_pagina_fabrica_de_creditos_y_se_ingresan_las_credenciales(List<DataCreditos> listadatos) throws InterruptedException {
        gestion.abrirFabricaCreditos();
        gestion.escribirUsuario(listadatos.get(0).getUsuario());
        gestion.escribirClave(listadatos.get(0).getPassword());
        gestion.clicIngresar();
    }

    @When("^Se visualiza la cola de creditos y se busca el credito$")
    public void se_visualiza_la_cola_de_creditos_y_se_busca_el_credito() throws IOException, InterruptedException {
        gestion.verPaginaPrincipal();
        gestion.buscarCredito();
    }

    @Then("^Se gestiona y aprueba el credito$")
    public void se_gestiona_y_aprueba_el_credito() {

    }

    @Then("^El credito queda aprobado$")
    public void el_credito_queda_aprobado() {

    }

}

