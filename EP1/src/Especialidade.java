public class Especialidade {
    private String nome;
	private double valorConsulta;
	
	public Especialidade() {
		this.nome = "";
		this.valorConsulta = 0.0;
	}
	
	public Especialidade(String nome, double valorConsulta) {
		this.nome = nome;
		this.valorConsulta = valorConsulta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getValorConsulta(){
		return this.valorConsulta;
	}

	public void setValorConsulta(double valorConsulta){
		this.valorConsulta = valorConsulta;
	}
}
