public class SuperCalc {
    int superRate;
    int superAmount;



    public SuperCalc(float superRate, int grossSalary) {
        this.superRate = (int) superRate;
        this.superAmount = (int) ((grossSalary*superRate)/100);

    }

    public int getSuperAmount() {
        return superAmount;
    }
}
