
package utilidades;

import Data.InternalDB.Repository.CitaMedicaInternalRepository;
import Data.InternalDB.Repository.MedicoInternalRepository;
import Data.InternalDB.Repository.PacienteInternalRepository;
import controladores.CitaMedicaController;
import controladores.IGeneralController;
import controladores.MedicoController;
import controladores.PacienteController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import modelos.CitaMedica;
import modelos.Medico;
import modelos.Paciente;


public class ManagerController {
    private final Map<Class<?>, IGeneralController<?>> controllers = new HashMap<>();

    public ManagerController() {
        controllers.put(Medico.class, new MedicoController(new MedicoInternalRepository()));
        controllers.put(Paciente.class, new PacienteController(new PacienteInternalRepository()));
        controllers.put(CitaMedica.class, new CitaMedicaController(new CitaMedicaInternalRepository()));
    }

    
    @SuppressWarnings("unchecked")
    public <T> ArrayList<T> get(Class<?> c) {
        IGeneralController<T> ctrl = tryGetController(c);
        if (ctrl != null) {
            return ctrl.get();
        } else {
            throw new IllegalArgumentException("Entidad no soportada: " + c);
        }
    }
    
    @SuppressWarnings("unchecked")
    public <T> boolean put(T entidad) {
        IGeneralController<T> ctrl = tryGetController(entidad.getClass());
        if (ctrl != null) {
            return ctrl.put(entidad);
        } else {
            throw new IllegalArgumentException("Entidad no soportada: " + entidad.getClass());
        }
    }
    
    
    @SuppressWarnings("unchecked")
    public <T> boolean post(T entidad){
        IGeneralController<T> ctrl = tryGetController(entidad.getClass());
        if(ctrl != null){
            return ctrl.post(entidad);
        } else {
            throw new IllegalArgumentException("Entidad no soportada: " + entidad.getClass());
        }
    }
    
    @SuppressWarnings("unchecked")
    public <T> boolean remove(Class<?> c, int id){
        IGeneralController<T> ctrl = tryGetController(c);
        return ctrl.remove(id);
    }
    
    private <T> IGeneralController tryGetController(Class<?> c){
        try{
            IGeneralController<T> ctrl = (IGeneralController<T>) controllers.get(c);
            return ctrl;
        } catch(Exception ex){
            throw new IllegalArgumentException("Entidad no soportada: " + c);
        }
    }
}