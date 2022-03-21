/**
 * 
 * Autor : Gustavo dos Santos Nunes
 * Ra : 2149877
 */

 /*
    Nomes:Estacionamento,Veiculo
    Verbos : Cadatrar
    Adjetivos : Tipo,Placa, HrSaida, HrEntrada,Valor

 */

public class Main {
    public static void main(String[] args) throws Exception {
        Estacionamento obj = new Estacionamento();
        Veiculo corsa = new Veiculo("Compacto", "AQE-9I90", 100, 200,0);
        Veiculo golf = new Veiculo("Compacto", "EEQ-9I31", 100, 200,0);
        Veiculo hilux = new Veiculo("Utilitario/Caminhonete", "AOW-4Y92", 100, 200,0);
        obj.cadastrar(corsa);
        obj.cadastrar(golf);
        obj.cadastrar(hilux);
        
        System.out.println(corsa);
        System.out.println(golf);
        System.out.println(hilux);
    }
}
