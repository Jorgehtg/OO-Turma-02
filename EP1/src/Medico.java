public class Medico extends Pessoa {
    private String crm;
    protected double valorConsulta;
    private String[] agenda;
    
    public Medico(){
        super();
        this.crm = "";
        this.valorConsulta = 0.0;
        this.agenda = new String[0];
    }

    public Medico(String nome, String crm, double valorConsulta, String[] agenda){
        super(nome);
        this.crm = crm;
        this.valorConsulta = valorConsulta;
        this.agenda = agenda;
    }

    public String getCrm(){
        return this.crm;
    }

    public void setCrm(String crm){
        this.crm = crm;
    }

    public double getValorConsulta(){
        return this.valorConsulta;
    }

    public void setValorConsulta(double valorConsulta){
        this.valorConsulta = valorConsulta;
    }

    public String[] getAgenda(){
        return agenda;
    }

    public void setAgenda(String[] agenda){
        this.agenda = agenda;
    }
    
}
