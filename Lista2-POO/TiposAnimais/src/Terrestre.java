public class Terrestre extends Animal{
    protected String qntPelos;

    public Terrestre(String nome){
        super(nome);

    }

    public String toString() {
        return super.toString()+
        " Pelos: " + qntPelos;
    }
}
