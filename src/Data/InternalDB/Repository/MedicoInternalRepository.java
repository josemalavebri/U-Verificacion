
package Data.InternalDB.Repository;

import java.util.ArrayList;
import modelos.Medico;



public class MedicoInternalRepository extends GenericInternalRepository<Medico>{
    
    public MedicoInternalRepository(){
        try {
        internalBD = internalBD.getInstance();
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public ArrayList<Medico> all() {
        return internalBD.getMedicos();
    }

    @Override
    public boolean add(Medico entity) {
        return internalBD.addMedico(entity);
        
    }

    @Override
    public boolean update(Medico entity) {
        return internalBD.updateMedico(entity);
    }

    @Override
    public boolean remove(int id) {
        return internalBD.removeMedico(id);
    }

    
    @Override
    public Medico buscarPorCedula(Medico medico) {
        
        return internalBD.buscarMedicosByCedula(medico);
    }
}
