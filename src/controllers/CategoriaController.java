package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Categoria;
import models.Conexion;

public class CategoriaController {
    
   private final String tabla = "categorias";
   Connection conexion;
   
   public void actualizar(Categoria categoria){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(categoria.getId() == 0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + "(nombre, salario_base, puesto_destino, estado, fecha_registro) VALUES(?, ?, ?, ?, ?)");
            consulta.setString(1, categoria.getNombre());
            consulta.setDouble(2, categoria.getSalario_base());
            consulta.setString(3, categoria.getPuesto_destino());
            consulta.setInt(4, categoria.getEstado());
            consulta.setString(5, categoria.getFecha_registro());
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET nombre =?, salario_base =?, puesto_destino =? WHERE id = ?");
            consulta.setString(1, categoria.getNombre());
            consulta.setDouble(2, categoria.getSalario_base());
            consulta.setString(3, categoria.getPuesto_destino());
            consulta.setInt(4, categoria.getId());
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
   
   public Categoria consultar(int id){
      Categoria categoria = null;
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, salario_base, puesto_destino, estado, fecha_registro FROM " + this.tabla + " WHERE id = ? AND estado = 1" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            categoria = new Categoria(rs.getInt("id"),
                                      rs.getString("nombre"),
                                      rs.getDouble("salario_base"),
                                      rs.getString("puesto_destino"),
                                      rs.getInt("estado"),
                                      rs.getString("fecha_registro"));
         }
         
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage()); 
      }
      return categoria;
   }
   
   public Categoria consultarDni(String id){
      Categoria categoria = null;
      try{
          conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, salario_base, puesto_destino, estado, fecha_registro FROM " + this.tabla + " WHERE id = ? AND estado = 1" );
         consulta.setString(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            categoria = new Categoria(rs.getInt("id"),
                                      rs.getString("nombre"),
                                      rs.getDouble("salario_base"),
                                      rs.getString("puesto_destino"),
                                      rs.getInt("estado"),
                                      rs.getString("fecha_registro"));
         }
   
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage()); 
      }
      return categoria;
   }
   
   
   public void eliminar(Categoria categoria){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, categoria.getEstado());
          consulta.setInt(2, categoria.getId());
          consulta.executeUpdate();
         JOptionPane.showMessageDialog(null, "Operación realizada exitosamente");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución "+ex.getMessage()); 
      }
   }
   
   
   public List<Categoria> listar(){
      List<Categoria> categorias = new ArrayList<Categoria>();
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, nombre, salario_base, puesto_destino, estado, fecha_registro FROM " + this.tabla + " WHERE estado = 1 ORDER BY id ASC");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
            Categoria categoria = new Categoria(rs.getInt("id"),
                                                rs.getString("nombre"),
                                                rs.getDouble("salario_base"), 
                                                rs.getString("puesto_destino"),
                                                rs.getInt("estado"),
                                                rs.getString("fecha_registro"));
            categorias.add(categoria);
         }
         
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return categorias;
   }
}