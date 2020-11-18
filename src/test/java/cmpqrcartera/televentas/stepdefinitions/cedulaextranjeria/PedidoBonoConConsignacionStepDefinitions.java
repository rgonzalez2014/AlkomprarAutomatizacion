package cmpqrcartera.televentas.stepdefinitions.cedulaextranjeria;

import cmpqr.cartera.models.DataTeleventas;
import cmpqr.cartera.steps.RegistroPedidoSteps;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class PedidoBonoConConsignacionStepDefinitions {

    @Steps
    RegistroPedidoSteps pedidobono;

    @Then("^Se registra el formulario Cliente Factura con una CE$")
    public void se_registra_el_formulario_Cliente_Factura_con_una_CE(List<DataTeleventas> listadatos) throws InterruptedException {
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

    @Then("^Se registra el formulario Cliente Envio con una CE$")
    public void se_registra_el_formulario_Cliente_Envio_con_una_CE(List<DataTeleventas> listadatos) throws InterruptedException {
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
}
