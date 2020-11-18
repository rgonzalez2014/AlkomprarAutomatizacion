package cmpqr.cartera.models;

public class DataMalla {

    String usuario;
    String password;
    String area;
    String asesor;
    String fechainicio;
    String fechafin;
    String horainicio;
    String horafin;
    String pausa;
    String horainiciopausa;
    String horafinpausa;

    public DataMalla(String usuario, String password, String area, String asesor, String fechainicio, String fechafin, String horainicio, String horafin, String pausa, String horainiciopausa, String horafinpausa) {
        this.usuario = usuario;
        this.password = password;
        this.area = area;
        this.asesor = asesor;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.horainicio = horainicio;
        this.horafin = horafin;
        this.pausa = pausa;
        this.horainiciopausa = horainiciopausa;
        this.horafinpausa = horafinpausa;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }

    public String getArea() {
        return area;
    }

    public String getAsesor() {
        return asesor;
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

    public String getPausa() {
        return pausa;
    }

    public String getHorainiciopausa() {
        return horainiciopausa;
    }

    public String getHorafinpausa() {
        return horafinpausa;
    }
}
