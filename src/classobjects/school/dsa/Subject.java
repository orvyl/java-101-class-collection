package classobjects.school.dsa;

public class Subject {
    private String title;
    String description;

    Subject(String title) {
        this.title = title;
    }

    public String getFullDetails() {
        return title + ": " + description;
    }
}
