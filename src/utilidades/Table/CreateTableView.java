
package utilidades.Table;

import java.lang.reflect.Field;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CreateTableView {
    

    public <T> void cargarDatosEnTabla(JTable tabla, List<T> objets) {
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();
        
        if (objets == null || objets.isEmpty()) return;

        for (T objeto : objets) {
            
            Object[] fila = new Object[modelo.getColumnCount()];
            for (int i = 0; i < modelo.getColumnCount(); i++) {
                try {
                    Field campo = objeto.getClass().getDeclaredField(modelo.getColumnName(i));
                    campo.setAccessible(true);
                    fila[i] = campo.get(objeto);
                } catch (Exception e) {
                    fila[i] = "N/A"; // por si no existe el campo
                }
            }
            modelo.addRow(fila);
        }

        tabla.setModel(modelo);

    }
    
}


