
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MNArifin
 */
public class Home extends javax.swing.JFrame {
String nol_jam = "";
String nol_menit = "";
String nol_detik = "";
    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        setTanggal();
        setJam();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        bSave = new javax.swing.JButton();
        bDelete = new javax.swing.JButton();
        bClear = new javax.swing.JButton();
        bRefresh = new javax.swing.JButton();
        bEdit = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tSiswa = new javax.swing.JTable();
        bPrint = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        etNama = new javax.swing.JTextField();
        etNis = new javax.swing.JTextField();
        etKelas = new javax.swing.JTextField();
        etEmail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        etAlamat = new javax.swing.JTextArea();
        rbPr = new javax.swing.JRadioButton();
        rbLk = new javax.swing.JRadioButton();
        etTmpLahir = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dcTglLahir = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Tanggal = new javax.swing.JLabel();
        Jam = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 0, 0));
        jPanel1.setLayout(null);

        bSave.setText("Save");
        bSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSaveActionPerformed(evt);
            }
        });
        jPanel1.add(bSave);
        bSave.setBounds(30, 30, 70, 23);

        bDelete.setText("Delete");
        bDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bDelete);
        bDelete.setBounds(110, 30, 70, 23);

        bClear.setText("Clear");
        bClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bClearActionPerformed(evt);
            }
        });
        jPanel1.add(bClear);
        bClear.setBounds(190, 30, 70, 23);

        bRefresh.setText("Refresh");
        bRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRefreshActionPerformed(evt);
            }
        });
        jPanel1.add(bRefresh);
        bRefresh.setBounds(310, 30, 70, 23);

        bEdit.setText("Edit");
        bEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditActionPerformed(evt);
            }
        });
        jPanel1.add(bEdit);
        bEdit.setBounds(390, 30, 70, 23);

        tSiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "Nama", "JenisKelamin", "Kelas", "TempatLahir", "TanggalLahir", "Email", "Alamat"
            }
        ));
        tSiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tSiswaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tSiswa);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(30, 70, 510, 370);

        bPrint.setText("Print");
        bPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPrintActionPerformed(evt);
            }
        });
        jPanel1.add(bPrint);
        bPrint.setBounds(470, 30, 70, 23);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(330, 60, 560, 520);

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("NIS");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 0, 220, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nama");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(40, 60, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Jenis Kelamin");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(40, 120, 220, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Kelas");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(40, 180, 220, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Alamat");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(40, 420, 220, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Email");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(40, 360, 220, 30);

        etNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNamaActionPerformed(evt);
            }
        });
        jPanel2.add(etNama);
        etNama.setBounds(40, 90, 220, 30);

        etNis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etNisActionPerformed(evt);
            }
        });
        jPanel2.add(etNis);
        etNis.setBounds(40, 30, 220, 30);

        etKelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etKelasActionPerformed(evt);
            }
        });
        jPanel2.add(etKelas);
        etKelas.setBounds(40, 210, 220, 30);

        etEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etEmailActionPerformed(evt);
            }
        });
        jPanel2.add(etEmail);
        etEmail.setBounds(40, 390, 220, 30);

        etAlamat.setColumns(20);
        etAlamat.setRows(5);
        jScrollPane1.setViewportView(etAlamat);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(40, 450, 220, 50);

        buttonGroup1.add(rbPr);
        rbPr.setText("Perempuan");
        jPanel2.add(rbPr);
        rbPr.setBounds(170, 150, 90, 30);

        buttonGroup1.add(rbLk);
        rbLk.setText("Laki-laki");
        jPanel2.add(rbLk);
        rbLk.setBounds(40, 150, 90, 30);

        etTmpLahir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etTmpLahirActionPerformed(evt);
            }
        });
        jPanel2.add(etTmpLahir);
        etTmpLahir.setBounds(40, 270, 220, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Tempat Lahir");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(40, 240, 220, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Tanggal Lahir");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(40, 300, 220, 30);
        jPanel2.add(dcTglLahir);
        dcTglLahir.setBounds(40, 330, 220, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 60, 310, 520);

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));
        jPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("FORM BIODATA SMK TELKOM MALANG");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 0, 640, 50);

        Tanggal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Tanggal.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Tanggal);
        Tanggal.setBounds(650, 10, 120, 30);

        Jam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Jam.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.add(Jam);
        Jam.setBounds(780, 10, 90, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 890, 50);

        setBounds(0, 0, 902, 613);
    }// </editor-fold>//GEN-END:initComponents

    private void etNisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNisActionPerformed

    private void etNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etNamaActionPerformed

    private void etKelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etKelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etKelasActionPerformed

    private void etEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etEmailActionPerformed

    public void setTanggal()
    {
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd/MM/yyyy");
        Tanggal.setText(kal.format(skrg));
    }
    
    public void setJam()
    {
        ActionListener taskPerformer = new ActionListener() 
        {
            public void actionPerformed(ActionEvent evt) 
            {
                Date dt = new Date();
                int n_jam = dt.getHours();
                int n_menit = dt.getHours();
                int n_detik = dt.getHours();
                
                
                if (n_jam <= 9) 
                {
                    nol_jam = "0";
                }
                
                if (n_menit <= 9) 
                {
                    nol_menit = "0";
                }
                
                if (n_detik <= 9) 
                {
                    nol_detik = "0";
                }
                
                String jam = nol_jam + Integer.toString(n_jam);
                String menit = nol_menit + Integer.toString(n_menit);
                String detik = nol_detik + Integer.toString(n_detik);
                Jam.setText("Jam "+ jam + ":" + menit + ":" + detik);
            }
        };
        new Timer(100, taskPerformer).start();
    }
    
    private void bSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSaveActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(dcTglLahir.getDate());
        String JK = "";
        
        if (rbLk.isSelected()) 
            {
                JK = "L";
            }
        else
            {
                JK = "P";
            }
        
        if (etNis.getText().equals("")||
                etNama.getText().equals("")||
                JK.equals("")||
                etKelas.getText().equals("")||
                etTmpLahir.getText().equals("")||
                tanggal.equals("")||
                etEmail.getText().equals("")||
                etAlamat.getText().equals("")) 
        {
            JOptionPane.showMessageDialog(this, "Lengkapi data", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            
            String SQL = "insert into t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,TempatLahir,TanggalLahir,Email,Alamat)"
                    + "values ('"+etNis.getText()+"','"+etNama.getText()+"','"+JK+"',"+"'"+etKelas.getText()+"','"+etTmpLahir.getText()+"','"+tanggal+"',"+"'"+etEmail.getText()+"','"+etAlamat.getText()+"')";
            int status = KoneksiDB.execute(SQL);
            if (status == 1) 
            {
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_bSaveActionPerformed

    private void bDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDeleteActionPerformed
        // TODO add your handling code here:
        int baris = tSiswa.getSelectedRow();
        if (baris >= 0) 
        {
            String NIS = tSiswa.getValueAt(baris, 0).toString();
            String SQL = "delete from t_siswa where nis='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if (status == 1)
            {
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_bDeleteActionPerformed

    private void bClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bClearActionPerformed
        // TODO add your handling code here:
        etNis.setText("");
        etNama.setText("");
        buttonGroup1.clearSelection();
        etKelas.setText("");
        etTmpLahir.setText("");
        etEmail.setText("");
        etAlamat.setText("");
        
    }//GEN-LAST:event_bClearActionPerformed

    private void bRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRefreshActionPerformed
        // TODO add your handling code here:
        selectData();
    }//GEN-LAST:event_bRefreshActionPerformed

    private void bEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggal = dateFormat.format(dcTglLahir.getDate());
        String JK = "";
        
        if (rbLk.isSelected()) 
            {
                JK = "L";
            }
            else
            {
                JK = "P";
            }
        
        if (etNis.getText().equals("")||
                etNama.getText().equals("")||
                JK.equals("")||
                etKelas.getText().equals("")||
                etTmpLahir.getText().equals("")||
                tanggal.equals("")||
                etEmail.getText().equals("")||
                etAlamat.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Lengkapi data", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            int baris = tSiswa.getSelectedRow();
            String nis = tSiswa.getValueAt(baris, 0).toString();
            
            
            String SQL = "UPDATE t_siswa SET" 
                    +" NIS='"+etNis.getText()+"',"
                    +" NamaSiswa='"+etNama.getText()+"',"
                    +" JenisKelamin='"+JK+"',"
                    +" Kelas='"+etKelas.getText()+"',"
                    +" TempatLahir='"+etTmpLahir.getText()+"',"
                    +" TanggalLahir='"+tanggal+"',"
                    +" Email='"+etEmail.getText()+"',"
                    +" Alamat='"+etAlamat.getText()+"' WHERE NIS="+nis;
            int status = KoneksiDB.execute(SQL);
            if (status == 1) 
            {
                JOptionPane.showMessageDialog(this, "Data berhasil diupdate", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Data gagal diupdate", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }
        
    }//GEN-LAST:event_bEditActionPerformed

    private void tSiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tSiswaMouseClicked
        // TODO add your handling code here:
        int baris = tSiswa.getSelectedRow();
        if (baris != -1) 
        {
            etNis.setText(tSiswa.getValueAt(baris, 0).toString());
            etNama.setText(tSiswa.getValueAt(baris, 1).toString());
            if ("Laki-laki".equals(tSiswa.getValueAt(baris, 2).toString())) 
            {
                rbLk.setSelected(true);
            }
            else
            {
                rbPr.setSelected(true);
            }
            etKelas.setText(tSiswa.getValueAt(baris, 3).toString());
            etTmpLahir.setText(tSiswa.getValueAt(baris, 4).toString());            
            etEmail.setText(tSiswa.getValueAt(baris, 6).toString());
            etAlamat.setText(tSiswa.getValueAt(baris, 7).toString());
        }
    }//GEN-LAST:event_tSiswaMouseClicked

    private void etTmpLahirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etTmpLahirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etTmpLahirActionPerformed

    private void bPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPrintActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Biodatat Siswa SMK Telkom Malang");
        MessageFormat footer = new MessageFormat("Page (0,number,integer)       ");
        try 
        {
            tSiswa.print(JTable.PrintMode.FIT_WIDTH, header, footer, true, null, true, null);
        }
        catch (java.awt.print.PrinterException e) 
        {
            System.err.format("Cannot print %s%n", e.getMessage());
        }
    }//GEN-LAST:event_bPrintActionPerformed

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jam;
    private javax.swing.JLabel Tanggal;
    private javax.swing.JButton bClear;
    private javax.swing.JButton bDelete;
    private javax.swing.JButton bEdit;
    private javax.swing.JButton bPrint;
    private javax.swing.JButton bRefresh;
    private javax.swing.JButton bSave;
    private javax.swing.ButtonGroup buttonGroup1;
    private com.toedter.calendar.JDateChooser dcTglLahir;
    private javax.swing.JTextArea etAlamat;
    private javax.swing.JTextField etEmail;
    private javax.swing.JTextField etKelas;
    private javax.swing.JTextField etNama;
    private javax.swing.JTextField etNis;
    private javax.swing.JTextField etTmpLahir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JRadioButton rbLk;
    private javax.swing.JRadioButton rbPr;
    private javax.swing.JTable tSiswa;
    // End of variables declaration//GEN-END:variables

    private void selectData() 
    {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","TempatLahir","TanggalLahir","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        try
        {
            while (rs.next()) 
            {
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if ("L".equals(rs.getString(3)))
                {
                    JenisKelamin = "Laki-laki";
                }
                else
                {
                    JenisKelamin = "Perempuan";
                }                       
                String Kelas = rs.getString(4);
                String TempatLahir = rs.getString(5);
                String TanggalLahir = rs.getString(6);
                String Email = rs.getString(7);
                String Alamat = rs.getString(8);
                String data[] = {NIS,NamaSiswa,JenisKelamin,Kelas,TempatLahir,TanggalLahir,Email,Alamat};
                dtm.addRow(data);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
        tSiswa.setModel(dtm);
    }
}
