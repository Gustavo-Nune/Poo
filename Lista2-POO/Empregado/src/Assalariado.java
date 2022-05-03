public abstract class Assalariado extends Empregado {
    private float salarioSemanal;
    
    public Assalariado(String nome, String sobrenome, float salarioBase, float salarioSemanal){
        super(nome, sobrenome, salarioBase);
        setSalarioSemanal(salarioSemanal);
    }

    public void setSalarioSemanal(float salarioSemanal){
        this.salarioSemanal = salarioSemanal;
    }
    public float getSalarioSemanal(){
        return this.salarioSemanal;
    }
}
