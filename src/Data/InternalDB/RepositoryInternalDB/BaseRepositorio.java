package Data.InternalDB.RepositoryInternalDB;

import java.util.List;
import modelos.BaseEntity;

public abstract class BaseRepositorio<T extends BaseEntity> implements IBaseRepositorio<T>{

    protected AccesoDatos accesoDatos;

    public BaseRepositorio() {
        this.accesoDatos = AccesoDatos.getInstance();
    }
    
    protected void calcularId(List<T> listaEntidad, BaseEntity baseEntity){
        BaseEntity lastBaseEntity = listaEntidad.get(listaEntidad.size()-1);
        int lastId = lastBaseEntity.getId()+1;
        baseEntity.setId(lastId);
    }
    
    
    
    
}
