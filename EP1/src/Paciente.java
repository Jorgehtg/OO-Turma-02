public class Paciente {
	private String nome;
    private String cpf;
    private int idade;
    private String[] historico;
    private String[] internações;
    

    public Paciente() {
    	this.nome = "";
    	this.cpf = "";
    	this.idade = 0;
    	this.historico = new String[0];
    	this.internações = new String[0];
    }
    
    public Paciente(String nome, String cpf, int idade, String[] historico, String[] internações) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.historico = historico;
        this.internações = internações;
    }

    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public String[] getHistorico() {
    	return historico;
    }
    
    public void setHistorico(String[] historico) {
    	this.historico = historico;
    }
    
    public String[] getInternações() {
    	return internações;
    }
    
    public void setInternações(String[] internações) {
    	this.internações = internações;
    }
    
    public void imprimeDados() {
        //System.out.println("--------------------");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCpf());
        System.out.println("Idade: " + this.getIdade());
        //System.out.println("Historico: " + this.historico());
        //System.out.println("Quantidade créditos: " + this.getQuantidadeCreditos());
    }

}
