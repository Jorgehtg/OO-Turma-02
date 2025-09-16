import java.util.ArrayList;
import java.util.List;

public class Medico extends Pessoa {
    private String crm;
    protected double valorConsulta;
    private List<String> agenda;
    
    public Medico(){
        super();
        this.crm = "";
        this.valorConsulta = 0.0;
        this.agenda = new ArrayList<>();
    }

    public Medico(String nome, String crm, double valorConsulta, List<String> agenda){
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

    public List<String> getAgenda(){
        return agenda;
    }

    public void setAgenda(List<String> agenda){
        this.agenda = agenda;
    }
    
    public void adicionaHorario(String horario){
        agenda.add(horario);
    }

    public void removeHorario(String horario){
        agenda.remove(horario);
    }
}
