package TrainTicket;

public class TicketSystem {
    public static double getCharge(Location place, boolean isAdult, int numTickets) {
        double basicCharge = 0.0;
        double totalCharge = 0.0;


        basicCharge = switch (place) {
            case LISBON -> 22.3;
            case HAMBURG -> 34.3;
            case VIENNA -> 42.2;
            case ROME -> 12.2;
        };

        if (!isAdult) {
            basicCharge *= 0.9;
        }

        totalCharge = basicCharge * numTickets;
        return totalCharge;
    }
}
