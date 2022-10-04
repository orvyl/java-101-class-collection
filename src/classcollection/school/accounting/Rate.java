package classcollection.school.accounting;

import classcollection.school.Course;

public class Rate {
    private Course course;
    private double pricePerUnit;

    public Rate(Course course, double pricePerUnit) {
        this.course = course;
        this.pricePerUnit = pricePerUnit;
    }

    public Course getCourse() {
        return course;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }
}
