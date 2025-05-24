
package Data.InternalDB.Repository;

import java.util.ArrayList;
import modelos.CitaMedica;
import modelos.Paciente;

public class CitaMedicaInternalRepository extends GenericInternalRepository<CitaMedica>{
    
    public CitaMedicaInternalRepository(){
        internalBD = internalBD.getInstance();
    }

    @Override
    public ArrayList<CitaMedica> all() {
        return internalBD.getCitaMedicas();
    }

    @Override
    public boolean add(CitaMedica entity) {
        return internalBD.addCitaMedica(entity);
        
    }

    @Override
    public boolean update(CitaMedica entity) {
        return internalBD.updateCitaMedica(entity);
    }

    @Override
    public boolean remove(CitaMedica p) {
        return internalBD.removeCitaMedica(p);   
    }
    
    @Override
    public CitaMedica buscarPorCedula(CitaMedica medico) {
        return new CitaMedica();
    }
}
