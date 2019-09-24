
public class TaxCalc {
       int annualSalary;
       int incomeTax;

    public TaxCalc(int annualSalary) {
        this.annualSalary = annualSalary;
        this.incomeTax = getIncomeTax();
    }



    public  int getIncomeTax() {
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

}
