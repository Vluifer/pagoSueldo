package vistas;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class ContenedorVista extends javax.swing.JFrame {

  
    public ContenedorVista() {
        initComponents();
        
         this.setLayout(null); 
         this.setExtendedState(this.MAXIMIZED_BOTH);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu2 = new javax.swing.JMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        smInicio = new javax.swing.JMenu();
        smEmpleado = new javax.swing.JMenuItem();
        smCategoria = new javax.swing.JMenuItem();
        smComplemento = new javax.swing.JMenuItem();
        smDeduccion = new javax.swing.JMenuItem();
        smContrato = new javax.swing.JMenuItem();
        smNomina = new javax.swing.JMenuItem();
        smsalir = new javax.swing.JMenuItem();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenu2.setText("jMenu2");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Nomina");
        setName("contenedor"); // NOI18N
        setResizable(false);

        smInicio.setText("Inicio");

        smEmpleado.setText("Empleado...");
        smEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smEmpleadoActionPerformed(evt);
            }
        });
        smInicio.add(smEmpleado);

        smCategoria.setText("Categoria...");
        smCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smCategoriaActionPerformed(evt);
            }
        });
        smInicio.add(smCategoria);

        smComplemento.setText("Complemento...");
        smComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smComplementoActionPerformed(evt);
            }
        });
        smInicio.add(smComplemento);

        smDeduccion.setText("Deduccion...");
        smDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smDeduccionActionPerformed(evt);
            }
        });
        smInicio.add(smDeduccion);

        smContrato.setText("Contrato...");
        smContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smContratoActionPerformed(evt);
            }
        });
        smInicio.add(smContrato);

        smNomina.setText("Nomina...");
        smNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smNominaActionPerformed(evt);
            }
        });
        smInicio.add(smNomina);

        smsalir.setText("Salir");
        smsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                smsalirActionPerformed(evt);
            }
        });
        smInicio.add(smsalir);

        jMenuBar1.add(smInicio);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1149, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 504, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void smsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smsalirActionPerformed

        try {
            System.exit(0);
            models.Conexion.cerrar();
        } catch (SQLException ex) {
            Logger.getLogger(ContenedorVista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_smsalirActionPerformed

    private void smContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smContratoActionPerformed
        ContratoVista contratov=new ContratoVista(this,true);
        contratov.setLocationRelativeTo(null);
        contratov.setVisible(true);
        ContratoVista.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
    }//GEN-LAST:event_smContratoActionPerformed

    private void smDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smDeduccionActionPerformed
        DeduccionVista Deduccionv=new DeduccionVista(this,true);
        Deduccionv.setLocationRelativeTo(null);
        Deduccionv.setVisible(true);
        DeduccionVista.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
    }//GEN-LAST:event_smDeduccionActionPerformed

    private void smComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smComplementoActionPerformed
        ComplementoVista complementov=new ComplementoVista(this,true);
        complementov.setLocationRelativeTo(null);
        complementov.setVisible(true);
        ComplementoVista.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
    }//GEN-LAST:event_smComplementoActionPerformed

    private void smCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smCategoriaActionPerformed
        CategoriaVista categoriav=new CategoriaVista(this,true);
        categoriav.setLocationRelativeTo(null);
        categoriav.setVisible(true);
        CategoriaVista.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
    }//GEN-LAST:event_smCategoriaActionPerformed

    private void smEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smEmpleadoActionPerformed
        EmpleadoVista empleadov=new EmpleadoVista(this, true);
        empleadov.setLocationRelativeTo(null);
        empleadov.setVisible(true);
        EmpleadoVista.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
    }//GEN-LAST:event_smEmpleadoActionPerformed

    private void smNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_smNominaActionPerformed
    NominaVista nominav=new NominaVista(this,true);
    nominav.setLocationRelativeTo(null);
    nominav.setVisible(true);
    NominaVista.setDefaultLookAndFeelDecorated(rootPaneCheckingEnabled);
    }//GEN-LAST:event_smNominaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            /* Set the Nimbus look and feel */
            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
            */
            UIManager.setLookAndFeel("com.jtattoo.plaf.luna.LunaLookAndFeel");
            //</editor-fold>
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex) {
            Logger.getLogger(ContenedorVista.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContenedorVista().setVisible(true);
                
                //ContenedorVista Contenedor=new ContenedorVista();
                
             
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JMenuItem smCategoria;
    private javax.swing.JMenuItem smComplemento;
    private javax.swing.JMenuItem smContrato;
    private javax.swing.JMenuItem smDeduccion;
    private javax.swing.JMenuItem smEmpleado;
    private javax.swing.JMenu smInicio;
    private javax.swing.JMenuItem smNomina;
    private javax.swing.JMenuItem smsalir;
    // End of variables declaration//GEN-END:variables
}
