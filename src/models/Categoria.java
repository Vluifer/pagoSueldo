package models;

public class Categoria {
    
    private int id;
    private String nombre;
    private double salario_base;
    private String puesto_destino;
    private int estado;
    private String fecha_registro;

    public Categoria(int id, String nombre, double salario_base, String puesto_destino, int estado, String fecha_registro) {
        this.id = id;
        this.nombre = nombre;
        this.salario_base = salario_base;
        this.puesto_destino = puesto_destino;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
    }
    
    public Categoria(String nombre, double salario_base, String puesto_destino, int estado, String fecha_registro) {
        this.nombre = nombre;
        this.salario_base = salario_base;
        this.puesto_destino = puesto_destino;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
    }
    
    public Categoria(String nombre, double salario_base, String puesto_destino) {
        this.nombre = nombre;
        this.salario_base = salario_base;
        this.puesto_destino = puesto_destino;
    }

    public Categoria() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario_base() {
        return salario_base;
    }

    public void setSalario_base(double salario_base) {
        this.salario_base = salario_base;
    }

    public String getPuesto_destino() {
        return puesto_destino;
    }

    public void setPuesto_destino(String puesto_destino) {
        this.puesto_destino = puesto_destino;
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
        return "CATEGORIA" + " \n ID = " + id + "\n nombre = " + nombre + "\n salario_base = " + salario_base + "\n puesto_destino = " + puesto_destino + "\n estado = " + estado + "\n fecha_registro = " + fecha_registro+"\n";
    }
    
    
}
