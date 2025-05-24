
package modelos;


public class Persona {
    
    protected int id;
    protected int cedula;
    protected int edad;
    protected String nombre;
    protected String apellido;
    protected int telefono;
    
    public Persona() {
        this.id = 0;
        this.cedula = 0;
        this.edad = 0;
        this.nombre = "";
        this.apellido = "";
        this.telefono = 0;
    }

    public Persona(int id, int cedula, int edad,String nombre, String apellido, int telefono) {
        this.id = id;
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    @Override
    public String toString() {
        return nombre + " "+apellido;
    }
    
    
}
