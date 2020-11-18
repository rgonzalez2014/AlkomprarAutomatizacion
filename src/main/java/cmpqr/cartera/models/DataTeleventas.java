package cmpqr.cartera.models;

public class DataTeleventas {

    /*Credenciales*/

    String usuario;
    String password;

    /*Formulario cliente envio*/

    String unidadventa;
    String facturacionelectronica;
    String tipodocumento;
    String numerodocumento;
    String primernombre;
    String segundonombre;
    String primerapellido;
    String segundoapellido;
    String razonsocial;
    String email;
    String ciudad;
    String direccion;
    String barrio;
    String celular;
    String fijo;
    String genero;
    String habeas;

    /*Formulario cliente factura*/

    String tipodocumento_2;
    String numerodocumento_2;
    String primernombre_2;
    String segundonombre_2;
    String primerapellido_2;
    String segundoapellido_2;
    String razonsocial_2;
    String ciudad_2;
    String direccion_2;
    String barrio_2;
    String email_2;
    String celular_2;
    String fijo_2;
    String genero_2;

    /*Formulario productos*/

    String ean;
    String cantidad;

    /*Formulario medios de pago*/

    String bono;
    String ordencompra;
    String consignacion;
    String credito;
    String fechaexpedicion;
    String actividad;
    String descripcion;
    String profesion;
    String cuotas;
    String valorcuota;
    String periodicidad;
    String payu;
    String tipopago;
    String observaciones;

    /*Gestionar pedido*/

    String casaclientependiente;
    String valorconsignacion;
    String observaciones_2;


    public DataTeleventas(String usuario, String password, String unidadventa, String facturacionelectronica, String tipodocumento, String numerodocumento, String primernombre, String segundonombre, String primerapellido, String segundoapellido, String razonsocial, String ciudad, String direccion, String barrio, String celular, String fijo, String email, String actividad, String profesion, String genero, String habeas, String tipodocumento_2, String numerodocumento_2, String primernombre_2, String segundonombre_2, String primerapellido_2, String segundoapellido_2, String razonsocial_2, String ciudad_2, String direccion_2, String barrio_2, String celular_2, String fijo_2, String email_2, String genero_2, String ean, String cantidad, String bono, String ordencompra, String credito, String fechaexpedicion, String descripcion, String cuotainicial, String cuotas, String valorcuota, String periodicidad, String consignacion, String payu, String tipopago, String observaciones, String casaclientependiente, String valorconsignacion, String observaciones_2) {
        this.usuario = usuario;
        this.password = password;
        this.unidadventa = unidadventa;
        this.facturacionelectronica = facturacionelectronica;
        this.tipodocumento = tipodocumento;
        this.numerodocumento = numerodocumento;
        this.primernombre = primernombre;
        this.segundonombre = segundonombre;
        this.primerapellido = primerapellido;
        this.segundoapellido = segundoapellido;
        this.razonsocial = razonsocial;
        this.email = email;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.barrio = barrio;
        this.celular = celular;
        this.fijo = fijo;
        this.actividad = actividad;
        this.profesion = profesion;
        this.genero = genero;
        this.habeas = habeas;
        this.tipodocumento_2 = tipodocumento_2;
        this.numerodocumento_2 = numerodocumento_2;
        this.primernombre_2 = primernombre_2;
        this.segundonombre_2 = segundonombre_2;
        this.primerapellido_2 = primerapellido_2;
        this.segundoapellido_2 = segundoapellido_2;
        this.razonsocial_2 = razonsocial_2;
        this.ciudad_2 = ciudad_2;
        this.direccion_2 = direccion_2;
        this.barrio_2 = barrio_2;
        this.celular_2 = celular_2;
        this.fijo_2 = fijo_2;
        this.email_2 = email_2;
        this.genero_2 = genero_2;
        this.ean = ean;
        this.cantidad = cantidad;
        this.bono = bono;
        this.ordencompra = ordencompra;
        this.credito = credito;
        this.fechaexpedicion = fechaexpedicion;
        this.descripcion = descripcion;
        this.cuotas = cuotas;
        this.valorcuota = valorcuota;
        this.periodicidad = periodicidad;
        this.consignacion = consignacion;
        this.payu = payu;
        this.tipopago = tipopago;
        this.observaciones = observaciones;
        this.casaclientependiente = casaclientependiente;
        this.valorconsignacion = valorconsignacion;
        this.observaciones_2 = observaciones_2;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getUnidadventa() {
        return unidadventa;
    }

    public String getFacturacionelectronica() {
        return facturacionelectronica;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public String getNumerodocumento() {
        return numerodocumento;
    }

    public String getPrimernombre() {
        return primernombre;
    }

    public String getSegundonombre() {
        return segundonombre;
    }

    public String getPrimerapellido() {
        return primerapellido;
    }

    public String getSegundoapellido() {
        return segundoapellido;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public String getEmail() {
        return email;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getCelular() {
        return celular;
    }

    public String getFijo() {
        return fijo;
    }

    public String getActividad() {
        return actividad;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getGenero() {
        return genero;
    }

    public String getHabeas() {
        return habeas;
    }

    public String getTipodocumento_2() {
        return tipodocumento_2;
    }

    public String getNumerodocumento_2() {
        return numerodocumento_2;
    }

    public String getPrimernombre_2() {
        return primernombre_2;
    }

    public String getSegundonombre_2() {
        return segundonombre_2;
    }

    public String getPrimerapellido_2() {
        return primerapellido_2;
    }

    public String getSegundoapellido_2() {
        return segundoapellido_2;
    }

    public String getRazonsocial_2() {
        return razonsocial_2;
    }

    public String getCiudad_2() {
        return ciudad_2;
    }

    public String getDireccion_2() {
        return direccion_2;
    }

    public String getBarrio_2() {
        return barrio_2;
    }

    public String getCelular_2() {
        return celular_2;
    }

    public String getFijo_2() {
        return fijo_2;
    }

    public String getEmail_2() {
        return email_2;
    }

    public String getGenero_2() {
        return genero_2;
    }

    public String getEan() {
        return ean;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getBono() {
        return bono;
    }

    public String getOrdencompra() {
        return ordencompra;
    }

    public String getCredito() {
        return credito;
    }

    public String getFechadocumento() {
        return fechaexpedicion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCuotas() {
        return cuotas;
    }

    public String getValorcuota() {
        return valorcuota;
    }

    public String getPeriodicidad() {
        return periodicidad;
    }

    public String getConsignacion() {
        return consignacion;
    }

    public String getPayu() {
        return payu;
    }

    public String getTipopago() {
        return tipopago;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public String getCasaclientependiente() {
        return casaclientependiente;
    }

    public String getValorconsignacion() {
        return valorconsignacion;
    }

    public String getObservaciones_2() {
        return observaciones_2;
    }

}

