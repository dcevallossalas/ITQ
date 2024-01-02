package app;

import bdd.Persistencia;
import bdd.Vehiculo;
import java.sql.*;
import javax.swing.JOptionPane;

public class FrmAplicacion extends javax.swing.JFrame {
    private String preambulo = "jdbc:mysql";
    private String server = "localhost";
    private int puerto = 3306;
    private String bdd = "vehiculos";
    private String usuario = "root";
    private String password = "12345678";
    private Persistencia persistencia;
    
    
    public FrmAplicacion() {
        initComponents();
        persistencia = new Persistencia(preambulo, server, puerto, bdd, usuario, password);
        limpiarControles();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnTesting = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtPLACA = new javax.swing.JTextField();
        txtCPN = new javax.swing.JTextField();
        txtCHASIS = new javax.swing.JTextField();
        txtNOMBRE = new javax.swing.JTextField();
        txtAPELLIDO = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnTesting.setText("Testing");
        btnTesting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestingActionPerformed(evt);
            }
        });

        jLabel1.setText("ID:");

        jLabel2.setText("PLACA:");

        jLabel3.setText("CPN:");

        jLabel4.setText("CHASIS:");

        jLabel5.setText("NOMBRE:");

        jLabel6.setText("APELLIDO:");

        txtID.setText("jTextField1");

        txtPLACA.setText("jTextField2");

        txtCPN.setText("jTextField3");

        txtCHASIS.setText("jTextField4");

        txtNOMBRE.setText("jTextField5");

        txtAPELLIDO.setText("jTextField6");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addGap(146, 146, 146)
                        .addComponent(btnBorrar)
                        .addGap(49, 49, 49)
                        .addComponent(btnCrear))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                            .addComponent(txtPLACA)
                            .addComponent(txtCPN)
                            .addComponent(txtCHASIS)
                            .addComponent(txtNOMBRE)
                            .addComponent(txtAPELLIDO))
                        .addGap(47, 47, 47)
                        .addComponent(btnConsultar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnTesting)
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPLACA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCPN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCHASIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtAPELLIDO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTesting)
                    .addComponent(btnLimpiar)
                    .addComponent(btnCrear)
                    .addComponent(btnActualizar)
                    .addComponent(btnBorrar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTestingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestingActionPerformed
        try {
            Connection conexion = persistencia.getConexion();   
            conexion.close();
            JOptionPane.showMessageDialog(this,"Conexión exitosa");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_btnTestingActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiarControles();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        try {
            String placa = txtPLACA.getText();
            String cpn = txtCPN.getText();
            String chasis = txtCHASIS.getText();
            String nombre = txtNOMBRE.getText();
            String apellido = txtAPELLIDO.getText();

            String statement = "INSERT INTO vehiculo (PLACA,CPN,CHASIS,NOMBRE_DUENO,APELLIDO_DUENO) values ('" + placa
                    + "','" + cpn
                    + "','" + chasis
                    + "','" + nombre
                    + "','" + apellido + "')";
            int res = persistencia.crearRegistro(statement);
            if (res > 0) 
                JOptionPane.showMessageDialog(this, "Registro ingresado correctamente");
            else
                JOptionPane.showMessageDialog(this, "No se pudo ingresar registro");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            String placa = txtPLACA.getText();
            String statement = "SELECT ID,PLACA,CPN,CHASIS,NOMBRE_DUENO,APELLIDO_DUENO FROM vehiculo WHERE PLACA = '" + placa + "'";
            Vehiculo resultado = persistencia.LeerRegistro(statement);

            if (resultado.resultado == 1) {
                txtID.setText(String.valueOf(resultado.id));
                txtPLACA.setText(resultado.placa);
                txtCPN.setText(resultado.cpn);
                txtCHASIS.setText(resultado.chasis);
                txtNOMBRE.setText(resultado.nombre);
                txtAPELLIDO.setText(resultado.apellido);
            } else {
                JOptionPane.showMessageDialog(this, "No se encontraron resultados");
            }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        try {
            String id = txtID.getText();
            String placa = txtPLACA.getText();
            String cpn = txtCPN.getText();
            String chasis = txtCHASIS.getText();
            String nombre = txtNOMBRE.getText();
            String apellido = txtAPELLIDO.getText();

            String statement = "UPDATE vehiculo SET placa = '" + placa 
                    + "', cpn = '" + cpn 
                    + "', chasis = '" + chasis 
                    + "', nombre_dueno = '" + nombre
                    + "', apellido_dueno = '" + apellido 
                    + "' WHERE ID = " + id;
                    
            int res = persistencia.actualizarRegistro(statement);
            if (res > 0) 
                JOptionPane.showMessageDialog(this, "Registro actualizado correctamente");
            else
                JOptionPane.showMessageDialog(this, "No se encontró registro para actualización");
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        try {
            String id = txtID.getText();

            String statement = "DELETE FROM vehiculo WHERE ID = " + id;
                    
            int res = persistencia.eliminarRegistro(statement);
            if (res > 0) {
                limpiarControles();
                JOptionPane.showMessageDialog(this, "Registro borrado correctamente");
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró registro para ser borrado"); }
        } catch(Exception ex) {
            JOptionPane.showMessageDialog(this, ex.toString());
        }
    }//GEN-LAST:event_btnBorrarActionPerformed
    
    private void limpiarControles() {
        txtID.setText("");
        txtPLACA.setText("");
        txtCHASIS.setText("");
        txtCPN.setText("");
        txtNOMBRE.setText("");
        txtAPELLIDO.setText("");
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
            java.util.logging.Logger.getLogger(FrmAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAplicacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnTesting;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtAPELLIDO;
    private javax.swing.JTextField txtCHASIS;
    private javax.swing.JTextField txtCPN;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNOMBRE;
    private javax.swing.JTextField txtPLACA;
    // End of variables declaration//GEN-END:variables
}
