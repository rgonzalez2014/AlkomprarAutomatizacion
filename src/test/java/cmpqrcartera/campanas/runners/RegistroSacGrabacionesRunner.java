package cmpqrcartera.campanas.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/cmpqr.cartera.featurescampanas/RegistroCampanas.feature"},
        glue = {"cmpqrcartera.campanas.stepdefinitions"}, tags = {"@GrabacionesSac"}, snippets = SnippetType.CAMELCASE)

public class RegistroSacGrabacionesRunner {
}
