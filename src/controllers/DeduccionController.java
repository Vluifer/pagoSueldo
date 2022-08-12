package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Deduccion;
import models.Conexion;

public class DeduccionController {
    
   private final String tabla = "deducciones";
   Connection conexion;
   
   public void actualizar(Deduccion deduccion){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(deduccion.getId() == 0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "( nombre, descripcion, valor, rango_inicial, rango_final, estado, fecha_registro) VALUES(?, ?, ?, ?, ?, ?, ?)");
            consulta.setString(1, deduccion.getNombre());
            consulta.setString(2, deduccion.getDescripcion());
            consulta.setDouble(3, deduccion.getValor());
            consulta.setDouble(4, deduccion.getRango_inicial());
            consulta.setDouble(5, deduccion.getRango_final());
            consulta.setInt(6, deduccion.getEstado());
            consulta.setString(7, deduccion.getFecha_registro());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET nombre =?, descripcion =?, valor = ?, rango_inicial = ?, rango_final  = ? WHERE id = ?");
            consulta.setString(1, deduccion.getNombre());
            consulta.setString(2, deduccion.getDescripcion());
            consulta.setDouble(3, deduccion.getValor());
            consulta.setDouble(4, deduccion.getRango_inicial());
            consulta.setDouble(5, deduccion.getRango_final());
            consulta.setInt(6, deduccion.getId());
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
   
   public Deduccion consultar(int id){
      Deduccion deduccion = null;
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, descripcion, valor, rango_inicial, rango_final, estado, fecha_registro FROM " + this.tabla + " WHERE id = ? AND estado = 1" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            deduccion = new Deduccion(rs.getInt("id"), 
                                      rs.getString("nombre"), 
                                      rs.getString("descripcion"), 
                                      rs.getDouble("valor"),
                                      rs.getDouble("rango_inicial"),
                                      rs.getDouble("rango_final"),
                                      rs.getInt("estado"), 
                                      rs.getString("fecha_registro") );
         }
         
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return deduccion;
   }
   
   
   public void eliminar(Deduccion deduccion){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, deduccion.getEstado());
          consulta.setInt(2, deduccion.getId());
          consulta.executeUpdate();
       JOptionPane.showMessageDialog(null,"Operación realizada exitosamente");
      }catch(Exception ex){
       JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   
   public List<Deduccion> listar(){
      List<Deduccion> deducciones = new ArrayList<Deduccion>();
      Deduccion deduccion = null;
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, descripcion, valor, rango_inicial, rango_final, estado, fecha_registro FROM " + this.tabla + " WHERE estado = 1 ORDER BY id ASC ");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            deduccion = new Deduccion(rs.getInt("id"), 
                                      rs.getString("nombre"), 
                                      rs.getString("descripcion"), 
                                      rs.getDouble("valor"),
                                      rs.getDouble("rango_inicial"),
                                      rs.getDouble("rango_final"),
                                      rs.getInt("estado"), 
                                      rs.getString("fecha_registro") );
            deducciones.add(deduccion);
         }
      }catch(Exception ex){
         JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return deducciones;
   }
}