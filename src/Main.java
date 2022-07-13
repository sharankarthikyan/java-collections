import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Theatre theatre = new Theatre("PVR Grand Galada", 10, 10);

        if (theatre.reserveSeat("D05")) {
            System.out.println("Please pay for D05");
        } else {
            System.out.println("Seat already reserved.");
        }

        if (theatre.reserveSeat("D05")) {
            System.out.println("Please pay for D05");
        } else {
            System.out.println("Seat already reserved.");
        }

        if (theatre.reserveSeat("A08")) {
            System.out.println("Please pay for A08");
        } else {
            System.out.println("Seat already reserved.");
        }

        List<Theatre.Seat> seats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(seats);
        printList(seats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 150.00));
        priceSeats.add(theatre.new Seat("C07", 120.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> seats) {
        for (Theatre.Seat seat : seats) {
            System.out.print(" " + seat.getSeatNumber() + ": $" + seat.getPrice() + " |");
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