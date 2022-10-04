package classobjects.flight;

public class Flight { // class declaration

    // Fields: store the states. attributes
    private int numberOfPassengers;
    private int numberOfSeats;

    /**
     * OK, at this point review your ACCESS MODIFIERS.
     *
     * `private` variables can only be accessible(viewed and updated) within this class. see addPassenger() method.
     *              It can directly add to the variable `numberOfPassengers` but that is not possible outside `Flight.java`.
     *              [HW1] `numberOfPassengers` cannot be access directly by a static method even tho it's part of
     *              `Flight.java`. Why?
     *
     */

    // Constructor: Action to be executed upon creation of an instance of this class. You can set initial value of the Fields or do some operations
    public Flight(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    // Method: Operation of the class. Alters the state or fields.
    public void addPassenger() { // EXPERIMENT: What if addPassenger() is using a private or default modifier
        ++numberOfPassengers;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    //[HW2] Add a method isFull() that returns `true` if the flight can no longer accept passengers, `false` otherwise.
}
