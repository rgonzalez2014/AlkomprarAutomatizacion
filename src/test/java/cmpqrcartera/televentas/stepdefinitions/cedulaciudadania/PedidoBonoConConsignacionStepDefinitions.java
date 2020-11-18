package cmpqrcartera.televentas.stepdefinitions.cedulaciudadania;

import cmpqr.cartera.models.DataTeleventas;
import cmpqr.cartera.steps.RegistroPedidoSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.io.FileNotFoundException;
import java.util.List;

public class PedidoBonoConConsignacionStepDefinitions {

    @Steps
    RegistroPedidoSteps pedidobono;


    @Given("^Se despliega la pagina CRM Alkomprar y se ingresan las credenciales$")
    public void se_despliega_la_pagina_CRM_Alkomprar_y_se_ingresan_las_credenciales(List<DataTeleventas> listadatos) {
        pedidobono.abrirCRMAlkomprar();
        pedidobono.escribirUsuario(listadatos.get(0).getUsuario());
        pedidobono.escribirClave(listadatos.get(0).getPassword());
        pedidobono.clicIngresar();
    }


    @When("^Se ingresa al modulo de Televentas y se hace clic en Crear$")
    public void se_ingresa_al_modulo_de_Televentas_y_se_hace_clic_en_Crear() {
        pedidobono.irModuloTeleventas();
        pedidobono.ingresarIframe();
        pedidobono.clicCrear();
    }

    @Then("^Se registra el formulario Cliente Factura con una CC$")
    public void se_registra_el_formulario_Cliente_Factura_con_una_CC(List<DataTeleventas> listadatos) throws InterruptedException {
        pedidobono.seleccionarUnidadVenta(listadatos.get(0).getUnidadventa());
        pedidobono.seleccionarFacturacion(listadatos.get(0).getFacturacionelectronica());
        pedidobono.seleccionarTipoDocumento(listadatos.get(0).getTipodocumento());
        pedidobono.ingresarNumeroIdentificacion(listadatos.get(0).getNumerodocumento());
        pedidobono.buscarDocumento();
        pedidobono.ingresarPrimerNombre(listadatos.get(0).getPrimernombre());
        pedidobono.ingresarSegundoNombre(listadatos.get(0).getSegundonombre());
        pedidobono.ingresarPrimerApellido(listadatos.get(0).getPrimerapellido());
        pedidobono.ingresarSegundoApellido(listadatos.get(0).getSegundoapellido());
        pedidobono.irFinalPagina1();
        pedidobono.seleccionarCiudad(listadatos.get(0).getCiudad());
        pedidobono.ingresarDireccion(listadatos.get(0).getDireccion());
        pedidobono.clicEnGeoreferenciar();
        pedidobono.ingresarBarrio(listadatos.get(0).getBarrio());
        pedidobono.ingresarCelular(listadatos.get(0).getCelular());
        pedidobono.ingresarFijo(listadatos.get(0).getFijo());
        pedidobono.ingresarEmail(listadatos.get(0).getEmail());
        pedidobono.seleccionarGenero(listadatos.get(0).getGenero());
        pedidobono.seleccionarHabeas(listadatos.get(0).getHabeas());
        pedidobono.clicBotonSiguiente1();
    }

    @Then("^Se registra el formulario Cliente Envio con una CC$")
    public void se_registra_el_formulario_Cliente_Envio_con_una_CC(List<DataTeleventas> listadatos) throws InterruptedException {
        pedidobono.clienteEnvio();
        pedidobono.seleccionarTipoDocumento(listadatos.get(0).getTipodocumento_2());
        pedidobono.ingresarNumeroIdentificacion(listadatos.get(0).getNumerodocumento_2());
        pedidobono.buscarDocumento();
        pedidobono.ingresarPrimerNombre(listadatos.get(0).getPrimernombre_2());
        pedidobono.ingresarSegundoNombre(listadatos.get(0).getSegundonombre_2());
        pedidobono.ingresarPrimerApellido(listadatos.get(0).getPrimerapellido_2());
        pedidobono.ingresarSegundoApellido(listadatos.get(0).getSegundoapellido_2());
        pedidobono.seleccionarCiudad(listadatos.get(0).getCiudad_2());
        pedidobono.ingresarDireccion(listadatos.get(0).getDireccion_2());
        pedidobono.irFinalPagina2();
        pedidobono.clicEnGeoreferenciar();
        pedidobono.ingresarBarrio(listadatos.get(0).getBarrio_2());
        pedidobono.ingresarCelular(listadatos.get(0).getCelular_2());
        pedidobono.ingresarFijo(listadatos.get(0).getFijo_2());
        pedidobono.ingresarEmail(listadatos.get(0).getEmail_2());
        pedidobono.seleccionarGenero(listadatos.get(0).getGenero_2());
        pedidobono.clicBotonSiguiente2();
    }

    @Then("^Se agregan los productos al pedido$")
    public void se_agregan_los_productos_al_pedido(List<DataTeleventas> listadatos) throws InterruptedException {
        pedidobono.ingresarEan(listadatos.get(0).getEan());
        pedidobono.clicBuscarEan();
        pedidobono.ingresarCantidad(listadatos.get(0).getCantidad());
        pedidobono.agregarCarrito();
        pedidobono.clicBotonSiguiente3();
    }

    @Then("^Se seleccionan las fechas y el medio de pago bono con consignacion$")
    public void se_seleccionan_las_fechas_y_el_medio_de_pago_bono_con_consignacion(List<DataTeleventas> listadatos) throws InterruptedException {
        pedidobono.seleccionarFechaEntrega();
        pedidobono.clicGuardarFecha();
        pedidobono.seleccionarPagoBono(listadatos.get(0).getBono());
        pedidobono.irFinalPagina3();
        pedidobono.adjuntarArchivo();
        pedidobono.clicConsignacion();
        pedidobono.registrarObservaciones(listadatos.get(0).getObservaciones());
        pedidobono.clicBotonSiguiente4();
    }


    @Then("^El pedido queda creado$")
    public void el_pedido_queda_creado() throws InterruptedException, FileNotFoundException {
        pedidobono.pedidoCreado();
        pedidobono.cerrarNavegador();

    }

}
