public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private String data;
    private String hora;
    private String local;
    private String status;

    public Consulta(){
        this.paciente = null;
        this.medico = null;
        this.data = "";
        this.hora = "";
        this.local = "";
        this.status = null;
    }

    public Consulta(Paciente paciente, Medico medico, String data, String hora, String local, String status){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
        this.hora = hora;
        this.local = local;
        this.status = status;
        paciente.adicionarConsulta(this);
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public Medico getMedico(){
        return medico;
    }

    public String getData(){
        return this.data;
    }

    public void setData(String data){
        this.data = data;
    }

    public String getHora(){
        return this.hora;
    }

    public void setHora(String hora){
        this.hora = hora;
    }

    public String getLocal(){
        return this.local;
    }

    public void setLocal(String local){
        this.local = local;
    }

    public String getStatus(){
        return this.status;
    }

    public void setStatus(String status){
        this.status = status;
    }
    
}
