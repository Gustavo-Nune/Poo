import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Bonificado b1 = new Bonificado("Joao", "Silva", 1500f, 304.2f, 150.f);
        Comissionado c1 = new Comissionado("Maria", "Soares", 3800.55f, 830f);
        Horista h1 = new Horista("Jomar", "Silva Soares", 1000f, 1000);

        ArrayList<Empregado> lista = new ArrayList<>();
        lista.add(b1);
        lista.add(c1);
        lista.add(h1);

        for (Empregado emp : lista) {
            emp.imprimir();
            emp.ganhos();
        }

    }
}
