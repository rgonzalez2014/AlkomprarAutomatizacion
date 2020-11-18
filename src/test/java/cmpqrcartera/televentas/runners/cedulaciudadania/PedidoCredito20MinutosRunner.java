package cmpqrcartera.televentas.runners.cedulaciudadania;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/cmpqr.cartera.featuresteleventas/PedidoCredito20Minutos.feature"},
        glue = {"cmpqrcartera.televentas.stepdefinitions"},
        tags = {"@CedulaCiudadania", "not @GestionCedula"},
        snippets = SnippetType.CAMELCASE)


public class PedidoCredito20MinutosRunner {


}
