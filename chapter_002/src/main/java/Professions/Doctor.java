package Professions;

public class Doctor extends Profession{
    private int age;
    private String typeOf;
    int payment = 10;
    private String problemToSolve;

    public boolean heal(Patient pacient){
        if (pacient.pay(this)) {
            double healing = Math.random();
            return (healing > 0.5);
        } else {
            return false;
        }
    }

    public void ask(Patient pacient) {
        this.problemToSolve = pacient.problem;
    }

    public void reassure(Patient pacient) {
        System.out.println("Do not worry. Everything will be fine");
    }
}
