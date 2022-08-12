package models;

public class DetalleNominaEmpleado {
    
    private int id;
    private Empleado empleado;
    private Nomina nomina;
    private String concepto;
    private double valor;
    private int estado;
    private String fecha_registro;

    public DetalleNominaEmpleado() {
    }

    public DetalleNominaEmpleado(int id, Empleado empleado, Nomina nomina, String concepto, double valor, int estado, String fecha_registro) {
        this.id = id;
        this.empleado = empleado;
        this.nomina = nomina;
        this.concepto = concepto;
        this.valor = valor;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Nomina getNomina() {
        return nomina;
    }

    public void setNomina(Nomina nomina) {
        this.nomina = nomina;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
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

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    @Override
    public String toString() {
        return "DetalleNominaEmpleado{" + " id=" + id + "\n empleado=" + empleado.toString() + "\n nomina=" + nomina.toString() + "\n concepto=" + concepto + "\n valor=" + valor + "\n estado=" + estado + "\n fecha_registro=" + fecha_registro + '}';
    }

    
}