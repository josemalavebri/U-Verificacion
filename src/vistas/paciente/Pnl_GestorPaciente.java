package vistas.paciente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Paciente;
import utilidades.AccesoController;
import utilidades.Table.ButtonTable.ButtonEditor;
import utilidades.Table.ButtonTable.ButtonRenderer;
import utilidades.ManagerController;

public class Pnl_GestorPaciente extends javax.swing.JPanel {
    
    private static final String MODIFICAR = "Modificar";
    private static final String ELIMINAR = "Eliminar";
    private AccesoController accesoController;
    private ManagerController managerController;
    private ArrayList<Paciente> datosPaciente;
    private JF_NuevoFormularioPaciente formularioPaciente;
    
    public Pnl_GestorPaciente(AccesoController accesoController) {
        this.accesoController = accesoController;
        initComponents();
        inicializarDatos();
        TablaPacienteLlenado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_cedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btn_resetear = new javax.swing.JButton();
        btn_nuevo = new javax.swing.JButton();
        btn_buscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_paciente = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(600, 400));
        setPreferredSize(new java.awt.Dimension(600, 400));

        lbl_cedula.setText("Cedula");

        btn_resetear.setText("Resetear");
        btn_resetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetearActionPerformed(evt);
            }
        });

        btn_nuevo.setText("Nuevo");
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });

        btn_buscar.setText("Buscar");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        tb_paciente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_paciente);

        jLabel1.setText("Paciente:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbl_cedula)
                        .addGap(18, 18, 18)
                        .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_buscar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_resetear)
                        .addGap(127, 127, 127))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_cedula)
                            .addComponent(btn_buscar)
                            .addComponent(btn_resetear))
                        .addGap(18, 18, 18)
                        .addComponent(btn_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inicializarDatos(){
        datosPaciente = new ArrayList<>();
    }
    
    private JF_NuevoFormularioPaciente abrirFormulario(){
        formularioPaciente = new JF_NuevoFormularioPaciente(this, accesoController);
        formularioPaciente.setLocationRelativeTo(null);
        formularioPaciente.setVisible(true);
        return formularioPaciente;
    }
    
    private void btn_resetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetearActionPerformed
        // TODO add your handling code here:
        txtCedula.setText("");
        TablaPacienteLlenado();
    }//GEN-LAST:event_btn_resetearActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        abrirFormulario();
        
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        String campoCedulaTexto = txtCedula.getText().toLowerCase().trim();
        datosPaciente = accesoController.pacienteController().get();
        DefaultTableModel modelo = (DefaultTableModel) tb_paciente.getModel();
        modelo.setRowCount(0);
        for (Paciente pacienteTemporal : datosPaciente){
            boolean isCedula = campoCedulaTexto.equals(String.valueOf(pacienteTemporal.getCedula()));
            if(isCedula){
                Object[] nuevaFila={
                    pacienteTemporal.getId(),
                    pacienteTemporal.getCedula(),
                    pacienteTemporal.getNombre(),
                    pacienteTemporal.getApellido(),
                    MODIFICAR,
                    ELIMINAR
                };
                modelo.addRow(nuevaFila);
                break;
            }
        }
    }//GEN-LAST:event_btn_buscarActionPerformed

    public void TablaPacienteLlenado(){
        datosPaciente = accesoController.pacienteController().get();

        //modelo = CrearColumnasModeloPersonalizado(datosPaciente.get(1), campos);
        //String[] campos = {"Id","Cedula","Nombre", "Apellido"};

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Cedula");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        
        modelo.addColumn(MODIFICAR);
        modelo.addColumn(ELIMINAR);
        for (Paciente p : datosPaciente){
            Object[] fila = {p.getId(), p.getCedula(), p.getNombre(), p.getApellido(), MODIFICAR, ELIMINAR};
            modelo.addRow(fila);
        }
        
        tb_paciente.setModel(modelo);
        
        tb_paciente.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        tb_paciente.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox(), MODIFICAR, eventoModificar()));

        tb_paciente.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        tb_paciente.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), ELIMINAR, eventoEliminar()));
    }
    
    private ActionListener eventoEliminar(){
        ActionListener eliminarAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tb_paciente.getSelectedRow();

                int idTablaPaciente = (int) tb_paciente.getValueAt(filaSeleccionada, 0);

                boolean eliminado = accesoController.pacienteController().remove(idTablaPaciente);
                
                if(eliminado){
                    JOptionPane.showMessageDialog(null, "Se eliminó el paciente con ID: " + idTablaPaciente);
                    TablaPacienteLlenado();
                }
            }
        };
        return eliminarAction;
    }
    
    private ActionListener eventoModificar(){
        ActionListener modificarAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tb_paciente.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    String idTexto = tb_paciente.getValueAt(filaSeleccionada, 0).toString(); // columna 0 = ID
                    int id = Integer.parseInt(idTexto);
                    Paciente paciente = buscarPaciente(id, tb_paciente);
                    JF_NuevoFormularioPaciente formularioModificar = abrirFormulario();
                    formularioModificar.setPaciente(paciente);
                    accesoController.pacienteController().put(paciente);
                    TablaPacienteLlenado();
                }
            }
        };
        return modificarAction;
    }
    
    private Paciente buscarPaciente(int id, JTable tabla){
        for(Paciente paciente: datosPaciente){
            if(id == paciente.getId()){
                String cedulaTexto = tb_paciente.getValueAt(tabla.getSelectedRow(), 1).toString();
                int cedula = Integer.parseInt(cedulaTexto);
                String nombre = tb_paciente.getValueAt(tabla.getSelectedRow(), 2).toString();
                String apellido = tb_paciente.getValueAt(tabla.getSelectedRow(), 3).toString();
                datosPaciente = accesoController.pacienteController().get();
                int edad = paciente.getEdad();
                String correo = paciente.getCorreo();
                int telefono = paciente.getTelefono();
                return paciente = new Paciente(cedula,nombre,apellido,edad,correo,telefono);
            }
        }
        return null;
    }
    
    public static DefaultTableModel CrearColumnasModeloPersonalizado(Object objeto, String[] camposDeseados){
        Field[] campos = objeto.getClass().getDeclaredFields();
        ArrayList<String> columnas = new ArrayList<>();

        for (String campoDeseado : camposDeseados) {
            for (Field campo : campos) {
                if (campo.getName().equals(campoDeseado)) {
                    columnas.add(campoDeseado);
                    break;
                }
            }
        }
        String[] nombresDeColumnas = columnas.toArray(new String[0]);
        return new DefaultTableModel(nombresDeColumnas, 0);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_resetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cedula;
    private javax.swing.JTable tb_paciente;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}
