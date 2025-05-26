package vistas.citasMedicas;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JTable;
import modelos.CitaMedica;
import utilidades.AccesoController;
import utilidades.Table.CreateTableFinal;
import utilidades.ManagerController;

public class Pnl_CitaMedica extends javax.swing.JPanel {

    private ManagerController managerController;
    private CreateTableFinal<CitaMedica> createTableFinal;

    public Pnl_CitaMedica(AccesoController accesoController) {
        initComponents();
        managerController = new ManagerController();
        createTableFinal = new CreateTableFinal(managerController);
        crearTodaTablaConDatos();
    }
    
    private void crearTodaTablaConDatos(){
        crearModeloTablaCitaMedica();
        crearTableConEventoEliminar();
        crearTableConEventoModificar();
    }
    
    private void crearModeloTablaCitaMedica(){
        createTableFinal.tableModelTotal(tb_citasMedicas,CitaMedica.class);
    }
    
    private void crearTableConEventoEliminar(){
        createTableFinal.asignarEventoEliminarTabla(tb_citasMedicas, managerController,CitaMedica.class);
    }
    
    
    private void crearTableConEventoModificar(){
        createTableFinal.asignarEventoModificar(tb_citasMedicas, CitaMedica.class, citaMedica -> {
            JF_NuevaCitaMedica panel = new JF_NuevaCitaMedica();
            panel.setCitaMedicaModificar(citaMedica); 
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_citasMedicas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        jLabel1.setText("Citas Registradas:");

        tb_citasMedicas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tb_citasMedicas);

        jButton1.setText("Nueva Cita");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(236, 236, 236))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       JFrame jframe = new JF_NuevaCitaMedica();
       jframe.setLocationRelativeTo(null);
       jframe.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_citasMedicas;
    // End of variables declaration//GEN-END:variables

    
}
