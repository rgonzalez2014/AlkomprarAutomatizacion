package cmpqr.cartera.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@DefaultUrl("http://10.181.0.153/fabricacreditos/index.php")

public class GestionPedidoCredito extends PageObject {

    By txtusuario = By.name("usuario");
    By txtpassword = By.name("password");
    By btningresar = By.cssSelector("#ingresa");
    By paginaprincipal = By.xpath("//h2[@class='titulo']");
    By paginatramite = By.xpath("//h2[@class='titulo']");
    By txtidcredito = By.xpath("//input[@type='search']");

    public void ingresarUsuario(String usuario) throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(txtusuario).sendKeys(usuario);
    }

    public void ingresarPassword(String password) {
        getDriver().findElement(txtpassword).sendKeys(password);
    }

    public void clicIngresar() {
        getDriver().findElement(btningresar).click();
    }

    public void paginaPrincipal() throws InterruptedException {
        Thread.sleep(2500);
        getDriver().findElement(paginaprincipal).getText();
    }

    public void buscarCredito() throws IOException {
        String numcredito;
        BufferedReader br = new BufferedReader(new FileReader("numerocredito.txt"));
        while ((numcredito = br.readLine()) != null) {
            getDriver().findElement(txtidcredito).sendKeys(numcredito.substring(19, 24));
        }
    }

}
