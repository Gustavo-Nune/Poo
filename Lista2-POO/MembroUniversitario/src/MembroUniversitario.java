public abstract class  MembroUniversitario {
    public abstract float pagamento();

    @Override
    public String toString() {
        return "pagamento : " + pagamento();
    }
}
