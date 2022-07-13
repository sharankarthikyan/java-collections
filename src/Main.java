import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("PVR Grand Galada", 5, 10);
        List<Theatre.Seat> seatsCopy = new ArrayList<>(theatre.seats);
        printList(seatsCopy);

        seatsCopy.get(1).reserve();
        if (theatre.reserveSeat("A02")) {
            System.out.println("Please pat for A02");
        } else {
            System.out.println("Seat already reserved.");
        }

        // Collections.reverse
        System.out.println("================ Collection Reverse ================");
        Collections.reverse(seatsCopy);
        System.out.println("Printing seat copy.");
        printList(seatsCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        // Collections.shuffle
        System.out.println("================ Collection Shuffle ================");
        Collections.shuffle(seatsCopy);
        System.out.println("Printing seat copy.");
        printList(seatsCopy);
        System.out.println("Printing theatre.seat");
        printList(theatre.seats);

        Theatre.Seat minSeat = Collections.min(seatsCopy);
        Theatre.Seat maxSeat = Collections.max(seatsCopy);
        System.out.println("Min seat number is " + minSeat.getSeatNumber());
        System.out.println("Max seat number is " + maxSeat.getSeatNumber());

        sortList(seatsCopy);
        System.out.println("Printing sorted seatsCopy");
        printList(seatsCopy);
    }

    public static void printList(List<Theatre.Seat> seats) {
        for (Theatre.Seat seat : seats) {
            System.out.print(" " + seat.getSeatNumber());
        }
        System.out.println();
        System.out.println("======================================================================================");
    }

    public static void sortList(List<? extends Theatre.Seat> seats) {
        for (int i = 0; i < seats.size(); i++) {
            for (int j = i + 1; j < seats.size(); j++) {
                if (seats.get(i).compareTo(seats.get(j)) > 0) {
                    Collections.swap(seats, i, j);
                }
            }
        }
    }
}