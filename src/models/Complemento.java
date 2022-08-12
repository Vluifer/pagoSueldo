package models;

public class Complemento {
    
    private int id;
    private String nombre;
    private double valor;
    private String descripcion;
    private int estado;
    private String fecha_registro;

    public Complemento() {
    }
    
    public Complemento(int id, String nombre, double valor, String descripcion, int estado, String fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.valor = valor;
        this.descripcion = descripcion;
        this.estado = estado;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getFechaRegistro() {
        return fecha_registro;
    }

    public void setFechaRegistro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "COMPLEMENTO" + "\n ID = " + id + "\n Nombre = " + nombre + "\n Valor (%) = " + valor + "\n Descripcion = " + descripcion + "\n Estado = " + estado + "\n Fecha_registro = " + fecha_registro+"\n";
    }
    
    
    
}
