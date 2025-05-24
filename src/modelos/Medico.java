
package modelos;

public class Medico extends Persona{
    
    private String especialidad;
    private String genero;
    
    
    public Medico() {
        super(); 
        this.especialidad = "";
        this.genero = "";
    }
    
    public Medico(int id, int cedula, int edad,String nombre, String apellido, String especialidad,String genero,int telefono) {
        super(id,cedula,edad,nombre,apellido,telefono);
        this.especialidad = especialidad;
        this.genero = genero;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
  
   
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
}
