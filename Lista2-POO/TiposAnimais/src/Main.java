/**
 * @author Gustavo Nunes - 2149877
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        // Classe Principal.java
        ArrayList<Animal> lista = new ArrayList<>();
        Animal sapo = new Sapo();
        Animal ra = new Ra();
        Animal leao = new Leao();
        Animal macaco = new Macaco();
        lista.add(sapo);
        lista.add(ra);
        lista.add(leao);
        lista.add(macaco);

        Iterator i = lista.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
