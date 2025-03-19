public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Conta conta1 = new Conta(123, "João");
        conta1.depositar(500);
        System.out.println(conta1);

        Reserva reserva1 = new Reserva("João", 3, "20/03/2025", 200);
        System.out.println(reserva1);
    }
}