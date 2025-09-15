public class Internacao {
    private Paciente paciente;
    private Medico medico;
    private String dataEntrada;
    private String dataSaida;
    private int quarto;
    private double custo;

    public Internacao(Paciente paciente, Medico medico, String dataEntrada, String dataSaida, int quarto, double custo){
        this.paciente = paciente;
        this.medico = medico;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.quarto = quarto;
        this.custo = custo;
    }

    public Paciente getPaciente(){
        return paciente;
    }

    public Medico getMedico(){
        return medico;
    }
    
    public String getDataEntrada(){
        return this.dataEntrada;
    }

}
