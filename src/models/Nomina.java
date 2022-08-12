package models;

public class Nomina {
    
    private int id;
    private String fecha_ini;
    private String fecha_fin;
    private String encargado;
    private double total_pagar;
    private int estado;
    private String fecha_registro;

    public Nomina() {
    }
    
    public Nomina(int id, String fecha_ini, String fecha_fin, String encargado, double total_pagar, int estado, String fecha_registro) {
        this.id = id;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.encargado = encargado;
        this.total_pagar = total_pagar;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(String fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public String getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public double getTotal_pagar() {
        return total_pagar;
    }

    public void setTotal_pagar(double total_pagar) {
        this.total_pagar = total_pagar;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "Nomina{" + "id=" + id + ", fecha_ini=" + fecha_ini + ", fecha_fin=" + fecha_fin +", total_pagar=" + total_pagar + ", estado=" + estado + ", fecha_registro=" + fecha_registro + '}';
    }
 
}
