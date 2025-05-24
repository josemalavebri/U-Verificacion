package modelos;

public class CitaMedica {
    
    private int id;
    private Paciente paciente;
    private Medico medico;
    private String descripcion;
    private Turno turno;
    
    public CitaMedica(){}

    public CitaMedica(Paciente paciente, Medico medico, String descripcion, Turno turno) {
        this.paciente = paciente;
        this.medico = medico;
        this.descripcion = descripcion;
        this.turno = turno;
    }
    
    public CitaMedica(int id, Paciente paciente, Medico medico, String descripcion, Turno turno) {
        this.id = id;
        this.paciente = paciente;
        this.medico = medico;
        this.descripcion = descripcion;
        this.turno = turno;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }
    

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(Turno turno) {
        this.turno = turno;
    }
}
