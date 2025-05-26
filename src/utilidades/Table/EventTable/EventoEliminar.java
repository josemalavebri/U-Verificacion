
package utilidades.Table.EventTable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import utilidades.ManagerController;


public class EventoEliminar implements ActionListener {
    
    private final JTable tabla;
    private final ManagerController manager;
    private final Runnable recargarDatos;
    private final Class<?> c;
    

    public EventoEliminar(JTable tabla, ManagerController manager, Runnable recargarDatos, Class<?> c) {
        this.tabla = tabla;
        this.manager = manager;
        this.recargarDatos = recargarDatos;
        this.c = c;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int fila = tabla.getSelectedRow();
        if (fila >= 0) {
            int id = (int) tabla.getValueAt(fila, 0);
            boolean eliminado = manager.remove(c,id);
            if (eliminado) {
                JOptionPane.showMessageDialog(null, "Se eliminó correctamente");
                recargarDatos.run(); // recarga la tabla
            }
        }
    }
    
}
