
package utilidades;

import Data.InternalDB.Repository.MedicoInternalRepository;
import Data.InternalDB.Repository.PacienteInternalRepository;
    import Data.IRepository;
import controladores.*;





public class AccesoController {
  
    private IGeneralController medicoController;
    private IGeneralController pacienteController;
    private IGeneralController turnoController;
    private IGeneralController citaMedicaController;
    private IGeneralController facturaController;
    private IRepository repository;
    
    public AccesoController(){
        repository = new PacienteInternalRepository();
        medicoController = new MedicoController(repository);
        pacienteController = new PacienteController(repository);
    }
    
    
    public IGeneralController facturaController(){
        return facturaController;
    }
   
    public IGeneralController turnosController(){
        return turnoController;
    }
    
    public IGeneralController citaMedicaController(){
        return citaMedicaController;
    }
    
    public IGeneralController pacienteController(){
        return pacienteController;
    }
    
    public IGeneralController medicoController(){
        return medicoController;
    }
    
    
    
    
}
