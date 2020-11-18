package cmpqr.cartera.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("http://10.181.3.183:8085/cmpqr_cartera/")

public class RegistroMallaTurno extends PageObject {

    By txtusuario = By.id("usuario");
    By txtpassword = By.name("password");
    By btningresar = By.cssSelector("#ingresa");
    By btnadministracion = By.xpath("//*[@id='marco']/ul/li[1]/a/span");
    By btnmallaturno = By.linkText("Malla de Turnos");
    By btnagregar = By.id("agrega-turnos");
    By selectarea = By.id("areas");
    By btnasesor = By.xpath("//button[@title='None selected']");
    By selectasesor = By.name("asesor[]");
    By txtfechainicial = By.id("fechaini");
    By txtfechafinal = By.id("fechafin");
    By labelhorainicio = By.xpath("//*[@id='hora-inicio']/label");
    By txthorainicial = By.name("hora_inicio");
    By txthorafinal = By.name("hora_fin");
    By selectpausa = By.name("pausas_area[]");
    By txthorainiciopausa = By.name("hora_inicio_pausa[]");
    By txthorafinpausa = By.name("hora_fin_pausa[]");
    By btnguardar = By.xpath("//button[@type='submit']");
    By btnaceptar = By.xpath("//*[contains(text(),'Aceptar')]");


    public void registrarUsuario(String usuario) {
        getDriver().findElement(txtusuario).sendKeys(usuario);
    }

    public void registrarClave(String clave) {
        getDriver().findElement(txtpassword).sendKeys(clave);
    }

    public void clicIngresar() {
        getDriver().findElement(btningresar).click();
    }

    public void clicAdministracion() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.presenceOfElementLocated(btnadministracion));
        getDriver().findElement(btnadministracion).click();
    }

    public void clicMallaTurno() {
        getDriver().findElement(btnmallaturno).click();
    }

    public void ingresarFrame() {
        WebElement frame = getDriver().findElement(By.tagName("object"));
        getDriver().switchTo().frame(frame);
    }

    public void clicAgregar() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(btnagregar));
        getDriver().findElement(btnagregar).click();
    }

    public void seleccionarAreaCartera() {
        Select area = new Select(getDriver().findElement(selectarea));
        area.selectByValue("1");
    }

    public void seleccionarAreaSac() {
        Select area = new Select(getDriver().findElement(selectarea));
        area.selectByValue("2");
    }

    public void seleccionarAreaDespachos() {
        Select area = new Select(getDriver().findElement(selectarea));
        area.selectByValue("3");
    }

    public void seleccionarAreaCredito() {
        Select area = new Select(getDriver().findElement(selectarea));
        area.selectByValue("4");
    }

    public void seleccionarAreaOtrosIngresos() {
        Select area = new Select(getDriver().findElement(selectarea));
        area.selectByValue("5");
    }

    public void seleccionarAreaTelemercadeo() {
        Select area = new Select(getDriver().findElement(selectarea));
        area.selectByValue("43");
    }

    public void seleccionarAsesor() {
        getDriver().findElement(btnasesor).click();
        Select asesor = new Select(getDriver().findElement(selectasesor));
        asesor.selectByValue("2336");
    }

    public void ingresarFechaInicial(String fechainicial) {
        getDriver().findElement(txtfechainicial).sendKeys(fechainicial);
    }

    public void ingresarFechaFinal(String fechafinal) {

        getDriver().findElement(txtfechafinal).sendKeys(fechafinal);
    }

    public void ingresarHoraInicial(String horainicial) {
        getDriver().findElement(labelhorainicio).click();
        getDriver().findElement(txthorainicial).sendKeys(horainicial);
    }

    public void ingresarHoraFinal(String horafinal) {
        getDriver().findElement(txthorafinal).sendKeys(horafinal);
    }

    public void seleccionarPausa() {
        Select pausa = new Select(getDriver().findElement(selectpausa));
        pausa.selectByVisibleText("Almuerzo");
    }

    public void ingresarHoraInicioPausa(String horainiciopausa) {
        getDriver().findElement(txthorainiciopausa).sendKeys(horainiciopausa);
    }

    public void ingresarHoraFinPausa(String horafinpausa) {
        getDriver().findElement(txthorafinpausa).sendKeys(horafinpausa);
    }

    public void clicGuardar() {
        getDriver().findElement(btnguardar).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(btnaceptar));

    }

    public void cerrarChrome() {
        getDriver().quit();
    }
}


