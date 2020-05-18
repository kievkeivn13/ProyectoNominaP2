package Principal;


import PaqueteNomina.Nomina;
import PaqueteNomina.Aplicacion;
import mantenimiento.empleado.Empleados;
import mantenimiento.empleado.Departamentos;
import mantenimiento.empleado.Puestos;
import Usuarios.M_Usuarios;
import PaqueteNomina.Concepto;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.Calendar;

public class mdiMenuPrincipal extends javax.swing.JFrame {

    public static String BD = "jdbc:mysql://localhost/nominaproyect";
    public static String Usuario = "root";
    public static String Contraseña = "6182";
    
    public static Connection getConeccion(){
        Connection cn = null;
        try{
            Class.forName(BD);
            cn=DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            
        }catch(Exception e){
            System.out.println(String.valueOf(e));}
        return cn;
        
         
    }
    /**
     * Creates new form mdiMenuPrincipal to use the program
     */
    public mdiMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(mdiMenuPrincipal.MAXIMIZED_BOTH);
        this.setTitle("Nomina");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        date = new javax.swing.JLabel();
        timee = new javax.swing.JLabel();
        ImageIcon icon= new ImageIcon(getClass().getResource("/Fondos/fondo 4.jpg"));
        Image image= icon.getImage();
        panel = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        usuario = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        date.setText("jLabel1");

        timee.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        usuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        usuario.setForeground(new java.awt.Color(255, 255, 255));
        usuario.setText("Usuario");
        usuario.setMaximumSize(new java.awt.Dimension(91, 91));
        usuario.setPreferredSize(new java.awt.Dimension(91, 91));
        panel.add(usuario);
        usuario.setBounds(20, 10, 160, 51);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");
        fileMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fileMenuMouseClicked(evt);
            }
        });

        jMenuItem6.setText("Salir");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem6);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Catálogos ");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Gestor de Empleados");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(openMenuItem);

        jMenuItem1.setText("Gestor de Departamentos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem1);

        jMenuItem2.setText("Gestor de Puestos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        editMenu.add(jMenuItem2);

        menuBar.add(editMenu);

        jMenu1.setText("Procesos");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Nómina");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(cutMenuItem);

        menuBar.add(jMenu1);

        jMenu2.setText("Informes");
        menuBar.add(jMenu2);

        jMenu3.setText("Herramientas");

        jMenuItem3.setText("Gestor de Conceptos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Gestor de Usuarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Gestor de Aplicaciones");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        menuBar.add(jMenu3);

        jMenu4.setText("Ayuda");

        jMenuItem7.setText("Instrucciones");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        menuBar.add(jMenu4);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 744, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
      Empleados e = new Empleados();
      panel.add(e);
         Dimension desktopSize = panel.getSize();
        Dimension FrameSize = e.getSize();
         e.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
         
         //registro en bitacora
         try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, usuario.getText());
            pst.setString(3, "Ingresó al Gestor de Empleados");
            
            Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minutos = calendario.get(Calendar.MINUTE);
                int segundos = calendario.get(Calendar.SECOND);
                
                Calendar c1 = Calendar.getInstance();
                String dia = Integer.toString(c1.get(Calendar.DATE));
                String mes = Integer.toString(c1.get(Calendar.MONTH));
                String annio = Integer.toString(c1.get(Calendar.YEAR));
                
                String fecha=dia+"/"+mes+"/"+annio;
                String time=hora+":"+minutos+":"+segundos;
                
                date.setText(fecha);
                timee.setText(time);
                
                pst.setString(4, date.getText());
                pst.setString(5, timee.getText());
                
                 String us = this.usuario.getText();
                    Empleados.usuario.setText(us);
 
            

            pst.executeUpdate();

        } catch (SQLException ex) {

        }

    }//GEN-LAST:event_openMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed

        Nomina nomina=new Nomina();
        panel.add(nomina);
         Dimension desktopSize = panel.getSize();
        Dimension FrameSize = nomina.getSize();
         nomina.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
         
                  //registro en bitacora
         try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, usuario.getText());
            pst.setString(3, "Ingresó a la Nómina");
            
            Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minutos = calendario.get(Calendar.MINUTE);
                int segundos = calendario.get(Calendar.SECOND);
                
                Calendar c1 = Calendar.getInstance();
                String dia = Integer.toString(c1.get(Calendar.DATE));
                String mes = Integer.toString(c1.get(Calendar.MONTH));
                String annio = Integer.toString(c1.get(Calendar.YEAR));
                
                String fecha=dia+"/"+mes+"/"+annio;
                String time=hora+":"+minutos+":"+segundos;
                
                date.setText(fecha);
                timee.setText(time);
                
                pst.setString(4, date.getText());
                pst.setString(5, timee.getText());
 
                 String us = this.usuario.getText();
                    Nomina.usuario.setText(us);
            

            pst.executeUpdate();

        } catch (SQLException ex) {

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void fileMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fileMenuMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_fileMenuMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    Departamentos depto =new Departamentos();
        panel.add(depto);
         Dimension desktopSize = panel.getSize();
        Dimension FrameSize = depto.getSize();
         depto.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
         
                  //registro en bitacora
         try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, usuario.getText());
            pst.setString(3, "Ingresó al Gestor de Departamentos");
            
            Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minutos = calendario.get(Calendar.MINUTE);
                int segundos = calendario.get(Calendar.SECOND);
                
                Calendar c1 = Calendar.getInstance();
                String dia = Integer.toString(c1.get(Calendar.DATE));
                String mes = Integer.toString(c1.get(Calendar.MONTH));
                String annio = Integer.toString(c1.get(Calendar.YEAR));
                
                String fecha=dia+"/"+mes+"/"+annio;
                String time=hora+":"+minutos+":"+segundos;
                
                date.setText(fecha);
                timee.setText(time);
                
                pst.setString(4, date.getText());
                pst.setString(5, timee.getText());

                 String us = this.usuario.getText();
                    Departamentos.usuario.setText(us);
            

            pst.executeUpdate();

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Puestos puesto = new Puestos();
        panel.add(puesto);
         Dimension desktopSize = panel.getSize();
        Dimension FrameSize = puesto.getSize();
         puesto.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
         
                  //registro en bitacora
         try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, usuario.getText());
            pst.setString(3, "Ingresó al Gestor de Puestos");
            
            Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minutos = calendario.get(Calendar.MINUTE);
                int segundos = calendario.get(Calendar.SECOND);
                
                Calendar c1 = Calendar.getInstance();
                String dia = Integer.toString(c1.get(Calendar.DATE));
                String mes = Integer.toString(c1.get(Calendar.MONTH));
                String annio = Integer.toString(c1.get(Calendar.YEAR));
                
                String fecha=dia+"/"+mes+"/"+annio;
                String time=hora+":"+minutos+":"+segundos;
                
                date.setText(fecha);
                timee.setText(time);
                
                pst.setString(4, date.getText());
                pst.setString(5, timee.getText());
                
                 String us = this.usuario.getText();
                    Puestos.usuario.setText(us);
 
            

            pst.executeUpdate();

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Concepto concepto=new Concepto();
        panel.add(concepto);
         Dimension desktopSize = panel.getSize();
        Dimension FrameSize = concepto.getSize();
         concepto.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
         
                  //registro en bitacora
         try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, usuario.getText());
            pst.setString(3, "Ingresó al Gestor de Conceptos");
            
            Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minutos = calendario.get(Calendar.MINUTE);
                int segundos = calendario.get(Calendar.SECOND);
                
                Calendar c1 = Calendar.getInstance();
                String dia = Integer.toString(c1.get(Calendar.DATE));
                String mes = Integer.toString(c1.get(Calendar.MONTH));
                String annio = Integer.toString(c1.get(Calendar.YEAR));
                
                String fecha=dia+"/"+mes+"/"+annio;
                String time=hora+":"+minutos+":"+segundos;
                
                date.setText(fecha);
                timee.setText(time);
                
                pst.setString(4, date.getText());
                pst.setString(5, timee.getText());
 
                 String us = this.usuario.getText();
                    Concepto.usuario.setText(us);
            

            pst.executeUpdate();

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        M_Usuarios usuarios = new M_Usuarios();
        panel.add(usuarios);
         Dimension desktopSize = panel.getSize();
        Dimension FrameSize = usuarios.getSize();
         usuarios.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
         
                  //registro en bitacora
         try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, usuario.getText());
            pst.setString(3, "Ingresó al Gestor de Usuarios");
            
            Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minutos = calendario.get(Calendar.MINUTE);
                int segundos = calendario.get(Calendar.SECOND);
                
                Calendar c1 = Calendar.getInstance();
                String dia = Integer.toString(c1.get(Calendar.DATE));
                String mes = Integer.toString(c1.get(Calendar.MONTH));
                String annio = Integer.toString(c1.get(Calendar.YEAR));
                
                String fecha=dia+"/"+mes+"/"+annio;
                String time=hora+":"+minutos+":"+segundos;
                
                date.setText(fecha);
                timee.setText(time);
                
                pst.setString(4, date.getText());
                pst.setString(5, timee.getText());
 
            

            pst.executeUpdate();
            
            String us = this.usuario.getText();
                    M_Usuarios.usuario.setText(us);

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        dispose();
        frmLogin login=new frmLogin();
        login.setVisible(true);
        
                 //registro en bitacora
         try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, usuario.getText());
            pst.setString(3, "Cerró sesión");
            
            Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minutos = calendario.get(Calendar.MINUTE);
                int segundos = calendario.get(Calendar.SECOND);
                
                Calendar c1 = Calendar.getInstance();
                String dia = Integer.toString(c1.get(Calendar.DATE));
                String mes = Integer.toString(c1.get(Calendar.MONTH));
                String annio = Integer.toString(c1.get(Calendar.YEAR));
                
                String fecha=dia+"/"+mes+"/"+annio;
                String time=hora+":"+minutos+":"+segundos;
                
                date.setText(fecha);
                timee.setText(time);
                
                pst.setString(4, date.getText());
                pst.setString(5, timee.getText());
 
            

            pst.executeUpdate();

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Aplicacion aplicacion=new Aplicacion();
        panel.add(aplicacion);
         Dimension desktopSize = panel.getSize();
        Dimension FrameSize = aplicacion.getSize();
         aplicacion.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
         
                  //registro en bitacora
         try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, usuario.getText());
            pst.setString(3, "Ingresó al Gestor de Aplicaciones");
            
            Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minutos = calendario.get(Calendar.MINUTE);
                int segundos = calendario.get(Calendar.SECOND);
                
                Calendar c1 = Calendar.getInstance();
                String dia = Integer.toString(c1.get(Calendar.DATE));
                String mes = Integer.toString(c1.get(Calendar.MONTH));
                String annio = Integer.toString(c1.get(Calendar.YEAR));
                
                String fecha=dia+"/"+mes+"/"+annio;
                String time=hora+":"+minutos+":"+segundos;
                
                date.setText(fecha);
                timee.setText(time);
                
                pst.setString(4, date.getText());
                pst.setString(5, timee.getText());
                
                 String us = this.usuario.getText();
                    Aplicacion.usuario.setText(us);
 
            

            pst.executeUpdate();

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        
        Instrucciones ins = new Instrucciones();
        panel.add(ins);
         Dimension desktopSize = panel.getSize();
        Dimension FrameSize = ins.getSize();
         ins.setLocation((desktopSize.width-FrameSize.width)/2,(desktopSize.height-FrameSize.height)/2);
         
         
                 //registro en bitacora
         try {
            Connection cn = DriverManager.getConnection(mdiMenuPrincipal.BD, mdiMenuPrincipal.Usuario, mdiMenuPrincipal.Contraseña);
            //localhost es 127.0.0.1
            PreparedStatement pst = cn.prepareStatement("insert into Bitacora values(?,?,?,?,?)");

            pst.setString(1, "0");
            pst.setString(2, usuario.getText());
            pst.setString(3, "Ingresó a las Instrucciones");
            
            Calendar calendario = Calendar.getInstance();
                
                int hora = calendario.get(Calendar.HOUR_OF_DAY);
                int minutos = calendario.get(Calendar.MINUTE);
                int segundos = calendario.get(Calendar.SECOND);
                
                Calendar c1 = Calendar.getInstance();
                String dia = Integer.toString(c1.get(Calendar.DATE));
                String mes = Integer.toString(c1.get(Calendar.MONTH));
                String annio = Integer.toString(c1.get(Calendar.YEAR));
                
                String fecha=dia+"/"+mes+"/"+annio;
                String time=hora+":"+minutos+":"+segundos;
                
                date.setText(fecha);
                timee.setText(time);
                
                pst.setString(4, date.getText());
                pst.setString(5, timee.getText());
 
            

            pst.executeUpdate();

        } catch (SQLException ex) {

        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed
       
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
            java.util.logging.Logger.getLogger(mdiMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mdiMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mdiMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mdiMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mdiMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JLabel date;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JDesktopPane panel;
    private javax.swing.JLabel timee;
    public static javax.swing.JLabel usuario;
    // End of variables declaration//GEN-END:variables

}
