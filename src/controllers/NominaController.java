package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Nomina;
import models.Conexion;

public class NominaController {
    
   private final String tabla = "nominas";
   Connection conexion;
   
   public void actualizar(Nomina nomina){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(nomina.getId() == 0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(fecha_ini, fecha_fin, encargado,total_pagar, estado, fecha_registro) VALUES(?, ?, ?, ?, ?,?)");
            consulta.setString(1, nomina.getFecha_ini());
            consulta.setString(2, nomina.getFecha_fin());
            consulta.setString(3, nomina.getEncargado());
            consulta.setDouble(4, nomina.getTotal_pagar());
            consulta.setInt(5, nomina.getEstado());
            consulta.setString(6, nomina.getFecha_registro());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET fecha_ini, fecha_fin, encargado,total_pagar, estado, fecha_registro WHERE id = ?");
           consulta.setString(1, nomina.getFecha_ini());
            consulta.setString(2, nomina.getFecha_fin());
            consulta.setString(3, nomina.getEncargado());
            consulta.setDouble(4, nomina.getTotal_pagar());
            consulta.setInt(5, nomina.getEstado());
            consulta.setString(6, nomina.getFecha_registro());
         }
         int respuesta = consulta.executeUpdate();
         if(respuesta == 1){
             JOptionPane.showMessageDialog(null,"Operación realizada exitosamente");
         }else{
             JOptionPane.showMessageDialog(null,"No se puedo llevar a cabo la operación"); 
         }
         
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   public Nomina consultar(int id){
      Nomina nomina = null;
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, fecha_ini, fecha_fin, encargado,total_pagar, estado, fecha_registro FROM " + this.tabla + " WHERE id = ?" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            nomina = new Nomina(rs.getInt("id"),
                                rs.getString("fecha_ini"), 
                                rs.getString("fecha_fin"),
                                rs.getString("encargado"),
                                rs.getDouble("total_pagar"),
                                rs.getInt("estado"),
                                rs.getString("fecha_registro"));
         }
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());  
      }
      return nomina;
   }
   
    public Nomina consultarUltimo(){
      Nomina nomina = null;
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, fecha_ini, fecha_fin, encargado,total_pagar, estado, fecha_registro FROM " + this.tabla + " ORDER BY id DESC LIMIT 1;" );
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            nomina = new Nomina(rs.getInt("id"),
                                rs.getString("fecha_ini"), 
                                rs.getString("fecha_fin"),
                                rs.getString("encargado"),
                                rs.getDouble("total_pagar"),
                                rs.getInt("estado"),
                                rs.getString("fecha_registro"));
         }
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());  
      }
      return nomina;
   }
   
   
   public void eliminar(Nomina nomina){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, nomina.getEstado());
          consulta.setInt(2, nomina.getId());
          consulta.executeUpdate();
          JOptionPane.showMessageDialog(null, "Operación realizada exitosamente");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   
   public List<Nomina> listar(){
      List<Nomina> nominas = new ArrayList<Nomina>();
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, fecha_ini, fecha_fin, encargado,total_pagar, estado, fecha_registro FROM " + this.tabla + " ORDER BY id ASC");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
          Nomina nomina = new Nomina(rs.getInt("id"),
                    rs.getString("fecha_ini"), 
                    rs.getString("fecha_fin"),
                    rs.getString("encargado"),
                    rs.getDouble("total_pagar"),
                    rs.getInt("estado"),
                    rs.getString("fecha_registro"));
            nominas.add(nomina);
         }
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return nominas;
   }
}