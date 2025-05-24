package vistas.medico;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelos.Medico;
import utilidades.AccesoController;
import utilidades.Verificador.TipoValidacion;
import utilidades.Verificador.Verificador;
import vistas.paciente.JF_NuevoFormularioPaciente;

/**
 *
 * @author conta
 */
public class JF_FormularioMedico extends javax.swing.JFrame {
    
    private Pnl_GestionMedico panelPadre;
    private Verificador verificador;
    private Medico medico;
    private AccesoController accesoController;
    
    public JF_FormularioMedico(Pnl_GestionMedico panelPadre) {
        this.panelPadre = panelPadre;
        verificador = new Verificador();
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    
    public void setMedico(Medico medico) {
        this.medico = medico;
        llenarFormulario();
    }
    
    private Medico obtenerDatos(){
        int id = medico.getId();
        int cedula = medico.getCedula();
        int edad = medico.getEdad();
        String nombre = medico.getNombre();
        String apellido = medico.getApellido();
        String especialidad = medico.getEspecialidad();
        String genero = medico.getGenero();
        int telefono = medico.getTelefono();
        return new Medico(id, cedula, edad, nombre, apellido, especialidad, genero, telefono );
    }

    private void llenarFormulario() {
        if (medico != null) {
            String cedula = ""+medico.getCedula();
            String telefono = ""+medico.getTelefono();
            
            txt_Cedula.setText(cedula);
            txt_Edad.setText(cedula);
            txtNombre.setText(medico.getNombre());
            txtApellido.setText(medico.getApellido());
            txtEspecialidad.setText(medico.getEspecialidad());
            cbx_Genero.setSelectedItem(cedula);
            txtTelefono.setText(telefono);
        }
        if (medico.getGenero().equalsIgnoreCase("Masculino")) {
            cbx_Genero.setSelectedItem("Masculino");
        } else if (medico.getGenero().equalsIgnoreCase("Femenino")) {
            cbx_Genero.setSelectedItem("Femenino");
}
    }                     

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
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txt_Cedula = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtEspecialidad = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        lblApellido = new javax.swing.JLabel();
        btnResetear = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblCedula1 = new javax.swing.JLabel();
        lblTelefono1 = new javax.swing.JLabel();
        cbx_Genero = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        lblCedula2 = new javax.swing.JLabel();
        txt_Edad = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario");

        lblTelefono.setText("Telefono");

        lblCedula.setText("Cedula");

        txt_Cedula.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        txtTelefono.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        txtApellido.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        lblNombre.setText("Nombre");

        txtEspecialidad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        lblApellido.setText("Apellido");

        btnResetear.setText("Resetea");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblCedula1.setText("Especialidad");

        lblTelefono1.setText("Genero ");

        cbx_Genero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txtNombre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        lblCedula2.setText("Edad");

        txt_Edad.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BOTTOM)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(170, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblCedula)
                        .addGap(93, 93, 93)
                        .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAceptar)
                                .addGap(18, 18, 18)
                                .addComponent(btnResetear)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCedula2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblApellido)
                                            .addComponent(lblNombre)
                                            .addComponent(lblTelefono)
                                            .addComponent(lblCedula1)
                                            .addComponent(lblTelefono1))
                                        .addGap(65, 65, 65)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEspecialidad)
                                            .addComponent(txtApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtTelefono)
                                            .addComponent(cbx_Genero, javax.swing.GroupLayout.Alignment.TRAILING, 0, 93, Short.MAX_VALUE)
                                            .addComponent(txtNombre))))
                                .addGap(18, 18, 18)))
                        .addGap(166, 166, 166))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCedula)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(lblCedula2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblApellido)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbx_Genero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefono1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCedula1)
                    .addComponent(txtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnResetear)
                    .addComponent(btnAceptar)
                    .addComponent(btnSalir))
                .addGap(52, 52, 52))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
  
        String cedula = txt_Cedula.getText().trim();
        String edad = txt_Edad.getText().trim();
        String nombre = txtNombre.getText().trim();
        String apellido = txtApellido.getText().trim();
        String especialidad = txtEspecialidad.getText().trim();
        String genero = cbx_Genero.getSelectedItem().toString();
        String telefono = txtTelefono.getText().trim();


        // Validación
        boolean cedulaValidacion = verificador.verificar(cedula, TipoValidacion.NO_NULO, TipoValidacion.NUMERICO);
        boolean nombreValidacion = verificador.verificar(nombre, TipoValidacion.NO_NULO, TipoValidacion.CADENA_TEXTO_VALIDA);
        boolean apellidoValidacion = verificador.verificar(apellido, TipoValidacion.NO_NULO, TipoValidacion.CADENA_TEXTO_VALIDA);
        boolean telefonoValidacion = verificador.verificar(telefono, TipoValidacion.NO_NULO, TipoValidacion.NUMERICO);

        // Si todos son válidos
        if (cedulaValidacion && nombreValidacion && apellidoValidacion && telefonoValidacion){
            int cedula1 = Integer.parseInt(cedula);
            int telefono1 = Integer.parseInt(telefono);


            //Medico medico = new Medico(0, cedula1, nombre, apellido, especialidad, genero, telefono1);

            //MedicoController medicoController = new MedicoController();
            //medicoController.PostMedico(medico);

            //panelPadre.TablaMedicoLlenado();

            this.dispose();

            JOptionPane.showMessageDialog(null, "Datos guardados correctamente.");
        } else {
            JOptionPane.showMessageDialog(null, "Hay campos inválidos o vacíos.\nPor favor, revise e intente nuevamente.");

        }
    }       

    private boolean validarEntrada(){
        if(!validarNumero(txt_Cedula)){
            JOptionPane.showMessageDialog(null, "La cedula es un dato incorrecto o vacio");
            return false;
        }
        if(!validarLetra(txtNombre)){
            JOptionPane.showMessageDialog(null, "El nombre es un dato incorrecto o vacio");
            return false;
        }
        if(!validarLetra(txtApellido)){
            JOptionPane.showMessageDialog(null, "EL apellido es dato incorrecto o vacio");
            return false;
        }
        if(!validarNumero(txt_Edad)){
            JOptionPane.showMessageDialog(null, "La edad es dato incorrecto o vacio");
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
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        txt_Cedula.setText("");
        txt_Edad.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        txtEspecialidad.setText("");
        cbx_Genero.setSelectedIndex(-1); 
        txtTelefono.setText("");      
    }//GEN-LAST:event_btnSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnResetear;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cbx_Genero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCedula1;
    private javax.swing.JLabel lblCedula2;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTelefono1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtEspecialidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txt_Cedula;
    private javax.swing.JTextField txt_Edad;
    // End of variables declaration//GEN-END:variables
}
