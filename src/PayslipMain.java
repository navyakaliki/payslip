import java.util.Scanner;

public class PayslipMain {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        String fName = getDetails(scanner,"FIRST NAME");
        String lName=getDetails(scanner,"LAST NAME");
        int annualSalary = getNumericDetails(scanner,"Annual Salary");
        int superRate = getNumericDetails(scanner, "Super Rate:");
        String startDate=getDetails(scanner,"Pay-Period START -DATE:");
        String endDate=getDetails(scanner,"Pay Period END-DATE");

        System.out.println("Name:"+fName+ " " + lName+
                "\nPay-period Start"+" " +startDate+
                "\nPay-period End"+" "+ endDate);
        int grossSalary = getGrossSalary(annualSalary);
        System.out.println("Gross Income: "+ grossSalary);
        int incomeTax=0;
        incomeTax = getIncomeTax(annualSalary, incomeTax);
        System.out.println("Income Tax:"+ incomeTax);
        int netIncome = getNetIncome(grossSalary, incomeTax);
        System.out.println("Net Income is: "+ netIncome);
        int superAmount = getSuperAmount(superRate, grossSalary);
        System.out.println("Super:"+superAmount);
    }

    private static int getNumericDetails(Scanner scanner,String msg) {
        System.out.println("Enter"+ msg);
        return Integer.parseInt(scanner.nextLine());
    }

    private static String getDetails(Scanner scanner, String msg) {
        System.out.println("Enter :" + msg);
        return scanner.nextLine();
    }


    private static int getGrossSalary(int annualSalary) {
        return annualSalary/12;
    }

    private static int getSuperAmount(int superRate, int grossSalary) {
        return (grossSalary*superRate)/100;
    }

    private static int getIncomeTax(int annualSalary, int incomeTax) {
        if (annualSalary>0 && annualSalary<=18200){
            incomeTax=0;}
        else if (annualSalary>=18201 && annualSalary<37000) {
            incomeTax =(19 * annualSalary)/12;
        }
        else if(annualSalary>=37001 && annualSalary<=87000){
            incomeTax= (int) ((3572+(annualSalary-37000)*0.325)/12);
        }
        else if(annualSalary>=87001 && annualSalary<=180000){
            incomeTax= (int) ((19822+(annualSalary-87000)*0.37)/12);}
        else if(annualSalary>=180001){
            incomeTax=(54232+(annualSalary-180000))/12;}
        return incomeTax;
    }

    private static int getNetIncome(int grossSalary, int incomeTax) {
        return grossSalary-incomeTax;
    }
}