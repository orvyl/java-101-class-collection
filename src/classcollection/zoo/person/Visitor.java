package classcollection.zoo.person;

public class Visitor {
    private String name;
    private String age;

    // [HW6] Make this constructor dynamic. Allows to instantiate with different name and age.
    public Visitor() {
        name = "Orvyl";
        age = "19";
    }

    public String getAge() {
        return age;
    }
}
