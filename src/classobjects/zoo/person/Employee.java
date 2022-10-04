package classobjects.zoo.person;


import classobjects.zoo.animal.Animal;

public class Employee {

    private String id;
    private String name;
    double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void feedAnimal(Animal animal, String food) {
        boolean isEating = animal.chewFood(food);

        System.out.println(isEating ? "Yehey! Eating!" : "Wrong food");
    }

    public void displaySalaryBracket() {
        System.out.println(salary > 50000 ? "50k-100k" : "10k-49k");
    }

    public String getName() {
        return name;
    }
}
