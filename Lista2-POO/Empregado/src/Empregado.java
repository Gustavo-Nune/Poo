public abstract class Empregado {
    
    private String nome;
    private String sobrenome;
    private float salarioBase;

    public Empregado(String nome, String sobrenome, float salarioBase){
            setNome(nome);
            setSobrenome(sobrenome);
            setSalarioBase(salarioBase);
        }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioBase() {
        return this.salarioBase;
    }

    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }

    public abstract float ganhos();
    public abstract void imprimir();
}
