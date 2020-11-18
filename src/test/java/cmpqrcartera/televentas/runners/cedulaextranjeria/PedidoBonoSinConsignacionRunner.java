package cmpqrcartera.televentas.runners.cedulaextranjeria;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/cmpqr.cartera.featuresteleventas/PedidoBonoSinConsignacion.feature"},
        glue = {"cmpqrcartera.televentas.stepdefinitions"},
        tags = {"@CedulaExtranjeria"},
        snippets = SnippetType.CAMELCASE)

public class PedidoBonoSinConsignacionRunner {
}
