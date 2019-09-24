import java.util.Scanner;

public class PayslipMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fName = getDetails(scanner, "your First Name:");
        String lName = getDetails(scanner, "your Last Name");
        float annualSalary = getNumericDetails(scanner, "your Annual Salary");
        float superRate = getNumericDetails(scanner, "your Super Rate:");
        String startDate = getDetails(scanner, "PayPeriod Start:");
        String endDate = getDetails(scanner, "PayPeriod End");

        System.out.println("Payslip Generated:");
        System.out.println("Employee Name:" + fName + " " + lName + "\nPayperiod Start" + " " + startDate + "\nPayperiod End" + " " + endDate);
        int grossSalary = getGrossSalary((int) annualSalary);
        System.out.println("Gross Salary :" + grossSalary);
        TaxCalc incomeTax = new TaxCalc((int) annualSalary);
        System.out.println("Tax amount is :" + incomeTax.getIncomeTax());
        NetCalc netIncome=new NetCalc(grossSalary,incomeTax);
        System.out.println("Net Income is:"+ netIncome.getNetIncome());
        SuperCalc superAmt = new SuperCalc(superRate, grossSalary);
        System.out.println("Super amount is : " + superAmt.getSuperAmount());
        System.out.println("***** THANK YOU FOR USING MYOB********");
    }

    private static float getNumericDetails(Scanner scanner, String msg) {
        System.out.println("Please Enter" + msg);
        return Float.parseFloat(scanner.nextLine());
    }

    private static String getDetails(Scanner scanner, String msg) {
        System.out.println("Enter " + msg);
        return scanner.nextLine();
    }


    private static int getGrossSalary(int annualSalary) {
        return annualSalary / 12;
    }


}