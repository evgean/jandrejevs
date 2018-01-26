package Professions;

public class Teacher extends Profession {
    int salary;

    public void teach(Learner learner) {
        System.out.println("I learning " + learner.name);
    }

    public double giveGrade(Learner learner) {
        return Math.random() * 10;
    }

    public String classTeacher(Learner learner, Teacher teacher) {
        String answer = "Learner do not have teacher";
        if (learner.classTeacher != null) {
            answer = learner.classTeacher;
        }
        return answer;
    }

    public boolean claimSalary(Principal principal, double amount) {
        boolean answer = false;
        if (principal.goodMood) {
            answer = (principal.moneyAmount > amount);
        }
        return answer;
    }
}
