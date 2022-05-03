public class Horista extends Empregado {
    private int horas;

    public Horista(String nome , String sobrenome,float salarioBase,int horas){
        super(nome,sobrenome,salarioBase);
        setHoras(horas);
    }

    public int getHoras(){
        return this.horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public float ganhos(){
        return getSalarioBase() + (20 * getHoras());
    }
    
    public void imprimir() {

        System.out.println("Nome: " +  getNome() +
                    "\nSobrenome: " + getSobrenome() +
                    "\nSalario Base: " + getSalarioBase() +
                    "\nGanhos: " + ganhos() +
                    "\nHoras: " + getHoras() );

    }

}
