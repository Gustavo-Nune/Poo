public class Bonificado extends Assalariado {
    private float bonificacao;

    public Bonificado(String nome, String sobrenome,float salarioBase, float bonificacao,float salarioSemanal){
        super(nome, sobrenome, salarioBase, salarioSemanal);
        setBonificacao(bonificacao);
        
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    public float getBonificacao() {
        return this.bonificacao;
    }

    public float ganhos() {
        return  getSalarioBase() + getSalarioSemanal() + getBonificacao();
    }

    public void imprimir() {

        System.out.println("Nome: " + getNome() +
                "\nSobrenome: " + getSobrenome() +
                "\nSalario Base: " + getSalarioBase() +
                "\nSalario Semanal: "+getSalarioSemanal() +
                "\nBonificacao: " + getBonificacao() +
                "\nGanhos: " + ganhos());

    }
}
