public class Anfibio extends Animal {
    protected String qntEscamas;

    public Anfibio(String nome){
        super(nome);
    }

    public String toString() {
        return super.toString() + 
        " Escamas: " + qntEscamas;
    }
}
