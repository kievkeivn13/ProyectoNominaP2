/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import java.awt.MouseInfo;
import java.awt.Point;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Heydi Quemé 9959-18-5335
 */
public class Consulta_Bitacora extends javax.swing.JFrame {
    private int x;
    private int y;
    public static int clic;

    /**
     * Esta forma permite visualizar el contenido de la bitacatora 
     */
    
    public void tablas() {
        try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            PreparedStatement pstt4 = cn.prepareStatement("select * from Bitacora");
            ResultSet rss4 = pstt4.executeQuery();

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Codigo");
            modelo.addColumn("Usuario");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Fecha");
            modelo.addColumn("Hora");
            tabla_b.setModel(modelo);
            String[] dato = new String[5];
            while (rss4.next()) {
                dato[0] = rss4.getString(1);
                dato[1] = rss4.getString(2);
                dato[2] = rss4.getString(3);
                dato[3] = rss4.getString(4);
                dato[4] = rss4.getString(5);

                modelo.addRow(dato);
            }

        } catch (Exception e) {

        }

    }
    
    public void tema(){
    try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from togglereg");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                code.setText(rs.getString("nombre"));
                if(code.getText().contains("Claro")){
                    lb1.setVisible(true);
            lb2.setVisible(true);
            
            ln1.setVisible(false);
            ln2.setVisible(false);
            
            jLabel6.setForeground(new java.awt.Color(0,0,0));
            jPanel4.setBackground(new java.awt.Color(255,255,255));
            
            cerrarbtn4.setVisible(true);
            minimizarbtn1.setVisible(true);
            btnCerrar1.setVisible(false);
            btnMinimizar1.setVisible(false);
                    
 }
        else{
            if(code.getText().contains("Oscuro")){
         lb1.setVisible(false);
            lb2.setVisible(false);
            
            ln1.setVisible(true);
            ln2.setVisible(true);
            
            jLabel6.setForeground(new java.awt.Color(255,255,255));
            jPanel4.setBackground(new java.awt.Color(0,0,0));
            
            cerrarbtn4.setVisible(false);
            minimizarbtn1.setVisible(false);
            btnCerrar1.setVisible(true);
            btnMinimizar1.setVisible(true);
                    
            }
                }

            } else {
            }
        } catch (Exception e) {
        }
    }
    
    public int getClic(){
        int c=0;
        
        try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            PreparedStatement pst = cn.prepareStatement("select * from togglereg");

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                
                c=Integer.valueOf(rs.getString("clic"));
            } else {
            }

        } catch (Exception e) {
        }
        return c;
    }

    public Consulta_Bitacora() {
        initComponents();
        tablas();
        setLocationRelativeTo(null); 
       this.clic=getClic();
        tema();
    tabla_b.getColumnModel().getColumn(0).setPreferredWidth(40);
     tabla_b.getColumnModel().getColumn(1).setPreferredWidth(60);
      tabla_b.getColumnModel().getColumn(2).setPreferredWidth(380);
       tabla_b.getColumnModel().getColumn(3).setPreferredWidth(80);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Claro = new javax.swing.JLabel();
        code = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        timee = new javax.swing.JLabel();
        usuario = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cerrarbtn4 = new temaclaro.Cerrarbtn();
        btnCerrar1 = new temanegro.btnCerrar();
        minimizarbtn1 = new temaclaro.Minimizarbtn();
        jLabel6 = new javax.swing.JLabel();
        btnMinimizar1 = new temanegro.btnMinimizar();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_b = new javax.swing.JTable();
        lb1 = new javax.swing.JLabel();
        lb2 = new javax.swing.JLabel();
        ln1 = new javax.swing.JLabel();
        ln2 = new javax.swing.JLabel();

        Claro.setText("0");

        code.setText("0");

        date.setText("jLabel1");

        timee.setText("jLabel1");

        usuario.setText("jLabel6");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel4MouseDragged(evt);
            }
        });
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel4MousePressed(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarbtn4.setText("cerrarbtn1");
        cerrarbtn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cerrarbtn4MousePressed(evt);
            }
        });
        jPanel4.add(cerrarbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        btnCerrar1.setText("btnCerrar1");
        btnCerrar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrar1MousePressed(evt);
            }
        });
        jPanel4.add(btnCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, -1, -1));

        minimizarbtn1.setText("minimizarbtn1");
        minimizarbtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                minimizarbtn1MousePressed(evt);
            }
        });
        jPanel4.add(minimizarbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel6.setText("Consulta Bitacora");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnMinimizar1.setText("btnMinimizar1");
        btnMinimizar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMinimizar1MousePressed(evt);
            }
        });
        jPanel4.add(btnMinimizar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, -1));

        tabla_b.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabla_b.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Usuario", "Descripción", "Fecha", "Hora"
            }
        ));
        jScrollPane1.setViewportView(tabla_b);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 740, 240));

        lb1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/ventana desenfocar.png"))); // NOI18N
        getContentPane().add(lb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 330));

        lb2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondo blanco.jpg"))); // NOI18N
        getContentPane().add(lb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 330));

        ln1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/ventana desenfocar b.png"))); // NOI18N
        getContentPane().add(ln1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 330));

        ln2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/fondo 4.jpg"))); // NOI18N
        getContentPane().add(ln2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 810, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarbtn4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarbtn4MousePressed
        // TODO add your handling code here:
        this.dispose();
        this.clic=0;
    }//GEN-LAST:event_cerrarbtn4MousePressed

    private void btnCerrar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrar1MousePressed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerrar1MousePressed

    private void minimizarbtn1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarbtn1MousePressed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarbtn1MousePressed

    private void btnMinimizar1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizar1MousePressed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizar1MousePressed

    private void jPanel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseDragged
        // TODO add your handling code here:
        Point ubicacion = MouseInfo.getPointerInfo().getLocation();//1
        System.out.println("Coordenadas: ("+ubicacion.x+","+ubicacion.y+")");//2
        setLocation(ubicacion.x - x, ubicacion.y - y);//3
    }//GEN-LAST:event_jPanel4MouseDragged

    private void jPanel4MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanel4MousePressed

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
            java.util.logging.Logger.getLogger(Consulta_Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta_Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta_Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta_Bitacora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta_Bitacora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Claro;
    public static temanegro.btnCerrar btnCerrar1;
    public static temanegro.btnMinimizar btnMinimizar1;
    public static temaclaro.Cerrarbtn cerrarbtn4;
    private javax.swing.JLabel code;
    private javax.swing.JLabel date;
    public static javax.swing.JLabel jLabel6;
    public static javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel lb1;
    public static javax.swing.JLabel lb2;
    public static javax.swing.JLabel ln1;
    public static javax.swing.JLabel ln2;
    public static temaclaro.Minimizarbtn minimizarbtn1;
    private javax.swing.JTable tabla_b;
    private javax.swing.JLabel timee;
    public static javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables
}
