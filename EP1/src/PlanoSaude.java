public class PlanoSaude {
    private String nome;
    private double desconto;

    public PlanoSaude(){
        this.nome = "";
        this.desconto = 0.0;
    }

    public PlanoSaude(String nome, double desconto){
        this.nome = nome;
        this.desconto = desconto;
    }
    
}
