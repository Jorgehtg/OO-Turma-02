public class Medico extends Pessoa {
	private String crm;
	private Especialidade especialidade;
	private double custoConsulta;
	private String[] agenda;
	
	
	public Medico() {
		super();
		this.crm = "";
		this.especialidade = null;
		this.custoConsulta = 0.0;
		this.agenda = new String[10];
	}
	
	public Medico(String nome, String crm, Especialidade especialidade, double custoConsulta, String[] agenda) {
		super(nome);
		this.crm = crm;
		this.especialidade = especialidade;
		this.custoConsulta = custoConsulta;
		this.agenda = agenda;
	}
	
	public String getCrm() {
		return this.crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	public double getCustoConsulta() {
		return this.custoConsulta;
	}
	
	public void setCustoConsulta(double custoConsulta) {
		this.custoConsulta = custoConsulta;
	}
	
	public Especialidade getEspecialidade() {
		return especialidade;
	}
	
	public void setEspecialidade(Especialidade especialidade) {
		this.especialidade = especialidade;
	}
	
	public String[] getAgenda() {
		return agenda;
	}
	
	public void setAgenda(String[] horarios) {
		this.agenda = horarios;
	}

	public void mostrarAgenda(){
		System.out.print("Horarios disponiveis: ");
		 for (int i = 0; i < agenda.length; i++) {
            System.out.print(agenda[i]);
		 }
		}
}
