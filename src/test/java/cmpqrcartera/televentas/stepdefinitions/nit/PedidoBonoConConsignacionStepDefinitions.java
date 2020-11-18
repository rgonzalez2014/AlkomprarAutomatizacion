package cmpqrcartera.televentas.stepdefinitions.nit;

import cmpqr.cartera.models.DataTeleventas;
import cmpqr.cartera.steps.RegistroPedidoSteps;

import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PedidoBonoConConsignacionStepDefinitions {

    @Steps
    RegistroPedidoSteps pedidobono;

    @Then("^Se registra el formulario Cliente Factura con un NIT$")
    public void se_registra_el_formulario_Cliente_Factura_con_un_NIT(List<DataTeleventas> listadatos) throws InterruptedException {
        pedidobono.seleccionarUnidadVenta(listadatos.get(0).getUnidadventa());
        pedidobono.seleccionarFacturacion(listadatos.get(0).getFacturacionelectronica());
        pedidobono.seleccionarTipoDocumento(listadatos.get(0).getTipodocumento());
        pedidobono.ingresarNumeroIdentificacion(listadatos.get(0).getNumerodocumento());
        pedidobono.buscarDocumento();
        pedidobono.ingresarRazonSocial(listadatos.get(0).getRazonsocial());
        pedidobono.seleccionarCiudad(listadatos.get(0).getCiudad());
        pedidobono.ingresarDireccion(listadatos.get(0).getDireccion());
        pedidobono.clicEnGeoreferenciar();
        pedidobono.irFinalPagina1();
        pedidobono.ingresarBarrio(listadatos.get(0).getBarrio());
        pedidobono.ingresarCelular(listadatos.get(0).getCelular());
        pedidobono.ingresarFijo(listadatos.get(0).getFijo());
        pedidobono.ingresarEmail(listadatos.get(0).getEmail());
        pedidobono.seleccionarHabeas(listadatos.get(0).getHabeas());
        pedidobono.clicBotonSiguiente1();

    }

    @Then("^Se registra el formulario Cliente Envio con un NIT$")
    public void se_registra_el_formulario_Cliente_Envio_con_un_NIT(List<DataTeleventas> listadatos) throws InterruptedException {
        pedidobono.clienteEnvio();
        pedidobono.seleccionarTipoDocumento(listadatos.get(0).getTipodocumento_2());
        pedidobono.ingresarNumeroIdentificacion(listadatos.get(0).getNumerodocumento_2());
        pedidobono.buscarDocumento();
        pedidobono.ingresarRazonSocial(listadatos.get(0).getRazonsocial_2());
        pedidobono.seleccionarCiudad(listadatos.get(0).getCiudad_2());
        pedidobono.ingresarDireccion(listadatos.get(0).getDireccion_2());
        pedidobono.clicEnGeoreferenciar();
        pedidobono.irFinalPagina2();
        pedidobono.ingresarBarrio(listadatos.get(0).getBarrio_2());
        pedidobono.ingresarCelular(listadatos.get(0).getCelular_2());
        pedidobono.ingresarFijo(listadatos.get(0).getFijo_2());
        pedidobono.ingresarEmail(listadatos.get(0).getEmail_2());
        pedidobono.clicBotonSiguiente2();
    }
}
