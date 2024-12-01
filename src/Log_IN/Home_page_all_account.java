/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Log_IN;

/**
 *
 * @author AL-SABA
 */
public class Home_page_all_account extends javax.swing.JFrame {

    /**
     * Creates new form Home_page_all_account
     */
    public Home_page_all_account() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        govt_button_01 = new javax.swing.JLabel();
        teacher_button_01 = new javax.swing.JLabel();
        student_button_01 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        govt_button_02 = new javax.swing.JLabel();
        teacher_button_02 = new javax.swing.JLabel();
        student_button_02 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        govt_button_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/govt button 01.png"))); // NOI18N
        govt_button_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                govt_button_01MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                govt_button_01MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                govt_button_01MouseExited(evt);
            }
        });
        jPanel2.add(govt_button_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(895, 563, -1, -1));

        teacher_button_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/teacher button 01.png"))); // NOI18N
        teacher_button_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher_button_01MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacher_button_01MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacher_button_01MouseExited(evt);
            }
        });
        jPanel2.add(teacher_button_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 565, -1, -1));

        student_button_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/student button 01.png"))); // NOI18N
        student_button_01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_button_01MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                student_button_01MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                student_button_01MouseExited(evt);
            }
        });
        jPanel2.add(student_button_01, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 562, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Background/1st page.png"))); // NOI18N
        jPanel2.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        govt_button_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/govt button 02.png"))); // NOI18N
        jPanel2.add(govt_button_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        teacher_button_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/teacher button 02.png"))); // NOI18N
        jPanel2.add(teacher_button_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 460, -1, -1));

        student_button_02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/student button 02.png"))); // NOI18N
        jPanel2.add(student_button_02, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 680, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void student_button_01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_button_01MouseEntered
        student_button_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/student button 02.png")));
    }//GEN-LAST:event_student_button_01MouseEntered

    private void student_button_01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_button_01MouseExited
        student_button_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/student button 01.png")));
    }//GEN-LAST:event_student_button_01MouseExited

    private void teacher_button_01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_button_01MouseEntered
       teacher_button_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/teacher button 02.png")));
    }//GEN-LAST:event_teacher_button_01MouseEntered

    private void teacher_button_01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_button_01MouseExited
         teacher_button_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/teacher button 01.png")));
    }//GEN-LAST:event_teacher_button_01MouseExited

    private void govt_button_01MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_govt_button_01MouseEntered
        govt_button_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/govt button 02.png")));
    }//GEN-LAST:event_govt_button_01MouseEntered

    private void govt_button_01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_govt_button_01MouseExited
        govt_button_01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Button/govt button 01.png")));
    }//GEN-LAST:event_govt_button_01MouseExited

    private void govt_button_01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_govt_button_01MouseClicked
        new govt_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_govt_button_01MouseClicked

    private void student_button_01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_button_01MouseClicked
        new student_login().setVisible(true);
        dispose();
    }//GEN-LAST:event_student_button_01MouseClicked

    private void teacher_button_01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_button_01MouseClicked
       new teacher_login().setVisible(true);
       dispose();
    }//GEN-LAST:event_teacher_button_01MouseClicked

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
            java.util.logging.Logger.getLogger(Home_page_all_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_page_all_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_page_all_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_page_all_account.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Home_page_all_account().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel govt_button_01;
    private javax.swing.JLabel govt_button_02;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel student_button_01;
    private javax.swing.JLabel student_button_02;
    private javax.swing.JLabel teacher_button_01;
    private javax.swing.JLabel teacher_button_02;
    // End of variables declaration//GEN-END:variables
}