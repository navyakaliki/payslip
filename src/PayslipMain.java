import java.util.Scanner;

public class PayslipMain {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter Your First Name :");
        String fName=scanner.nextLine();
        System.out.println("Enter your last Name:");
        String lName=scanner.nextLine();
        System.out.println("Enter your annual Salary:");
        int annualSalary= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Super rate:");
        int superRate= Integer.parseInt(scanner.nextLine());
        System.out.println("Enter Pay period Start Date:(dd/mm/yyyy");
        String startDate=scanner.nextLine();
        System.out.println("Enter Pay period End date :9dd/mm/yyyy");
        String endDate=scanner.nextLine();
        System.out.println("Name:"+fName+lName+
                "\n Pay-period Start"+startDate+
                "\n Pay-period End" +endDate);
        int grossSalary = getGrossSalary(annualSalary);
        System.out.println("Gross income is "+ grossSalary);
        int incomeTax=0;
        incomeTax = getIncomeTax(annualSalary, incomeTax);
        System.out.println("Income Tax:"+ incomeTax);
        int netIncome = getNetIncome(grossSalary, incomeTax);
        System.out.println("Net Income is: "+ netIncome);
        int superAmount = getSuperAmount(superRate, grossSalary);
        System.out.println("Super:"+superAmount);
    }


    private static int getGrossSalary(int annualSalary) {
        return annualSalary/12;
    }

    private static int getSuperAmount(int superRate, int grossSalary) {
        return grossSalary*(superRate/100);
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
