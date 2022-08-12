package vistas;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controllers.ComplementoController;
import java.text.SimpleDateFormat;
import java.util.Date;
import models.Complemento;



/**
 *
 * @author LuiferV
 */
public class ComplementoVista extends javax.swing.JDialog {

    public ComplementoVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.refrescarTabla();
        btnActualizarComplemento.setEnabled(false);
        btnEliminarComplemento.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnconsultar = new javax.swing.JPanel();
        btnconsultarcomplemento = new javax.swing.JButton();
        txtConsultaComplemento = new javax.swing.JTextField();
        lblcomplemento1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jlbcomplemento = new javax.swing.JLabel();
        lblcomplemento = new javax.swing.JLabel();
        txtIdComplemento = new javax.swing.JTextField();
        lblnombrecomplemento = new javax.swing.JLabel();
        txtNombreComplemento = new javax.swing.JTextField();
        lbldescripcion = new javax.swing.JLabel();
        txtDescripcionComplemento = new javax.swing.JTextField();
        lblvalorcomplemento = new javax.swing.JLabel();
        txtValorComplemento = new javax.swing.JTextField();
        btnGuardarComplemento = new javax.swing.JButton();
        btnLimpiarComplemento = new javax.swing.JButton();
        btnActualizarComplemento = new javax.swing.JButton();
        btnEliminarComplemento = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcomplemento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jpnconsultar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Consultar Complementos"));

        btnconsultarcomplemento.setText("Consultar");
        btnconsultarcomplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarcomplementoActionPerformed(evt);
            }
        });

        txtConsultaComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaComplementoActionPerformed(evt);
            }
        });

        lblcomplemento1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcomplemento1.setText("Id Complemento");

        javax.swing.GroupLayout jpnconsultarLayout = new javax.swing.GroupLayout(jpnconsultar);
        jpnconsultar.setLayout(jpnconsultarLayout);
        jpnconsultarLayout.setHorizontalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcomplemento1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtConsultaComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconsultarcomplemento)
                .addContainerGap())
        );
        jpnconsultarLayout.setVerticalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconsultarcomplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultaComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcomplemento1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Agregar"));

        jlbcomplemento.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jlbcomplemento.setText("Complementos");

        lblcomplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcomplemento.setText("Id Complemento");

        txtIdComplemento.setEnabled(false);

        lblnombrecomplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombrecomplemento.setText("Nombre");

        lbldescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldescripcion.setText("Descripcion");

        txtDescripcionComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionComplementoActionPerformed(evt);
            }
        });

        lblvalorcomplemento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblvalorcomplemento.setText("Valor (%)");

        txtValorComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorComplementoActionPerformed(evt);
            }
        });

        btnGuardarComplemento.setText("Guardar");
        btnGuardarComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComplementoActionPerformed(evt);
            }
        });

        btnLimpiarComplemento.setText("Limpiar");
        btnLimpiarComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarComplementoActionPerformed(evt);
            }
        });

        btnActualizarComplemento.setText("Actualizar");
        btnActualizarComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarComplementoActionPerformed(evt);
            }
        });

        btnEliminarComplemento.setText("Eliminar");
        btnEliminarComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarComplementoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 76, Short.MAX_VALUE)
                        .addComponent(jlbcomplemento)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcomplemento)
                            .addComponent(lblnombrecomplemento)
                            .addComponent(lblvalorcomplemento)
                            .addComponent(lbldescripcion))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtValorComplemento, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                            .addComponent(txtNombreComplemento)
                            .addComponent(txtIdComplemento)
                            .addComponent(txtDescripcionComplemento))
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnGuardarComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLimpiarComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizarComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminarComplemento)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jlbcomplemento)
                .addGap(59, 59, 59)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcomplemento))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombrecomplemento)
                    .addComponent(txtNombreComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblvalorcomplemento)
                    .addComponent(txtValorComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescripcionComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldescripcion))
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarComplemento)
                    .addComponent(btnLimpiarComplemento)
                    .addComponent(btnActualizarComplemento)
                    .addComponent(btnEliminarComplemento))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbcomplemento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbcomplemento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcomplementoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcomplemento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                    .addComponent(jpnconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnconsultarcomplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarcomplementoActionPerformed
         try { 
            int con = Integer.parseInt(txtConsultaComplemento.getText());   
            JOptionPane.showMessageDialog(null, "Usted esta consultando el complemento el ID: "+con);
            ComplementoController complemento_crtl =new  ComplementoController(); 
           Complemento complemento= new Complemento();
            complemento = complemento_crtl.consultar(con);
            if(complemento != null){
                JOptionPane.showMessageDialog(null, complemento.toString());
            }else{
                JOptionPane.showMessageDialog(null, "Complemento no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución "+e.getMessage());
        }
         txtConsultaComplemento.setText("");
    }//GEN-LAST:event_btnconsultarcomplementoActionPerformed

    private void txtConsultaComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaComplementoActionPerformed

    private void tbcomplementoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcomplementoMouseClicked
        btnActualizarComplemento.setEnabled(true);
        btnEliminarComplemento.setEnabled(true);
        //con esto traemos la posicion  los datos de la fila a la que le demos click
        int seleccion = tbcomplemento.rowAtPoint(evt.getPoint());
        txtIdComplemento.setText(String.valueOf(tbcomplemento.getValueAt(seleccion,0)));
        txtNombreComplemento.setText(String.valueOf(tbcomplemento.getValueAt(seleccion,1)));
        txtValorComplemento.setText(String.valueOf(tbcomplemento.getValueAt(seleccion, 2)));
        txtDescripcionComplemento.setText(String.valueOf(tbcomplemento.getValueAt(seleccion, 3)));
    }//GEN-LAST:event_tbcomplementoMouseClicked

    private void btnEliminarComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarComplementoActionPerformed
        try {

            ComplementoController complemento_ctrl = new ComplementoController();
            Complemento complemento = new Complemento();
            int id = Integer.parseInt(txtIdComplemento.getText());
            complemento.setEstado(2);
            complemento.setId(id);
            complemento_ctrl.eliminar(complemento);
            refrescarTabla();
            limpiarCampos();
        }
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecucion " + e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarComplementoActionPerformed

    private void btnActualizarComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarComplementoActionPerformed
        try{
            ComplementoController complemento_ctrl = new ComplementoController();
            Complemento complemento = new Complemento();
            double valor = Double.parseDouble(txtValorComplemento.getText());
            int id = Integer.parseInt(txtIdComplemento.getText());
            complemento.setNombre(txtNombreComplemento.getText());
            complemento.setValor(valor);
            complemento.setDescripcion(txtDescripcionComplemento.getText());
            complemento.setId(id);
            complemento_ctrl.actualizar(complemento);
            refrescarTabla();
            limpiarCampos();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecucion " + e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarComplementoActionPerformed

    private void btnLimpiarComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarComplementoActionPerformed
        txtIdComplemento.setText("");
        txtNombreComplemento.setText("");
        txtValorComplemento.setText("");
        txtDescripcionComplemento.setText("");
    }//GEN-LAST:event_btnLimpiarComplementoActionPerformed

    private void btnGuardarComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComplementoActionPerformed
        try{
            ComplementoController complemento_ctrl = new ComplementoController();
            Complemento complemento = new Complemento();
            double valor=Double.parseDouble(txtValorComplemento.getText());
            String fecha = this.getFechaActual();

            complemento.setNombre(txtNombreComplemento.getText());
            complemento.setValor(valor);
            complemento.setDescripcion(txtDescripcionComplemento.getText());
            complemento.setEstado(1);
            complemento.setFechaRegistro(fecha);
            complemento_ctrl.actualizar(complemento);
            refrescarTabla();
            limpiarCampos();
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecucion " + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarComplementoActionPerformed

    private void txtValorComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorComplementoActionPerformed

    private void txtDescripcionComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionComplementoActionPerformed

     //En este metodo listamos todos datos que traemos de la tabla empleados de la bade datos, en el JTable. 
    public void refrescarTabla(){
        try{
            //Limpiamos la tabla
            limpiarTabla();
            //Creamos un objeto de tipo empleadoController
            ComplementoController complemento_crtl =new  ComplementoController();
            /*Creamos un arrayList tipo empleado, para pasarle la lista de objetos que nos traera el metodo listar,
            de la clase empeladoController*/
            List<Complemento> complementos = complemento_crtl.listar();
            //Se crea un objeto de tipo iterator,nosdevuelve un iterador sobre los elementos de esta lista en la secuencia adecuada.
            Iterator iter = complementos.iterator();
            //Crreamos un objeto de tipo DefaultTableModel, esto nos ayuda a crear las filas y las columnas de nuestra tabla
            DefaultTableModel dtmComplementos = new DefaultTableModel();
            //Con esta lienea de codigo, establecemos los titulos o la cebecera de la tabla
            String[] colComplemento = {"ID Complemento","Nombre", "Valor", "Descripcion"};
            //aqui creamos la columna antes establecida
            dtmComplementos.setColumnIdentifiers(colComplemento);
            //Creamos un vector de tipo objeto, al cual le pasamos el objeto, tipo DefaultTableModel con el metodo .getColumnCount()
            Object[] fila = new Object[dtmComplementos.getColumnCount()];
          //Con el este while recorremos el vector y mostraremos los datos, el metodo hasNext nos mostrar hasta el ultimo
            while (iter.hasNext()){  
           //Cremos un objeto tipo empledo y se lo asignamos al iteador, para traer los valores con iter.next()
                Complemento complemento = new Complemento();
                complemento = (Complemento) iter.next();
                //Capturamos los datos datos
                fila[0] = complemento.getId();
                fila[1] = complemento.getNombre();
                fila[2] = complemento.getValor();
                fila[3] = complemento.getDescripcion();
                //Se crean las filas
                dtmComplementos.addRow(fila);
        }
        //Mostramos los datos en la tbala
        tbcomplemento.setModel(dtmComplementos);
        }catch(Exception e){
            //Por si ocurre un error mostrar el mensaje y que nos diga donde esta el error
            JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución: "+e.getMessage());
        }
    
    }
    
      public void limpiarTabla(){
        DefaultTableModel tb = (DefaultTableModel) tbcomplemento.getModel();
        int a = tbcomplemento.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
    }
    
       //Meotodo que devuelve la hora actual
     public String getFechaActual(){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
    }
    
     public void limpiarCampos(){
         txtIdComplemento.setText("");
         txtNombreComplemento.setText("");
         txtValorComplemento.setText("");
         txtDescripcionComplemento.setText("");
     }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ComplementoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ComplementoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ComplementoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ComplementoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ComplementoVista dialog = new ComplementoVista(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarComplemento;
    private javax.swing.JButton btnEliminarComplemento;
    private javax.swing.JButton btnGuardarComplemento;
    private javax.swing.JButton btnLimpiarComplemento;
    private javax.swing.JButton btnconsultarcomplemento;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbcomplemento;
    private javax.swing.JPanel jpnconsultar;
    private javax.swing.JLabel lblcomplemento;
    private javax.swing.JLabel lblcomplemento1;
    private javax.swing.JLabel lbldescripcion;
    private javax.swing.JLabel lblnombrecomplemento;
    private javax.swing.JLabel lblvalorcomplemento;
    private javax.swing.JTable tbcomplemento;
    private javax.swing.JTextField txtConsultaComplemento;
    private javax.swing.JTextField txtDescripcionComplemento;
    private javax.swing.JTextField txtIdComplemento;
    private javax.swing.JTextField txtNombreComplemento;
    private javax.swing.JTextField txtValorComplemento;
    // End of variables declaration//GEN-END:variables
}
