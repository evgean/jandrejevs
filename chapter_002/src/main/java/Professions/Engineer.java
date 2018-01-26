package Professions;

public class Engineer extends Profession {
    private int age;
    private String family;

    public void createBlueprint(House house) {
        System.out.println("Blueprint for " + house.serialNum + " was created");
    }

    public boolean tests(House house) {
        double testing = Math.random();
        return (testing > 0.5);
    }
}
