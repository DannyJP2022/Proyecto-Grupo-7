
package tallermecanico.Graficas;

import tallermecanico.Graficas.jModuloInicioSesion;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PaginaPrincipal extends javax.swing.JFrame {

    jModuloInicioSesion moduloInicioSesion = new jModuloInicioSesion();
     boolean sesionActiva;
    
    public PaginaPrincipal() {
        initComponents();
        sesionActiva=false;
        jMenuLogOut.setEnabled(false);
        jMenuModulos.setEnabled(false);
        this.add(moduloInicioSesion);
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBarraPrincipal = new javax.swing.JMenuBar();
        jMenuArchivo = new javax.swing.JMenu();
        jMenuLogIn = new javax.swing.JMenuItem();
        jMenuLogOut = new javax.swing.JMenuItem();
        jMenuModulos = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenuArchivo.setText("Archivo");
        jMenuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuArchivoActionPerformed(evt);
            }
        });

        jMenuLogIn.setText("Iniciar Sesion");
        jMenuLogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogInActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuLogIn);

        jMenuLogOut.setText("Cerrar sesion");
        jMenuLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuLogOutActionPerformed(evt);
            }
        });
        jMenuArchivo.add(jMenuLogOut);

        jMenuBarraPrincipal.add(jMenuArchivo);

        jMenuModulos.setText("Modulos");
        jMenuBarraPrincipal.add(jMenuModulos);

        setJMenuBar(jMenuBarraPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 939, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 466, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogInActionPerformed
        moduloInicioSesion.limpiarCampos();
        moduloInicioSesion.setJMenuLogIn(jMenuLogIn);
        moduloInicioSesion.setJMenuLogOut(jMenuLogOut);
        moduloInicioSesion.show();

    }//GEN-LAST:event_jMenuLogInActionPerformed

    private void jMenuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuArchivoActionPerformed
        
    }//GEN-LAST:event_jMenuArchivoActionPerformed

    private void jMenuLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuLogOutActionPerformed
       jMenuLogOut.setEnabled(false);
        jMenuLogIn.setEnabled(true);
    }//GEN-LAST:event_jMenuLogOutActionPerformed
     
   
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
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaginaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaginaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenuArchivo;
    private javax.swing.JMenuBar jMenuBarraPrincipal;
    private javax.swing.JMenuItem jMenuLogIn;
    private javax.swing.JMenuItem jMenuLogOut;
    private javax.swing.JMenu jMenuModulos;
    // End of variables declaration//GEN-END:variables
}