/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author sheva
 */
public class Latihan4 extends javax.swing.JFrame {

    /**
     * Creates new form Latihan4
     */
    public Latihan4() {
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

        rbJurusan = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Nama = new javax.swing.JTextField();
        Absen = new javax.swing.JTextField();
        TKJ = new javax.swing.JRadioButton();
        RPL = new javax.swing.JRadioButton();
        Animator = new javax.swing.JCheckBox();
        Programming = new javax.swing.JCheckBox();
        Designer = new javax.swing.JCheckBox();
        Teknisi = new javax.swing.JCheckBox();
        Exit = new javax.swing.JButton();
        Submit = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Hasil = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(550, 450));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 1, 24)); // NOI18N
        jLabel1.setText("Biodata Siswa");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(160, 30, 150, 30);

        jLabel2.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel2.setText("Hasil");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 350, 70, 30);

        jLabel3.setFont(new java.awt.Font("Baskerville Old Face", 1, 20)); // NOI18N
        jLabel3.setText("Nama");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 80, 70, 30);

        jLabel4.setFont(new java.awt.Font("Baskerville Old Face", 1, 20)); // NOI18N
        jLabel4.setText("Absen");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 130, 70, 30);

        jLabel5.setFont(new java.awt.Font("Baskerville Old Face", 1, 20)); // NOI18N
        jLabel5.setText("Jurusan");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 180, 70, 30);

        Nama.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        Nama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaActionPerformed(evt);
            }
        });
        getContentPane().add(Nama);
        Nama.setBounds(140, 80, 280, 30);

        Absen.setFont(new java.awt.Font("Bookman Old Style", 0, 18)); // NOI18N
        Absen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbsenActionPerformed(evt);
            }
        });
        getContentPane().add(Absen);
        Absen.setBounds(140, 130, 280, 30);

        rbJurusan.add(TKJ);
        TKJ.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        TKJ.setText("TKJ");
        TKJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TKJActionPerformed(evt);
            }
        });
        getContentPane().add(TKJ);
        TKJ.setBounds(270, 180, 70, 30);

        rbJurusan.add(RPL);
        RPL.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        RPL.setText("RPL");
        RPL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RPLActionPerformed(evt);
            }
        });
        getContentPane().add(RPL);
        RPL.setBounds(140, 180, 59, 30);

        Animator.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Animator.setText("Animator");
        Animator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimatorActionPerformed(evt);
            }
        });
        getContentPane().add(Animator);
        Animator.setBounds(140, 250, 130, 27);

        Programming.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Programming.setText("Programming");
        Programming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProgrammingActionPerformed(evt);
            }
        });
        getContentPane().add(Programming);
        Programming.setBounds(140, 220, 130, 25);

        Designer.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Designer.setText("Designer");
        Designer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DesignerActionPerformed(evt);
            }
        });
        getContentPane().add(Designer);
        Designer.setBounds(270, 250, 130, 27);

        Teknisi.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Teknisi.setText("Teknisi");
        Teknisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeknisiActionPerformed(evt);
            }
        });
        getContentPane().add(Teknisi);
        Teknisi.setBounds(270, 220, 130, 25);

        Exit.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        getContentPane().add(Exit);
        Exit.setBounds(320, 300, 90, 25);

        Submit.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Submit.setText("Submit");
        Submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitActionPerformed(evt);
            }
        });
        getContentPane().add(Submit);
        Submit.setBounds(80, 300, 90, 25);

        Hapus.setFont(new java.awt.Font("Baskerville Old Face", 0, 16)); // NOI18N
        Hapus.setText("Hapus");
        Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HapusActionPerformed(evt);
            }
        });
        getContentPane().add(Hapus);
        Hapus.setBounds(200, 300, 90, 25);

        Hasil.setColumns(20);
        Hasil.setRows(5);
        jScrollPane1.setViewportView(Hasil);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 390, 350, 140);

        jLabel6.setFont(new java.awt.Font("Baskerville Old Face", 1, 18)); // NOI18N
        jLabel6.setText("Hobi");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 220, 70, 30);

        jPanel1.setBackground(new java.awt.Color(120, 55, 235));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 500, 550);

        setBounds(0, 0, 516, 591);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaActionPerformed

    private void AbsenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbsenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AbsenActionPerformed

    private void TKJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TKJActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TKJActionPerformed

    private void RPLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RPLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RPLActionPerformed

    private void AnimatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AnimatorActionPerformed

    private void ProgrammingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProgrammingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProgrammingActionPerformed

    private void DesignerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DesignerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DesignerActionPerformed

    private void TeknisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeknisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TeknisiActionPerformed

    private void SubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitActionPerformed
        // TODO add your handling code here:
        String nama = Nama.getText();
        String absen = Absen.getText();
        String jurusan;
        String hobi = "";
        // untuk rd
        if (RPL.isSelected()) {
            jurusan = "RPL";
        } else if (TKJ.isSelected()) {
            jurusan = "TKJ";
        } else jurusan = " ";
        // untuk checkbox
        if (Programming.isSelected()) 
            hobi += Programming.getText()+", ";
        if (Animator.isSelected()) 
            hobi += Animator.getText()+", ";
        if (Teknisi.isSelected()) 
            hobi += Teknisi.getText()+", ";
        if (Designer.isSelected()) 
            hobi += Designer.getText()+", ";
        Hasil.setText("Nama Siswa :" + nama+"\nAbsen Siswa : "+absen+
                "\nJurusan Siswa : "+jurusan+"\nHobi Siswa : "+hobi);
    }//GEN-LAST:event_SubmitActionPerformed

    private void HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HapusActionPerformed
        // TODO add your handling code here:
        Hasil.setText("");
        Nama.setText("");
        Absen.setText("");
        rbJurusan.clearSelection();
        Programming.setSelected(false);
        Animator.setSelected(false);
        Teknisi.setSelected(false);
        Designer.setSelected(false);
    }//GEN-LAST:event_HapusActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Latihan4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Latihan4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Absen;
    private javax.swing.JCheckBox Animator;
    private javax.swing.JCheckBox Designer;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Hapus;
    private javax.swing.JTextArea Hasil;
    private javax.swing.JTextField Nama;
    private javax.swing.JCheckBox Programming;
    private javax.swing.JRadioButton RPL;
    private javax.swing.JButton Submit;
    private javax.swing.JRadioButton TKJ;
    private javax.swing.JCheckBox Teknisi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.ButtonGroup rbJurusan;
    // End of variables declaration//GEN-END:variables
}
