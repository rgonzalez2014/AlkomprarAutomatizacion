package cmpqr.cartera.models;

public class DataCampana {

    String usuario;
    String password;
    String nombre;
    String fechainicio;
    String fechafin;
    String horainicio;
    String horafin;
    String dias;
    String actualizar;
    String area;
    String canal;
    String responsable;
    String plantilla;
    String gestion;
    String campanavicidial;
    String observaciones;


    public DataCampana(String usuario, String password, String nombre, String fechainicio, String fechafin, String horainicio, String horafin, String dias, String actualizar, String area, String canal, String responsable, String plantilla, String gestion, String campanavicidial, String observaciones) {
        this.usuario = usuario;
        this.password = password;
        this.nombre = nombre;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.dias = dias;
        this.actualizar = actualizar;
        this.area = area;
        this.canal = canal;
        this.responsable = responsable;
        this.plantilla = plantilla;
        this.gestion = gestion;
        this.campanavicidial = campanavicidial;
        this.observaciones = observaciones;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public String getDias() {
        return dias;
    }

    public String getActualizar() {
        return actualizar;
    }

    public String getArea() {
        return area;
    }

    public String getCanal() {
        return canal;
    }

    public String getResponsable() {
        return responsable;
    }

    public String getPlantilla() {
        return plantilla;
    }

    public String getGestion() {
        return gestion;
    }

    public String getCampanavicidial() {
        return campanavicidial;
    }

    public String getObservaciones() {
        return observaciones;
    }
}
