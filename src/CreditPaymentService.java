public class CreditPaymentService {
    public int calculate(double loanAmount, int loanTermMonths, double rate) {
        double monthlyRate = rate / 12 / 100;
        double annuityPayment = loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, loanTermMonths))
                / (Math.pow(1 + monthlyRate, loanTermMonths) - 1);
        return (int) Math.round(annuityPayment);
    }

}
