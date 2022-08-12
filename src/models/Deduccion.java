package models;

public class Deduccion {
    
    private int id;
    private String nombre;
    private String descripcion;
    private double valor;
    private double rango_inicial;
    private double rango_final;
    private int estado;
    private String fecha_registro;

    public Deduccion() {
    }

    public Deduccion(int id, String nombre, String descripcion, double valor, double rango_inicial, double rango_final, int estado, String fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
        this.estado = estado;
        this.rango_inicial = rango_inicial;
        this.rango_final = rango_final;
        this.fecha_registro = fecha_registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getRango_inicial() {
        return rango_inicial;
    }

    public void setRango_inicial(double rango_inicial) {
        this.rango_inicial = rango_inicial;
    }

    public double getRango_final() {
        return rango_final;
    }

    public void setRango_final(double rango_final) {
        this.rango_final = rango_final;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "DEDUCCION" + "\n id = " + id + "\n nombre = " + nombre + "\n descripcion = " + descripcion + "\n valor (%) = " + valor  + "\n Rango ( Inicio : " + rango_inicial  + " Fin: " + rango_final  +") \n estado = " + estado + "\n fecha_registro = " + fecha_registro;
    }
    
    
    
}
