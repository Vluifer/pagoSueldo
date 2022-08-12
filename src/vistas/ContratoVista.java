
package vistas;

import controllers.CategoriaController;
import controllers.ComplementoController;
import controllers.ContratoController;
import controllers.EmpleadoController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Categoria;
import models.Complemento;
import models.Contrato;
import models.Empleado;

public class ContratoVista extends javax.swing.JDialog {

    public ContratoVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //llamamos el metodo refrescar tabla
        this.refrescarTabla();
        //llamamos los metodo con los que se llenan los comboBox
        this.llenarCbxEmpleados();
        this.llenarCbxCategorias();
        this.llenarCbxComplementos();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        lblContrato = new javax.swing.JLabel();
        lblIngresarDatos = new javax.swing.JLabel();
        lblIdContrato = new javax.swing.JLabel();
        lblFechaA = new javax.swing.JLabel();
        txtIdContrato = new javax.swing.JTextField();
        txtFechaAlta = new javax.swing.JTextField();
        txtFechaBaja = new javax.swing.JTextField();
        lblCategoria = new javax.swing.JLabel();
        lblComplementos = new javax.swing.JLabel();
        lblFechab = new javax.swing.JLabel();
        lblComplementos2 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblDniEmpleado = new javax.swing.JLabel();
        btnEliminaContrato = new javax.swing.JButton();
        cbxIdiEmpleadocontrato = new javax.swing.JComboBox<>();
        cbxIdcategoriaContrato = new javax.swing.JComboBox<>();
        cbxIdComplementosContrato = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDniconsultaiEmpleadoContrato = new javax.swing.JTextField();
        btnConsultarContrato = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbContrato = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        jPanel3.setForeground(new java.awt.Color(153, 153, 153));
        jPanel3.setName("Contrato"); // NOI18N

        lblContrato.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        lblContrato.setText("CONTRATO");

        lblIngresarDatos.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        lblIngresarDatos.setText("Ingresar datos de contrato");

        lblIdContrato.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblIdContrato.setText("ID contrato:");

        lblFechaA.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblFechaA.setText("Fecha de alta (YYYY-MM-DD):");

        txtIdContrato.setEnabled(false);
        txtIdContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdContratoActionPerformed(evt);
            }
        });

        txtFechaAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaAltaActionPerformed(evt);
            }
        });

        lblCategoria.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblCategoria.setText("Categoria:");

        lblComplementos.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblComplementos.setText("Complementos:");

        lblFechab.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblFechab.setText("Fecha de baja (YYYY-MM-DD):");

        lblComplementos2.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblDniEmpleado.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        lblDniEmpleado.setText("Empleado:");

        btnEliminaContrato.setText("Elimnar");
        btnEliminaContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminaContratoActionPerformed(evt);
            }
        });

        cbxIdComplementosContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxIdComplementosContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(18, 18, 18)
                .addComponent(btnLimpiar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnActualizar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminaContrato)
                .addGap(36, 36, 36))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblComplementos2)
                            .addComponent(lblIdContrato)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFechaA)
                                    .addComponent(lblFechab))
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtFechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(txtFechaBaja)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblComplementos)
                                    .addComponent(lblCategoria)
                                    .addComponent(lblDniEmpleado))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtIdContrato)
                                    .addComponent(cbxIdiEmpleadocontrato, 0, 240, Short.MAX_VALUE)
                                    .addComponent(cbxIdcategoriaContrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbxIdComplementosContrato, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(lblContrato))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(lblIngresarDatos)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblContrato)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(lblIngresarDatos)
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdContrato))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDniEmpleado)
                    .addComponent(cbxIdiEmpleadocontrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCategoria)
                    .addComponent(cbxIdcategoriaContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblComplementos)
                    .addComponent(cbxIdComplementosContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaA)
                    .addComponent(txtFechaAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechab)
                    .addComponent(txtFechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(lblComplementos2)
                .addGap(32, 32, 32)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnActualizar)
                    .addComponent(btnEliminaContrato))
                .addGap(40, 40, 40))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Contrato"));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setText("Consultar contrato ");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));

        jLabel2.setFont(new java.awt.Font("DejaVu Sans", 0, 14)); // NOI18N
        jLabel2.setText("ID Contrato:");

        btnConsultarContrato.setText("Consultar");
        btnConsultarContrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarContratoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txtDniconsultaiEmpleadoContrato)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtDniconsultaiEmpleadoContrato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultarContrato))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        tbContrato.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tbContrato.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbContrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbContratoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbContrato);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

     public void llenarCbxComplementos(){
         //Se crea obejeto de tipo ComplementoController
      ComplementoController complemento_crtl=new ComplementoController();
      /*Creamos un arrayList tipo Complemento, para pasarle la lista de objetos que nos traera el metodo listar,
            de la clase ComplementoController*/
       List<Complemento> complementos = complemento_crtl.listar();
        //Se crea un objeto de tipo iterator, nos devuelve un iterador sobre los elementos de esta lista en la secuencia adecuada.
        Iterator iter = complementos.iterator();
        //agregamos un item al combobox por defecto.
        cbxIdComplementosContrato.addItem("Seleccione Opción");
        //Con este while recorremos el vector y mostraremos los datos, el metodo hasNext nos mostrar hasta el ultimo
            while (iter.hasNext()){  
          //Cremos un objeto tipo Complemento y se lo asignamos al iteador, para traer los valores con iter.next()
                Complemento complemento = new Complemento();
                complemento = (Complemento) iter.next();
            //Asigmos a una variable tipo String los campos que queremos mostrar los concatenamos y los separamos con un guion
                String texto = complemento.getId()+" - "+complemento.getNombre();
             //Le agregamos el comboBox los datos obetenidos en la varibale texto   
                cbxIdComplementosContrato.addItem(texto);
            }
            //nos devuelve el comboBox asu estado inicial que en este caso seria "Seleccione Opcion"
             cbxIdComplementosContrato.setSelectedIndex(0);
        }
     
     
     public void llenarCbxCategorias(){
      CategoriaController categoria_crtl=new CategoriaController();
      
       List<Categoria> categorias = categoria_crtl.listar();
        Iterator iter = categorias.iterator();
        cbxIdcategoriaContrato.addItem("Seleccione Opción");
            while (iter.hasNext()){  
                Categoria categoria = new Categoria();
                categoria = (Categoria) iter.next();
                String texto = categoria.getId()+" - "+categoria.getPuesto_destino() ;
                cbxIdcategoriaContrato.addItem(texto);
            }
             cbxIdcategoriaContrato.setSelectedIndex(0);
        }
     
     public void llenarCbxEmpleados(){
      EmpleadoController empleado_crtl=new EmpleadoController();
      
       List<Empleado> empleados = empleado_crtl.listar();
        Iterator iter = empleados.iterator();
        cbxIdiEmpleadocontrato.addItem("Seleccione Opción");
            while (iter.hasNext()){  
                Empleado empleado = new Empleado();
                empleado = (Empleado) iter.next();
                String texto = empleado.getId()+" - "+empleado.getApellidos()+" "+ empleado.getNombres();
                cbxIdiEmpleadocontrato.addItem(texto);
            }
             cbxIdiEmpleadocontrato.setSelectedIndex(0);
    }
    
   
    private void txtIdContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdContratoActionPerformed

    private void txtFechaAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaAltaActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        try{
             //Creamos objetos del paquete models de las clases que muestran aqui
            Categoria categoria = new Categoria();
            Empleado empleado =new Empleado();
            Complemento complemento =new Complemento();
            Contrato contrato = new Contrato();
            //Creamos obejtos del paquete controller de las clases que se muestran aqui 
            ContratoController contrato_ctrl = new ContratoController();
            CategoriaController categoria_ctrl = new CategoriaController();
            EmpleadoController empleado_ctrl=new EmpleadoController();
            ComplementoController complemento_ctrl = new ComplementoController();
            /*Creamos una variable de tipo int, para casterar lo que nos ingresen por el ComboBox,ya que lo queremos insertar es un valor tipo intero,con el metodo getSelectedItem(), 
            traemos o seleccionamos el registro o valor a obtener mediante el set, como cargamos una lista de empleados en este caso, el valor seleccionado, debemos pasarlo a tipo cadena y eso lo hacemos
            Con el metodo toString(), luego que lo tenemos en tipo cadena utlizamos el metodo llamado split() que separa los caracteres 
            mediante una expresion regular en este caso "-" y con "[0]" indicamos que nos devuelva la primera posicion de vector*/
            int idEmpleado = Integer.parseInt(cbxIdiEmpleadocontrato.getSelectedItem().toString().split(" - ")[0]);
            /*Creamos un objeto de tipo empleado que contendra un objeto de tipo empleado controler, del cual usaremos el metodo consultar
             al que le pasaremos la variable tipo int anteriormente preparada, y esto nos traera una seria de datos */
            empleado = empleado_ctrl.consultar(idEmpleado);

            int idCategoria = Integer.parseInt(cbxIdcategoriaContrato.getSelectedItem().toString().split(" - ")[0]);
            categoria = categoria_ctrl.consultar(idCategoria);

            int idComplemento = Integer.parseInt(cbxIdComplementosContrato.getSelectedItem().toString().split(" - ")[0]);
            complemento = complemento_ctrl.consultar(idComplemento);
            //Creamos dos variables tipo String a las que le asignaremos los valores ingresados por los JtextField
            String fecha_alta = txtFechaAlta.getText();
            String fecha_baja = txtFechaBaja.getText();
            //Se crea una variable tipo String y le asiganamos el metodo getFechaActual(), que nos devolvera en tipo String
            String fecha = this.getFechaActual();
            //creamos una variable tipo int llamada estado y le asiganamos el valor de 1
            int estado = 1;
            /* Al objeto de tipo contrato, le pasamos el metodo setEmpleado al que hay que pasarle como parametro un objeto de tipo empleado
            el cual ya habiamos preparado con anterioridad que nosdevolvera un valor que sacaremos del metodo que nos devuelve una consulta que esta la clase empeladoControler
            En este caso el id, nombre y appelido, pero solo pasaremos por el set el valor del id*/
            contrato.setEmpleado(empleado);
            contrato.setCategoria(categoria);
            contrato.setComplemento(complemento);
            //pasamos mediante el set, lo que nos devuelva esta variable, que contiene JtextField
            contrato.setFecha_alta(fecha_alta);
            contrato.setFecha_baja(fecha_baja);
            //Pasamos el valor que hemos establecido en la variable estado
            contrato.setEstado(estado);
            contrato.setFecha_registro(fecha);
            /*El objeto contrato controler, madiante el metodo actualizar, envia un objeto de tipo
            empleado con la informacion antes obtenida por los getter para que se realice la accion que se quiere*/
            contrato_ctrl.actualizar(contrato);
            //metodo que nos actualiza la tabla cada vez que insertamos un nuevo empleado
            refrescarTabla();
           //limpia los campos luego que se genera la accion.
            limpiarCampos();
        }catch(Exception e){
           //capturamos cualquier error que pueda ocurrir al momento que se este ejecutando el programa
            JOptionPane.showMessageDialog(null, "Error en el tiempo de ejecucion vista" +e.getMessage());
    }//GEN-LAST:event_btnGuardarActionPerformed
}
    
    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {
            ContratoController contrato_ctrl = new ContratoController();
            Contrato contrato = new Contrato();
            int idContrato = Integer.parseInt(txtIdContrato.getText());
            contrato.setFecha_alta(txtFechaAlta.getText());
            contrato.setFecha_baja(txtFechaBaja.getText());
            contrato.setId(idContrato);
            contrato_ctrl.actualizar(contrato);
            refrescarTabla();
            limpiarCampos();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en el tiempo de ejecucion" +e.getMessage());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminaContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminaContratoActionPerformed
        ContratoController contrato_ctrl = new ContratoController();
        Contrato contrato = new Contrato();
        int id= Integer.parseInt(txtIdContrato.getText());
        contrato.setEstado(2);
        contrato.setId(id);
        contrato_ctrl.eliminar(contrato);
        refrescarTabla();
        limpiarCampos();       
    }//GEN-LAST:event_btnEliminaContratoActionPerformed

    private void cbxIdComplementosContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxIdComplementosContratoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxIdComplementosContratoActionPerformed

    private void btnConsultarContratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarContratoActionPerformed

        try {
            int id = Integer.parseInt(txtDniconsultaiEmpleadoContrato.getText());
            JOptionPane.showMessageDialog(null, "Usted esta consultando su contrato por codigo: "+id);
            ContratoController contrato_ctrl = new ContratoController();
            Contrato contrato = new Contrato();
            contrato = contrato_ctrl.consultar("id", id);
            if(contrato != null){
                 JOptionPane.showMessageDialog(null, contrato.toString());
            }else{
                JOptionPane.showMessageDialog(null, "Empleado no existe");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución "+e.getMessage());
        }
        txtDniconsultaiEmpleadoContrato.setText("");
    }//GEN-LAST:event_btnConsultarContratoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
       txtIdContrato.setText("");
       cbxIdiEmpleadocontrato.setSelectedIndex(0);
       cbxIdcategoriaContrato.setSelectedIndex(0);
       cbxIdComplementosContrato.setSelectedIndex(0);
       txtFechaAlta.setText("");
       txtFechaBaja.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void tbContratoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbContratoMouseClicked
      int seleccion = tbContrato.rowAtPoint(evt.getPoint());
        txtIdContrato.setText(String.valueOf(tbContrato.getValueAt(seleccion,0)));
        cbxIdiEmpleadocontrato.setSelectedIndex(1);
        cbxIdcategoriaContrato.setSelectedIndex(2);
        cbxIdComplementosContrato.setSelectedIndex(3);
        txtFechaAlta.setText(String.valueOf(tbContrato.getValueAt(seleccion,4)));
        txtFechaBaja.setText(String.valueOf(tbContrato.getValueAt(seleccion, 5)));     
    }//GEN-LAST:event_tbContratoMouseClicked
        
     public void limpiarTabla() {
        DefaultTableModel tb = (DefaultTableModel) tbContrato.getModel();
        int a = tbContrato.getRowCount() - 1;
        for (int i = a; i >= 0; i--) {
            tb.removeRow(tb.getRowCount() - 1);
        }
    }
   //En este metodo listamos todos datos que traemos de la tabla contratos de la bade datos, en el JTable.
    public void refrescarTabla(){
       
        try{
            //llamamos al metodo Limpiar tabla
            limpiarTabla();
             //Creamos un objeto de tipo ContratoController
            ContratoController contrato_crtl =new  ContratoController(); 
            /*Creamos un arrayList tipo Contrato, para pasarle la lista de objetos que nos traera el metodo listar,
            de la claseContratoController*/
            List<Contrato> contratos = contrato_crtl.listar();
            //Se crea un objeto de tipo iterator,nosdevuelve un iterador sobre los elementos de esta lista en la secuencia adecuada.
            Iterator iter = contratos.iterator();
            //Crreamos un objeto de tipo DefaultTableModel, esto nos ayuda a crear las filas y las columnas de nuestra tabla
            DefaultTableModel dtmContratos = new DefaultTableModel();
            //Con esta lienea de codigo, establecemos los titulos o la cebecera de la tabla
            String[] colContratos = {"ID Contrato","Empleado","Categoria", "Complementos", "Fecha Alta", "Fecha Baja"};
            //aqui creamos la columna antes establecida
            dtmContratos.setColumnIdentifiers(colContratos);
            //Creamos un vector de tipo objeto, al cual le pasamos el objeto, tipo DefaultTableModel con el metodo .getColumnCount()
            Object[] fila = new Object[dtmContratos.getColumnCount()];
             //Con este while recorremos el iterador y mostraremos los datos, el metodo hasNext nos mostrar hasta el ultimo
            while (iter.hasNext()){
            //Cremos un objeto tipo Contrato y se lo asignamos al iteador, para traer los valores con iter.next()
                Contrato contrato = new Contrato();
               //Hacemos un casteao de iter.next() a Contrato , para que nos devuelva un arreglo de tipo Contratos
                contrato = (Contrato) iter.next();
                //Mostramos datos
                fila[0] = contrato.getId();
                //en este caso en particular, mosgtraremos el dni, del empleado.
                fila[1] = contrato.getEmpleado().getDni();
                fila[2] = contrato.getCategoria().getNombre().toUpperCase();
                //validamos de que el campo no este vacio.
                if(contrato != null ){
                fila[3] = contrato.getComplemento().getNombre();
                }else{
                //Si esta vacio sera igual a lo que esta entre comillas.
                    fila[3] = "N/A";
                }
                fila[4] = contrato.getFecha_alta();
                fila[5] = contrato.getFecha_baja();   
                //Se crean las filas
                dtmContratos.addRow(fila);
        }
           //Mostramos los datos en la tbala
        tbContrato.setModel(dtmContratos);
        }catch(Exception e){
             //Por si ocurre un error mostrar el mensaje y que nos diga donde esta el error
            JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución: "+e.getMessage());
        }
    }
     //Meotodo que devuelve la hora actual en string
      public String getFechaActual(){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
        }
    
    public void limpiarCampos(){
       txtIdContrato.setText("");
       cbxIdiEmpleadocontrato.setSelectedIndex(0);
       cbxIdcategoriaContrato.setSelectedIndex(0);
       cbxIdComplementosContrato.setSelectedIndex(0);
       txtFechaAlta.setText("");
       txtFechaBaja.setText("");
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ContratoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContratoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContratoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContratoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ContratoVista dialog = new ContratoVista(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnConsultarContrato;
    private javax.swing.JButton btnEliminaContrato;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<String> cbxIdComplementosContrato;
    private javax.swing.JComboBox<String> cbxIdcategoriaContrato;
    private javax.swing.JComboBox<String> cbxIdiEmpleadocontrato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCategoria;
    private javax.swing.JLabel lblComplementos;
    private javax.swing.JLabel lblComplementos2;
    private javax.swing.JLabel lblContrato;
    private javax.swing.JLabel lblDniEmpleado;
    private javax.swing.JLabel lblFechaA;
    private javax.swing.JLabel lblFechab;
    private javax.swing.JLabel lblIdContrato;
    private javax.swing.JLabel lblIngresarDatos;
    private javax.swing.JTable tbContrato;
    private javax.swing.JTextField txtDniconsultaiEmpleadoContrato;
    private javax.swing.JTextField txtFechaAlta;
    private javax.swing.JTextField txtFechaBaja;
    private javax.swing.JTextField txtIdContrato;
    // End of variables declaration//GEN-END:variables
}
