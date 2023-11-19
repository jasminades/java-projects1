package TrainTicket;

public class Charging {
    public static void main(String[] args){
            double charge = TicketSystem.getCharge(Location.HAMBURG, false, 2);

            System.out.println("The Total Charge is: " + charge);

            charge=TicketSystem.getCharge(Location.LISBON, true, 6);
        System.out.println("The Total Charge is: " + charge);
    }
}
