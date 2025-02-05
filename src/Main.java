public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int payment1 = service.calculate(1_000_000, 12, 9.99);
        System.out.println("Ежемесячный платеж (1 год): " + payment1 + " руб.");

        int payment2 = service.calculate(1_000_000, 24, 9.99);
        System.out.println("Ежемесячный платеж (2 год): " + payment2 + " руб.");

        int payment3 = service.calculate(1_000_000, 36, 9.99);
        System.out.println("Ежемесячный платеж (3 год): " + payment3 + " руб.");
    }
}
