public class Comissionado extends Empregado {
    private float taxaComissao;

    public Comissionado(String nome, String sobrenome, float salarioBase, float taxaComissao){
        super(nome, sobrenome, salarioBase);
        setTaxaComissao(taxaComissao);
    }

    public float getTaxaComissao() {
        return this.taxaComissao;
    }
    public void setTaxaComissao(float taxaComissao) {
        this.taxaComissao = taxaComissao;
    }

    public float ganhos() {
        return getSalarioBase() + getTaxaComissao();
    }

    public void imprimir() {

        System.out.println("Nome: " + getNome() +
                "\nSobrenome: " + getSobrenome() +
                "\nSalario Base: " + getSalarioBase()
                +"\nGanhos: " + ganhos() +
        "\nTaxa Comissao: " + getTaxaComissao());

    }

}
