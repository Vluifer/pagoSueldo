package models;

public class Contrato {
    
    private int id;
    private Empleado empleado;
    private Categoria categoria;
    private Complemento complemento;
    private String fecha_alta;
    private String fecha_baja;
    private int estado;
    private String fecha_registro;


    public Contrato() {
    }

    public Contrato(int id, Empleado empleado, Categoria categoria,Complemento complemento, String fecha_alta, String fecha_baja,int estado,String fecha_registro) {
        this.id = id;
        this.empleado = empleado;
        this.categoria = categoria;
        this.complemento = complemento;
        this.fecha_alta = fecha_alta;
        this.fecha_baja = fecha_baja;
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    public Complemento getComplemento() {
        return complemento;
    }

    public void setComplemento(Complemento complemento) {
        this.complemento = complemento;
    }
    
    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }

    public String getFecha_baja() {
        return fecha_baja;
    }

    public void setFecha_baja(String fecha_baja) {
        this.fecha_baja = fecha_baja;
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
        return "\nCONTRARO" + "\nid=" + id + "\nempleado=" + empleado + "\ncategoria=" + categoria + "\ncomplemento=" + complemento + "\nfecha_alta=" + fecha_alta + "\nfecha_baja=" + fecha_baja + "\nestado=" + estado + "\nfecha_registro=" + fecha_registro;
    }
    
}
