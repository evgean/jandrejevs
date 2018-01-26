package Professions;

public class Doctor extends Profession{
    private int age;
    private String typeOf;
    int payment = 110;
    private String problemToSolve;

    public boolean heal(Patient pacient) {
        boolean isHealed = false;
        if (pacient.pay(this)) {
            double healing = Math.random();
            if (healing > 0.5) {
                isHealed = true;
            }
        }
        return isHealed;
    }

    public void ask(Patient pacient) {
        this.problemToSolve = pacient.problem;
    }

    public void reassure(Patient pacient) {
        System.out.println("Do not worry. Everything will be fine");
    }
}
