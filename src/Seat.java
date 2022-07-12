public class Seat {
    // Attributes of Seat
    private final String seatNumber;
    private boolean reserved = false;

    // Initialization
    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    // Getters
    public String getSeatNumber() {
        return seatNumber;
    }

    // Behaviours of Seat
    public boolean reserve() {
        if (!this.reserved) {
            this.reserved = true;
            System.out.println("Seat " + seatNumber + " reserved.");
            return true;
        } else {
            return false;
        }
    }

    public boolean cancel() {
        if (this.reserved) {
            this.reserved = false;
            System.out.println("Reservation of seat " + seatNumber + " cancelled.");
            return true;
        } else {
            return false;
        }
    }
}
