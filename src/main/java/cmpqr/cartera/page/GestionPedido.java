package cmpqr.cartera.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


@DefaultUrl("http://10.181.3.183:8085/cmpqr_cartera/")

public class GestionPedido extends PageObject {


    By txtusuario = By.id("usuario");
    By txtpassword = By.name("password");
    By btningresar = By.cssSelector("#ingresa");
    By btnprincipal = By.xpath("//*[@id='marco']/ul/li[2]/a/span");
    By btnteleventas = By.linkText("Televentas");
    By txtidpedido = By.xpath("//*[@id='solicitudes_filter']/label/input");
    By idpedido = By.xpath("//*[@id='solicitudes']/tbody/tr/td[1]/a[1]");
    By btngestionar = By.xpath("//*[contains(text(),'Gestionar')]");
    By listestado = By.id("estado");
    By btnadjunto = By.name("adjunto[]");
    By txtconsignacion = By.name("valor_consignacion");
    By txtobservacion = By.name("observacion");
    By btnguardar = By.id("submit-form");
    By pageprincipal = By.xpath("/html/body/div[1]/h2");


    public void registrarUsuario(String usuario) {
        getDriver().findElement(txtusuario).sendKeys(usuario);
    }

    public void registrarClave(String clave) {
        getDriver().findElement(txtpassword).sendKeys(clave);
    }

    public void clicIngresar() {
        getDriver().findElement(btningresar).click();
    }

    public void clicPrincipal() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(btnprincipal));
        getDriver().findElement(btnprincipal).click();
    }

    public void clicTeleventas() {
        getDriver().findElement(btnteleventas).click();
    }

    public void ingresarFrame() {
        WebElement frame = getDriver().findElement(By.tagName("object"));
        getDriver().switchTo().frame(frame);
    }

    public void ingresarPedido() throws IOException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(pageprincipal));
        String idpedido;
        BufferedReader bf = new BufferedReader(new FileReader("numeropedido.txt"));
        while ((idpedido = bf.readLine()) != null) {
            getDriver().findElement(txtidpedido).clear();
            getDriver().findElement(txtidpedido).sendKeys(idpedido);
        }
    }

    public void clicPedido() {
        getDriver().findElement(idpedido).click();
    }

    public void pestanaGestionar() {
        getDriver().findElement(btngestionar).click();
    }

    public void seleccionarCasaCliente(String casaclientependiente) {
        Select casacliente = new Select(getDriver().findElement(listestado));
        casacliente.selectByValue(casaclientependiente);
    }

    public void adjuntarDocumento() {
        getDriver().findElement(btnadjunto).sendKeys("C:\\Users\\user\\Documents\\Alkomprar\\Automatizacion\\Alkomprar\\src\\test\\resources\\Adjuntos\\Bono.jpg");
    }

    public void valorConsignacion(String ValorConsignacion) {
        getDriver().findElement(txtconsignacion).sendKeys(ValorConsignacion);
    }

    public void ingresarObservaciones(String observaciones_2) {
        getDriver().findElement(txtobservacion).sendKeys(observaciones_2);
    }

    public void guardar() {
        getDriver().findElement(btnguardar).click();
    }

    public void paginaPrincipal() throws InterruptedException {
        getDriver().findElement(idpedido).getText();
        Thread.sleep(2000);
        getDriver().quit();
    }


}
