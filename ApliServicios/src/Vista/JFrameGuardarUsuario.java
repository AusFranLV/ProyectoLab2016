/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ivan
 */
public class JFrameGuardarUsuario extends javax.swing.JFrame {

    /**
     * Creates new form JFrameUsuario
     */
    public JFrameGuardarUsuario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNombreUsuario = new javax.swing.JLabel();
        lblPasw = new javax.swing.JLabel();
        lblConfPasw = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        lblNivelAcceso = new javax.swing.JLabel();
        cmbNivel = new javax.swing.JComboBox<>();
        txtPasw = new javax.swing.JPasswordField();
        txtConfPasw = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        btnGrabar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTitulo.setForeground(new java.awt.Color(0, 204, 153));
        lblTitulo.setText("Usuario");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 204, 153), null));
        jPanel1.setMinimumSize(new java.awt.Dimension(32767, 32767));

        lblNombreUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNombreUsuario.setText("Nombre de usuario");

        lblPasw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblPasw.setText("Contraseña");

        lblConfPasw.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblConfPasw.setText("Confirmar Contraseña");

        txtNombreUsuario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        lblNivelAcceso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNivelAcceso.setText("Nivel de acceso");

        cmbNivel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmbNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrador", "Gerente", "Cliente", "Supervisor" }));
        cmbNivel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelActionPerformed(evt);
            }
        });

        txtPasw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPasw.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaswActionPerformed(evt);
            }
        });

        txtConfPasw.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNivelAcceso)
                    .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPasw)
                        .addGap(92, 92, 92)
                        .addComponent(lblConfPasw))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtPasw, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(txtConfPasw, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblNombreUsuario)
                    .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNombreUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNivelAcceso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cmbNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasw)
                    .addComponent(lblConfPasw))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPasw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtConfPasw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnGrabar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonGrabar4.png"))); // NOI18N

        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonCancelarX.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 99, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGrabar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BotonRegresar2.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(73, 73, 73)
                            .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblTitulo)
                            .addGap(258, 258, 258))))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbNivelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNivelActionPerformed

    private void txtPaswActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaswActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaswActionPerformed

    public JButton getBtnCancelar() {
        return btnCancelar;
    }


    public JButton getBtnRegresar() {
        return btnRegresar;
    }

    public JButton getBtnGrabar() {
        return btnGrabar;
    }


    public JPasswordField getTxtConfPasw() {
        return txtConfPasw;
    }

    public JTextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public JPasswordField getTxtPasw() {
        return txtPasw;
    }

    public JComboBox<String> getCmbNivelA() {
        return cmbNivel;
    }

    public JLabel getLblConfPasw() {
        return lblConfPasw;
    }

    public JLabel getLblPasw() {
        return lblPasw;
    }

   //------------------------------------------
    public void agregarListener (ActionListener accion)
{

    this.btnCancelar.addActionListener(accion);
    this.btnGrabar.addActionListener(accion);
    this.btnRegresar.addActionListener(accion);
    this.btnRegresar.addActionListener(accion);
  
}   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGrabar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JComboBox<String> cmbNivel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblConfPasw;
    private javax.swing.JLabel lblNivelAcceso;
    private javax.swing.JLabel lblNombreUsuario;
    private javax.swing.JLabel lblPasw;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JPasswordField txtConfPasw;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JPasswordField txtPasw;
    // End of variables declaration//GEN-END:variables


}
