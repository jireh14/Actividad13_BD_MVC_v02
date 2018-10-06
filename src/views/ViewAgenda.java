package views;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Zeo
 */
public class ViewAgenda extends javax.swing.JFrame {

    /**
     * Creates new form ViewAgenda
     */
    public ViewAgenda() {
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
        jl_nombre = new javax.swing.JLabel();
        jl_email = new javax.swing.JLabel();
        jtf_nombre = new javax.swing.JTextField();
        jtf_email = new javax.swing.JTextField();
        jbtn_primero = new javax.swing.JButton();
        jbtn_anterior = new javax.swing.JButton();
        jbtn_siguiente = new javax.swing.JButton();
        jbtn_ultimo = new javax.swing.JButton();
        jB_nuevo = new javax.swing.JButton();
        jB_insertar = new javax.swing.JButton();
        jB_modificar = new javax.swing.JButton();
        jB_eliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jl_nombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jl_nombre.setForeground(new java.awt.Color(255, 0, 204));
        jl_nombre.setText("Nombre");

        jl_email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jl_email.setForeground(new java.awt.Color(255, 0, 204));
        jl_email.setText("Email");

        jbtn_primero.setBackground(new java.awt.Color(255, 0, 204));
        jbtn_primero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn_primero.setForeground(new java.awt.Color(255, 255, 0));
        jbtn_primero.setText("|<");

        jbtn_anterior.setBackground(new java.awt.Color(255, 0, 204));
        jbtn_anterior.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn_anterior.setForeground(new java.awt.Color(255, 255, 0));
        jbtn_anterior.setText("<<");
        jbtn_anterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_anteriorActionPerformed(evt);
            }
        });

        jbtn_siguiente.setBackground(new java.awt.Color(255, 0, 204));
        jbtn_siguiente.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn_siguiente.setForeground(new java.awt.Color(255, 255, 0));
        jbtn_siguiente.setText(">>");

        jbtn_ultimo.setBackground(new java.awt.Color(255, 0, 204));
        jbtn_ultimo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtn_ultimo.setForeground(new java.awt.Color(255, 255, 0));
        jbtn_ultimo.setText(">|");

        jB_nuevo.setBackground(new java.awt.Color(255, 0, 204));
        jB_nuevo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jB_nuevo.setForeground(new java.awt.Color(255, 255, 0));
        jB_nuevo.setText("Nuevo");
        jB_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_nuevoActionPerformed(evt);
            }
        });

        jB_insertar.setBackground(new java.awt.Color(255, 0, 204));
        jB_insertar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jB_insertar.setForeground(new java.awt.Color(255, 255, 0));
        jB_insertar.setText("Insertar");

        jB_modificar.setBackground(new java.awt.Color(255, 0, 204));
        jB_modificar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jB_modificar.setForeground(new java.awt.Color(255, 255, 0));
        jB_modificar.setText("Modificar");
        jB_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_modificarActionPerformed(evt);
            }
        });

        jB_eliminar.setBackground(new java.awt.Color(255, 0, 204));
        jB_eliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jB_eliminar.setForeground(new java.awt.Color(255, 255, 0));
        jB_eliminar.setText("Eliminar");

        jPanel2.setBackground(new java.awt.Color(255, 0, 204));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText(" Base de Datos en MVC v 0.2");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(59, 59, 59))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jbtn_primero)
                .addGap(49, 49, 49)
                .addComponent(jbtn_anterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbtn_siguiente)
                .addGap(51, 51, 51)
                .addComponent(jbtn_ultimo)
                .addGap(33, 33, 33))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jl_nombre)
                            .addComponent(jl_email))
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jB_nuevo)
                        .addGap(18, 18, 18)
                        .addComponent(jB_insertar)
                        .addGap(18, 18, 18)
                        .addComponent(jB_modificar)
                        .addGap(18, 18, 18)
                        .addComponent(jB_eliminar)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_nombre))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtf_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jl_email))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_primero)
                    .addComponent(jbtn_anterior)
                    .addComponent(jbtn_siguiente)
                    .addComponent(jbtn_ultimo))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_nuevo)
                    .addComponent(jB_modificar)
                    .addComponent(jB_insertar)
                    .addComponent(jB_eliminar))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_modificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_modificarActionPerformed

    private void jbtn_anteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_anteriorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_anteriorActionPerformed

    private void jB_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_nuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jB_nuevoActionPerformed

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
            java.util.logging.Logger.getLogger(ViewAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAgenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewAgenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jB_eliminar;
    public javax.swing.JButton jB_insertar;
    public javax.swing.JButton jB_modificar;
    public javax.swing.JButton jB_nuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public javax.swing.JButton jbtn_anterior;
    public javax.swing.JButton jbtn_primero;
    public javax.swing.JButton jbtn_siguiente;
    public javax.swing.JButton jbtn_ultimo;
    public javax.swing.JLabel jl_email;
    public javax.swing.JLabel jl_nombre;
    public javax.swing.JTextField jtf_email;
    public javax.swing.JTextField jtf_nombre;
    // End of variables declaration//GEN-END:variables
}
