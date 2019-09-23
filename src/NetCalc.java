public class NetCalc{
    int grossSalary;
    int incomeTax;
    int netIncome;

    public NetCalc(int grossSalary, int incomeTax) {
        this.grossSalary = grossSalary;
        this.incomeTax = incomeTax;
        this.netIncome = grossSalary-incomeTax;
    }

    public int getNetIncome() {
        return netIncome;
    }
}
