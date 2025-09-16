public class Paciente extends Pessoa {
    private String cpf;
    private int idade;
    private String[] historicoConsulta;
    private String[] historicoInternacao;

    public Paciente(){
        super();
        this.cpf = "";
        this.idade = 0;
        this.historicoConsulta = new String[0];
        this.historicoInternacao = new String[0];
    }

    public Paciente(String nome, String cpf, int idade, String[] consultas, String[] internacoes){
        super(nome);
        this.cpf = cpf;
        this.idade = idade;
        this.historicoConsulta = consultas;
        this.historicoInternacao = internacoes;
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
    
}
