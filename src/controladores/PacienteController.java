
package controladores;

import Data.IRepository;
import modelos.Paciente;


public class PacienteController extends GeneralController<Paciente>{
    
    public PacienteController(IRepository repository){
        super(repository);
    }
    
    
}