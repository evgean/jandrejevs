package Professions;

public class Patient {
    private String name;
    private int age;
    private String sex;
    String problem;
    private String condition;
    private int money = 100;

    public boolean pay(Doctor doctor) {
        boolean isPayed = false;
        if (doctor.payment <= this.money) {
            this.money = this.money - doctor.payment;
            isPayed = true;
        }
        return isPayed;
    }
}
