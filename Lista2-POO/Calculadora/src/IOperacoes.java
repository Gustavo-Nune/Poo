public interface IOperacoes {
    
    public static int instaces = 0;
    public abstract void setOperando1(float operando1);
    public abstract void setOpernado2(float operando2);
    public abstract float getResultado();
    public abstract String getNome();
    public abstract int getQuantidade();
}
