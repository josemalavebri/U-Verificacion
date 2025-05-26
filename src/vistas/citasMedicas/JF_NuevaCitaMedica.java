package vistas.citasMedicas;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import modelos.CitaMedica;
import modelos.Medico;
import modelos.Paciente;
import modelos.Turno;

import utilidades.AccesoController;
import utilidades.ManagerController;
import utilidades.Table.TableColumns;
import utilidades.Verificador.VerificadorDeFormato;

import vistas.Factura.JF_Factura;

public class JF_NuevaCitaMedica extends javax.swing.JFrame {
    private Turno turnoSeleccionado;
    private ManagerController managerController;
    private ArrayList<Paciente> listaPacientes;
    private ArrayList<Medico> listaMedicos;
    private ArrayList<Turno> turnosDisponibles;

    public JF_NuevaCitaMedica() {
        initComponents();
        inicializarComponentesLogicos();
        cargarDatosComboBox();
        mostrarTurnosEnTabla();
    } 
    
    private void inicializarComponentesLogicos(){
        turnoSeleccionado = new Turno();
        managerController = new ManagerController();
        asignarEventoClickFilaTurno();
    }
    
    private void cargarDatosComboBox(){
        listaMedicos = managerController.get(Medico.class);
        listaPacientes = managerController.get(Paciente.class);
        llenarComboBoxConDatos(cbx_medicos, listaMedicos);
        llenarComboBoxConDatos(cbx_paciente, listaPacientes);
    }
    
    private void mostrarTurnosEnTabla() {
        turnosDisponibles = managerController.get(Turno.class);
        Turno turnoModelo = turnosDisponibles.get(1);
        TableColumns tableColumns = new TableColumns();
        DefaultTableModel modeloTabla = tableColumns.CrearColumnasModelo(turnoModelo);
        for (Turno t : turnosDisponibles) {
            Object[] fila = {t.getId(), t.getFecha(), t.getHora(), t.getMinuto()};
            modeloTabla.addRow(fila);
        }
        tb_turnos.setModel(modeloTabla);
    }
     
    private <T> void llenarComboBoxConDatos(JComboBox<String> comboBox, ArrayList<T> lista) {
        comboBox.removeAllItems();
        for (T item : lista) {
            comboBox.addItem(item.toString());
        }
    }
    
    private void asignarEventoClickFilaTurno(){
        tb_turnos.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int filaSeleccionada = tb_turnos.getSelectedRow();
                if (filaSeleccionada != -1) {
                    turnoSeleccionado = turnosDisponibles.get(filaSeleccionada);
                    TextBoxTurno(turnoSeleccionado);
                }   
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbx_paciente = new javax.swing.JComboBox<>();
        btn_resetear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_turnos = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        btn_guardar1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txta_descripcion = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbx_medicos = new javax.swing.JComboBox<>();
        txt_turnoSeleccionado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cbx_paciente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btn_resetear.setText("Resetear");
        btn_resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetearActionPerformed(evt);
            }
        });

        tb_turnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tb_turnos);

        jLabel5.setText("Turnos:");

        btn_guardar1.setText("Guardar");
        btn_guardar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar1ActionPerformed(evt);
            }
        });

        txta_descripcion.setColumns(20);
        txta_descripcion.setRows(5);
        jScrollPane2.setViewportView(txta_descripcion);

        jLabel3.setText("Paciente:");

        jLabel2.setText("Medicos:");

        jLabel4.setText("Descripcion");

        cbx_medicos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        txt_turnoSeleccionado.setText("Turno Seleccionado");
        txt_turnoSeleccionado.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(cbx_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cbx_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(btn_resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(113, 113, 113)
                                        .addComponent(txt_turnoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbx_paciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbx_medicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btn_resetear, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_guardar1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_turnoSeleccionado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void btn_resetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetearActionPerformed
        cbx_paciente.setSelectedIndex(0);
        cbx_medicos.setSelectedIndex(0);
        txta_descripcion.setText("");
        txt_turnoSeleccionado.setText("Turno Seleccionado");
    }//GEN-LAST:event_btn_resetearActionPerformed

    private void btn_guardar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar1ActionPerformed
        if(!verificarCampos()){
            return;
        }
        
        CitaMedica citaMedica = crearCitaMedicaFormulario();
        boolean guadadoExitoso = managerController.post(citaMedica);
        generarFactura(citaMedica);
        
        if (guadadoExitoso){
            JOptionPane.showMessageDialog(null, "Cita Medica guadada con exito");
        } else {
            JOptionPane.showMessageDialog(null, "Error al guardar la cita médica");
        }
    }//GEN-LAST:event_btn_guardar1ActionPerformed
    
    private boolean verificarCampos(){
        if(! VerificadorDeFormato.verificarCampoTexto(cbx_medicos.getSelectedItem(), "Campo Medico Vacio o no valido")) 
            return false;
        
        if(! VerificadorDeFormato.verificarCampoTexto(cbx_paciente.getSelectedItem(), "Campo Paciente Vacio o no valido")) 
            return false;
        
        if(! VerificadorDeFormato.verificarCampoTexto(txta_descripcion.getText(), "Descripcion no valida")) 
            return false;
        
        return true;
    }
    
    private CitaMedica crearCitaMedicaFormulario(){
        Medico medico =  (Medico) cbx_medicos.getSelectedItem();
        Paciente paciente = (Paciente) cbx_paciente.getSelectedItem();
        String descripcion = txta_descripcion.getText();
        CitaMedica citaMedica = new CitaMedica(paciente, medico, descripcion, turnoSeleccionado);
        return citaMedica;
    }
    
    private void generarFactura(CitaMedica citaMedica){
        JF_Factura factura = new JF_Factura();
        factura.setCitaMedica(citaMedica);
        factura.setLocationRelativeTo(null);
        factura.setVisible(true);
    }
    
    private void TextBoxTurno(Turno turnoSeleccionadoActual){
        txt_turnoSeleccionado.setText(turnoSeleccionadoActual.getFecha()+" - "+turnoSeleccionadoActual.getHora());
    }
    
    public void setCitaMedicaModificar(CitaMedica citaMedica){
        llenarFormularioCitaMedica(citaMedica);
    }
    
    private void llenarFormularioCitaMedica(CitaMedica citaMedica){
        cbx_paciente.setSelectedIndex(0);
        cbx_medicos.setSelectedIndex(0);
        txta_descripcion.setText(citaMedica.getDescripcion());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar1;
    private javax.swing.JButton btn_resetear;
    private javax.swing.JComboBox<String> cbx_medicos;
    private javax.swing.JComboBox<String> cbx_paciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_turnos;
    private javax.swing.JTextField txt_turnoSeleccionado;
    private javax.swing.JTextArea txta_descripcion;
    // End of variables declaration//GEN-END:variables
}
