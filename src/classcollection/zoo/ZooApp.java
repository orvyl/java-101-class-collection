package classcollection.zoo;

import classcollection.zoo.animal.Animal;
import classcollection.zoo.animal.AnimalType;
import classcollection.zoo.person.Employee;
import classcollection.zoo.person.Manager;
import classcollection.zoo.person.Visitor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ZooApp {
    public static void main(String[] args) {
        Animal dog = new Animal("Dog", AnimalType.MAMMAL, "Bone", "Arf");
        dog.makeSound();

        Visitor v1 = new Visitor();
        System.out.println("The age of first visitor is " + v1.getAge());

        Employee e1 = new Employee("id123", "Larry", 12000);
        e1.feedAnimal(dog, "Fish");

        Manager m1 = new Manager();
        m1.updateSalary(e1, 100000.00);

        e1.displaySalaryBracket();

        System.out.println("++==++==");

        Animal cat = new Animal("Cat", AnimalType.MAMMAL, "Fish", "meow");
        cat.makeSound();

        System.out.println("+===++=++");
        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        System.out.println("Current # of animals: " + animals.size());
        animals.remove(dog);
        System.out.println("Current # of animals after removing one: " + animals.size());
        Animal croc = new Animal("Croc", AnimalType.REPTILE, "Chicken", "grrr");
        animals.add(croc);
        System.out.println("Current # of animals after adding one: " + animals.size());

        System.out.println("++=++=");
        Map<String, Employee> employees = new HashMap<>();
        employees.put("id123", e1);
        employees.put("id456", new Employee("id456", "Sarah", 10000));
        employees.put("bea123", new Employee("bea123", "Bea", 500000000));


        System.out.println("Current # of employees: " + employees.size());
        Employee employeeWithId456 = employees.get("id456");
        employeeWithId456.displaySalaryBracket();

        System.out.println("++=++=++");
        for (Animal animal : animals) {
            System.out.println(animal.getName() + " sounds like...");
            animal.makeSound();
        }

        System.out.println("++=++=++");
        for (Map.Entry<String, Employee> employeeEntry : employees.entrySet()) {
            System.out.println(employeeEntry.getKey() + " => " + employeeEntry.getValue().getName());
        }

        System.out.println();
        System.out.println("****************");
        System.out.println();

        // [HW7] display here the name of Employee with ID: id456 CLUE: create a getter and use it here

        // [HW8] Create a Set of animals and the following existing animal variables in order: dog, cat, dog, croc, dog, croc, cat
        // Add your code here and uncomment the next line of code. It should display `3`.

        // System.out.println(animalSet.size()); // comment HERE why it displays `3`.
    }
}
