package controllers;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import models.Categoria;
import models.Contrato;
import models.Conexion;
import models.Empleado;
import models.Complemento;


public class ContratoController {
    
   private final String tabla = "contratos";
   Connection conexion;
   
   public void actualizar(Contrato contrato){
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta;
         if(contrato.getId() == 0){
            consulta = conexion.prepareStatement("INSERT INTO " + this.tabla + " (id_empleado, id_categoria, id_complemento, fecha_alta, fecha_baja,estado, fecha_registro) VALUES (?, ?, ?, ?, ?, ?, ?)");
            consulta.setInt(1, contrato.getEmpleado().getId());
            consulta.setInt(2, contrato.getCategoria().getId());
            consulta.setInt(3, contrato.getComplemento().getId());
            consulta.setString(4, contrato.getFecha_alta());
            consulta.setString(5, contrato.getFecha_baja());
            consulta.setInt(6, contrato.getEstado());
            consulta.setString(7, contrato.getFecha_registro()); 
         }else{
            consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET fecha_alta = ?, fecha_baja = ? WHERE id = ?");
       
            consulta.setString(1, contrato.getFecha_alta());
            consulta.setString(2, contrato.getFecha_baja());
            consulta.setInt(3, contrato.getId());
         }
         int respuesta = consulta.executeUpdate();
         if(respuesta == 1){
              JOptionPane.showMessageDialog(null,"Operación realizada exitosamente");
         }else{
             JOptionPane.showMessageDialog(null,"No se puedo llevar a cabo la operación");
         }
         
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución Controller contrato "+ex.getMessage());
      }
   }
   
   public Contrato consultar(String campo, int id){
      Contrato contrato = null;
      
      Empleado empleado = null;
      EmpleadoController ec = new EmpleadoController();
      
      Categoria categoria = null;
      CategoriaController cc = new CategoriaController();
      
      Complemento complemento=null;
      ComplementoController cpc =new ComplementoController();
      
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, id_empleado, id_categoria, id_complemento, fecha_alta, fecha_baja, estado,fecha_registro FROM " + this.tabla + " WHERE "+campo+" = ?" );
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery(); 
         
         while(rs.next()){
             
            empleado = ec.consultar(rs.getInt("id_empleado"));
            categoria = cc.consultar(rs.getInt("id_categoria"));
            complemento =cpc.consultar(rs.getInt("id_complemento"));
            
            
            contrato = new Contrato(rs.getInt("id"), 
                                    empleado, 
                                    categoria, 
                                    complemento,
                                    rs.getString("fecha_alta"),
                                    rs.getString("fecha_baja"),
                                    rs.getInt("estado"),
                                    rs.getString("fecha_registro"));
        
         }
      }catch(Exception ex){
           JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return contrato;
   }
   
   
   public void eliminar(Contrato contrato){
       PreparedStatement consulta;
      try{
          conexion = Conexion.Conectar();
          consulta = conexion.prepareStatement("UPDATE " + this.tabla + " SET estado =? WHERE id = ?");
          consulta.setInt(1, contrato.getEstado());
          consulta.setInt(2, contrato.getId());
          consulta.executeUpdate();
          JOptionPane.showMessageDialog(null,"Operación realizada exitosamente");
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
   }
   
   
   public List<Contrato> listar(){
      Contrato contrato = null;
      
      Empleado empleado = null;
      EmpleadoController ec = new EmpleadoController();
      
      Categoria categoria = null;
      CategoriaController cc = new CategoriaController();
      
      Complemento complemento=null;
      ComplementoController cpc =new ComplementoController();
      
      List<Contrato> contratos = new ArrayList<Contrato>();
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, id_empleado, id_categoria,id_complemento, fecha_alta, fecha_baja, estado, fecha_registro FROM " + this.tabla + " WHERE estado = 1 ORDER BY id ASC");
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
               empleado = ec.consultar(rs.getInt("id_empleado"));
               categoria = cc.consultar(rs.getInt("id_categoria"));
               complemento =cpc.consultar(rs.getInt("id_complemento"));
            
            
                        contrato = new Contrato(rs.getInt("id"), 
                                                empleado, 
                                                categoria, 
                                                complemento,
                                                rs.getString("fecha_alta"),
                                                rs.getString("fecha_baja"),
                                                rs.getInt("estado"),
                                                rs.getString("fecha_registro"));
            contratos.add(contrato);
         }
        
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return contratos;
   }



   public List<Contrato> listarEmpleado(String campo, int id){
      Contrato contrato = null;
      
      Empleado empleado = null;
      EmpleadoController ec = new EmpleadoController();
      
      Categoria categoria = null;
      CategoriaController cc = new CategoriaController();
      
      Complemento complemento=null;
      ComplementoController cpc =new ComplementoController();
      
      List<Contrato> contratos = new ArrayList<Contrato>();
      try{
         conexion = Conexion.Conectar();
         PreparedStatement consulta = conexion.prepareStatement("SELECT id, id_empleado, id_categoria,id_complemento, fecha_alta, fecha_baja, estado, fecha_registro FROM " + this.tabla + " WHERE "+campo+" = ? AND estado = 1 ORDER BY id ASC");
         consulta.setInt(1, id);
         ResultSet rs = consulta.executeQuery();
         while(rs.next()){
             
               empleado = ec.consultar(rs.getInt("id_empleado"));
               categoria = cc.consultar(rs.getInt("id_categoria"));
               complemento =cpc.consultar(rs.getInt("id_complemento"));
            
            
                        contrato = new Contrato(rs.getInt("id"), 
                                                empleado, 
                                                categoria, 
                                                complemento,
                                                rs.getString("fecha_alta"),
                                                rs.getString("fecha_baja"),
                                                rs.getInt("estado"),
                                                rs.getString("fecha_registro"));
            contratos.add(contrato);
         }
        
      }catch(Exception ex){
          JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución "+ex.getMessage());
      }
      return contratos;
   }
}

