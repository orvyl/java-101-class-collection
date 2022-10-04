package classcollection.flight;

public class FlightApp {
    public static void main(String[] args) {
        Flight manilaToBoracay = new Flight(150);
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();
        manilaToBoracay.addPassenger();

        System.out.println("Current number of passengers: " + manilaToBoracay.getNumberOfPassengers());

        // System.out.println("Is capacity full: " + manilaToBoracay.isFull()); // Is capacity full: false
    }
}
