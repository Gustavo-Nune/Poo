import java.util.ArrayList;

public class Estacionamento {
    ArrayList listaVeiculos;

    public Estacionamento(){
        listaVeiculos = new ArrayList();
    }

    public void cadastrar(Veiculo veiculo){
        this.listaVeiculos.add(veiculo);
    }
    
    public void listarTodos() {
        // Para cada ‘item’ do tipo ‘Calcado‘ de ‘listaCalcados’
        // imprima esse ‘item’
        Iterator items = listaVeiculos.iterator();
        while (items.hasNext())
            System.out.println(items.next());
    }

}
