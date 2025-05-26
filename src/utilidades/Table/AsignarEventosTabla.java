
package utilidades.Table;

import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utilidades.Table.ButtonTable.ButtonEditor;
import utilidades.Table.ButtonTable.ButtonRenderer;


public class AsignarEventosTabla {
    
    public static JTable EventoEliminarTabla(JTable table, ActionListener action){
        DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
        modeloTabla.addColumn("Eliminar");
        table.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        table.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox(), "Eliminar", action));
        table.setModel(modeloTabla);
        return table;
    }
    
     public static JTable EventoModificarTabla(JTable table, ActionListener action){
        DefaultTableModel modeloTabla = (DefaultTableModel) table.getModel();
        modeloTabla.addColumn("Modificar");
        table.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        table.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox(), "Modificar", action));
        table.setModel(modeloTabla);
        return table;
    }

}
