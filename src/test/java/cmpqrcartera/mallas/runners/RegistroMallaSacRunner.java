package cmpqrcartera.mallas.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {"src/test/resources/cmpqrcartera.featuresmallas/RegistroMallaSac.feature"},
        glue = {"cmpqrcartera.mallas.stepdefinitions"}, snippets = SnippetType.CAMELCASE)

public class RegistroMallaSacRunner {

}