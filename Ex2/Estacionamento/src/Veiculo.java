public class Veiculo {
    private String tipo;
    private String placa;
    private int hrEntrada;
    private int hrSaida;
    private double valor;

    public Veiculo(String tipo, String placa,int hrEntrada
    ,int hrSaida,double valor) {
        setTipo(tipo);
        setPlaca(placa);
        setHrEntrada(hrEntrada);
        setHrSaida(hrSaida);
       // setValor(valor);
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getHrEntrada() {
        return this.hrEntrada;
    }

    public void setHrEntrada(int hrEntrada) {
        this.hrEntrada = hrEntrada;
    }

    public int getHrSaida() {
        return this.hrSaida;
    }

    public void setHrSaida(int hrSaida) {
        this.hrSaida = hrSaida;
    }
    public double getValor() {
        return this.valor ;
    }

    public void setValor(double valor) {
    /*  int aux = hrEntrada - hrSaida;
        if(aux <= 30){
            this.valor = 0;
        }else if(30 < aux & aux < 100){
            this.valor = 10;
        }else{
            this.valor = 20;
        }
    */
        this.valor = valor;
    }

    // Sobrecarga de método
    public String toString(){

        return  "Tipo: " + getTipo() +
                "\nPlaca: " + getPlaca() +
                "\nHora Entrada: " + getHrEntrada() +
                "\nHora Saida: " + getHrSaida()+
                "\nValor: " + getValor();
    }

}
