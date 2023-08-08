public class q9 {
    public static void main(String[] args) {
        FinancialSituation FS = new FinancialSituation(30000000, 33000);
        System.out.printf("Financial Situation is: " + FS.balance());
    }
    
}

class FinancialSituation {
    double creditValue;
    double debitValue;

    public FinancialSituation(double creditValue, double debitValue) {
        this.creditValue = creditValue;
        this.debitValue = debitValue;
    }

    double balance() {
        return creditValue - debitValue;
        
    }

}
