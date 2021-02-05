package cmpqr.cartera.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

@DefaultUrl("http://10.181.3.183:8085/cmpqr_cartera/")

public class RegistroCampana extends PageObject {

    By txtusuario = By.id("usuario");
    By txtpassword = By.name("password");
    By btningresar = By.cssSelector("#ingresa");
    By btnadministracion = By.xpath("//*[@id='marco']/ul/li[1]/a/span");
    By btncampanas = By.xpath("//*[@id='marco']/ul/li[1]/ul/li[1]/a");
    By btncrear = By.xpath("//*[@id='crear-campana']/a");
    By txtcampana = By.name("nombre");
    By txtfechainicio = By.name("fecha_inicial");
    By txtfechafin = By.name("fecha_final");
    By labelhorainicio = By.xpath("//*[@id='form-campana']/div[4]/label");
    By txthorainicio = By.name("hora_inicial");
    By txthorafin = By.name("hora_final");
    By txtdias = By.name("dias");
    By listactualizar = By.name("actualizar");
    By listareas = By.name("cod_area_interna");
    By listcanal = By.name("cod_canal_campana");
    By listresponsable = By.name("cod_usuarios");
    By btngestion = By.xpath("//button[@title='Seleccione...']");
    By listgestion = By.name("gestion[]");
    By listcampana = By.name("id_campana_vd");
    By btnplantilla = By.name("cod_plantillas");
    By txtobservaciones = By.name("observacion");
    By btnguardar = By.xpath("//*[@id='form-campana']/div[15]/button");


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

    public void clicCampanas() {
        getDriver().findElement(btncampanas).click();
    }

    public void ingresarFrame() {
        WebElement frame = getDriver().findElement(By.tagName("object"));
        getDriver().switchTo().frame(frame);
    }

    public void clicCrear() {
        getDriver().findElement(btncrear).click();
    }

    public void nombreCampana(String campana) {
        getDriver().findElement(txtcampana).sendKeys(campana);
    }

    public void fechaInicio(String fechaini) {
        getDriver().findElement(txtfechainicio).sendKeys(fechaini);
    }

    public void fechaFin(String fechafin) {
        getDriver().findElement(txtfechafin).sendKeys(fechafin);
        getDriver().findElement(labelhorainicio).click();
    }

    public void horaInicio(String horaini) {
        getDriver().findElement(txthorainicio).sendKeys(horaini);
    }

    public void horaFin(String horafin) {
        getDriver().findElement(txthorafin).sendKeys(horafin);
    }

    public void dias(String ingresardias) {
        getDriver().findElement(txtdias).sendKeys(ingresardias);
    }

    public void actualizar(String actualizar) {
        Select actualiza = new Select(getDriver().findElement(listactualizar));
        actualiza.selectByVisibleText(actualizar);
    }

    public void areaCartera(String area) {
        Select areacar = new Select(getDriver().findElement(listareas));
        areacar.selectByVisibleText(area);
    }

    public void areaServicioCliente(String sac) {
        Select area = new Select(getDriver().findElement(listareas));
        area.selectByVisibleText(sac);
    }

    public void areaDespachos(String despachos) {
        Select area = new Select(getDriver().findElement(listareas));
        area.selectByValue(despachos);
    }

    public void areaCredito(String credito) {
        Select area = new Select(getDriver().findElement(listareas));
        area.selectByValue(credito);
    }

    public void areaOtrosIngresos(String ingresos) {
        Select area = new Select(getDriver().findElement(listareas));
        area.selectByValue(ingresos);
    }

    public void areaTelemercadeo(String telemercadeo) {
        Select area = new Select(getDriver().findElement(listareas));
        area.selectByValue(telemercadeo);
    }

    public void canalPredictiva(String predictiva) {
        Select canal = new Select(getDriver().findElement(listcanal));
        canal.selectByValue(predictiva);
    }

    public void canalProgresiva(String progresiva) {
        Select canal = new Select(getDriver().findElement(listcanal));
        canal.selectByValue(progresiva);
    }

    public void canalManual(String manual) {
        Select canal = new Select(getDriver().findElement(listcanal));
        canal.selectByValue(manual);
    }

    public void canalGrabacion(String grabacion) {
        Select canal = new Select(getDriver().findElement(listcanal));
        canal.selectByValue(grabacion);
    }


    public void canalMensaje(String mensaje) {
        Select canal = new Select(getDriver().findElement(listcanal));
        canal.selectByValue(mensaje);
    }

    public void responsableCampana(String responsablecampana) {
        Select responsable = new Select(getDriver().findElement(listresponsable));
        responsable.selectByValue(responsablecampana);
    }

    public void seleccionarGestion(String gestion) throws InterruptedException {
        getDriver().findElement(btngestion).click();
        Thread.sleep(1000);
        Select asesor = new Select(getDriver().findElement(listgestion));
        asesor.selectByValue(gestion);
    }

    public void seleccionarCarteraPredictiva(String carterapredictiva) {
        Select campana = new Select(getDriver().findElement(listcampana));
        campana.selectByVisibleText(carterapredictiva);
    }

    public void seleccionarCarteraProgresiva(String carteraprogresiva) {
        Select campana = new Select(getDriver().findElement(listcampana));
        campana.selectByVisibleText(carteraprogresiva);
    }

    public void seleccionarSacPredictiva(String sacpredictiva) {
        Select campana = new Select(getDriver().findElement(listcampana));
        campana.selectByVisibleText(sacpredictiva);
    }

    public void seleccionarSacProgresiva(String sacprogresiva) {
        Select campana = new Select(getDriver().findElement(listcampana));
        campana.selectByVisibleText(sacprogresiva);
    }

    public void seleccionarTelPredictiva(String telpredictiva) {
        Select campana = new Select(getDriver().findElement(listcampana));
        campana.selectByVisibleText(telpredictiva);
    }

    public void seleccionarTelProgresiva(String telprogresiva) {
        Select campana = new Select(getDriver().findElement(listcampana));
        campana.selectByVisibleText(telprogresiva);
    }

    public void seleccionarGrabacionSac(String grabsac) {
        Select campana = new Select(getDriver().findElement(listcampana));
        campana.selectByVisibleText(grabsac);
    }

    public void seleccionarGrabacionCartera(String grabcartera) {
        Select campana = new Select(getDriver().findElement(listcampana));
        campana.selectByVisibleText(grabcartera);
    }

    public void seleccionarGrabacionTel(String grabtelemercadeo) {
        Select campana = new Select(getDriver().findElement(listcampana));
        campana.selectByVisibleText(grabtelemercadeo);
    }

    public void seleccionarMensajeCartera(String mensajecartera) {
        Select campana = new Select(getDriver().findElement(btnplantilla));
        campana.selectByVisibleText(mensajecartera);
    }

    public void seleccionarMensajeSac(String mensajesac) {
        Select campana = new Select(getDriver().findElement(btnplantilla));
        campana.selectByVisibleText(mensajesac);
    }

    public void seleccionarMensajeTel(String mensajetel) {
        Select campana = new Select(getDriver().findElement(btnplantilla));
        campana.selectByVisibleText(mensajetel);
    }

    public void observaciones(String registrar) {
        getDriver().findElement(txtobservaciones).sendKeys(registrar);
    }

    public void clicGuardar() {
        getDriver().findElement(btnguardar).click();
    }

    public void cerrarChrome() {
        getDriver().quit();
    }

}
