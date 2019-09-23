public class SuperCalc {
    int superRate;
    int superAmount;


    public SuperCalc(int superRate, int grossSalary) {
        this.superRate = superRate;
        this.superAmount = (grossSalary*superRate)/100;

    }

    public int getSuperAmount() {
        return superAmount;
    }
}
