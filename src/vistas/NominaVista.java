package vistas;

import controllers.ContratoController;
import controllers.DeduccionController;
import controllers.DetalleNominaEmpleadoController;
import controllers.EmpleadoController;
import controllers.NominaController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import models.Complemento;
import models.Contrato;
import models.Deduccion;
import models.DetalleNominaEmpleado;
import models.Empleado;
import models.Nomina;

/**
 *
 * @author LuiferV
 */
public class NominaVista extends javax.swing.JDialog {

    /**
     * Creates new form NominaVista
     */
    public NominaVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.refrescarTabla();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbNomina = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtCorteInicioNomina = new javax.swing.JTextField();
        txtCorteFinNomina = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtResponsableNomina = new javax.swing.JTextField();
        btnGenerarNomina1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtDniEmpleadoNomina = new javax.swing.JTextField();
        LiquidarPago = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFechaInicioNomina = new javax.swing.JTextField();
        txtFechaFinNomina = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Nomina "));
        jPanel1.setMaximumSize(new java.awt.Dimension(853, 423));

        jLabel1.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        jLabel1.setText("NOMINA GENERAL DE EMPLEADOS");

        tbNomina.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        tbNomina.setModel(new javax.swing.table.DefaultTableModel(
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
        tbNomina.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNominaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbNomina);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro Nomina"));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Corte Inicio (aaaa-mm-dd)");

        txtCorteInicioNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorteInicioNominaActionPerformed(evt);
            }
        });

        txtCorteFinNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorteFinNominaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Corte Fin (aaaa-mm-dd)");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Responsable");

        btnGenerarNomina1.setText("Generar Nomina");
        btnGenerarNomina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarNomina1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtCorteInicioNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCorteFinNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txtResponsableNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGenerarNomina1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorteInicioNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorteFinNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtResponsableNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnGenerarNomina1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Liquidar Pago Empleado"));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Dni empleado");

        LiquidarPago.setText("LiquidarPago");
        LiquidarPago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LiquidarPagoActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Fecha Inicio (aaaa-mm-dd)");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Fecha Fin (aaaa-mm-dd)");

        txtFechaInicioNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaInicioNominaActionPerformed(evt);
            }
        });

        txtFechaFinNomina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaFinNominaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtFechaInicioNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFechaFinNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtDniEmpleadoNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LiquidarPago)))
                .addGap(24, 24, 24))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LiquidarPago, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDniEmpleadoNomina, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaFinNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtFechaInicioNomina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        txtFechaInicioNomina.getAccessibleContext().setAccessibleName("txtFechaInicioNomina");
        txtFechaFinNomina.getAccessibleContext().setAccessibleName("txtFechaFinNomina");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LiquidarPagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LiquidarPagoActionPerformed
        try{
            //Consultar Empleado
            EmpleadoController e_ctrl = new EmpleadoController();
            String dni = txtDniEmpleadoNomina.getText();
            //Consultamos el empleado por Dni
            Empleado empleado = e_ctrl.consultarPorDNI(dni);
            //Mostramos los datos del empleado
            JOptionPane.showMessageDialog(null, empleado.toString());
            //Si el empleado existe entra en la siguiente cindicion
            if(empleado != null){
                //Consultar Deducciones
                //Instanciamos objetos de difentes clases
                Deduccion deduccion;
                Contrato contrato;
                Complemento complemento;
                //Se crea objeto de tipo DeduccionController
                DeduccionController d_ctrl = new DeduccionController();
                 /*Creamos un arrayList tipo Deduccion, para pasarle la lista de objetos que nos traera el metodo listar,
                 de la clase DeduccionController*/
                List<Deduccion> deducciones = d_ctrl.listar();
                //Consultar Contratos de empleado
                //se crea objeto de tipo ContratoController
                ContratoController c_trl = new ContratoController();
                /*Creamos un arrayList tipo Contrato, para pasarle la lista de objetos que nos traera el metodo listarEmpleado,
                 de la clase ContratoController, en este caso traeremos el id*/
                List<Contrato> contratos = c_trl.listarEmpleado("id_empleado", empleado.getId());
                //hacemos la impresion de la cantidad de contratos que tiene ese empleado
                JOptionPane.showMessageDialog(null, "Cantidad de contratos a liquidar: "+contratos.size());
                //Creamos una variable de tipo Iterador y le asiganamos los contratos al metodo iterator()
                Iterator iter = contratos.iterator();
                //Creacion de variables tipo String
                String puesto_destino, categoria, fecha_alta, nombre_deduccion, nombre_complemento= "";
                //Creacion de variables tipo double
                double salario, valor_complemento, valor_deduccion, porcentaje_deduccion = 0.0;
                 //Con este while recorremos el iterador y mostraremos los datos, el metodo hasNext nos mostrar hasta el ultimo
                while (iter.hasNext()){

                    contrato = (Contrato) iter.next();
                    //Consultar Categoria - Salario
                    //asignamos a las varias el valor que nos trae contrato.get
                    fecha_alta = contrato.getFecha_alta();
                    categoria = contrato.getCategoria().getNombre();
                    puesto_destino = contrato.getCategoria().getPuesto_destino();
                    salario = contrato.getCategoria().getSalario_base();
                    //Consultar Complementos
                    complemento = contrato.getComplemento();
                    nombre_complemento =  contrato.getComplemento().getNombre();
                    valor_complemento = contrato.getComplemento().getValor();

                   //Se crea objeto de la clase Nomina
                    Nomina nomina = new Nomina();
                    //Se crea objeto de la clase NominaController
                    NominaController n_ctrl = new NominaController();
                    /*Asignamos al objeto nomina la consulta traida por la clase NominaController, el metodo 
                    asignado a esta clase nos devuelve el ultimo valor insertado*/
                    nomina = n_ctrl.consultarUltimo();
                    //Creamos dos variables tipo String, a las que les asignaremos los valores ingresados, por los JtextField
                    String fecha_ini = txtFechaInicioNomina.getText();
                    String fecha_fin = txtFechaFinNomina.getText();
                   /*Creamos una variable double llamada cantadidad_dias, le asinaremos el metodo diferencia de dias
                   de tipo doble, el cual requiere dos parametros de tipo String*/
                    double cantidad_dias = this.DiferenciaFechas(fecha_ini, fecha_fin);
                    //validamos que la cantidad de dias sena mayor que cero rn caso que lo sea, se hara lo que esta dentro de la condicion
                    if(cantidad_dias > 0){
                        
                         //LIDACIÓN DIAS TRABAJADOS
                        double valor_dia = salario / 30;
                        double salario_laborado = valor_dia * cantidad_dias;
                        DetalleNominaEmpleado dne = new DetalleNominaEmpleado();
                        DetalleNominaEmpleadoController dne_ctrl = new DetalleNominaEmpleadoController();
                        dne.setEmpleado(empleado);
                        dne.setEstado(1);
                        dne.setConcepto("SALARIO DEVENGADO");
                        dne.setFecha_registro(this.getFechaActual());
                        dne.setNomina(nomina);
                        dne.setValor(salario_laborado);
                        dne_ctrl.actualizar(dne);
                        
                        
                        //LIQUIDACIÓN TRIENIO - COMPLEMENTOS
                        
                        double dias_trienio = this.DiferenciaFechas(fecha_alta, fecha_fin);
                        double anios = dias_trienio/360;
                        if(anios % 3.0 == 0){
                            dne = new DetalleNominaEmpleado();
                            dne.setEmpleado(empleado);
                            dne.setEstado(1);
                            dne.setConcepto(nombre_complemento);
                            dne.setFecha_registro(this.getFechaActual());
                            dne.setNomina(nomina);
                            double trienio = salario* (valor_complemento/100);
                            dne.setValor(trienio);
                            dne_ctrl.actualizar(dne);          
                        }
                                
                        //LIQUIDANDO DEDUCCIONES
                        Iterator iter2 = deducciones.iterator();
                        int pos = 0;
                        while (iter2.hasNext()){
                            deduccion = (Deduccion) iter2.next();
                            porcentaje_deduccion = deduccion.getValor()/100;
                            nombre_deduccion =  deduccion.getNombre();
                            valor_deduccion = 0.0;
                            if(deduccion.getRango_inicial() > 0 && deduccion.getRango_final() > 0){
                                if(salario >= deduccion.getRango_inicial()  && salario <= deduccion.getRango_final() ){
                                    valor_deduccion = salario_laborado * porcentaje_deduccion*-1;
                                }
                            }else{
                                valor_deduccion = salario_laborado * porcentaje_deduccion*-1;
                            }
                            
                            if(valor_deduccion != 0){
                                JOptionPane.showMessageDialog(null, "Valor deducido CONCEPTO: "+nombre_deduccion+" ($ "+valor_deduccion+")");
                                dne = new DetalleNominaEmpleado();
                                dne.setEmpleado(empleado);
                                dne.setEstado(1);
                                dne.setConcepto(nombre_deduccion);
                                dne.setFecha_registro(this.getFechaActual());
                                dne.setNomina(nomina);
                                dne.setValor(valor_deduccion);
                                dne_ctrl.actualizar(dne);
                            }
                            pos++;
                        }
                        double sueldo_devengado = dne_ctrl.getSalarioDevengado(nomina.getId(), empleado.getId());
                        JOptionPane.showMessageDialog(null, "Se ha liquidado el pago del funcionario. \n"+empleado.toString()+"\n Salario Devengado : "+sueldo_devengado);
                        this.LimpiarCamposLiquidarPagos();
                    }else{
                        JOptionPane.showMessageDialog(null, "Existe una inconsistencia en el rango de fecha colocado");
                    }
                }
            }else{
                JOptionPane.showMessageDialog(null, "El empleado "+dni+" a consultar no existe ");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecucion " + e.getMessage());
        }
    }//GEN-LAST:event_LiquidarPagoActionPerformed

    //Este nos hace una resta emyte dos fechas y nos deveuelve un valotr tipo double
    public double DiferenciaFechas(String fecha_ini, String fecha_fin){
        double dias = 0;
        try{
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date fechaInicial=dateFormat.parse(fecha_ini);
            Date fechaFinal=dateFormat.parse(fecha_fin);
            dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al intentar evaluar fechas y liquidar nomina" + e.getMessage());
        }
        return dias;
    }
    
        //En este metodo listamos todos datos que traemos de la tabla empleados de la bade datos, en el JTable. 
    public void refrescarTabla(){
        try{
            //Limpiamos la tabla
            limpiarTabla();
            //Creamos un objeto de tipo empleadoController
            NominaController nomina_crtl =new  NominaController();
            /*Creamos un arrayList tipo empleado, para pasarle la lista de objetos que nos traera el metodo listar,
            de la clase empeladoController*/
            List<Nomina> nominas = nomina_crtl.listar();
            //Se crea un objeto de tipo iterator,nosdevuelve un iterador sobre los elementos de esta lista en la secuencia adecuada.
            Iterator iter = nominas.iterator();
            //Crreamos un objeto de tipo DefaultTableModel, esto nos ayuda a crear las filas y las columnas de nuestra tabla
            DefaultTableModel dtmNominas = new DefaultTableModel();
            //Con esta lienea de codigo, establecemos los titulos o la cebecera de la tabla
            String[] colNomina = {"ID","Corte Inicio", "Corte Fin", "Encargado", "Fecha Registro",};
            //aqui creamos la columna antes establecida
            dtmNominas.setColumnIdentifiers(colNomina);
            //Creamos un vector de tipo objeto, al cual le pasamos el objeto, tipo DefaultTableModel con el metodo .getColumnCount()
            Object[] fila = new Object[dtmNominas.getColumnCount()];
          //Con el este while recorremos el iterador y mostraremos los datos, el metodo hasNext nos mostrar hasta el ultimo
            while (iter.hasNext()){  
           //Cremos un objeto tipo empledo y se lo asignamos al iteador, para traer los valores con iter.next()
                Nomina nomina = new Nomina();
                nomina = (Nomina) iter.next();
                //Capturamos los datos datos
                fila[0] = nomina.getId();
                fila[1] = nomina.getFecha_ini();
                fila[2] = nomina.getFecha_fin();
                fila[3] = nomina.getEncargado();
                fila[4] = nomina.getFecha_registro();
                //Se crean las filas
                dtmNominas.addRow(fila);
        }
        //Mostramos los datos en la tbala
        tbNomina.setModel(dtmNominas);
        }catch(Exception e){
            //Por si ocurre un error mostrar el mensaje y que nos diga donde esta el error
            JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución: "+e.getMessage());
        }
    
    }
    
        //Este metodo limpiar la tabla cada vez inserte,actualice o elimine. 
     public void limpiarTabla(){
        DefaultTableModel tb = (DefaultTableModel) tbNomina.getModel();
        int a = tbNomina.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
    }
    
    private void txtCorteInicioNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorteInicioNominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorteInicioNominaActionPerformed

    private void tbNominaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNominaMouseClicked

        // con esto traemos la posicion  los datos de la fila a la que le demos click
        int seleccion = tbNomina.rowAtPoint(evt.getPoint());
        txtFechaInicioNomina.setText(String.valueOf(tbNomina.getValueAt(seleccion,1)));
        txtFechaFinNomina.setText(String.valueOf(tbNomina.getValueAt(seleccion,2)));


    }//GEN-LAST:event_tbNominaMouseClicked

    private void txtCorteFinNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorteFinNominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorteFinNominaActionPerformed

    private void btnGenerarNomina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarNomina1ActionPerformed
        // TODO add your handling code here:
        try{
                //Registrar Nomina
              
                double cantidad_dias = this.DiferenciaFechas(txtCorteInicioNomina.getText(), txtCorteFinNomina.getText());
                if(cantidad_dias > 0){
                    Nomina n = new Nomina();
                    NominaController n_ctrl = new NominaController();
                    n.setFecha_ini(txtCorteInicioNomina.getText());
                    n.setFecha_fin(txtCorteFinNomina.getText());
                    n.setEncargado(txtResponsableNomina.getText());
                    n.setFecha_registro(this.getFechaActual());
                    n.setEstado(1);
                    n_ctrl.actualizar(n);
                    this.LimpiarCamposNomina();
                }else{
                    JOptionPane.showMessageDialog(null, "Existe una inconsistencia en el rango de fecha colocado");
                 }
                
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecucion " + e.getMessage());
        }
    }//GEN-LAST:event_btnGenerarNomina1ActionPerformed

    private void txtFechaInicioNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaInicioNominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaInicioNominaActionPerformed

    private void txtFechaFinNominaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaFinNominaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaFinNominaActionPerformed

    public void LimpiarCamposNomina(){
        txtCorteInicioNomina.setText("");
        txtCorteFinNomina.setText("");
        txtResponsableNomina.setText("");
    }
    
    public void LimpiarCamposLiquidarPagos(){
        txtFechaInicioNomina.setText("");
        txtFechaFinNomina.setText("");
        txtDniEmpleadoNomina.setText("");
    }
   
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(NominaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NominaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NominaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NominaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NominaVista dialog = new NominaVista(new javax.swing.JFrame(), true);
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
    
      public String getFechaActual(){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LiquidarPago;
    private javax.swing.JButton btnGenerarNomina1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbNomina;
    private javax.swing.JTextField txtCorteFinNomina;
    private javax.swing.JTextField txtCorteInicioNomina;
    private javax.swing.JTextField txtDniEmpleadoNomina;
    private javax.swing.JTextField txtFechaFinNomina;
    private javax.swing.JTextField txtFechaInicioNomina;
    private javax.swing.JTextField txtResponsableNomina;
    // End of variables declaration//GEN-END:variables
}
