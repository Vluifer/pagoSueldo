
package vistas;


import javax.swing.JOptionPane;
import controllers.DeduccionController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Deduccion;

/**
 *
 * @author LuiferV
 */
public class DeduccionVista extends javax.swing.JDialog {

 
    public DeduccionVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        refrescarTabla();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbdeduccion = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        lblcategoria = new javax.swing.JLabel();
        lbliddeduccion = new javax.swing.JLabel();
        txtIdDeduccion = new javax.swing.JTextField();
        lblnombrededuccion = new javax.swing.JLabel();
        txtNombreDeduccion = new javax.swing.JTextField();
        lbldescripciondeduccion = new javax.swing.JLabel();
        txtDescripcionDeduccion = new javax.swing.JTextField();
        btnGuardarDeduccion = new javax.swing.JButton();
        btLimpiarDeduccion = new javax.swing.JButton();
        btnActualizarDeduccion = new javax.swing.JButton();
        btnEliminarDeduccion = new javax.swing.JButton();
        txtValorDeduccion = new javax.swing.JTextField();
        lbldescripciondeduccion1 = new javax.swing.JLabel();
        txtRangoFinalDeduccion = new javax.swing.JTextField();
        txtRangoInicialDeduccion = new javax.swing.JTextField();
        lbldescripciondeduccion2 = new javax.swing.JLabel();
        lbldescripciondeduccion3 = new javax.swing.JLabel();
        jpnconsultar = new javax.swing.JPanel();
        btnConsultarDeduccion = new javax.swing.JButton();
        txtConsultaDeduccion = new javax.swing.JTextField();
        lblcomplemento1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        tbdeduccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbdeduccion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbdeduccionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbdeduccion);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Agregar"));

        lblcategoria.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        lblcategoria.setText("Deducción");

        lbliddeduccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbliddeduccion.setText("Id Deduccion");

        txtIdDeduccion.setEnabled(false);

        lblnombrededuccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombrededuccion.setText("Nombre");

        lbldescripciondeduccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldescripciondeduccion.setText("Descripcion");

        txtDescripcionDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionDeduccionActionPerformed(evt);
            }
        });

        btnGuardarDeduccion.setText("Guardar");
        btnGuardarDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDeduccionActionPerformed(evt);
            }
        });

        btLimpiarDeduccion.setText("Limpiar");
        btLimpiarDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLimpiarDeduccionActionPerformed(evt);
            }
        });

        btnActualizarDeduccion.setText("Actualizar");
        btnActualizarDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarDeduccionActionPerformed(evt);
            }
        });

        btnEliminarDeduccion.setText("Eliminar");
        btnEliminarDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDeduccionActionPerformed(evt);
            }
        });

        txtValorDeduccion.setName("txtValorDeduccion"); // NOI18N
        txtValorDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorDeduccionActionPerformed(evt);
            }
        });

        lbldescripciondeduccion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldescripciondeduccion1.setText("Valor (%)");

        txtRangoFinalDeduccion.setName("txtValorDeduccion"); // NOI18N
        txtRangoFinalDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRangoFinalDeduccionActionPerformed(evt);
            }
        });

        txtRangoInicialDeduccion.setName("txtValorDeduccion"); // NOI18N
        txtRangoInicialDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRangoInicialDeduccionActionPerformed(evt);
            }
        });

        lbldescripciondeduccion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldescripciondeduccion2.setText("Rango Inicial");

        lbldescripciondeduccion3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldescripciondeduccion3.setText("Rango Final");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(lblcategoria))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnGuardarDeduccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btLimpiarDeduccion)
                                .addGap(14, 14, 14)
                                .addComponent(btnActualizarDeduccion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarDeduccion)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbliddeduccion)
                            .addComponent(lblnombrededuccion)
                            .addComponent(lbldescripciondeduccion)
                            .addComponent(lbldescripciondeduccion1)
                            .addComponent(lbldescripciondeduccion2)
                            .addComponent(lbldescripciondeduccion3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtValorDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDescripcionDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRangoFinalDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRangoInicialDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblcategoria)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtIdDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbliddeduccion))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtNombreDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblnombrededuccion))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtValorDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbldescripciondeduccion1))
                                .addGap(13, 13, 13)
                                .addComponent(txtRangoInicialDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbldescripciondeduccion2))
                        .addGap(13, 13, 13)
                        .addComponent(txtRangoFinalDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbldescripciondeduccion3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDescripcionDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldescripciondeduccion))
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarDeduccion)
                    .addComponent(btLimpiarDeduccion)
                    .addComponent(btnActualizarDeduccion)
                    .addComponent(btnEliminarDeduccion))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        txtValorDeduccion.getAccessibleContext().setAccessibleName("txtValorDeduccion");

        jpnconsultar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Consultar Deduccion"));

        btnConsultarDeduccion.setText("Consultar");
        btnConsultarDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarDeduccionActionPerformed(evt);
            }
        });

        txtConsultaDeduccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaDeduccionActionPerformed(evt);
            }
        });

        lblcomplemento1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcomplemento1.setText("Id Deduccion");

        javax.swing.GroupLayout jpnconsultarLayout = new javax.swing.GroupLayout(jpnconsultar);
        jpnconsultar.setLayout(jpnconsultarLayout);
        jpnconsultarLayout.setHorizontalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblcomplemento1)
                .addGap(18, 18, 18)
                .addComponent(txtConsultaDeduccion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConsultarDeduccion)
                .addContainerGap())
        );
        jpnconsultarLayout.setVerticalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConsultarDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConsultaDeduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcomplemento1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 588, Short.MAX_VALUE)
                    .addComponent(jpnconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescripcionDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionDeduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionDeduccionActionPerformed

    private void btnGuardarDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDeduccionActionPerformed
        try{
        DeduccionController deduccion_crtl = new DeduccionController();
        Deduccion deduccion =new  Deduccion();
        String fecha = this.getFechaActual();
   
        deduccion.setNombre(txtNombreDeduccion.getText());
        deduccion.setDescripcion(txtDescripcionDeduccion.getText());
        double valor = Double.parseDouble(txtValorDeduccion.getText());
        deduccion.setValor(valor);
        double rango_inicial = Double.parseDouble(txtRangoInicialDeduccion.getText());
        deduccion.setRango_inicial(rango_inicial);
        double rango_final = Double.parseDouble(txtRangoFinalDeduccion.getText());
        deduccion.setRango_final(rango_final);
        deduccion.setEstado(1);
        deduccion.setFecha_registro(fecha);
        deduccion_crtl.actualizar(deduccion);
        refrescarTabla();
        limpirCampos();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución: " +e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarDeduccionActionPerformed

    private void btnConsultarDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarDeduccionActionPerformed
      try { 
           int con = Integer.parseInt(txtConsultaDeduccion.getText());   
            JOptionPane.showMessageDialog(null, "Usted esta consultando al usuario con ID: "+con);
            DeduccionController deduccion_crtl =new  DeduccionController(); 
            Deduccion deduccion= new Deduccion();
            deduccion = deduccion_crtl.consultar(con);
            if(deduccion != null){
                JOptionPane.showMessageDialog(null, deduccion.toString());
            }else{
                JOptionPane.showMessageDialog(null, "Deduccion no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución "+e.getMessage());
        }
        txtConsultaDeduccion.setText("");
    }//GEN-LAST:event_btnConsultarDeduccionActionPerformed

    private void txtConsultaDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaDeduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaDeduccionActionPerformed

    private void btnEliminarDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDeduccionActionPerformed
       try {
            DeduccionController deduccion_crtl = new DeduccionController();
            Deduccion deduccion =new  Deduccion();
            int id = Integer.parseInt(txtIdDeduccion.getText());
            deduccion.setEstado(2);
            deduccion.setId(id);
            deduccion_crtl.eliminar(deduccion);
            refrescarTabla();
            limpirCampos();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución: " +e.getMessage());
        }
    }//GEN-LAST:event_btnEliminarDeduccionActionPerformed

    private void tbdeduccionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbdeduccionMouseClicked
        btnActualizarDeduccion.setEnabled(true);
        btnEliminarDeduccion.setEnabled(true);
        // con esto traemos la posicion de los datos de la fila a la que le demos click
        //{"ID Deducciones","Nombre", "%", "Inicial", "Final","Descripcion"};
        int seleccion = tbdeduccion.rowAtPoint(evt.getPoint());
        txtIdDeduccion.setText(String.valueOf(tbdeduccion.getValueAt(seleccion,0)));
        txtNombreDeduccion.setText(String.valueOf(tbdeduccion.getValueAt(seleccion,1)));
        txtValorDeduccion.setText(String.valueOf(tbdeduccion.getValueAt(seleccion, 2)));
        txtRangoInicialDeduccion.setText(String.valueOf(tbdeduccion.getValueAt(seleccion, 3)));
        txtRangoFinalDeduccion.setText(String.valueOf(tbdeduccion.getValueAt(seleccion, 4)));
        txtDescripcionDeduccion.setText(String.valueOf(tbdeduccion.getValueAt(seleccion, 5)));
    }//GEN-LAST:event_tbdeduccionMouseClicked

    private void btnActualizarDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarDeduccionActionPerformed
        try {
            DeduccionController deduccion_crtl = new DeduccionController();
            Deduccion deduccion =new  Deduccion();
            int id = Integer.parseInt(txtIdDeduccion.getText());
            deduccion.setNombre(txtNombreDeduccion.getText());
            deduccion.setDescripcion(txtDescripcionDeduccion.getText());
            double valor = Double.parseDouble(txtValorDeduccion.getText());
            deduccion.setValor(valor);
            double rango_inicial = Double.parseDouble(txtRangoInicialDeduccion.getText());
            deduccion.setRango_inicial(rango_inicial);
            double rango_final = Double.parseDouble(txtRangoFinalDeduccion.getText());
            deduccion.setRango_final(rango_final);
            deduccion.setId(id);
            deduccion_crtl.actualizar(deduccion);
            refrescarTabla();
            limpirCampos();
        } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución: " +e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarDeduccionActionPerformed

    private void txtValorDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorDeduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorDeduccionActionPerformed

    private void btLimpiarDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLimpiarDeduccionActionPerformed
                // TODO add your handling code here:
        txtIdDeduccion.setText("");
        txtNombreDeduccion.setText("");
        txtDescripcionDeduccion.setText("");
        txtValorDeduccion.setText("");
        txtRangoInicialDeduccion.setText("");
        txtRangoFinalDeduccion.setText("");
    }//GEN-LAST:event_btLimpiarDeduccionActionPerformed

    private void txtRangoFinalDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRangoFinalDeduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRangoFinalDeduccionActionPerformed

    private void txtRangoInicialDeduccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRangoInicialDeduccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRangoInicialDeduccionActionPerformed

     //Meotodo que devuelve la hora actual
     public String getFechaActual(){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
    }
    
     public void limpirCampos(){
         txtIdDeduccion.setText("");
         txtNombreDeduccion.setText("");
         txtDescripcionDeduccion.setText("");
         txtValorDeduccion.setText("");
         txtRangoInicialDeduccion.setText("");
         txtRangoFinalDeduccion.setText("");
     }
     
        //En este metodo listamos todos datos que traemos de la tabla empleados de la bade datos, en el JTable. 
    public void refrescarTabla(){
        try{
            //Limpiamos la tabla
            limpiarTabla();
            //Creamos un objeto de tipo empleadoController
           DeduccionController deduccion_crtl = new DeduccionController();
            /*Creamos un arrayList tipo empleado, para pasarle la lista de objetos que nos traera el metodo listar,
            de la clase empeladoController*/
            List< Deduccion>  deducciones = deduccion_crtl.listar();
            //Se crea un objeto de tipo iterator,nosdevuelve un iterador sobre los elementos de esta lista en la secuencia adecuada.
            Iterator iter = deducciones.iterator();
            //Creamos un objeto de tipo DefaultTableModel, esto nos ayuda a crear las filas y las columnas de nuestra tabla
            DefaultTableModel dtmdeducciones = new DefaultTableModel();
            //Con esta linea de codigo, establecemos los titulos o la cabecera de la tabla
            String[] colCategoria = {"ID Deducciones","Nombre", "%", "Inicial", "Final","Descripcion"};
            //aqui creamos la columna antes establecida
            dtmdeducciones.setColumnIdentifiers(colCategoria);
            //Creamos un vector de tipo objeto, al cual le pasamos el objeto, tipo DefaultTableModel con el metodo .getColumnCount()
            Object[] fila = new Object[dtmdeducciones.getColumnCount()];
          //Con el este while recorremos el vector y mostraremos los datos, el metodo hasNext nos mostrar hasta el ultimo
            while (iter.hasNext()){  
           //Cremos un objeto tipo empledo y se lo asignamos al iteador, para traer los valores con iter.next()
                Deduccion deduccion=new Deduccion();
                //Hacemos un casteao de tipo categoria a iter.next(), para que nos devuelva un arreglo de tipo categorias
                deduccion = (Deduccion) iter.next();
                //Capturamos los datos datos
                fila[0] = deduccion.getId();
                fila[1] = deduccion.getNombre();
                fila[2] = deduccion.getValor();
                fila[3] = deduccion.getRango_inicial();
                fila[4] = deduccion.getRango_final();
                fila[5] = deduccion.getDescripcion();
                //Se crean las filas
                dtmdeducciones.addRow(fila);
        }
        //Mostramos los datos en la tbala
        tbdeduccion.setModel(dtmdeducciones);
        }catch(Exception e){
            //Por si ocurre un error mostrar el mensaje y que nos diga donde esta el error
            JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución: "+e.getMessage());
        }
    
    }
    
     public void limpiarTabla(){
        DefaultTableModel tb = (DefaultTableModel) tbdeduccion.getModel();
        int a = tbdeduccion.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        } 
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
            java.util.logging.Logger.getLogger(DeduccionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeduccionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeduccionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeduccionVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DeduccionVista dialog = new DeduccionVista(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btLimpiarDeduccion;
    private javax.swing.JButton btnActualizarDeduccion;
    private javax.swing.JButton btnConsultarDeduccion;
    private javax.swing.JButton btnEliminarDeduccion;
    private javax.swing.JButton btnGuardarDeduccion;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnconsultar;
    private javax.swing.JLabel lblcategoria;
    private javax.swing.JLabel lblcomplemento1;
    private javax.swing.JLabel lbldescripciondeduccion;
    private javax.swing.JLabel lbldescripciondeduccion1;
    private javax.swing.JLabel lbldescripciondeduccion2;
    private javax.swing.JLabel lbldescripciondeduccion3;
    private javax.swing.JLabel lbliddeduccion;
    private javax.swing.JLabel lblnombrededuccion;
    private javax.swing.JTable tbdeduccion;
    private javax.swing.JTextField txtConsultaDeduccion;
    private javax.swing.JTextField txtDescripcionDeduccion;
    private javax.swing.JTextField txtIdDeduccion;
    private javax.swing.JTextField txtNombreDeduccion;
    private javax.swing.JTextField txtRangoFinalDeduccion;
    private javax.swing.JTextField txtRangoInicialDeduccion;
    private javax.swing.JTextField txtValorDeduccion;
    // End of variables declaration//GEN-END:variables
}
