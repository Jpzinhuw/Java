public class App {
    public static void main(String[] args) {

        // Criando uma conta e depositando um valor
        Conta conta1 = new Conta(123, "João");
        conta1.depositar(500);
        System.out.println(conta1);

        // Criando uma reserva
        Reserva reserva1 = new Reserva("João", 3, "20/03/2025", 200);
        System.out.println(reserva1);
        System.out.println("Total da Reserva: " + reserva1.calcularReserva());

        // Criando um evento
        Evento evento1 = new Evento("Show de Rock", "25/03/2025", 50.0f, 100);
        System.out.println(evento1);

        // Vendendo ingressos
        evento1.venderIngresso(30);
        System.out.println("Arrecadação: " + evento1.verArrecadacao());
        System.out.println(evento1);
    }
}
