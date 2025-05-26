package utilidades.Table;

import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;


public class TableColumns {
    
    public DefaultTableModel CrearColumnasModelo(Object objeto){
        String[] nombreDeColumnas= NombresColumnasGet(objeto);
        DefaultTableModel modelo = new DefaultTableModel(nombreDeColumnas, 0);
        return modelo;
    }

    private String[] NombresColumnasGet(Object objeto){
        Field[] campos = objeto.getClass().getDeclaredFields();
        ArrayList<String> columnas = new ArrayList();
        for (Field campo : campos) {
            columnas.add(campo.toString());
        }
        String[] nombresDeColumnas = new String[campos.length];
        for(int i=0; i<campos.length;i++ ){
            nombresDeColumnas[i]= campos[i].getName();
        }
        return nombresDeColumnas;
    }
    
    public DefaultTableModel CrearColumnasModelo(Object objeto,boolean eliminarDescripcion){
        String[] nombreDeColumnas= NombresColumnasGet(objeto,eliminarDescripcion);
        DefaultTableModel modelo = new DefaultTableModel(nombreDeColumnas, 0);
        return modelo;
    }
    
    private String[] NombresColumnasGet(Object objeto,boolean eliminarDescripcion){
        Field[] campos = objeto.getClass().getDeclaredFields();
        ArrayList<String> columnas = new ArrayList();
        for (Field campo : campos) {
            
            if(!(eliminarDescripcion&&"descripcion".equals(campo.getName()))){
                columnas.add(campo.toString());
            }
        }
            
        String[] nombresDeColumnas = new String[campos.length];
        for(int i=0; i<campos.length;i++ ){
            nombresDeColumnas[i]= campos[i].getName();
        }
        return nombresDeColumnas;
    }
    
}
