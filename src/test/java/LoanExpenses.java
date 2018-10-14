import org.junit.jupiter.api.Assertions;

public class LoanExpenses {

    public static void main(String[] args) {

        double loanAmount = 60000.0;
        int termInYears = 10;

        double firstRate = 0.1;
        double secondRate = 0.08;
        double lastRate = 0.06;


        double oneYearPayment = loanAmount / (termInYears * 3);
        // = 2000.0
        double firstTenYearsPercentage = loanAmount * firstRate;
        // = 6000.0
        double firstTenYearsPayment = oneYearPayment * 10 + firstTenYearsPercentage;
        // = 26000.0
        double firstTenYearsBalance = loanAmount - oneYearPayment * 10;
        // = 40000.0


        double secondTenYearsPercentage = firstTenYearsBalance * secondRate;
        // = 3200.0
        double secondTenYearsPayment = oneYearPayment * 10 + secondTenYearsPercentage;
        // = 23200.0
        double secondTenYearsBalance = firstTenYearsBalance - oneYearPayment * 10;
        // = 20000.0


        double lastTenYearsPercentage = secondTenYearsBalance * lastRate;
        // = 1200.0
        double lastTenYearsPayment = oneYearPayment * 10 + lastTenYearsPercentage;
        // = 21200.0
        double lastTenYearsBalance = secondTenYearsBalance - oneYearPayment * 10;
        // = 0.0

        double allYearsPercentageSum = firstTenYearsPercentage + secondTenYearsPercentage + lastTenYearsPercentage;


        System.out.println("Loan amount is: " + loanAmount);
        System.out.println("One year payment for first ten years is: " + oneYearPayment);
        System.out.println("First ten years percentage is: " + firstTenYearsPercentage);
        System.out.println("First ten years balance is: " + firstTenYearsBalance);
        System.out.println("Second ten years percentage is: " + secondTenYearsPercentage);
        System.out.println("Second ten years balance is: " + secondTenYearsBalance);
        System.out.println("Last ten years percentage is: " + lastTenYearsPercentage);
        System.out.println("Last ten years balance is: " + lastTenYearsBalance);
        System.out.println();
        System.out.println("First ten years payment with percentage is: " + firstTenYearsPayment);
        System.out.println("Second ten years payment with percentage is: " + secondTenYearsPayment);
        System.out.println("Last ten years payment with percentage is: " + lastTenYearsPayment);
        System.out.println("Percentage sum for all years: " + allYearsPercentageSum);

        Assertions.assertEquals(loanAmount, firstTenYearsBalance + secondTenYearsBalance + lastTenYearsBalance, "The loan is calculated wrong!");
        Assertions.assertEquals(10400.0, allYearsPercentageSum);
    }
}

//    public static void main (String [] args) {
//
//        double loanAmount = 80000.0;
//        Integer termInYears = 10;
//
//        Scanner scn = new Scanner(System.in);
//
//
//        PercentageRate a = new PercentageRate();
//       // double a = loanAmount / 0.1;
//
//
//        PercentageRate b = new PercentageRate();
//      //  double b = loanAmount / 0.08;
//
//        PercentageRate c = new PercentageRate();
//      //  double c = loanAmount / 0.06;
//
//
//       double firstTenYearsPercentageSum = loanAmount / (termInYears * 3)) * a / 100;
//       double secondTenYearsPercentageSum = (loanAmount / termInYears) * b / 100;
//       double lastTenYearsPercentageSum = (loanAmount / termInYears)  * c / 100;
//
//
//        System.out.println(firstTenYearsPercentageSum);
//        System.out.println(secondTenYearsPercentageSum);
//        System.out.println(lastTenYearsPercentageSum);





