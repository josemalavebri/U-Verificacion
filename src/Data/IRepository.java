
package Data;

import java.util.ArrayList;


public interface IRepository<T> {
    
    ArrayList<T> all();
    boolean add(T entity);
    boolean update(T entity);
    boolean remove(int id);
    T buscarPorCedula(T object);
}

