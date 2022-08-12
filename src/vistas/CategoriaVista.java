package vistas;
import controllers.CategoriaController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Categoria;


/**
 *
 * @author LuiferV
 */
public class CategoriaVista extends javax.swing.JDialog {

    /**
     * Creates new form CategoriaVista
     */
    public CategoriaVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.refrescarTabla();
         btnactualizarcategoria.setEnabled(false);
         btneliminarcategoria.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblcategoria = new javax.swing.JLabel();
        lblidcategoria = new javax.swing.JLabel();
        txtIdCategoria = new javax.swing.JTextField();
        lblnombrecategoria = new javax.swing.JLabel();
        txtNombreCategoria = new javax.swing.JTextField();
        lblsueldobasico = new javax.swing.JLabel();
        txtSalarioBase = new javax.swing.JTextField();
        lblpuestodestino = new javax.swing.JLabel();
        txtPuestoDestino = new javax.swing.JTextField();
        btnguardarcaregoria = new javax.swing.JButton();
        btnlimpiarcategoria = new javax.swing.JButton();
        btnactualizarcategoria = new javax.swing.JButton();
        btneliminarcategoria = new javax.swing.JButton();
        jpnconsultar = new javax.swing.JPanel();
        btnconsultarcategoria = new javax.swing.JButton();
        txtConsultaCategoria = new javax.swing.JTextField();
        lblcomplemento1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbcategoria = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Agregar"));

        lblcategoria.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lblcategoria.setText("Categoria");

        lblidcategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblidcategoria.setText("Id Categoria");

        txtIdCategoria.setEnabled(false);

        lblnombrecategoria.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombrecategoria.setText("Nombre");

        txtNombreCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreCategoriaActionPerformed(evt);
            }
        });

        lblsueldobasico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblsueldobasico.setText("Salario Base");

        txtSalarioBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioBaseActionPerformed(evt);
            }
        });

        lblpuestodestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblpuestodestino.setText("Puesto destino");

        btnguardarcaregoria.setText("Guardar");
        btnguardarcaregoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarcaregoriaActionPerformed(evt);
            }
        });

        btnlimpiarcategoria.setText("Limpiar");
        btnlimpiarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarcategoriaActionPerformed(evt);
            }
        });

        btnactualizarcategoria.setText("Actualizar");
        btnactualizarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarcategoriaActionPerformed(evt);
            }
        });

        btneliminarcategoria.setText("Eliminar");
        btneliminarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarcategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(lblcategoria))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblidcategoria)
                            .addComponent(lblnombrecategoria)
                            .addComponent(lblpuestodestino)
                            .addComponent(lblsueldobasico))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtIdCategoria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPuestoDestino, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                .addComponent(txtSalarioBase))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(53, 53, 53))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(btnguardarcaregoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnlimpiarcategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnactualizarcategoria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btneliminarcategoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblcategoria)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblidcategoria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNombreCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblnombrecategoria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtSalarioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblsueldobasico))
                        .addGap(18, 18, 18)
                        .addComponent(txtPuestoDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblpuestodestino, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardarcaregoria)
                    .addComponent(btnlimpiarcategoria)
                    .addComponent(btnactualizarcategoria)
                    .addComponent(btneliminarcategoria))
                .addGap(69, 69, 69))
        );

        jpnconsultar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Consultar Categoria"));

        btnconsultarcategoria.setText("Consultar");
        btnconsultarcategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarcategoriaActionPerformed(evt);
            }
        });

        txtConsultaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaCategoriaActionPerformed(evt);
            }
        });

        lblcomplemento1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcomplemento1.setText("Id Categoria");

        javax.swing.GroupLayout jpnconsultarLayout = new javax.swing.GroupLayout(jpnconsultar);
        jpnconsultar.setLayout(jpnconsultarLayout);
        jpnconsultarLayout.setHorizontalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcomplemento1)
                .addGap(18, 18, 18)
                .addComponent(txtConsultaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnconsultarcategoria)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jpnconsultarLayout.setVerticalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconsultarcategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultaCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcomplemento1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbcategoria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbcategoria.setName(""); // NOI18N
        tbcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbcategoriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbcategoria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jpnconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSalarioBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioBaseActionPerformed

    private void btnguardarcaregoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarcaregoriaActionPerformed
       try{
        CategoriaController categoria_crtl = new CategoriaController();
        Categoria categoria= new Categoria();
        double SalarioBase= Double.valueOf(txtSalarioBase.getText());
        String fecha = this.getFechaActual();
        
        categoria.setNombre(txtNombreCategoria.getText());
        categoria.setSalario_base(SalarioBase);
        categoria.setPuesto_destino(txtPuestoDestino.getText());
        categoria.setEstado(1);
        categoria.setFecha_registro(fecha);
        categoria_crtl.actualizar(categoria);
        refrescarTabla();
        limpiarCampos();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución: " +e.getMessage());
        }
    }//GEN-LAST:event_btnguardarcaregoriaActionPerformed

    private void btnconsultarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarcategoriaActionPerformed
         try { 
            int con = Integer.parseInt(txtConsultaCategoria.getText());   
            JOptionPane.showMessageDialog(null, "Usted esta consultando La categoria por ID: "+con);
            CategoriaController categoria_crtl =new CategoriaController(); 
            Categoria categoria= new Categoria();
            categoria = categoria_crtl.consultar(con);
            if(categoria != null){
                JOptionPane.showMessageDialog(null, categoria.toString());
            }else{
                JOptionPane.showMessageDialog(null, "La Categoria no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución "+e.getMessage());
        }
         txtConsultaCategoria.setText("");
    }//GEN-LAST:event_btnconsultarcategoriaActionPerformed

    private void txtConsultaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaCategoriaActionPerformed

    private void txtNombreCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreCategoriaActionPerformed

    private void btnactualizarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarcategoriaActionPerformed
        try {
        CategoriaController categoria_crtl = new CategoriaController();
        Categoria categoria= new Categoria();
        double salarioBase= Double.valueOf(txtSalarioBase.getText());
        int id= Integer.parseInt(txtIdCategoria.getText());
        
        categoria.setNombre(txtNombreCategoria.getText());
        categoria.setSalario_base(salarioBase);
        categoria.setPuesto_destino(txtPuestoDestino.getText());
        categoria.setId(id);
        categoria_crtl.actualizar(categoria);
        refrescarTabla();
        limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución: " +e.getMessage());
        }
    }//GEN-LAST:event_btnactualizarcategoriaActionPerformed

    private void btnlimpiarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarcategoriaActionPerformed
        txtIdCategoria.setText("");
        txtNombreCategoria.setText("");
        txtPuestoDestino.setText("");
        txtSalarioBase.setText("");
    }//GEN-LAST:event_btnlimpiarcategoriaActionPerformed

    private void tbcategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbcategoriaMouseClicked
         btnactualizarcategoria.setEnabled(true);
         btneliminarcategoria.setEnabled(true);
        //con esto traemos la posicion  los datos de la fila a la que le demos click
        int seleccion = tbcategoria.rowAtPoint(evt.getPoint());
        txtIdCategoria.setText(String.valueOf(tbcategoria.getValueAt(seleccion,0)));
        txtNombreCategoria.setText(String.valueOf(tbcategoria.getValueAt(seleccion,1)));
        txtSalarioBase.setText(String.valueOf(tbcategoria.getValueAt(seleccion, 2)));
        txtPuestoDestino.setText(String.valueOf(tbcategoria.getValueAt(seleccion, 3)));
    }//GEN-LAST:event_tbcategoriaMouseClicked

    private void btneliminarcategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarcategoriaActionPerformed
        try {
        CategoriaController categoria_crtl = new CategoriaController();
        Categoria categoria= new Categoria();
        int id= Integer.parseInt(txtIdCategoria.getText());
        
        categoria.setEstado(2);
        categoria.setId(id);
        categoria_crtl.eliminar(categoria);
        refrescarTabla();
        limpiarCampos();
        }
        catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución: " +e.getMessage());
        }
    }//GEN-LAST:event_btneliminarcategoriaActionPerformed

 
     //Meotodo que devuelve la hora actual
     public String getFechaActual(){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
    }
     
      //En este metodo listamos todos datos que traemos de la tabla empleados de la bade datos, en el JTable. 
    public void refrescarTabla(){
        try{
            //Limpiamos la tabla
            limpiarTabla();
            //Creamos un objeto de tipo empleadoController
            CategoriaController categoria_crtl =new  CategoriaController();
            /*Creamos un arrayList tipo empleado, para pasarle la lista de objetos que nos traera el metodo listar,
            de la clase empeladoController*/
            List<Categoria> categorias = categoria_crtl.listar();
            //Se crea un objeto de tipo iterator,nosdevuelve un iterador sobre los elementos de esta lista en la secuencia adecuada.
            Iterator iter = categorias.iterator();
            //Creamos un objeto de tipo DefaultTableModel, esto nos ayuda a crear las filas y las columnas de nuestra tabla
            DefaultTableModel dtmCategorias = new DefaultTableModel();
            //Con esta linea de codigo, establecemos los titulos o la cabecera de la tabla
            String[] colCategoria = {"ID Categoria","Nombre", "Salario Base", "Puesto Destino"};
            //aqui creamos la columna antes establecida
            dtmCategorias.setColumnIdentifiers(colCategoria);
            //Creamos un vector de tipo objeto, al cual le pasamos el objeto, tipo DefaultTableModel con el metodo .getColumnCount()
            Object[] fila = new Object[dtmCategorias.getColumnCount()];
          //Con el este while recorremos el iterador y mostraremos los datos, el metodo hasNext nos mostrar hasta el ultimo
            while (iter.hasNext()){  
           //Cremos un objeto tipo empledo y se lo asignamos al iteador, para traer los valores con iter.next()
                Categoria categoria = new Categoria();
                //Hacemos un casteao de iter.next() a categoria , para que nos devuelva un arreglo de tipo categorias
                categoria = (Categoria) iter.next();
                //Mostramos los datos datos
                fila[0] = categoria.getId();
                fila[1] = categoria.getNombre();
                fila[2] = categoria.getSalario_base();
                fila[3] = categoria.getPuesto_destino();
                
                //Se crean las filas
                dtmCategorias.addRow(fila);
        }
        //Mostramos los datos en la tbala
        tbcategoria.setModel(dtmCategorias);
        }catch(Exception e){
            //Por si ocurre un error mostrar el mensaje y que nos diga donde esta el error
            JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución: "+e.getMessage());
        }
    
    }
    
     public void limpiarTabla(){
        DefaultTableModel tb = (DefaultTableModel) tbcategoria.getModel();
        int a = tbcategoria.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        } 
    }
     
     public void limpiarCampos(){
        txtIdCategoria.setText("");
        txtNombreCategoria.setText("");
        txtPuestoDestino.setText("");
        txtSalarioBase.setText("");
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
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoriaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CategoriaVista dialog = new CategoriaVista(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnactualizarcategoria;
    private javax.swing.JButton btnconsultarcategoria;
    private javax.swing.JButton btneliminarcategoria;
    private javax.swing.JButton btnguardarcaregoria;
    private javax.swing.JButton btnlimpiarcategoria;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnconsultar;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lblcomplemento1;
    private javax.swing.JLabel lblidcategoria;
    private javax.swing.JLabel lblnombrecategoria;
    private javax.swing.JLabel lblpuestodestino;
    private javax.swing.JLabel lblsueldobasico;
    private javax.swing.JTable tbcategoria;
    private javax.swing.JTextField txtConsultaCategoria;
    private javax.swing.JTextField txtIdCategoria;
    private javax.swing.JTextField txtNombreCategoria;
    private javax.swing.JTextField txtPuestoDestino;
    private javax.swing.JTextField txtSalarioBase;
    // End of variables declaration//GEN-END:variables
}
