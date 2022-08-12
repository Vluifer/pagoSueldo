
package vistas;
import controllers.EmpleadoController;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import models.Empleado;
import models.Conexion;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import models.Categoria;


public final class EmpleadoVista extends javax.swing.JDialog {

    public EmpleadoVista(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
      
        this.refrescarTabla();
        btnactualizar.setEnabled(false);
        btneliminar.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jlempleado1 = new javax.swing.JLabel();
        jlbdni2 = new javax.swing.JLabel();
        jlbnombre1 = new javax.swing.JLabel();
        jlbdireccion1 = new javax.swing.JLabel();
        jlbapellido1 = new javax.swing.JLabel();
        jlbtelefono1 = new javax.swing.JLabel();
        jlbdni3 = new javax.swing.JLabel();
        jtfnombre1 = new javax.swing.JTextField();
        jtfcodempleado1 = new javax.swing.JTextField();
        jtfdireccion1 = new javax.swing.JTextField();
        jtftelefono1 = new javax.swing.JTextField();
        jtfapellido1 = new javax.swing.JTextField();
        jtfdni1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jDialog2 = new javax.swing.JDialog();
        jlempleado2 = new javax.swing.JLabel();
        jlbdni4 = new javax.swing.JLabel();
        jlbnombre2 = new javax.swing.JLabel();
        jlbdireccion2 = new javax.swing.JLabel();
        jlbapellido2 = new javax.swing.JLabel();
        jlbtelefono2 = new javax.swing.JLabel();
        jlbdni5 = new javax.swing.JLabel();
        jtfnombre2 = new javax.swing.JTextField();
        jtfcodempleado2 = new javax.swing.JTextField();
        jtfdireccion2 = new javax.swing.JTextField();
        jtftelefono2 = new javax.swing.JTextField();
        jtfapellido2 = new javax.swing.JTextField();
        jtfdni2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jlempleado = new javax.swing.JLabel();
        lblcodempleado = new javax.swing.JLabel();
        txtidempleado = new javax.swing.JTextField();
        lbldni = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        lblnombre = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        lblapellido = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        lbltelefono = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        lbldireccion = new javax.swing.JLabel();
        txtDirreccion = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        btnlimpiar = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        lbldireccion1 = new javax.swing.JLabel();
        txtCuentaCorriente = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbempleado = new javax.swing.JTable();
        jpnconsultar = new javax.swing.JPanel();
        btnconsultar = new javax.swing.JButton();
        txtDniConsultar = new javax.swing.JTextField();
        lblcodempleado1 = new javax.swing.JLabel();

        jDialog1.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog1.setTitle("Empleados");
        jDialog1.setBackground(new java.awt.Color(214, 217, 223));
        jDialog1.setName("jdempleado"); // NOI18N

        jlempleado1.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jlempleado1.setText("Registro Empleados");

        jlbdni2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdni2.setText("Dni");

        jlbnombre1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbnombre1.setText("Nombres");

        jlbdireccion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdireccion1.setText("Dirección");

        jlbapellido1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbapellido1.setText("Apellidos");

        jlbtelefono1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbtelefono1.setText("Telefono");

        jlbdni3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdni3.setText("Cod empleado");

        jtfnombre1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnombre1ActionPerformed(evt);
            }
        });

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jlempleado1))
                    .addGroup(jDialog1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbdni2)
                                .addComponent(jlbdni3)
                                .addComponent(jlbdireccion1)
                                .addComponent(jlbnombre1)
                                .addComponent(jlbapellido1))
                            .addGroup(jDialog1Layout.createSequentialGroup()
                                .addComponent(jlbtelefono1)
                                .addGap(37, 37, 37)))
                        .addGap(22, 22, 22)
                        .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfcodempleado1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jtfdni1)
                            .addComponent(jtfnombre1)
                            .addComponent(jtfdireccion1)
                            .addComponent(jtftelefono1)
                            .addComponent(jtfapellido1))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlempleado1)
                .addGap(31, 31, 31)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdni3)
                    .addComponent(jtfcodempleado1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdni2)
                    .addComponent(jtfdni1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbnombre1)
                    .addComponent(jtfnombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfdireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbapellido1))
                .addGap(23, 23, 23)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtftelefono1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtelefono1))
                .addGap(18, 18, 18)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfapellido1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdireccion1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jDialog2.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        jDialog2.setTitle("Empleados");
        jDialog2.setBackground(new java.awt.Color(214, 217, 223));
        jDialog2.setName("jdempleado"); // NOI18N

        jlempleado2.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jlempleado2.setText("Registro Empleados");

        jlbdni4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdni4.setText("Dni");

        jlbnombre2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbnombre2.setText("Nombres");

        jlbdireccion2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdireccion2.setText("Dirección");

        jlbapellido2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbapellido2.setText("Apellidos");

        jlbtelefono2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbtelefono2.setText("Telefono");

        jlbdni5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jlbdni5.setText("Cod empleado");

        jtfnombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfnombre2ActionPerformed(evt);
            }
        });

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog2Layout = new javax.swing.GroupLayout(jDialog2.getContentPane());
        jDialog2.getContentPane().setLayout(jDialog2Layout);
        jDialog2Layout.setHorizontalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jlempleado2))
                    .addGroup(jDialog2Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlbdni4)
                                .addComponent(jlbdni5)
                                .addComponent(jlbdireccion2)
                                .addComponent(jlbnombre2)
                                .addComponent(jlbapellido2))
                            .addGroup(jDialog2Layout.createSequentialGroup()
                                .addComponent(jlbtelefono2)
                                .addGap(37, 37, 37)))
                        .addGap(22, 22, 22)
                        .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtfcodempleado2, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                            .addComponent(jtfdni2)
                            .addComponent(jtfnombre2)
                            .addComponent(jtfdireccion2)
                            .addComponent(jtftelefono2)
                            .addComponent(jtfapellido2))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDialog2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        jDialog2Layout.setVerticalGroup(
            jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jlempleado2)
                .addGap(31, 31, 31)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdni5)
                    .addComponent(jtfcodempleado2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbdni4)
                    .addComponent(jtfdni2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbnombre2)
                    .addComponent(jtfnombre2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfdireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbapellido2))
                .addGap(23, 23, 23)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtftelefono2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbtelefono2))
                .addGap(18, 18, 18)
                .addGroup(jDialog2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtfapellido2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlbdireccion2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados");
        setBackground(new java.awt.Color(214, 217, 223));
        setName("jdempleado"); // NOI18N
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)), "Registro"));

        jlempleado.setFont(new java.awt.Font("Calibri Light", 1, 24)); // NOI18N
        jlempleado.setText("Registro Empleados");

        lblcodempleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcodempleado.setText("Id empleado");

        txtidempleado.setEnabled(false);

        lbldni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldni.setText("Dni");

        lblnombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblnombre.setText("Nombres");

        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });

        lblapellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblapellido.setText("Apellidos");

        lbltelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltelefono.setText("Telefono");

        lbldireccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldireccion.setText("Dirección");

        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btnlimpiar.setText("Limpiar");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        btnactualizar.setText("Actualizar");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        btneliminar.setText("Eliminar");
        btneliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarActionPerformed(evt);
            }
        });

        lbldireccion1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbldireccion1.setText("Cuenta Corriente");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jlempleado))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnguardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnlimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btneliminar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcodempleado)
                            .addComponent(lbldni)
                            .addComponent(lblnombre)
                            .addComponent(lblapellido)
                            .addComponent(lbltelefono)
                            .addComponent(lbldireccion)
                            .addComponent(lbldireccion1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuentaCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnombres)
                                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDirreccion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jlempleado)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtidempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcodempleado))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbldni)
                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblnombre)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblapellido))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbltelefono))
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDirreccion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCuentaCorriente, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbldireccion1))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnguardar)
                    .addComponent(btnlimpiar)
                    .addComponent(btnactualizar)
                    .addComponent(btneliminar))
                .addContainerGap())
        );

        tbempleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Dni", "Nombres", "Apellidos", "Telefono", "Direccion"
            }
        ));
        tbempleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbempleadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbempleado);

        jpnconsultar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)), "Consultar registro"));

        btnconsultar.setText("Consultar");
        btnconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsultarActionPerformed(evt);
            }
        });

        txtDniConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDniConsultarActionPerformed(evt);
            }
        });

        lblcodempleado1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblcodempleado1.setText("Dni Empleado");

        javax.swing.GroupLayout jpnconsultarLayout = new javax.swing.GroupLayout(jpnconsultar);
        jpnconsultar.setLayout(jpnconsultarLayout);
        jpnconsultarLayout.setHorizontalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblcodempleado1, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDniConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnconsultar)
                .addContainerGap())
        );
        jpnconsultarLayout.setVerticalGroup(
            jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnconsultarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnconsultarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDniConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcodempleado1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 479, Short.MAX_VALUE)
                    .addComponent(jpnconsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnconsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfnombre1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnombre1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnombre1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jtfnombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfnombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfnombre2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtDniConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDniConsultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDniConsultarActionPerformed
        
    private void btnconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsultarActionPerformed
        try { 
            //Creamos una variable tipo string y le asignaremos lo que nostraiga el JtextField, txtDniConsultar 
            String con = txtDniConsultar.getText();   
            //Mostramos un diciendo que esta consultando un usuario por DNI y mostramos el valor ingresado por teclado, con la concatenacion
            JOptionPane.showMessageDialog(null, "Usted esta consultando al usuario con DNI: "+con);
           //Se crea un objeto de la clase EmpleadoController llamado empleado_crtl
            EmpleadoController empleado_crtl =new  EmpleadoController();
            //Se crea un objeto de la clase Empleado llamado empleado 
            Empleado empleado= new Empleado();
            /*Le asignamos al objeto de tipo empleado un objeto de tipo EmpleadoController con un metodo llamado constultarporDNI
            al cual le pasamos un parametro de tipo String*/
            empleado = empleado_crtl.consultarPorDNI(con);
            System.out.println(empleado);
            //Valimos que la variable empleado no este vacia
            if(empleado != null){
                
             //Se imprime un empleado, mediante el metodo toString
                JOptionPane.showMessageDialog(null, empleado.toString());
            }else{
              //En caso de que la variable empleado no devuelva ningun registro, se muestra este mensaje
                JOptionPane.showMessageDialog(null, "Empleado no existe");
            }
        } catch (Exception e) {
            //capturamos cualquier error que pueda ocurrir al momento que se este ejecutando el programa
            JOptionPane.showMessageDialog(null, "Error en tiempo de ejecución "+e.getMessage());
        }
        //Despues que se haga todo el proceso, se limpiara el campo de la consulta
           txtDniConsultar.setText("");
    }//GEN-LAST:event_btnconsultarActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
    
        try {
             //Se crea un objeto de la clase EmpleadoController llamado empleado_crtl
            EmpleadoController empleado_crtl =new  EmpleadoController(); 
             //Se crea un objeto de la clase Empleado llamado empleado 
            Empleado empleado=new Empleado();
             //Se crea una variable tipo String y le asiganamos el metodo getFechaActual(), que nos devolvera en tipo 
            String fecha = this.getFechaActual();
            //Asiganamos a la variable empleado mediante el get lo que se ingrese por teclado en los siguientes JtextField.
            empleado.setDni(txtdni.getText());
            empleado.setNombres(txtnombres.getText());
            empleado.setApellidos(txtapellidos.getText()); 
            empleado.setTelefono(txttelefono.getText());
            empleado.setDireccion(txtDirreccion.getText());
            empleado.setEstado(1);
            empleado.setFecha_registro(fecha);
            empleado.setCuenta_corriente(txtCuentaCorriente.getText());
            /*El objeto empleado controler, madiante el metodo actualizar, envia un objeto de tipo
            empleado con la informacion antes obtenida por los getter para que se realice la accion que se quiere*/
            empleado_crtl.actualizar(empleado);
            //metodo que nos actualiza la tabla cada vez que insertamos un nuevo empleado
            refrescarTabla();
            //limpia los campos luego que se genera la accion.
            limpiarCampos();
        } catch (Exception e) {
            //capturamos cualquier error que pueda ocurrir al momento que se este ejecutando el programa
            JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución: "+e.getMessage());
        }
        
        
    }//GEN-LAST:event_btnguardarActionPerformed
    
    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
       //limpiamos los campos de los JtextField
        txtidempleado.setText("");
        txtdni.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txttelefono.setText("");
        txtDirreccion.setText("");
        txtCuentaCorriente.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

    private void btneliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarActionPerformed
         //Se crea un objeto de la clase EmpleadoController llamado empleado_crtl
        EmpleadoController empleado_crtl =new  EmpleadoController(); 
         //Se crea un objeto de la clase Empleado llamado empleado
        Empleado empleado=new Empleado();
        /*Convertimos a entero el valor que nos trae el JtxtField, ya que este nos arroja 
        un valor tipo String y no, nos sirve para la accion que se pretende hacer */ 
        int id= Integer.parseInt(txtidempleado.getText());
        //Establemos un valor a el setter llamado setEstado
        empleado.setEstado(2);
        //El valor antes obtenemos del JtxtField, se lo pasamos a la variable id.
        empleado.setId(id);
         /*El objeto empleado controler, madiante el metodo eliminar, envia un objeto de tipo
         empleado con la informacion antes obtenida por los getter para que se realice la accion que se quiere*/
        empleado_crtl.eliminar(empleado);
        //metodo que nos actualiza la tabla cada vez que eliminamos un registro
        refrescarTabla();
        //limpia los campos luego que se genera la accion.
        limpiarCampos();
    }//GEN-LAST:event_btneliminarActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
        try {
             //Se crea un objeto de la clase EmpleadoController llamado empleado_crtl
            EmpleadoController empleado_crtl =new  EmpleadoController(); 
             //Se crea un objeto de la clase Empleado llamado empleado
            Empleado empleado=new Empleado();
            //Asiganamos a la variable empleado mediante el get lo que se ingrese por teclado en los siguientes JtextField.
            int id= Integer.parseInt(txtidempleado.getText());
            empleado.setId(id);
            empleado.setNombres(txtnombres.getText());
            empleado.setApellidos(txtapellidos.getText()); 
            empleado.setTelefono(txttelefono.getText());
            empleado.setDireccion(txtDirreccion.getText());
              /*El objeto empleado controler, madiante el metodo actulizamos, envia un objeto de tipo
         empleado con la informacion antes obtenida por los getter para que se realice la accion que se quiere*/
            empleado_crtl.actualizar(empleado);
              //metodo que nos actualiza la tabla cada vez que actulizamos un registro
            refrescarTabla();
           //limpia los campos luego que se genera la accion.
            limpiarCampos();
            //Con esto inabilitamos los botones
             btnactualizar.setEnabled(false);
             btneliminar.setEnabled(false);
        } catch (Exception e) {
            //capturamos cualquier error que pueda ocurrir al momento que se este ejecutando el programa
             JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución: "+e.getMessage());
        }
      
       
        
    }//GEN-LAST:event_btnactualizarActionPerformed
//Le pones en evento MouseMouseClicked a nuestra tabla
    private void tbempleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbempleadoMouseClicked
        btnactualizar.setEnabled(true);
        btneliminar.setEnabled(true);
        txtdni.setEnabled(false);
        // con esto traemos la posicion de los datos de la fila a la que seleccionemos
        int seleccion = tbempleado.rowAtPoint(evt.getPoint());
        txtidempleado.setText(String.valueOf(tbempleado.getValueAt(seleccion,0)));
        txtdni.setText(String.valueOf(tbempleado.getValueAt(seleccion,1)));
        txtnombres.setText(String.valueOf(tbempleado.getValueAt(seleccion, 2)));
        txtapellidos.setText(String.valueOf(tbempleado.getValueAt(seleccion, 3)));
        txttelefono.setText(String.valueOf(tbempleado.getValueAt(seleccion, 4)));
        txtDirreccion.setText(String.valueOf(tbempleado.getValueAt(seleccion, 5)));
    }//GEN-LAST:event_tbempleadoMouseClicked
    
    //En este metodo listamos todos datos que traemos de la tabla empleados de la bade datos, en el JTable. 
    public void refrescarTabla(){
        try{
            //llamamos al metodo Limpiar tabla
            limpiarTabla();
            //Creamos un objeto de tipo empleadoController
            EmpleadoController empleado_crtl =new  EmpleadoController();
            /*Creamos un arrayList tipo empleado, para pasarle la lista de objetos que nos traera el metodo listar,
            de la clase empeladoController*/
            List<Empleado> empleados = empleado_crtl.listar();
            //Se crea un objeto de tipo iterator,nosdevuelve un iterador sobre los elementos de esta lista en la secuencia adecuada.
            Iterator iter = empleados.iterator();
            //Crreamos un objeto de tipo DefaultTableModel, esto nos ayuda a crear las filas y las columnas de nuestra tabla
            DefaultTableModel dtmEmpleados = new DefaultTableModel();
            //Con esta lienea de codigo, establecemos los titulos o la cebecera de la tabla
            String[] colEmpleados = {"ID Empleado","DNI", "Nombres", "Apellido", "Telefono", "Dirección"};
            //aqui creamos la columna antes establecida
            dtmEmpleados.setColumnIdentifiers(colEmpleados);
            //Creamos un vector de tipo objeto, al cual le pasamos el objeto, tipo DefaultTableModel con el metodo .getColumnCount()
            Object[] fila = new Object[dtmEmpleados.getColumnCount()];
          //Con este while recorremos el iterador y mostraremos los datos, el metodo hasNext nos mostrar hasta el ultimo
            while (iter.hasNext()){  
           //Cremos un objeto tipo empledo y se lo asignamos al iteador, para traer los valores con iter.next()
                Empleado empleado = new Empleado();
              //Hacemos un casteao de iter.next() a Empleado , para que nos devuelva un arreglo de tipo Empleado
                empleado = (Empleado) iter.next();
                //Mostramos los datos 
                fila[0] = empleado.getId();
                fila[1] = empleado.getDni();
                fila[2] = empleado.getNombres();
                fila[3] = empleado.getApellidos();
                fila[4] = empleado.getTelefono();
                fila[5] = empleado.getDireccion();
                //Se crean las filas
                dtmEmpleados.addRow(fila);
        }
        //Mostramos los datos en la tbala
        tbempleado.setModel(dtmEmpleados);
        }catch(Exception e){
            //Por si ocurre un error mostrar el mensaje y que nos diga donde esta el error
            JOptionPane.showMessageDialog(null,"Error en tiempo de ejecución: "+e.getMessage());
        }
    
    }
    
    //Este metodo limpiar la tabla cada vez inserte,actualice o elimine. 
     public void limpiarTabla(){
        DefaultTableModel tb = (DefaultTableModel) tbempleado.getModel();
        int a = tbempleado.getRowCount()-1;
        for (int i = a; i >= 0; i--) {          
        tb.removeRow(tb.getRowCount()-1);
        }
    }
     
       public void limpiarCampos(){
        txtidempleado.setText("");
        txtdni.setText("");
        txtnombres.setText("");
        txtapellidos.setText("");
        txttelefono.setText("");
        txtDirreccion.setText("");
        txtCuentaCorriente.setText("");
     
        }
   
   //Meotodo que devuelve la hora actual en string
     public String getFechaActual(){
        String pattern = "yyyy-MM-dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String date = simpleDateFormat.format(new Date());
        return date;
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
            java.util.logging.Logger.getLogger(EmpleadoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpleadoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpleadoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpleadoVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EmpleadoVista dialog = new EmpleadoVista(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnconsultar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JDialog jDialog2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlbapellido1;
    private javax.swing.JLabel jlbapellido2;
    private javax.swing.JLabel jlbdireccion1;
    private javax.swing.JLabel jlbdireccion2;
    private javax.swing.JLabel jlbdni2;
    private javax.swing.JLabel jlbdni3;
    private javax.swing.JLabel jlbdni4;
    private javax.swing.JLabel jlbdni5;
    private javax.swing.JLabel jlbnombre1;
    private javax.swing.JLabel jlbnombre2;
    private javax.swing.JLabel jlbtelefono1;
    private javax.swing.JLabel jlbtelefono2;
    private javax.swing.JLabel jlempleado;
    private javax.swing.JLabel jlempleado1;
    private javax.swing.JLabel jlempleado2;
    private javax.swing.JPanel jpnconsultar;
    private javax.swing.JTextField jtfapellido1;
    private javax.swing.JTextField jtfapellido2;
    private javax.swing.JTextField jtfcodempleado1;
    private javax.swing.JTextField jtfcodempleado2;
    private javax.swing.JTextField jtfdireccion1;
    private javax.swing.JTextField jtfdireccion2;
    private javax.swing.JTextField jtfdni1;
    private javax.swing.JTextField jtfdni2;
    private javax.swing.JTextField jtfnombre1;
    private javax.swing.JTextField jtfnombre2;
    private javax.swing.JTextField jtftelefono1;
    private javax.swing.JTextField jtftelefono2;
    private javax.swing.JLabel lblapellido;
    private javax.swing.JLabel lblcodempleado;
    private javax.swing.JLabel lblcodempleado1;
    private javax.swing.JLabel lbldireccion;
    private javax.swing.JLabel lbldireccion1;
    private javax.swing.JLabel lbldni;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lbltelefono;
    private javax.swing.JTable tbempleado;
    private javax.swing.JTextField txtCuentaCorriente;
    private javax.swing.JTextField txtDirreccion;
    private javax.swing.JTextField txtDniConsultar;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtidempleado;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
