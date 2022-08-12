package models;

public class DetalleContratoComplemento {
    
    private int id;
    private Contrato contrato;
    private Complemento complemento;
    private int estado;
    private String fecha_registro;

    public DetalleContratoComplemento() {
    }


    public DetalleContratoComplemento(int id, Contrato contrato, Complemento complemento, int estado, String fecha_registro) {
        this.id = id;
        this.contrato = contrato;
        this.complemento = complemento;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
    }
    
 
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Complemento getComplemento() {
        return complemento;
    }

    public void setComplemento(Complemento complemento) {
        this.complemento = complemento;
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
        return "DetalleContratoComplemento{" + "id=" + id + ", contrato=" + contrato + ", complemento=" + complemento + ", estado=" + estado + ", fecha_registro=" + fecha_registro + '}';
    }

    
}