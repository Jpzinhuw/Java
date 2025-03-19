public class Reserva {
    private String nome;
    private int numPessoas;
    private String dataReserva;
    private double valorReserva;

    public Reserva(String nome, int numPessoas, String dataReserva, double valorReserva) {
        this.nome = nome;
        this.numPessoas = numPessoas;
        this.dataReserva = dataReserva;
        this.valorReserva = valorReserva;
    }

    public double calcularReserva() {
        return numPessoas * valorReserva;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public String getDataReserva() {
        return dataReserva;
    }

    public void setDataReserva(String dataReserva) {
        this.dataReserva = dataReserva;
    }

    public double getValorReserva() {
        return valorReserva;
    }

    public void setValorReserva(double valorReserva) {
        this.valorReserva = valorReserva;
    }

    @Override
    public String toString() {
        return "Reserva [nome=" + nome + ", numPessoas=" + numPessoas + ", dataReserva=" + dataReserva
                + ", valorReserva=" + valorReserva + "]";
    }
}
