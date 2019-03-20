// Programa para practicar operaciones aritméticas básicas
// * Suma
// * Resta
// * División
// * Multiplicación

// Creando parche de difusión
package operaciones;

import operaciones.Multiplicacion;

public class App_Multiplicacion extends javax.swing.JFrame {
    
    Multiplicacion objeto = new Multiplicacion();
    int f1, f2, resultado, sol, cifras, operacion, temp;
    String signo;
    /**
     * Creates new form App_Multiplicacion
     */
    public App_Multiplicacion() {
        initComponents();
        inicializaComponentes();
    }
    
    private void inicializaComponentes(){
        EtiquetaSigno.setVisible(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        Factor1 = new javax.swing.JTextField();
        Factor2 = new javax.swing.JTextField();
        EtiquetaSigno = new javax.swing.JLabel();
        Producto = new javax.swing.JTextField();
        ContenedorSol = new javax.swing.JScrollPane();
        Solución = new javax.swing.JTextArea();
        BotonNuevaOperación = new javax.swing.JButton();
        BotonComprobarProducto = new javax.swing.JButton();
        CBOperacion = new javax.swing.JComboBox<>();
        EtiquetaOperacion = new javax.swing.JLabel();
        EtiquetaCifras = new javax.swing.JLabel();
        CBCifras = new javax.swing.JComboBox<>();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Operaciones");

        Factor1.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        Factor1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Factor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factor1ActionPerformed(evt);
            }
        });

        Factor2.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        Factor2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Factor2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Factor2ActionPerformed(evt);
            }
        });

        EtiquetaSigno.setFont(new java.awt.Font("Bauhaus 93", 1, 24)); // NOI18N

        Producto.setFont(new java.awt.Font("Bauhaus 93", 0, 48)); // NOI18N
        Producto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoActionPerformed(evt);
            }
        });

        Solución.setEditable(false);
        Solución.setColumns(10);
        Solución.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        Solución.setRows(4);
        Solución.setText("\n\n\n");
        ContenedorSol.setViewportView(Solución);

        BotonNuevaOperación.setText("Nueva operación");
        BotonNuevaOperación.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonNuevaOperaciónMouseClicked(evt);
            }
        });

        BotonComprobarProducto.setText("Comprobar producto");
        BotonComprobarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonComprobarProductoMouseClicked(evt);
            }
        });

        CBOperacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suma", "Resta", "Multiplicación", "División" }));
        CBOperacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBOperacionActionPerformed(evt);
            }
        });

        EtiquetaOperacion.setText("Selecciona la operación");

        EtiquetaCifras.setText("Número de cifras");

        CBCifras.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "Aleatorio" }));
        CBCifras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCifrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EtiquetaCifras)
                            .addComponent(EtiquetaOperacion))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CBOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CBCifras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(Factor1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(EtiquetaSigno)
                        .addGap(42, 42, 42)
                        .addComponent(Factor2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(BotonNuevaOperación))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(BotonComprobarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(Producto)
                    .addComponent(ContenedorSol, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE))
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CBOperacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EtiquetaOperacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaCifras)
                    .addComponent(CBCifras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(BotonNuevaOperación)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EtiquetaSigno)
                    .addComponent(Factor1)
                    .addComponent(Factor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(BotonComprobarProducto)
                .addGap(18, 18, 18)
                .addComponent(ContenedorSol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Factor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Factor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Factor1ActionPerformed

    private void Factor2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Factor2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Factor2ActionPerformed

    private void ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoActionPerformed

    private void BotonNuevaOperaciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonNuevaOperaciónMouseClicked
        EtiquetaSigno.setVisible(true);
        Producto.setText("");
        Solución.setText("");
        cifras = CBCifras.getSelectedIndex();
        operacion = CBOperacion.getSelectedIndex();
        
        if(operacion == 2 && cifras == 0){
            f1 = objeto.obtenerFactor(4);
            f2 = objeto.obtenerFactor(4);
        }
        
        else if(operacion == 3){
            f1 = objeto.obtenerFactor(cifras);
            f2 = objeto.obtenerFactor(4);
        }
        
        else{
            f1 = objeto.obtenerFactor(cifras);
            f2 = objeto.obtenerFactor(cifras);
        }

        if((operacion == 1) || (operacion == 3)){
            if(f1 < f2){
                temp = f1;
                f1 = f2;
                f2 = temp;
            }
        }
        Factor1.setText(Integer.toString(f1));
        Factor2.setText(Integer.toString(f2)); 
        signo = objeto.obtenerSigno(operacion);
        EtiquetaSigno.setText(signo);
    }//GEN-LAST:event_BotonNuevaOperaciónMouseClicked

    private void BotonComprobarProductoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonComprobarProductoMouseClicked
        if(!Producto.getText().equals("")){
            f1 = Integer.parseInt(Factor1.getText());
            f2 = Integer.parseInt(Factor2.getText());
            resultado = Integer.parseInt(Producto.getText());
            sol = objeto.operador(operacion, f1, f2);

            if(resultado == sol){
                Solución.setText("¡Correcto! :)\n");
                Solución.append("\n" + f1 + " " + signo + " " + f2 + " = " + sol);
            }

            else{
                Solución.setText("Incorrecto :(\n");
                Solución.append("\n" + f1 + " " + signo + " " + f2 + " = " + sol);
            }
        }
    }//GEN-LAST:event_BotonComprobarProductoMouseClicked

    private void CBOperacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBOperacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBOperacionActionPerformed

    private void CBCifrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCifrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCifrasActionPerformed

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
            java.util.logging.Logger.getLogger(App_Multiplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(App_Multiplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(App_Multiplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(App_Multiplicacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new App_Multiplicacion().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonComprobarProducto;
    private javax.swing.JButton BotonNuevaOperación;
    private javax.swing.JComboBox<String> CBCifras;
    private javax.swing.JComboBox<String> CBOperacion;
    private javax.swing.JScrollPane ContenedorSol;
    private javax.swing.JLabel EtiquetaCifras;
    private javax.swing.JLabel EtiquetaOperacion;
    private javax.swing.JLabel EtiquetaSigno;
    private javax.swing.JTextField Factor1;
    private javax.swing.JTextField Factor2;
    private javax.swing.JTextField Producto;
    private javax.swing.JTextArea Solución;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}