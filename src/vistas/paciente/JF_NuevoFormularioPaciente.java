package vistas.paciente;

import modelos.Paciente;
import utilidades.Verificador.TipoValidacion;
import utilidades.Verificador.Verificador;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import utilidades.AccesoController;

public class JF_NuevoFormularioPaciente extends javax.swing.JFrame {

    private Pnl_GestorPaciente panelPadre;
    private Verificador verificador;
    private Paciente paciente;
    private AccesoController accesoController;
    
    public JF_NuevoFormularioPaciente(Pnl_GestorPaciente panelPadre, AccesoController accesoController) {
        this.accesoController = accesoController;
        this.panelPadre = panelPadre;
        initComponents();
        inicializarDatos();
    }

    public JF_NuevoFormularioPaciente() {
    }

    private void inicializarDatos(){
        verificador = new Verificador();

    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtEdad = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        lblCedula = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        lblApellido = new javax.swing.JLabel();
        btnResetear = new javax.swing.JButton();
        lblEdad = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lblCorreo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtEdad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        txtCorreo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        lblCedula.setText("Cedula");

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        lblNombre.setText("Nombre");

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblApellido.setText("Apellido");

        btnResetear.setText("Resetear");
        btnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetearActionPerformed(evt);
            }
        });

        lblEdad.setText("Edad");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblCorreo.setText("Correo");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario");

        lblTelefono.setText("Telefono");

        txtCedula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTelefono)
                    .addComponent(lblCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEdad, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombre, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedula, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNombre)
                    .addComponent(txtCedula)
                    .addComponent(txtApellido)
                    .addComponent(txtEdad)
                    .addComponent(txtCorreo)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnResetear, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCedula))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnAceptar)
                        .addGap(18, 18, 18)
                        .addComponent(btnResetear)
                        .addGap(18, 18, 18)
                        .addComponent(btnSalir))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblApellido, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEdad)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorreo)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
        llenarFormulario();
    }

    private void llenarFormulario() {
        if (paciente != null) {
            txtCedula.setText(String.valueOf(paciente.getCedula()));
            txtNombre.setText(paciente.getNombre());
            txtApellido.setText(paciente.getApellido());
            txtEdad.setText(String.valueOf(paciente.getEdad()));
            txtCorreo.setText(paciente.getCorreo());
            txtTelefono.setText(String.valueOf(paciente.getTelefono()));
        }
    }
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        String cedulaTexto = txtCedula.getText().trim();
        int cedula = Integer.parseInt(cedulaTexto);
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String edadTexto = txtEdad.getText().trim();
        int edad = Integer.parseInt(edadTexto);
        String correo = txtCorreo.getText().trim();
        String telefonoTexto = txtTelefono.getText().trim();
        int telefono = Integer.parseInt(telefonoTexto);
        if(validarEntrada()){
            Paciente paciente = new Paciente(cedula,nombre,apellido,edad,correo,telefono);
            if(accesoController.pacienteController().post(paciente)){
                panelPadre.TablaPacienteLlenado();
                this.dispose();
                JOptionPane.showMessageDialog(null, "Paciente guardado correctamente.");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Campos vacios, llene todos los campos");
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private boolean validarEntrada(){
        if(!validarNumero(txtCedula)){
            JOptionPane.showMessageDialog(null, "Campo cedula es un dato incorrecto o vacio");
            return false;
        }
        if(!validarLetra(txtNombre)){
            JOptionPane.showMessageDialog(null, "Campo nombre es un dato incorrecto o vacio");
            return false;
        }
        if(!validarLetra(txtApellido)){
            JOptionPane.showMessageDialog(null, "Campo apellido es dato incorrecto o vacio");
            return false;
        }
        if(!validarNumero(txtEdad)){
            JOptionPane.showMessageDialog(null, "Campo edad es dato incorrecto o vacio");
            return false;
        }
        if(!validarNumero(txtTelefono)){
            JOptionPane.showMessageDialog(null, "Campo telefono es dato incorrecto o vacio");
            return false;
        }
        return true;
    }
    
    private boolean validarLetra(JTextField texto){
        return verificador.verificar(texto.getText(), TipoValidacion.NO_NULO, TipoValidacion.CADENA_TEXTO_VALIDA);
    }
    
    private boolean validarNumero(JTextField texto){
        return verificador.verificar(texto.getText(), TipoValidacion.NO_NULO, TipoValidacion.NUMERICO);
    }
    
    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetearActionPerformed
        // TODO add your handling code here:
        txtCedula.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEdad.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
    }//GEN-LAST:event_btnResetearActionPerformed

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
            java.util.logging.Logger.getLogger(JF_NuevoFormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JF_NuevoFormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JF_NuevoFormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JF_NuevoFormularioPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JF_NuevoFormularioPaciente().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnResetear;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
