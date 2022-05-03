public class Multiplicacao implements IOperacoes {
    private float operando1;
    private float operando2;

    public Multiplicacao(float operando1, float operando2){
        setOperando1(operando1);
        setOpernado2(operando2);
    }

    public void setOperando1(float operando1) {
        this.operando1 = operando1;
    }

    public void setOpernado2(float operando2) {
        this.operando2 = operando2;
    }

    public float getResultado() {
        return operando1 * operando2;
    }

    public String getNome() {
        return "Multiplicacao: ";
    }

    public int getQuantidade() {
        return IOperacoes.instaces + 1;
    }
    
}
