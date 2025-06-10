package Data.InternalDB.RepositoryInternalDB;

import java.util.ArrayList;
import java.util.Iterator;
import modelos.*;

public class AccesoDatos {
    private static AccesoDatos instancia;
    private static ArrayList<Turno> listaTurnos;
    private static ArrayList<Paciente> listaPacientes;
    private static ArrayList<Medico> listaMedicos;
    private static ArrayList<CitaMedica> listaCitasMedicas;
    private static ArrayList<Factura> listaFacturas;

    private AccesoDatos(){
        listaPacientes = new ArrayList<>();
        listaMedicos = new ArrayList<>();
        listaTurnos = new ArrayList<>();
        listaCitasMedicas = new ArrayList<>();
        listaFacturas = new ArrayList<>();
    }
    
    public static AccesoDatos getInstance(){
        if(instancia==null){
            instancia = new AccesoDatos();
            cargarDatosTemporales();
        } 
        return instancia;
    }
    
    public ArrayList<Paciente> datosPacientes(){
        return listaPacientes;
    } 
    
    public ArrayList<Medico> datosMedicos(){
        return listaMedicos;
    }
    
    public ArrayList<Turno> datosTurnos(){
        return listaTurnos;
    }
    
    public ArrayList<CitaMedica> datosCitasMedicas(){
        return listaCitasMedicas;
    }
    
    public ArrayList<Factura> datosFacturas(){
        return listaFacturas;
    }
    
    private static void cargarDatosTemporales(){
        crearTurnosTemporales();
        crearPacienteTemporales();
        crearMedicosTemporales();
        crearCitasMedicasTemporales();
    }
    
    private static void crearTurnosTemporales(){
        String fechaFija = "19/5/2025";
        listaTurnos = new ArrayList<>();
        listaTurnos.add(new Turno(1, fechaFija, "08", "00"));
        listaTurnos.add(new Turno(2, fechaFija, "09", "00"));
        listaTurnos.add(new Turno(3, fechaFija, "10", "00"));
        listaTurnos.add(new Turno(4, fechaFija, "11", "00"));
        listaTurnos.add(new Turno(5, fechaFija, "12", "00"));
        listaTurnos.add(new Turno(6, fechaFija, "13", "00"));
        listaTurnos.add(new Turno(7, fechaFija, "14", "00"));
        listaTurnos.add(new Turno(8, fechaFija, "15", "00"));
        listaTurnos.add(new Turno(9, fechaFija, "16", "00"));
        listaTurnos.add(new Turno(10, fechaFija, "17", "00"));
    }
    
    private static void crearPacienteTemporales() {
        listaPacientes = new ArrayList<>();
        listaPacientes.add(new Paciente(1, 102030405, "Ana", "Pérez", 28, "ana.perez@mail.com", 991234567));
        listaPacientes.add(new Paciente(2, 203040506, "Luis", "Gómez", 35, "luis.gomez@mail.com", 987654321));
        listaPacientes.add(new Paciente(3, 304050607, "Marta", "Ramírez", 22, "marta.r@mail.com", 971122334));
        listaPacientes.add(new Paciente(4, 405060708, "Carlos", "López", 40, "carlos.l@mail.com", 965566778));
        listaPacientes.add(new Paciente(5, 506070809, "Lucía", "Fernández", 30, "lucia.f@mail.com", 999988776));
        listaPacientes.add(new Paciente(6, 607080910, "Pedro", "Suárez", 45, "pedro.suarez@mail.com", 954433221));
        listaPacientes.add(new Paciente(7, 708091011, "Elena", "Cruz", 27, "elena.cruz@mail.com", 945678901));
        listaPacientes.add(new Paciente(8, 809101112, "Jorge", "Mendoza", 33, "jorge.m@mail.com", 981122334));
        listaPacientes.add(new Paciente(9, 910111213, "Camila", "Ríos", 29, "camila.rios@mail.com", 979988776));
        listaPacientes.add(new Paciente(10, 1011121314, "Andrés", "Navarro", 38, "andres.n@mail.com", 966677889));
    }
    
    private static void crearMedicosTemporales(){
        listaMedicos = new ArrayList<>();
        listaMedicos.add(new Medico(1, 12345689, 20,"Carlos", "López", "Cardiología", "Masculino", 9876521));
        listaMedicos.add(new Medico(2, 987654321, 20,"Ana", "Gómez", "Pediatría", "Femenino", 123456789));
        listaMedicos.add(new Medico(5, 445566778, 20,"Mateo", "Díaz", "Traumatología", "Masculino", 111222333));
    }
    
    private static void crearCitasMedicasTemporales(){
        listaCitasMedicas = new ArrayList<>();
        int idCita = 1;
        Iterator<Paciente> iterPacientes = listaPacientes.iterator();
        Iterator<Medico> iterMedicos = listaMedicos.iterator();
        Iterator<Turno> iterTurnos = listaTurnos.iterator();

        while (iterPacientes.hasNext() && iterMedicos.hasNext() && iterTurnos.hasNext()) {
            Paciente paciente = iterPacientes.next();
            Medico medico = iterMedicos.next();
            Turno turno = iterTurnos.next();

            String descripcion = "Cita Medica Temporal";

            listaCitasMedicas.add(new CitaMedica(idCita++, paciente, medico, descripcion, turno));
        }
    }
    
}
