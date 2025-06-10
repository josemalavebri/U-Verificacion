
package utilidades.Table.ControlTable;

import java.util.List;
import javax.swing.JTable;
import modelos.BaseEntity;
import utilidades.Controller.ManagerController;
import utilidades.Table.CreateTable.ConstructorModeloTabla;
import utilidades.Table.RefreshTable.RefreshTable;
import vistas.IReceptorEntityJFrame;


public class ControlTable {
    private final RefreshTable refreshTable;
    private final ManagerController managerController;
    
    public ControlTable(){
        refreshTable = RefreshTable.getInstance();
        managerController = ManagerController.getInstance();
    }
    
    public void registrarTabla(Class<?> c, JTable table){
        refreshTable.suscribir(c.toString(), table);
    }
    
    public void llenarTablaDatos(Class<? extends BaseEntity> c, JTable table){
        List listaDatos = managerController.get(c);
        ConstructorModeloTabla.construirYAsignarModelo(table, listaDatos);
    }
    
    public void eventosTabla(JTable table, IReceptorEntityJFrame frame){
        ConstructorModeloTabla.AgregarEventosEditarYEliminar(table, frame);
    }
    
    public void refrescarTodasTablas(){
        refreshTable.refrescarTodas();
    }

}
