import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<IConversorMoeda> lista = new ArrayList<>();

        Iterator i = lista.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
