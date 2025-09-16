import java.util.List;

public class Especialista extends Medico{
    private String especialidade;

    public Especialista(){
        super();
        this.especialidade = "";
    }

    public Especialista(String nome, String crm, double valorConsulta, List<String> agenda, String especialidade){
        super(nome, crm, valorConsulta, agenda);
        this.especialidade = especialidade;
    }

    public String getEspecialidade(){
        return this.especialidade;
    }

    public void setEspecialidade(String Especialidade){
        this.especialidade = Especialidade;
    }

    @Override
    public void setValorConsulta(double valorConsulta){
        this.valorConsulta = valorConsulta;        
    }

}
