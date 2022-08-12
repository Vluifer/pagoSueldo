package models;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
    
   private static Connection cnx = null;

   public static Connection Conectar(){
          if (cnx == null) {
         try {
            cnx = DriverManager.getConnection("jdbc:mysql://localhost/nomina","root","");
            
         } catch (Exception ex) {
          JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución "+ex.getMessage());
         }
      }
      return cnx;
   }
   
   public static void cerrar() throws SQLException {
      if (cnx != null) {
         cnx.close();
      }
   }
}