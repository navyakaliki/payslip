
    public class NetCalc{
        int grossSalary;
        TaxCalc incomeTax;
        int netIncome;

        public NetCalc(int grossSalary, TaxCalc incomeTax) {
            this.grossSalary = grossSalary;
            this.incomeTax = incomeTax;
            this.netIncome = getNetIncome();
        }

        public int getNetIncome() {
            TaxCalc incomeTax= new TaxCalc(grossSalary);
            netIncome=grossSalary-incomeTax.getIncomeTax();
            return netIncome;
        }
    }


