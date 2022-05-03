import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        ArrayList<IOperacoes> lista = new ArrayList<>();
        lista.add(new Divisao(2f, 2f));
        lista.add(new Multiplicacao(2f, 2f));
        lista.add(new Soma(2f, 2f));
        lista.add(new Subtracao(2f, 2f));
       for (IOperacoes o : lista) {
          System.out.println(o.getNome() + o.getResultado() + " Instacias: " + o.getQuantidade());
      }
    }
}
