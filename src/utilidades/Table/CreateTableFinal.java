
package utilidades.Table;

import java.awt.event.ActionListener;
import java.util.List;
import java.util.function.Consumer;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import utilidades.Table.EventTable.EventoEliminar;
import utilidades.ManagerController;
import utilidades.Table.EventTable.EventoModificar;


public class CreateTableFinal<T> {
    
    
    private final ManagerController controller;
    
    public CreateTableFinal(ManagerController controller){
        this.controller = controller;
    }
    
    public void tableModelTotal(JTable table,Class<?> c ){
        List<T> listaDatos = recuperarDatos(c);
        TableColumns tableColumns = new TableColumns();
        DefaultTableModel tableModel = tableColumns.CrearColumnasModelo(listaDatos.get(0));
        table.setModel(tableModel);
        CreateTableView tableView = new CreateTableView();
        tableView.cargarDatosEnTabla(table, listaDatos);
    }

    private List<T>  recuperarDatos(Class<?> c){
        return controller.get(c);
    }
    
    public void asignarEventoEliminarTabla(JTable table, ManagerController manager, Class<?> c){
        Runnable recargarDatoss = () -> recuperarDatos(c);
        ActionListener eventoEliminar = new EventoEliminar( table, manager, recargarDatoss, c);
        AsignarEventosTabla.EventoEliminarTabla(table, eventoEliminar);
    }
    
    
    public void asignarEventoModificar(JTable table,Class<T> c, Consumer<T> abrirFormularioEditar ){
        ActionListener eventoModificar = new EventoModificar(table, abrirFormularioEditar,c);
        AsignarEventosTabla.EventoModificarTabla(table, eventoModificar);
    }
}
