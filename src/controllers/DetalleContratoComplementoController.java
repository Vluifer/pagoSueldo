package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Categoria;
import models.Complemento;
import models.DetalleContratoComplemento;
import models.Conexion;
import models.Contrato;

public class DetalleContratoComplementoController {
    
   private final String tabla = "detalle_contrato_complemento";
   Connection conexion;
   
   public void actualizar(DetalleContratoComplemento detalle){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(detalle.getId() == 0){
            consulta = conexion.prepareStatement("INESRT INTO " + this.tabla + "(id_contrato,id_complemento,estado,fecha_registro) VALUES(?,?,?,?)");
            consulta.setInt(1, detalle.getContrato().getId());
            consulta.setInt(2, detalle.getComplemento().getId());
            consulta.setInt(3, detalle.getEstado());
            consulta.setString(4, detalle.getFecha_registro());
            
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET id_contrato =? ,id_complemento=?,estado=?,fecha_registro=? WHERE id = ?");
            consulta.setInt(1, detalle.getId());
            consulta.setInt(2, detalle.getContrato().getId());
            consulta.setInt(3, detalle.getEstado());
            consulta.setString(4, detalle.getFecha_registro());
         }
         int respuesta = consulta.executeUpdate();
         if(respuesta == 1){
             JOptionPane.showConfirmDialog(null,"Operación realizada exitosamente");
         }else{
             JOptionPane.showMessageDialog(null,"No se puedo llevar a cabo la operación");
         }
         
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   public DetalleContratoComplemento consultar(int id){
      DetalleContratoComplemento detalle = null;
      
     Contrato contrato;
     ContratoController ct=new ContratoController();
     
     Complemento complemento;
     ComplementoController cp =new ComplementoController();
     
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id,id_contrato,id_complemento,estado,fecha_registro FROM " + this.tabla + " WHERE id = ?" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
        contrato = ct.consultar("id", rs.getInt("id_contrato"));
        complemento = cp.consultar(rs.getInt("id_complemento"));
              
        detalle = new DetalleContratoComplemento(rs.getInt("id"),
                                                       contrato,
                                                       complemento,
                                                       rs.getInt("estado"),
                                                       rs.getString("fecha_registro"));
         }
      }catch(Exception ex){
               JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return detalle;
   }
   
   
   public void eliminar(DetalleContratoComplemento detalle){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, detalle.getEstado());
          consulta.setInt(2, detalle.getId());
          consulta.executeUpdate();
         
         JOptionPane.showMessageDialog(null,"Operación realizada exitosamente");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
         
      }
   }
   
   
   public List<DetalleContratoComplemento> listar(){
       DetalleContratoComplemento detalle = null;
      
        Contrato contrato;
        ContratoController ct=new ContratoController();
     
        Complemento complemento;
        ComplementoController cp =new ComplementoController();
     
      List<DetalleContratoComplemento> detalles = new ArrayList<DetalleContratoComplemento>();
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id,id_contrato,id_complemento,estado,fecha_registro FROM " + this.tabla +  " ORDER BY id ASC");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
              contrato = ct.consultar("id", rs.getInt("id_contrato"));
              complemento = cp.consultar(rs.getInt("id_complemento"));
              
              detalle = new DetalleContratoComplemento(rs.getInt("id"),
                                                       contrato,
                                                       complemento,
                                                       rs.getInt("estado"),
                                                       rs.getString("fecha_registro"));
         }

      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());  
      }
      return detalles;
   }

    public DetalleContratoComplemento consultarPorDNI(String con) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}