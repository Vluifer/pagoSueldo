package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Complemento;
import models.Conexion;
import models.Empleado;

public class ComplementoController {
    
   private final String tabla = "complementos";
   Connection conexion;
   
   public void actualizar(Complemento complemento){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(complemento.getId() == 0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(nombre, valor, descripcion, estado, fecha_registro) VALUES(?, ?, ?, ?, ?)");
            consulta.setString(1, complemento.getNombre());
            consulta.setDouble(2, complemento.getValor());
            consulta.setString(3, complemento.getDescripcion());
            consulta.setInt(4, complemento.getEstado());
            consulta.setString(5, complemento.getFechaRegistro());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET nombre =?, valor =?, descripcion =? WHERE id = ?");
            consulta.setString(1, complemento.getNombre());
            consulta.setDouble(2, complemento.getValor());
            consulta.setString(3, complemento.getDescripcion());
            consulta.setInt(4, complemento.getId());
         }
         int respuesta = consulta.executeUpdate();
         if(respuesta == 1){
             JOptionPane.showMessageDialog(null,"Operación realizada exitosamente" );
         }else{
             JOptionPane.showMessageDialog(null,"No se puedo llevar a cabo la operación" );
         }
         
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage() );
      }
   }
   
   public Complemento consultar(int id){
      Complemento complemento = null;
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, valor, descripcion, estado, fecha_registro FROM " + this.tabla + " WHERE id = ? AND estado = '1'" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            complemento = new Complemento(rs.getInt("id"),
                                          rs.getString("nombre"),
                                          rs.getDouble("valor"),
                                          rs.getString("descripcion"),
                                          rs.getInt("estado"),
                                          rs.getString("fecha_registro"));
         }
        
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage()); 
      }
      return complemento;
   }
   
   public Complemento consultarDNi(String id){
      Complemento complemento = null;
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, valor, descripcion, estado, fecha_registro FROM " + this.tabla + " WHERE id = ? AND estado = '1'" );
         consulta.setString(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            complemento = new Complemento(rs.getInt("id"),
                                          rs.getString("nombre"),
                                          rs.getDouble("valor"),
                                          rs.getString("descripcion"),
                                          rs.getInt("estado"),
                                          rs.getString("fecha_registro"));
         }
        
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage()); 
      }
      return complemento;
   }
   
   
   public void eliminar(Complemento complemento){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, complemento.getEstado());
          consulta.setInt(2, complemento.getId());
          consulta.executeUpdate();
          //Conexion.cerrar();
          JOptionPane.showMessageDialog(null,"Operación realizada exitosamente");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage() );
      }
   }
   
   
   public List<Complemento> listar(){
      List<Complemento> complementos = new ArrayList<Complemento>();
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, valor, descripcion, estado, fecha_registro FROM "+this.tabla+" WHERE estado=1 ORDER BY id ASC");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
        Complemento complemento = new Complemento(rs.getInt("id"),
                                                  rs.getString("nombre"), 
                                                  rs.getDouble("valor"),
                                                  rs.getString("descripcion"),
                                                  rs.getInt("estado"), 
                                                  rs.getString("fecha_registro"));
            complementos.add(complemento);
         }
         
      }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage() );
      }
      return complementos;
   }
}