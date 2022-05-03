import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<MembroUniversitario> lista = new ArrayList<>();
        MembroUniversitario membro = new Administrativo();
        lista.add(membro);
        membro = new Bolsista();
        lista.add(membro);
        membro = new Tecnico();
        lista.add(membro);
        membro = new Professor();
        lista.add(membro);

        Iterator i = lista.iterator();

        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
