package Professions;

public class Teacher extends Profession {
    int salary;

    public void teach(Learner learner) {
        System.out.println("I learning " + learner.name);
    }

    public double giveGrade(Learner learner) {
        double mark = Math.random() * 10;
        return mark;
    }

    public String classTeacher(Learner learner, Teacher teacher) {
        if (learner.classTeacher != null) {
            return learner.classTeacher;
        } else {
            return "Learner do not have teacher";
        }
    }

    public boolean claimSalary(Principal principal, double amount) {
        return (principal.moneyAmount > amount);
    }
}
