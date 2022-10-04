package classobjects.zoo.person;

public class Manager {
    private String name;
    private String age;
    private String title;

    // [HW5] Make this constructor dynamic. Allows to instantiate with different name,age, and title.
    public Manager() {
        name = "Apper";
        age = "49";
        title = "Manager";
    }

    public void updateSalary(Employee employee, double newSalary) {
        employee.salary = newSalary;
    }
}
