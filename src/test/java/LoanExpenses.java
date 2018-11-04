import org.junit.jupiter.api.Assertions;



public class LoanExpenses {

    public static void main(String[] args) {

        double loanAmount = 60000.0;
        int termInYears = 10;

        double firstRate = 0.1;
        double secondRate = 0.08;
        double lastRate = 0.06;

        double oneYearPayment;
        oneYearPayment = loanAmount / (termInYears * 3);
        double firstTenYearsPercentage = loanAmount * firstRate;
        double firstTenYearsPayment = oneYearPayment * 10 + firstTenYearsPercentage;
        double firstTenYearsBalance = loanAmount - oneYearPayment * 10;

        double secondTenYearsPercentage = firstTenYearsBalance * secondRate;
        double secondTenYearsPayment = oneYearPayment * 10 + secondTenYearsPercentage;
        double secondTenYearsBalance = firstTenYearsBalance - oneYearPayment * 10;

        double lastTenYearsPercentage = secondTenYearsBalance * lastRate;
        double lastTenYearsPayment = oneYearPayment * 10 + lastTenYearsPercentage;
        double lastTenYearsBalance = secondTenYearsBalance - oneYearPayment * 10;

        double allYearsPercentageSum = firstTenYearsPercentage + secondTenYearsPercentage + lastTenYearsPercentage;

        Assertions.assertEquals(loanAmount, firstTenYearsBalance + secondTenYearsBalance + lastTenYearsBalance, "The loan is calculated wrong!");
        Assertions.assertEquals(10400.0, allYearsPercentageSum);
    }
}






