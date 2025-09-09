public class Medico {
    private String nome;
	private String crm;
	private Especialidade especialidade;
	private float valores;
	private String[] horarios;
	
	
	public Medico() {
		super();
		this.nome = "";
		this.crm = "";
		this.especialidade = null;
		this.valores = 0.0f;
		this.horarios = new String[0];
	}
	
	public Medico(String nome, String crm, Especialidade especialidade, float valores, String[] horarios) {
		this.nome = nome;
		this.crm = crm;
		this.especialidade = especialidade;
		this.valores = valores;
		this.horarios = horarios;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCrm() {
		return this.crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public float getValores() {
		return this.valores;
	}
	
	public void setValores(float valores) {
		this.valores = valores;
	}
	
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	public String[] getHorarios() {
		return horarios;
	}
	
	public void setHorarios(String[] horarios) {
		this.horarios = horarios;
	}
}
