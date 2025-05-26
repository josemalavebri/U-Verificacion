package vistas.medico;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelos.Medico;
import utilidades.AccesoController;
import utilidades.Table.ButtonTable.ButtonEditor;
import utilidades.Table.ButtonTable.ButtonRenderer;

/**
 *
 * @author conta
 */
    public class Pnl_GestionMedico extends javax.swing.JPanel {
    private static String MODIFICAR = "Modificar";
    private static String ELIMINAR = "Eliminar";
    private AccesoController accesoController;
    private ArrayList<Medico> datosMedico;
    private JF_FormularioMedico formularioMedico;

    /**
     * Creates new form Pnl_GestionMedico
     */
    public Pnl_GestionMedico() {
        initComponents();
        inicializarDatos();
        TablaMedicoLlenado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_Buscar = new javax.swing.JButton();
        btn_Resetear = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txt_Cedula = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_Medico = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(600, 400));
        setRequestFocusEnabled(false);

        btn_Buscar.setText("Buscar");

        btn_Resetear.setText("Resetear");

        btn_Nuevo.setText("Nuevo");

        jLabel2.setText("Medicos Agregados");

        jLabel1.setText("Cedula");

        tb_Medico.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tb_Medico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btn_Buscar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Resetear))
                    .addComponent(jLabel2)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)))
                .addContainerGap(141, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Buscar)
                    .addComponent(btn_Resetear)
                    .addComponent(jLabel1))
                .addGap(31, 31, 31)
                .addComponent(btn_Nuevo)
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    private void inicializarDatos(){
        accesoController = new AccesoController();
        datosMedico = new ArrayList<>();
    }
    
    private JF_FormularioMedico abrirFormulario(){
        formularioMedico = new JF_FormularioMedico(this);
        formularioMedico.setLocationRelativeTo(null);
        formularioMedico.setVisible(true);
        return formularioMedico;
    }
    
    private void btn_resetearActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        txt_Cedula.setText("");
        TablaMedicoLlenado();
    }                                            

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {                                          
        abrirFormulario();
        
    }                                         

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String campoCedulaTexto = txt_Cedula.getText().toLowerCase().trim();
        datosMedico = accesoController.medicoController().get();
        DefaultTableModel modelo = (DefaultTableModel) tb_Medico.getModel();
        modelo.setRowCount(0);
        for (Medico medicoTemporal : datosMedico){
            boolean isCedula = campoCedulaTexto.equals(String.valueOf(medicoTemporal.getCedula()));
            if(isCedula){
                Object[] nuevaFila={
                    medicoTemporal.getId(),
                    medicoTemporal.getCedula(),
                    medicoTemporal.getEdad(),
                    medicoTemporal.getNombre(),
                    medicoTemporal.getApellido(),
                    medicoTemporal.getEspecialidad(),
                    medicoTemporal.getGenero(),
                    medicoTemporal.getTelefono(),
                    MODIFICAR,
                    ELIMINAR
                };
                modelo.addRow(nuevaFila);
                break;
            }
        }
    }                                          

    public void TablaMedicoLlenado(){
        datosMedico = accesoController.medicoController().get();

        //modelo = CrearColumnasModeloPersonalizado(Medico.get(1), campos);
        //String[] campos = {"Id","Cedula","edad","Nombre","Apellido","Especialidad","Genero","Telefono"};

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Id");
        modelo.addColumn("Cedula");
        modelo.addColumn("Edad");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Genero");
        modelo.addColumn("Telefono");
        
        modelo.addColumn(MODIFICAR);
        modelo.addColumn(ELIMINAR);
        for (Medico p : datosMedico){
            Object[] fila = {p.getId(), p.getCedula(), p.getEdad(), p.getNombre(), p.getApellido(), p.getEspecialidad(), p.getGenero(), p.getTelefono(), MODIFICAR, ELIMINAR};
            modelo.addRow(fila);
        }
        
        tb_Medico.setModel(modelo);
        
        tb_Medico.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        tb_Medico.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox(), MODIFICAR, eventoModificar()));

        tb_Medico.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        tb_Medico.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), ELIMINAR, eventoEliminar()));
    }
    
    private ActionListener eventoEliminar(){
            ActionListener eliminarAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tb_Medico.getSelectedRow();

                int idTablaMedico = (int) tb_Medico.getValueAt(filaSeleccionada, 0);

                boolean eliminado = accesoController.medicoController().remove(idTablaMedico);
                
                if(eliminado){
                    JOptionPane.showMessageDialog(null, "Medico eliminado: " + idTablaMedico);
                    TablaMedicoLlenado();
                }
            }
        };
        return eliminarAction;
    }
    
    private ActionListener eventoModificar(){
        ActionListener modificarAction = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int filaSeleccionada = tb_Medico.getSelectedRow();
                if (filaSeleccionada >= 0) {
                    String idTexto = tb_Medico.getValueAt(filaSeleccionada, 0).toString(); // columna 0 = ID
                    int id = Integer.parseInt(idTexto);
                    Medico medico = buscarMedico(id, tb_Medico);
                    JF_FormularioMedico formularioModificar = abrirFormulario();
                    formularioModificar.setMedico(medico);
                    accesoController.medicoController().put(medico);
                    TablaMedicoLlenado();
                }
            }
        };
        return modificarAction;
    }
    
    
    private Medico buscarMedico(int id, JTable tabla){
        String especialidad = null; 
        String genero = null;
        for(Medico medico: datosMedico){ 
            if(id == medico.getId()){
                String cedulaTexto = tb_Medico.getValueAt(tabla.getSelectedRow(), 1).toString();
                int cedula = Integer.parseInt(cedulaTexto);
                String nombre = tb_Medico.getValueAt(tabla.getSelectedRow(), 2).toString();
                String apellido = tb_Medico.getValueAt(tabla.getSelectedRow(), 3).toString();
                datosMedico = accesoController.medicoController().get();
                int edad = medico.getEdad();
                int telefono = medico.getTelefono();
                return medico = new Medico(id,cedula,edad,nombre,apellido,especialidad,genero,telefono);
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
    private javax.swing.JButton btn_Buscar;
    private javax.swing.JToggleButton btn_Nuevo;
    private javax.swing.JButton btn_Resetear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tb_Medico;
    private javax.swing.JTextField txt_Cedula;
    // End of variables declaration//GEN-END:variables
}
