import java.util.ArrayList;
import java.util.List;

public class Paciente extends Pessoa{
    private String cpf;
    private int idade;
    private List<Consulta> consultas;
    private List<Internação> internações;

    public Paciente(String nome, String cpf, int idade){
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
        this.consultas = new ArrayList<>();
        this.internações = new ArrayList<>();
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public List<Consulta> getConsultas(){
        return consultas;
    }

    public List<Internação> getInternações(){
        return internações;
    }

    public void adicionarConsulta(Consulta consulta){
        this.consultas.add(consulta);
    }
    
    public void adicionarInternação(Internação internação){
        this.internações.add(internação);
    }
}
