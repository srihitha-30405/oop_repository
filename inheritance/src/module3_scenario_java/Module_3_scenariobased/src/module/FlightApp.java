package module;

class LateCheckInException extends Exception {
    public LateCheckInException(String message) {
        super(message);
    }
}

class FlightCheckIn {
    public void checkIn(String passengerName, int minutesBeforeDeparture) throws LateCheckInException {
        if (minutesBeforeDeparture < 30) {
            throw new LateCheckInException("Check-in failed: Less than 30 minutes before departure.");
        } else {
            System.out.println("Check-in successful for " + passengerName);
        }
    }
}

public class FlightApp {
    public static void main(String[] args) {
        FlightCheckIn checkInSystem = new FlightCheckIn();

        try {
            checkInSystem.checkIn("Alice", 45); // Successful
            checkInSystem.checkIn("Bob", 20);   // Throws LateCheckInException
        } catch (LateCheckInException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
