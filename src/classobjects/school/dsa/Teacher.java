package classobjects.school.dsa;

public class Teacher {
    private String name;
    private Subject subject;

    Teacher(String name, Subject subject) {
        this.subject = subject;
        this.name = name;
    }

    void updateSubjectDescription() {
        subject.description = " Your teacher is " + name;
    }
}
