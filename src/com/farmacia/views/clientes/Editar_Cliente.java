/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.farmacia.views.clientes;


import com.farmacia.dao.CRUD;
import com.farmacia.dao.Consultas;
import com.farmacia.entities1.Clientes;
import com.farmacia.entities1.Correo_Cliente;
import com.farmacia.entities1.Obcx;
import com.farmacia.entities1.Telefono_Cliente;
import java.awt.Dimension;
import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.sql.Types;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author ANGEL JESUS
 */
public class Editar_Cliente extends javax.swing.JDialog {

    int x, y;
    ArrayList<Obcx> listat = null;
    ArrayList<Obcx> listad = null;
    ArrayList<Obcx> listac = null;
    ArrayList<Telefono_Cliente> telefonos = null;
    ArrayList<Correo_Cliente> correos = null;
    static ArrayList<Clientes> clientes = null;
    private static Clientes cliente;
    Obcx obcx = new Obcx();
    Connection coneccion;
   // Conectar conectar = new Conectar();
    Consultas llamar = new Consultas();
    private Date fecha_registro;
    CRUD cc = new CRUD();
    int alto = java.awt.Toolkit.getDefaultToolkit().getScreenSize().height;
    int ancho = java.awt.Toolkit.getDefaultToolkit().getScreenSize().width;

    public Editar_Cliente(java.awt.Frame parent, boolean modal, Clientes clientes) {
        super(parent, modal);
        setUndecorated(true);
        initComponents();
        setLocationRelativeTo(null);
        ArrayList<Obcx> listat = null;
        ArrayList<Obcx> listad = null;
        ArrayList<Obcx> listac = null;
//        coneccion = conectar.Conexion("Modulo_Cliente");
//        telefonos = llamar.listarTelefonoCliente("Modulo_Cliente", "select * from Telefono ");
//        correos = llamar.listarCorreoCliente("Modulo_Cliente", "select * from Correo ");
     //   coneccion = conectar.Conexion("modulo_cliente");
        telefonos = llamar.listarTelefonoCliente("select * from telefono ");
        correos = llamar.listarCorreoCliente("select * from correo ");

        LlenarDatos(clientes, telefonos, correos);
        Habilitar(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonSalir = new javax.swing.JButton();
        fecha_reg = new javax.swing.JTextField();
        BotonEliminar = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        cbx1 = new javax.swing.JComboBox<>();
        cbx2 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        BotonAgregarT = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        BotonAgregarC = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cedula = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        BotonActualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BotonSalir1 = new javax.swing.JButton();
        direccion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(1, 1, 1), 2, true));

        BotonSalir.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        BotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icono/salir1.png"))); // NOI18N
        BotonSalir.setText("SALIR");
        BotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalirActionPerformed(evt);
            }
        });

        fecha_reg.setEditable(false);
        fecha_reg.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        fecha_reg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_reg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_regActionPerformed(evt);
            }
        });

        BotonEliminar.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        BotonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icono/eliminar1.png"))); // NOI18N
        BotonEliminar.setText("ELIMINAR");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        nombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nombreFocusLost(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(0, 153, 153));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(254, 254, 254));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("DATOS DEL CLIENTE");
        jLabel9.setOpaque(true);
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel9MouseDragged(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel9MousePressed(evt);
            }
        });

        apellido.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        apellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                apellidoFocusLost(evt);
            }
        });

        cbx1.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        cbx1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbx1ActionPerformed(evt);
            }
        });

        cbx2.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel2.setText("FECHA DE INGRESO:");

        BotonAgregarT.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        BotonAgregarT.setText("+");
        BotonAgregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarTActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRE:");

        BotonAgregarC.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        BotonAgregarC.setText("+");
        BotonAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarCActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO:");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel8.setText("CEDULA:");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel5.setText("TELEFONO:");

        cedula.setEditable(false);
        cedula.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        cedula.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel6.setText("CORREO:");

        BotonActualizar.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        BotonActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/farmacia/icono/update.png"))); // NOI18N
        BotonActualizar.setText("ACTUALIZAR");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 14)); // NOI18N
        jLabel7.setText("DIRECCION:");

        BotonSalir1.setFont(new java.awt.Font("Ubuntu", 1, 10)); // NOI18N
        BotonSalir1.setText("IMPRIMIR");
        BotonSalir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSalir1ActionPerformed(evt);
            }
        });

        direccion.setFont(new java.awt.Font("Ubuntu", 1, 12)); // NOI18N
        direccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                direccionFocusLost(evt);
            }
        });
        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(fecha_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6))
                                        .addGap(12, 12, 12))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(5, 5, 5)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BotonAgregarT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BotonAgregarC)))
                                    .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(fecha_reg, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonAgregarT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbx1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonAgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void LlenarDatos(Clientes pro, ArrayList<Telefono_Cliente> telf,
            ArrayList<Correo_Cliente> cor) {
        fecha_registro = pro.getFecha_reg();
        fecha_reg.setText(String.valueOf(pro.getFecha_reg()));
        if (String.valueOf(pro.getCedula()).length() <= 9) {
            cedula.setText("0" + String.valueOf(pro.getCedula()));
        } else {
            cedula.setText(String.valueOf(pro.getCedula()));
        }
        System.out.println(pro.getDireccion());
        nombre.setText(pro.getNombre());
        apellido.setText(pro.getApellido());
        direccion.setText(pro.getDireccion());

        for (int i = 0; i < telefonos.size(); i++) {
            if (pro.getCedula().equals(telefonos.get(i).getCedula())) {
                switch (Integer.valueOf((telefonos.get(i).getId_tipo_Telefono()).toString())) {
                    case 1:
                        cbx1.addItem(telefonos.get(i).getNumero() + " " +"CONVENCIONAL");
                        break;
                    case 2:
                        cbx1.addItem(telefonos.get(i).getNumero() + " " +"CELULAR ");
                        break;
                    case 3:
                        cbx1.addItem(telefonos.get(i).getNumero() + " " +"OTRO ");
                }
            }
        }
        for (int i = 0; i < correos.size(); i++) {
            if (pro.getCedula().equals(correos.get(i).getCedula())) {
                cbx2.addItem(correos.get(i).getCorreo());
            }
        }
        cbx1.setSelectedItem(pro.getStr_telefono());
        cbx2.setSelectedItem(pro.getStr_correo());

    }

    private void BotonAgregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarTActionPerformed
        ArrayList<Obcx> lista = new ArrayList();
        Ingresar_Telefono ic = new Ingresar_Telefono(new javax.swing.JFrame(), true, cedula.getText());
        ic.setVisible(true);
        if (ic.getTelefono() != null) {
            cbx1.addItem(ic.getTelefono() + " " + ic.getTexto());
            Obcx pol = new Obcx(ic.getTelefono(), ic.getTipo());
            lista.add(pol);
            listat = lista;
            cc.insertarTelefonoCliente(lista, cedula.getText());
            //System.out.println(lista.get(0).getTcd() + " " + lista.get(0).getTipos());

        }
    }//GEN-LAST:event_BotonAgregarTActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        int h = Confirmacion("Desea Actualizar el cliente con Cedula: "
                + cedula.getText() + " y Nombre: " + nombre.getText());
        if (h == 0 && nombre.getText().length()>2 && apellido.getText().length() >2 && direccion.getText().length() >2) {
            String pro = cc.editarCliente(cedula.getText(), nombre.getText(), apellido.getText(), 
                    direccion.getText(), cbx1.getSelectedItem().toString(), cbx2.getSelectedItem().toString());
            //if (pro != null) {
            //telefonos = llamar.listarTelefono("farmacia", "select * from telefono ");
            //insertarTelefono(listat);
            //insertarCorreo(listac);
            //insertarDireccion(listad);
            JOptionPane.showMessageDialog(null, pro);
            Consulta_Clientes mp = new Consulta_Clientes(new javax.swing.JFrame(), true);
            setVisible(false);
            mp.setVisible(true);

        } else {
             JOptionPane.showMessageDialog(null, "LLene todos los campos del formulario");
        }
        //}
    }//GEN-LAST:event_BotonActualizarActionPerformed
   
    private void fecha_regActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_regActionPerformed

    }//GEN-LAST:event_fecha_regActionPerformed

    private void BotonAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarCActionPerformed
        ArrayList<Obcx> lista = new ArrayList();
        Ingresar_Correo1 ic = new Ingresar_Correo1(new javax.swing.JFrame(), true, cedula.getText());
        ic.setVisible(true);
        if (ic.getCorreo() != " ") {
            cbx2.addItem(ic.getCorreo());
            Obcx pol = new Obcx(ic.getCorreo());
            lista.add(pol);
            listac = lista;
            cc.insertarCorreoCliente(lista, cedula.getText());
            // System.out.println(lista.get(0).getTcd() + " " + lista.get(0).getTipos());
        }
    }//GEN-LAST:event_BotonAgregarCActionPerformed

    private void cbx1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbx1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbx1ActionPerformed

    private void BotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalirActionPerformed
        setVisible(false);
        Consulta_Clientes cc =new Consulta_Clientes(new javax.swing.JFrame(), true);
        cc.setVisible(true);
    }//GEN-LAST:event_BotonSalirActionPerformed

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char car = evt.getKeyChar();
        if (cedula.getText().length() >= 10) {
            evt.consume();
            Habilitar(true);
        } else {
            Habilitar(false);
        }
        if (car < '0' || car > '9') {
            evt.consume();
        }
    }//GEN-LAST:event_cedulaKeyTyped
    public int Confirmacion(String msx) {
        int select = JOptionPane.showConfirmDialog(null, msx, "Confirmar", JOptionPane.YES_OPTION, JOptionPane.NO_OPTION);

        System.out.println(select);
        return select;
    }
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        int h = Confirmacion("Desea Eliminar el cliente con Cedula: "
                + cedula.getText() + " y Nombre: " + nombre.getText());
        if (h == 0) {
            String sol = cc.eliminarCliente(cedula.getText());
            JOptionPane.showMessageDialog(null, sol);
            Consulta_Clientes mp = new Consulta_Clientes(new javax.swing.JFrame(), true);
            setVisible(false);
            mp.setVisible(true);

        }
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void jLabel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MousePressed
        x = evt.getX();
        y = evt.getY();
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MousePressed

    private void jLabel9MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseDragged
        Point point = MouseInfo.getPointerInfo().getLocation();
        setLocation(point.x - x, point.y - y);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseDragged

    private void nombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nombreFocusLost
        nombre.setText(nombre.getText().toUpperCase());
    }//GEN-LAST:event_nombreFocusLost

    private void apellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_apellidoFocusLost
        apellido.setText(apellido.getText().toUpperCase());
    }//GEN-LAST:event_apellidoFocusLost

    private void BotonSalir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSalir1ActionPerformed
        ArrayList cliente = new ArrayList();
        Clientes cliente1 = new Clientes (cedula.getText(),nombre.getText(),apellido.getText(),direccion.getText(),fecha_reg.getText(),cbx1.getSelectedItem().toString(),cbx2.getSelectedItem().toString());
        cliente.add(cliente1);
        try{
            String dir = System.getProperty("user.dir") + "/Reportes/" +"Cliente.jasper";
            JasperReport reporte = (JasperReport) JRLoader.loadObject(dir);
            JasperPrint jprint = JasperFillManager.fillReport(reporte,null,new JRBeanCollectionDataSource(cliente));
            JDialog frame = new JDialog (this);
            JRViewer viewer = new JRViewer(jprint);
            frame.add(viewer);
            frame.setSize(new Dimension(ancho/2,alto/2));
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
            viewer.setFitWidthZoomRatio();
        } catch (JRException ex) {
            Logger.getLogger(Activar_Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_BotonSalir1ActionPerformed

    private void direccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_direccionFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionFocusLost

    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionActionPerformed

    public void Habilitar(boolean lok) {
        BotonAgregarT.setEnabled(lok);
        BotonAgregarC.setEnabled(lok);
        direccion.setEnabled(lok);
        //cedula.setEnabled(lok);
        nombre.setEnabled(lok);
        apellido.setEnabled(lok);
        BotonActualizar.setEnabled(lok);
    }

//    public void fe() {
//        Calendario1 jh = new Calendario1(new javax.swing.JFrame(), true);
//        //jh.setVisible(true);
//        fecha_registro = jh.getFecha_nacimiento();
//        int com = Fecha.comparacionFecha(fecha_registro, (Date) Fecha.FechaSql());
//        if (com == 1 || com == 0) {
//            fecha_reg.setText(Fecha.getStringFecha(fecha_registro));
//        } else {
//            JOptionPane.showMessageDialog(null, "Fecha Invalida!!");
//            fecha_registro = null;
//            fecha_reg.setText("");
//        }
//    }
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
            java.util.logging.Logger.getLogger(Editar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editar_Cliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Editar_Cliente dialog = new Editar_Cliente(new javax.swing.JFrame(), true, cliente);
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
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonAgregarC;
    private javax.swing.JButton BotonAgregarT;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonSalir;
    private javax.swing.JButton BotonSalir1;
    private javax.swing.JTextField apellido;
    private javax.swing.JComboBox<String> cbx1;
    private javax.swing.JComboBox<String> cbx2;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField fecha_reg;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre;
    // End of variables declaration//GEN-END:variables

    private void setExtendedState(int ICONIFIED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
