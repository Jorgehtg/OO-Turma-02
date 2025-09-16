public class Internação {
    private Paciente paciente;
    private Medico medico;
    private String dataEntrada;
    private String dataSaida;
    private int numQuarto;
    private double valorInternação;
    
    public Internação(){
        this.paciente = null;
        this.medico = null;
        this.dataEntrada = null;
        this.dataSaida = null;
        this.numQuarto = 0;
        this.valorInternação = 0.0;
    }

    public Internação(Paciente paciente, Medico medico, String dataEntrada, String dataSaida, int numQuarto, double valorInternação){
        this.paciente = paciente;
        this.medico = medico;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
        this.numQuarto = numQuarto;
        this.valorInternação = valorInternação;
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

    public void setDataEntrada(String dataEntrada){
        this.dataEntrada = dataEntrada;
    }

    public String getDataSaida(){
        return this.dataSaida;
    }

    public void setDataSaida(String dataSaida){
        this.dataSaida = dataSaida;
    }

    public int getNumQuarto(){
        return numQuarto;
    }

    public void setNumQuarto(int numQuarto){
        this.numQuarto = numQuarto;
    }

    public double getValorInternação(){
        return valorInternação;
    }

    public void setValorInternação(double valorInternação){
        this.valorInternação = valorInternação;
    }

}
