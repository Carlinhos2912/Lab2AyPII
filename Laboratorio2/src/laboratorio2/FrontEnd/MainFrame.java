/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laboratorio2.FrontEnd;
import laboratorio2.BackEnd.Admin;
/**
 *
 * @author carlo
 */
public class MainFrame extends javax.swing.JFrame {

    //Crear un objeto con los datos de administrador
    Admin AdminStuff = new Admin();
    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        IntFrame_AdminLogin = new javax.swing.JInternalFrame();
        Lbl_AdminUser = new javax.swing.JLabel();
        Tfield_AdminUser = new javax.swing.JTextField();
        Lbl_AdminPassword = new javax.swing.JLabel();
        Pfield_AdminPassword = new javax.swing.JPasswordField();
        Btn_ConfirmLogin = new javax.swing.JButton();
        Lbl_PasswordChange = new javax.swing.JLabel();
        IntFrame_PasswordChange = new javax.swing.JInternalFrame();
        Lbl_LastPassword = new javax.swing.JLabel();
        Pfield_LastPassword = new javax.swing.JPasswordField();
        Lbl_NewPassword = new javax.swing.JLabel();
        Pfield_NewPassword = new javax.swing.JPasswordField();
        Lbl_ConfirmNewPassword = new javax.swing.JLabel();
        Pfield_ConfirmNewPassword = new javax.swing.JPasswordField();
        Btn_ConfirmChange = new javax.swing.JButton();
        Btn_BackPasswordChange = new javax.swing.JButton();
        Btn_AdminLogin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Prototype 1");
        setMinimumSize(new java.awt.Dimension(700, 700));
        setPreferredSize(new java.awt.Dimension(700, 700));

        IntFrame_AdminLogin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        IntFrame_AdminLogin.setClosable(true);
        IntFrame_AdminLogin.setTitle("Admin Login");
        IntFrame_AdminLogin.setMinimumSize(new java.awt.Dimension(400, 400));
        IntFrame_AdminLogin.setName(""); // NOI18N
        IntFrame_AdminLogin.setPreferredSize(new java.awt.Dimension(400, 400));
        try {
            IntFrame_AdminLogin.setSelected(true);
        } catch (java.beans.PropertyVetoException e1) {
            e1.printStackTrace();
        }
        IntFrame_AdminLogin.setVisible(false);

        Lbl_AdminUser.setText("Usuario:");

        Lbl_AdminPassword.setText("Contraseña:");

        Btn_ConfirmLogin.setText("Entrar");
        Btn_ConfirmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConfirmLoginActionPerformed(evt);
            }
        });

        Lbl_PasswordChange.setText("Cambiar la contraseña de administrador");
        Lbl_PasswordChange.setToolTipText("");
        Lbl_PasswordChange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Lbl_PasswordChangeMousePressed(evt);
            }
        });

        javax.swing.GroupLayout IntFrame_AdminLoginLayout = new javax.swing.GroupLayout(IntFrame_AdminLogin.getContentPane());
        IntFrame_AdminLogin.getContentPane().setLayout(IntFrame_AdminLoginLayout);
        IntFrame_AdminLoginLayout.setHorizontalGroup(
            IntFrame_AdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntFrame_AdminLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IntFrame_AdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IntFrame_AdminLoginLayout.createSequentialGroup()
                        .addGroup(IntFrame_AdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lbl_AdminPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_AdminUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(IntFrame_AdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Tfield_AdminUser)
                            .addComponent(Pfield_AdminPassword)))
                    .addComponent(Lbl_PasswordChange, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntFrame_AdminLoginLayout.createSequentialGroup()
                        .addComponent(Btn_ConfirmLogin)
                        .addGap(69, 69, 69)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IntFrame_AdminLoginLayout.setVerticalGroup(
            IntFrame_AdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntFrame_AdminLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(IntFrame_AdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Tfield_AdminUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lbl_AdminUser))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(IntFrame_AdminLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_AdminPassword)
                    .addComponent(Pfield_AdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_ConfirmLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Lbl_PasswordChange)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        IntFrame_PasswordChange.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        IntFrame_PasswordChange.setClosable(true);
        IntFrame_PasswordChange.setResizable(true);
        IntFrame_PasswordChange.setTitle("Cambio de contraseña");
        IntFrame_PasswordChange.setEnabled(false);
        IntFrame_PasswordChange.setName(""); // NOI18N
        IntFrame_PasswordChange.setPreferredSize(new java.awt.Dimension(410, 400));
        IntFrame_PasswordChange.setVisible(true);

        Lbl_LastPassword.setText("Anterior contraseña:");

        Lbl_NewPassword.setText("Nueva contraseña:");

        Lbl_ConfirmNewPassword.setText("Confirmar nueva Contraseña:");

        Btn_ConfirmChange.setText("Confirmar");
        Btn_ConfirmChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ConfirmChangeActionPerformed(evt);
            }
        });

        Btn_BackPasswordChange.setText("Atras");
        Btn_BackPasswordChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BackPasswordChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IntFrame_PasswordChangeLayout = new javax.swing.GroupLayout(IntFrame_PasswordChange.getContentPane());
        IntFrame_PasswordChange.getContentPane().setLayout(IntFrame_PasswordChangeLayout);
        IntFrame_PasswordChangeLayout.setHorizontalGroup(
            IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntFrame_PasswordChangeLayout.createSequentialGroup()
                .addGroup(IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IntFrame_PasswordChangeLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Lbl_ConfirmNewPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_NewPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lbl_LastPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(IntFrame_PasswordChangeLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(Pfield_LastPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntFrame_PasswordChangeLayout.createSequentialGroup()
                                    .addGap(18, 18, 18)
                                    .addComponent(Pfield_NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IntFrame_PasswordChangeLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(Pfield_ConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(IntFrame_PasswordChangeLayout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(Btn_ConfirmChange)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_BackPasswordChange)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        IntFrame_PasswordChangeLayout.setVerticalGroup(
            IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IntFrame_PasswordChangeLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_LastPassword)
                    .addComponent(Pfield_LastPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_NewPassword)
                    .addComponent(Pfield_NewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_ConfirmNewPassword)
                    .addComponent(Pfield_ConfirmNewPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(IntFrame_PasswordChangeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_ConfirmChange)
                    .addComponent(Btn_BackPasswordChange))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        Btn_AdminLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/laboratorio2/media/admin.png"))); // NOI18N
        Btn_AdminLogin.setMaximumSize(new java.awt.Dimension(100, 100));
        Btn_AdminLogin.setMinimumSize(new java.awt.Dimension(100, 100));
        Btn_AdminLogin.setPreferredSize(new java.awt.Dimension(100, 100));
        Btn_AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IntFrame_AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(IntFrame_PasswordChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Btn_AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(IntFrame_AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IntFrame_PasswordChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Btn_AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AdminLoginActionPerformed
        //Abrir o cerrar el login de administrador
        if (IntFrame_AdminLogin.isVisible() == false) {
            IntFrame_AdminLogin.setVisible(true);
        }else{
            IntFrame_AdminLogin.setVisible(false);
        }
    }//GEN-LAST:event_Btn_AdminLoginActionPerformed

    private void Btn_ConfirmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConfirmLoginActionPerformed
        //Autenticar login de administrador
        if ((Tfield_AdminUser.getText().equalsIgnoreCase(AdminStuff.getUser())) && (String.valueOf(Pfield_AdminPassword.getPassword()).equals(AdminStuff.getPassword()))){
            System.out.println("Open AdminStuff page (Front End)");
        }else{
            System.out.println("PopUp: Error en la autenticación (Front End)");
        }
        //Vaciar el campo de contraseña
        Pfield_AdminPassword.setText("");
    }//GEN-LAST:event_Btn_ConfirmLoginActionPerformed

    private void Lbl_PasswordChangeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Lbl_PasswordChangeMousePressed
        //Inicio del cambio de contraseña
        IntFrame_AdminLogin.setVisible(false); //Cerrar login de administrador
        IntFrame_PasswordChange.setVisible(true); //Abrir cambio de contraseña
    }//GEN-LAST:event_Lbl_PasswordChangeMousePressed

    private void Btn_ConfirmChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ConfirmChangeActionPerformed
        //Si la contraseña anterior es correcta y las dos contraseñas nuevas son iguales
        if ((String.valueOf(Pfield_LastPassword.getPassword()).equals(AdminStuff.getPassword())) && (String.valueOf(Pfield_NewPassword.getPassword()).equals(String.valueOf(Pfield_ConfirmNewPassword.getPassword())))) {
            AdminStuff.setPassword(String.valueOf(Pfield_NewPassword.getPassword())); //Cambiar la contraseña anterior por la nueva
            //PopUp de contraseña cambiada correctamente (FrontEnd)
            System.out.println("PopUp: Contraseña cambiada correctamente (FrontEnd)");            
            IntFrame_PasswordChange.setVisible(false); //Ocultar la pagina de cambio de contraseña
            IntFrame_AdminLogin.setVisible(true); //Mostrar el admin login
        }
    }//GEN-LAST:event_Btn_ConfirmChangeActionPerformed

    private void Btn_BackPasswordChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BackPasswordChangeActionPerformed
        //Volver al admin login
        IntFrame_PasswordChange.setVisible(false); //Ocultar la pagina de cambio de contraseña
        IntFrame_AdminLogin.setVisible(true); //Modrear el admin login
    }//GEN-LAST:event_Btn_BackPasswordChangeActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_AdminLogin;
    private javax.swing.JButton Btn_BackPasswordChange;
    private javax.swing.JButton Btn_ConfirmChange;
    private javax.swing.JButton Btn_ConfirmLogin;
    private javax.swing.JButton Btn_ConfirmLogin1;
    private javax.swing.JInternalFrame IntFrame_AdminLogin;
    private javax.swing.JInternalFrame IntFrame_AdminLogin1;
    private javax.swing.JInternalFrame IntFrame_PasswordChange;
    private javax.swing.JLabel Lbl_AdminPassword;
    private javax.swing.JLabel Lbl_AdminPassword1;
    private javax.swing.JLabel Lbl_AdminUser;
    private javax.swing.JLabel Lbl_AdminUser1;
    private javax.swing.JLabel Lbl_ConfirmNewPassword;
    private javax.swing.JLabel Lbl_LastPassword;
    private javax.swing.JLabel Lbl_NewPassword;
    private javax.swing.JLabel Lbl_PasswordChange;
    private javax.swing.JLabel Lbl_PasswordChange1;
    private javax.swing.JPasswordField Pfield_AdminPassword;
    private javax.swing.JPasswordField Pfield_AdminPassword1;
    private javax.swing.JPasswordField Pfield_ConfirmNewPassword;
    private javax.swing.JPasswordField Pfield_LastPassword;
    private javax.swing.JPasswordField Pfield_NewPassword;
    private javax.swing.JTextField Tfield_AdminUser;
    private javax.swing.JTextField Tfield_AdminUser1;
    // End of variables declaration//GEN-END:variables
}
