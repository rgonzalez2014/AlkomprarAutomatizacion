package cmpqr.cartera.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.List;

@DefaultUrl("http://10.181.3.183:8085/cmpqr_cartera/")

public class RegistroPedido extends PageObject {

    By txtusuario = By.id("usuario");
    By txtpassword = By.name("password");
    By btningresar = By.cssSelector("#ingresa");
    By btnprincipal = By.xpath("//*[@id='marco']/ul/li[2]/a/span");
    By btnteleventas = By.linkText("Televentas");
    By btncrear = By.xpath("/html/body/div[1]/div[2]/a");
    By listunidadventa = By.name("unidad_venta");
    By listfacturacion = By.name("facturacion_electronica");
    By listtipodocumento = By.name("cliente[cod_tipo_identificacion]");
    By txtdocumento = By.name("cliente[numero_documento]");
    By btnbuscar = By.id("buscar-cliente");
    By clientenoexiste = By.xpath("//*[contains(text(),'El cliente no existe')]");
    By btnaceptardocumento = By.xpath("//*[contains(text(),'Aceptar')]");
    By btnaceptarproducto = By.xpath("/html/body/div[2]/div/div[4]/div/button");
    By txtprimernombre = By.name("cliente[primer_nombre]");
    By txtsegundonombre = By.name("cliente[segundo_nombre]");
    By txtprimerapellido = By.name("cliente[primer_apellido]");
    By txtsegundoapellido = By.name("cliente[segundo_apellido]");
    By txtrazonsocial = By.name("cliente[empresa]");
    By listciudad = By.name("cliente[cod_ciudad]");
    By txtdireccion = By.name("cliente[direccion]");
    By btngeoreferenciar = By.id("georeferenciar");
    By direccionsingeo = By.xpath("//*[contains(text(),'La dirección no pudo ser georeferenciada')]");
    By btnaceptardireccion = By.xpath("/html/body/div[5]/div/div[4]/div/button");
    By txtbarrio = By.name("cliente[barrio]");
    By txtcelular = By.name("cliente[telefono_celular]");
    By txtfijo = By.name("cliente[telefono_fijo]");
    By txtemail = By.name("cliente[email]");
    By listgenero = By.id("genero");
    By listhabeasdata = By.name("cliente[sms_habeas]");
    By btnsiguiente = By.id("siguiente");
    By btnaceptaremail = By.xpath("//*[contains(text(),'Correo cliente inválido')]");
    By pageclientefactura = By.cssSelector("#copiar-cliente");
    By tableinventario = By.xpath("//*[contains(text(),'Inventario')]");
    By txtingresarean = By.name("ean");
    By btnbuscarean = By.id("buscar-ean");
    By sininventario = By.xpath("//*[contains(text(),' No se encontró inventario del producto')]");
    By btnaceptarsininventario = By.xpath("/html/body/div[2]/div/div[4]/div/button");
    By txtcantidad = By.xpath("//*[@id='tabla-unidades']/tbody/tr[1]/td[3]/input");
    By btnagregarproducto = By.xpath("//*[@id='tabla-unidades']/tbody/tr[1]/td[5]/button");
    By btnproductoagregado = By.xpath("/html/body/div[2]/div/div[4]/div/button");
    By btnsiguienteproductos = By.id("confirmacion-productos");
    By paginamediospago = By.xpath("/html/body/div/h2/small");
    By selectfechaentrega = By.name("fecha_entrega");
    By btnsiguientemes = By.xpath("//*[@id='ui-datepicker-div']/div/a[2]/span");
    By listcalendario = By.xpath("//*[@id='ui-datepicker-div']/table//tbody//td[@data-event='click']");
    By btnguardarfecha = By.xpath("//*[@id='form-fechas']/div[4]/button");
    By fechaguardada = By.xpath("/html/body/div[3]/div/div[4]/div/button");
    By listpago = By.id("medio-pago");
    By listtipopago = By.id("tipo-pago");
    By btnadjunto = By.name("adjunto[]");
    By checkconsignacion = By.name("consignacion");
    By txtobservaciones = By.name("observaciones");
    By txtfechaexpedicion = By.name("fecha_expedicion_documento");
    By listactividad = By.name("cod_actividad_economica");
    By listdescripcion = By.id("nombre_descripcion_actividad");
    By selectdescripcion = By.xpath("//*[@id='ui-id-5']");
    By txtprofesion = By.name("profesion");
    By txtcantidadcuotas = By.name("numero_cuotas");
    By listperiodicidad = By.name("periodicidad");
    By txtcuotainicial = By.name("cuota_inicial");
    By pedidocreado = By.xpath("//*[contains(text(),'el medio de pago')]");
    By btnaceptarpedido = By.cssSelector("body > div.swal-overlay.swal-overlay--show-modal > div > div.swal-footer > div > button");
    By idpedido = By.xpath("//*[@id='solicitudes']/tbody/tr/td[1]/a[1]");
    By idcredito = By.xpath("//*[@id='solicitudes']/tbody/tr/td[12]");


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

    public void clicCrear() {
        getDriver().findElement(btncrear).click();
    }

    public void seleccionarUnidadVenta(String unidadventa) {
        Select unidad = new Select(getDriver().findElement(listunidadventa));
        unidad.selectByValue(unidadventa);
    }

    public void seleccionarFacturacion(String facturacionelectronica) {
        Select facturacion = new Select(getDriver().findElement(listfacturacion));
        facturacion.selectByVisibleText(facturacionelectronica);
    }

    public void seleccionarTipoDoc(String tipodocumento) {
        Select documento = new Select(getDriver().findElement(listtipodocumento));
        documento.selectByVisibleText(tipodocumento);
    }

    public void registrarDocumento(String numerodocumento) {
        getDriver().findElement(txtdocumento).sendKeys(numerodocumento);
    }

    public void clicBuscar() throws InterruptedException {
        getDriver().findElement(btnbuscar).click();
        if (isElementVisible(clientenoexiste)) {
            Thread.sleep(1500);
            getDriver().findElement(btnaceptardocumento).click();
        }
    }

    public void registrarPrimerNombre(String primernombre) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(txtprimernombre));
        getDriver().findElement(txtprimernombre).clear();
        getDriver().findElement(txtprimernombre).sendKeys(primernombre);
    }

    public void registrarSegundoNombre(String segundonombre) {
        getDriver().findElement(txtsegundonombre).clear();
        getDriver().findElement(txtsegundonombre).sendKeys(segundonombre);
    }

    public void registrarPrimerApellido(String primerapellido) {
        getDriver().findElement(txtprimerapellido).clear();
        getDriver().findElement(txtprimerapellido).sendKeys(primerapellido);
    }

    public void registrarSegundoApellido(String segundoapellido) {
        getDriver().findElement(txtsegundoapellido).clear();
        getDriver().findElement(txtsegundoapellido).sendKeys(segundoapellido);
    }

    public void registrarRazonSocial(String razonsocial) {
        getDriver().findElement(txtrazonsocial).clear();
        getDriver().findElement(txtrazonsocial).sendKeys(razonsocial);
    }

    public void paginaFinal1() {
        WebElement element = getDriver().findElement(btnsiguiente);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element);
        actions.perform();
    }

    public void seleccionarCiudad(String ciudad) {
        Select Ciudad = new Select(getDriver().findElement(listciudad));
        Ciudad.selectByVisibleText(ciudad);
    }

    public void registrarDireccion(String direccion) throws InterruptedException {
        Thread.sleep(1500);
        getDriver().findElement(txtdireccion).clear();
        getDriver().findElement(txtdireccion).sendKeys(direccion);
    }

    public void clicGeoreferenciar() throws InterruptedException {
        getDriver().findElement(btngeoreferenciar).click();
        if (isElementVisible(direccionsingeo)) {
            Thread.sleep(1500);
            getDriver().findElement(btnaceptardireccion).click();
        }
    }

    public void registrarBarrio(String barrio) {
        if (txtbarrio == null) {
            getDriver().findElement(txtbarrio).sendKeys(barrio);
        }
    }

    public void registrarCelular(String celular) {
        getDriver().findElement(txtcelular).clear();
        getDriver().findElement(txtcelular).sendKeys(celular);
    }

    public void registrarFijo(String fijo) {
        getDriver().findElement(txtfijo).clear();
        getDriver().findElement(txtfijo).sendKeys(fijo);
    }

    public void registrarEmail(String email) {
        getDriver().findElement(txtemail).clear();
        getDriver().findElement(txtemail).sendKeys(email);
    }

    public void seleccionarGenero(String genero) {
        Select Genero = new Select(getDriver().findElement(listgenero));
        Genero.selectByVisibleText(genero);
    }

    public void seleccionarHabeasData(String habeas) {
        Select Habeas = new Select(getDriver().findElement(listhabeasdata));
        Habeas.selectByValue(habeas);
    }

    public void clicSiguiente1() {
        getDriver().findElement(btnsiguiente).click();
        if (isElementVisible(btnaceptaremail)) {
            getDriver().findElement(btnaceptaremail).click();
            getDriver().quit();
        }
    }

    public void formularioClienteEnvio() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 30);
        wait.until(ExpectedConditions.presenceOfElementLocated(pageclientefactura));
    }

    public void paginaFinal2() {
        WebElement element = getDriver().findElement(btnsiguiente);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element);
        actions.perform();
    }

    public void clicSiguiente2() {
        getDriver().findElement(btnsiguiente).click();
    }

    public void ingresarEan(String ean) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(tableinventario));
        Thread.sleep(2000);
        getDriver().findElement((txtingresarean)).sendKeys(ean);
    }

    public void clicBuscarEan() {
        getDriver().findElement(btnbuscarean).click();
        if (isElementVisible(sininventario)) {
            getDriver().findElement(btnaceptarsininventario).click();
            System.out.println("No se encontro inventario del producto");
            getDriver().quit();
        }
    }

    public void ingresarCantidad(String cantidadProducto) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(txtcantidad));
        getDriver().findElement(txtcantidad).sendKeys(cantidadProducto);
    }

    public void clicAgregarCarrito() throws InterruptedException {
        getDriver().findElement(btnagregarproducto).click();
        Thread.sleep(1500);
        getDriver().findElement(btnproductoagregado).click();
    }

    public void clicSiguienteProductos() throws InterruptedException {
        Thread.sleep(1500);
        getDriver().findElement(btnsiguienteproductos).click();
        Thread.sleep(1500);
        getDriver().findElement(btnaceptarproducto).click();
    }


    public void seleccionarFechaEntrega() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 20);
        wait.until(ExpectedConditions.presenceOfElementLocated(selectfechaentrega));
        boolean CambiarMes = true;
        getDriver().findElement(selectfechaentrega).click();
        while (CambiarMes) {
            List<WebElement> listcalendariodia = getDriver().findElements(listcalendario);
            System.out.println(listcalendariodia.size());
            if (listcalendariodia.size() == 0) {
                getDriver().findElement(btnsiguientemes).click();
            } else {
                listcalendariodia.get(0).click();
                CambiarMes = false;
            }
        }
    }


    public void clicGuardarFecha() throws InterruptedException {
        getDriver().findElement(btnguardarfecha).click();
        Thread.sleep(1500);
        getDriver().findElement(fechaguardada).click();
        Thread.sleep(1500);
    }

    public void seleccionarPagoBono(String bono) {
        Select pagobono = new Select(getDriver().findElement(listpago));
        pagobono.selectByValue(bono);
    }

    public void paginaFinal3() {
        WebElement element = getDriver().findElement(btnsiguiente);
        Actions actions = new Actions(getDriver());
        actions.moveToElement(element);
        actions.perform();
    }

    public void seleccionarPagoOrdenCompra(String ordencompra) {
        Select pagoorden = new Select(getDriver().findElement(listpago));
        pagoorden.selectByValue(ordencompra);
    }

    public void seleccionarPagoConsignacion(String consignacion) {
        Select pagoconsignacion = new Select(getDriver().findElement(listpago));
        pagoconsignacion.selectByValue(consignacion);
    }

    public void seleccionarPagoCredito(String credito) {
        Select pagocredito = new Select(getDriver().findElement(listpago));
        pagocredito.selectByValue(credito);
    }

    public void registrarfechaDocumento(String fechadocumento) throws InterruptedException {
        Thread.sleep(2000);
        getDriver().findElement(txtfechaexpedicion).clear();
        getDriver().findElement(txtfechaexpedicion).sendKeys(fechadocumento);
    }

    public void seleccionarActividad(String actividad) throws InterruptedException {
        Thread.sleep(1500);
        Select Actividad = new Select(getDriver().findElement(listactividad));
        Actividad.selectByVisibleText(actividad);
    }

    public void ingresarDescripcion(String descripcion) throws InterruptedException {
        getDriver().findElement(listdescripcion).clear();
        getDriver().findElement(listdescripcion).sendKeys(descripcion);
        Thread.sleep(3000);
        getDriver().findElement(selectdescripcion).click();

    }

    public void ingresarProfesion(String profesion) {
        getDriver().findElement(txtprofesion).clear();
        getDriver().findElement(txtprofesion).sendKeys(profesion);
    }

    public void ingresarCantidadCuotas(String cuotas) {
        getDriver().findElement(txtcantidadcuotas).sendKeys(cuotas);
    }

    public void seleccionarPeriodicidad(String periodicidad) {
        Select period = new Select(getDriver().findElement(listperiodicidad));
        period.selectByValue(periodicidad);
    }

    public void ingresarValorCuota(String valorcuota) {
        getDriver().findElement(txtcuotainicial).sendKeys(valorcuota);
    }

    public void clicCheckConsignacion() {
        getDriver().findElement(checkconsignacion).click();
    }

    public void seleccionarPagoPayU(String payu) {
        Select pagopayu = new Select(getDriver().findElement(listpago));
        pagopayu.selectByValue(payu);
    }

    public void seleccionarPseTC(String tipopago) {
        Select psetc = new Select(getDriver().findElement(listtipopago));
        psetc.selectByValue(tipopago);
    }

    public void seleccionarBalEfecCons(String tipopago) {
        Select balefeccons = new Select(getDriver().findElement(listtipopago));
        balefeccons.selectByValue(tipopago);
    }

    public void adjuntarDocummento() {
        getDriver().findElement(btnadjunto).sendKeys("C:\\Users\\user\\Documents\\Alkomprar\\Automatizacion\\Alkomprar\\src\\test\\resources\\Adjuntos\\CedulaTest.jpg");

    }

    public void registrarObservaciones(String observacion) {
        getDriver().findElement(txtobservaciones).sendKeys(observacion);
    }

    public void clicSiguiente4() throws InterruptedException {
        getDriver().findElement(btnsiguiente).click();
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(pedidocreado));
        Thread.sleep(1000);
        getDriver().findElement(btnaceptarpedido).click();
    }

    public void pedidoCreado() throws FileNotFoundException {
        WebDriverWait wait = new WebDriverWait(getDriver(), 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(idpedido));
        PrintStream pedido = new PrintStream(new File("numeropedido.txt"));
        PrintStream credito = new PrintStream(new File("numerocredito.txt"));
        pedido.println((getDriver().findElement((idpedido))).getText());
        credito.println(getDriver().findElement(idcredito).getText());
    }

    public void cerrarChrome() throws InterruptedException {
        Thread.sleep(2000);
        getDriver().quit();
    }
}


