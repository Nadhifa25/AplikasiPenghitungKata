import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author vivob
 */
public class PenghitungKataForm extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungKataForm
     */
    public PenghitungKataForm() {
        initComponents();
        
        // Menambahkan DocumentListener untuk perhitungan otomatis
        textAreaInput.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                hitungJumlah();
            }

            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                hitungJumlah();
            }

            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                hitungJumlah();
            }
        });
    }
    
    // Metode untuk menghitung jumlah kata, karakter, kalimat, dan paragraf
    private void hitungJumlah() {
        String inputText = textAreaInput.getText();

        // Menghitung jumlah karakter
        int jumlahKarakter = inputText.length();

        // Menghitung jumlah kata
        String[] words = inputText.trim().split("\\s+");
        int jumlahKata = words.length;

        // Menghitung jumlah kalimat
        String[] sentences = inputText.split("[.!?]");
        int jumlahKalimat = sentences.length;

        // Menghitung jumlah paragraf
        String[] paragraphs = inputText.split("\\n\\n");
        int jumlahParagraf = paragraphs.length;

        // Menampilkan hasil pada JLabel
        labelJumlahKarakter.setText("Jumlah Karakter : " + jumlahKarakter);
        labelJumlahKata.setText("Jumlah Kata : " + jumlahKata);
        labelJumlahKalimat.setText("Jumlah Kalimat : " + jumlahKalimat);
        labelJumlahParagraf.setText("Jumlah Paragraf : " + jumlahParagraf);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaInput = new javax.swing.JTextArea();
        jScrollBar1 = new javax.swing.JScrollBar();
        labelJumlahKata = new javax.swing.JLabel();
        labelJumlahKarakter = new javax.swing.JLabel();
        labelJumlahKalimat = new javax.swing.JLabel();
        btnHitung = new javax.swing.JButton();
        labelJumlahParagraf = new javax.swing.JLabel();
        btnCari = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        textFieldCari = new javax.swing.JTextField();
        labelHasilCari = new javax.swing.JLabel();
        btnKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel1.setText("Aplikasi Penghitung Kata");
        jPanel2.add(jLabel1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.NORTH);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Penghitung Kata Form", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Verdana", 2, 12))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textAreaInput.setColumns(20);
        textAreaInput.setRows(5);
        jScrollPane1.setViewportView(textAreaInput);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 75, 359, 116));
        jPanel1.add(jScrollBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(388, 75, -1, 116));

        labelJumlahKata.setText("Label Jumlah Kata");
        jPanel1.add(labelJumlahKata, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 248, -1, -1));

        labelJumlahKarakter.setText("Label Jumlah Karakter");
        jPanel1.add(labelJumlahKarakter, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 282, -1, -1));

        labelJumlahKalimat.setText("Label Jumlah Kalimat");
        jPanel1.add(labelJumlahKalimat, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 250, -1, -1));

        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });
        jPanel1.add(btnHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 207, -1, -1));

        labelJumlahParagraf.setText("Label Jumlah Paragraf");
        jPanel1.add(labelJumlahParagraf, new org.netbeans.lib.awtextra.AbsoluteConstraints(241, 284, -1, -1));

        btnCari.setText("Cari Kata");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });
        jPanel1.add(btnCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(23, 40, -1, -1));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });
        jPanel1.add(btnSimpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 209, -1, -1));

        textFieldCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldCariActionPerformed(evt);
            }
        });
        jPanel1.add(textFieldCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(117, 40, 134, -1));

        labelHasilCari.setText("Label Hasil Cari");
        jPanel1.add(labelHasilCari, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 43, -1, -1));

        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });
        jPanel1.add(btnKeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 209, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
        hitungJumlah();
        
        /** // Mendapatkan teks dari JTextArea
        String inputText = textAreaInput.getText();

        // Menghitung jumlah karakter
        int jumlahKarakter = inputText.length();

        // Menghitung jumlah kata menggunakan split berdasarkan spasi
        String[] words = inputText.trim().split("\\s+");
        int jumlahKata = words.length;

        // Menghitung jumlah kalimat berdasarkan titik
        String[] sentences = inputText.split("[.!?]");
        int jumlahKalimat = sentences.length;

        // Menampilkan hasil pada JLabel
        labelJumlahKarakter.setText("Jumlah Karakter: " + jumlahKarakter);
        labelJumlahKata.setText("Jumlah Kata: " + jumlahKata);
        labelJumlahKalimat.setText("Jumlah Kalimat: " + jumlahKalimat);**/
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // Pencarian kata tertentu
        String cariKata = textFieldCari.getText();
        String inputText = textAreaInput.getText();
        int jumlahKemunculan = 0;

        Pattern pattern = Pattern.compile("\\b" + Pattern.quote(cariKata) + "\\b", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputText);

        while (matcher.find()) {
            jumlahKemunculan++;
        }

        labelHasilCari.setText("Kemunculan Kata : " + jumlahKemunculan);
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int pilihan = fileChooser.showSaveDialog(this);

        if (pilihan == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try (PrintWriter writer = new PrintWriter(file)) {
                writer.println("Teks : " + textAreaInput.getText());
                writer.println("Jumlah Karakter : " + labelJumlahKarakter.getText());
                writer.println("Jumlah Kata : " + labelJumlahKata.getText());
                writer.println("Jumlah Kalimat : " + labelJumlahKalimat.getText());
                writer.println("Jumlah Paragraf : " + labelJumlahParagraf.getText());
                writer.println("Hasil Pencarian : " + labelHasilCari.getText());
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan!");
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Gagal menyimpan file!");
            }
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void textFieldCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldCariActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldCariActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed
    
    
    
    
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
            java.util.logging.Logger.getLogger(PenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungKataForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelHasilCari;
    private javax.swing.JLabel labelJumlahKalimat;
    private javax.swing.JLabel labelJumlahKarakter;
    private javax.swing.JLabel labelJumlahKata;
    private javax.swing.JLabel labelJumlahParagraf;
    private javax.swing.JTextArea textAreaInput;
    private javax.swing.JTextField textFieldCari;
    // End of variables declaration//GEN-END:variables
}
