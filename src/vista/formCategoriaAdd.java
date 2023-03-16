
package vista;
import DAO.CategoriaDAO;
import Modelo.Categoria;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter; 
import javax.swing.JOptionPane;
import Modelo.Usuario;

public class formCategoriaAdd extends javax.swing.JFrame {
   Usuario sysUser;
    
    public formCategoriaAdd() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    public formCategoriaAdd(Usuario user){
        initComponents();
        
        this.setLocationRelativeTo(null);
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
        btnCancelarc = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtabreviatura = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        labRUC = new javax.swing.JLabel();
        labRUC1 = new javax.swing.JLabel();
        labRUC2 = new javax.swing.JLabel();
        btnGuardarc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(224, 224, 224));

        btnCancelarc.setBackground(new java.awt.Color(204, 204, 204));
        btnCancelarc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelarc.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarc.setText("Cancelar");
        btnCancelarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarcActionPerformed(evt);
            }
        });

        txtnombre.setBackground(new java.awt.Color(224, 224, 224));
        txtnombre.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtnombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtabreviatura.setBackground(new java.awt.Color(224, 224, 224));
        txtabreviatura.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        txtabreviatura.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        txtabreviatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtabreviaturaActionPerformed(evt);
            }
        });

        txtdescripcion.setColumns(20);
        txtdescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtdescripcion.setForeground(new java.awt.Color(51, 51, 51));
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 58, 82));
        jLabel2.setText("CATEGORIA");

        labRUC.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRUC.setForeground(new java.awt.Color(0, 0, 0));
        labRUC.setText("Nombre");

        labRUC1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRUC1.setForeground(new java.awt.Color(0, 0, 0));
        labRUC1.setText("Abreviatura");

        labRUC2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labRUC2.setForeground(new java.awt.Color(0, 0, 0));
        labRUC2.setText("Descripcion");

        btnGuardarc.setBackground(new java.awt.Color(11, 58, 82));
        btnGuardarc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardarc.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarc.setText("Guardar");
        btnGuardarc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(btnGuardarc)
                .addGap(94, 94, 94)
                .addComponent(btnCancelarc)
                .addGap(140, 140, 140))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labRUC1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labRUC2)
                            .addComponent(labRUC, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtabreviatura, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                .addComponent(txtnombre)
                                .addComponent(jLabel2)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addComponent(labRUC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(labRUC1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtabreviatura, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(labRUC2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 293, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarc)
                            .addComponent(btnCancelarc))
                        .addGap(55, 55, 55))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtabreviaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtabreviaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtabreviaturaActionPerformed

    private void btnCancelarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarcActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarcActionPerformed

    private void btnGuardarcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarcActionPerformed
        Categoria catego = new Categoria();
        CategoriaDAO categoDAO = new CategoriaDAO();
        
        if(!txtnombre.getText().equals("") && !txtabreviatura.getText().equals("") && 
                !txtdescripcion.getText().equals("") ){
            
            catego.setNombre((String)txtnombre.getText());
            catego.setAbreviatura((String)txtabreviatura.getText());
            catego.setDescripcion((String)txtdescripcion.getText());
            
            catego.setEstado(1);
            catego.setFechaIngreso(LocalDateTime.now());
            catego.setUsuarioIngreso(sysUser.getUsername());
            
            
            
            if (categoDAO.registrar(catego) ){
                this.dispose();
                formCategoriaAdd categos = new formCategoriaAdd();
                
                formCategorias.getDefaultLocale();
            }
            else{
                JOptionPane.showMessageDialog(null, "No se guardaron los datos");
            }
            
        }
        else{
            JOptionPane.showMessageDialog(null,"Por favor llene todos los campos");
        }
    }//GEN-LAST:event_btnGuardarcActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(formCategoriaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(formCategoriaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(formCategoriaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(formCategoriaAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formCategoriaAdd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelarc;
    private javax.swing.JButton btnGuardarc;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labRUC;
    private javax.swing.JLabel labRUC1;
    private javax.swing.JLabel labRUC2;
    private javax.swing.JTextField txtabreviatura;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
