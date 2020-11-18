package cmpqrcartera.televentas.stepdefinitions.cedulaciudadania;

import cmpqr.cartera.models.DataTeleventas;
import cmpqr.cartera.steps.GestionPedidoSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.IOException;
import java.util.List;

public class GestionPedidoBonoConConsignacionStepDefinitions {

    @Steps
    GestionPedidoSteps gestion;

    @Given("^Se despliega la pagina CRM Alkomprar y se ingresan las credenciales de confirmador$")
    public void se_despliega_la_pagina_CRM_Alkomprar_y_se_ingresan_las_credenciales_de_confirmador(List<DataTeleventas> listadatos) {
        gestion.abrirCRMAlkomprar();
        gestion.escribirUsuario(listadatos.get(0).getUsuario());
        gestion.escribirClave(listadatos.get(0).getPassword());
        gestion.clicIngresar();
    }

    @When("^Se ingresa al modulo de televentas y se busca el pedido$")
    public void se_ingresa_al_modulo_de_televentas_y_se_busca_el_pedido() throws IOException {
        gestion.irModuloTeleventas();
        gestion.ingresarIframe();
        gestion.idpedido();
        gestion.clicPedido();
    }

    @Then("^Se dirige a la pestana gestionar y registra los datos$")
    public void se_dirige_a_la_pestana_gestionar_y_registra_los_datos(List<DataTeleventas> listadatos) {
        gestion.gestionarPedido();
        gestion.seleccionarCasaCliente(listadatos.get(0).getCasaclientependiente());
        gestion.adjuntarArchivo();
        gestion.valorConsignacion(listadatos.get(0).getValorconsignacion());
        gestion.registrarObservaciones(listadatos.get(0).getObservaciones_2());
    }

    @Then("^Se guardan los cambios$")
    public void se_guardan_los_cambios() {
        gestion.guardarGestion();
    }

    @Then("^El pedido queda gestionado$")
    public void el_pedido_queda_gestionado() throws InterruptedException {
        gestion.paginaPrincipal();
    }


}
