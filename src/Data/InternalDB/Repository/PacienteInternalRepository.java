
package Data.InternalDB.Repository;

import java.util.ArrayList;
import modelos.Paciente;

public class PacienteInternalRepository extends GenericInternalRepository<Paciente>{
    
    public PacienteInternalRepository(){
        internalBD = internalBD.getInstance();
    }

    @Override
    public ArrayList<Paciente> all() {
        return internalBD.getPacientes();
    }

    @Override
    public boolean add(Paciente entity) {
        return internalBD.addPaciente(entity);
        
    }

    @Override
    public boolean update(Paciente entity) {
        return internalBD.updatePaciente(entity);
    }

    @Override
    public boolean remove(int id) {
        return internalBD.removePaciente(id);   
    }
    
    @Override
    public Paciente buscarPorCedula(Paciente medico) {
        
        return new Paciente();
    }
}
