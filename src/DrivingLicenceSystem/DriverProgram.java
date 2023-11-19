package DrivingLicenceSystem;

public class DriverProgram {
    public static void main(String[] args){
        GenericDriver tom = new GenericDriver("Tom", true);

        tom.deduct(3);
        tom.setMedicalReport();

        CommercialDriver lily = new CommercialDriver("Lily",false, "Inflammable" , "truck");

        lily.deduct(5);
        lily.setMedicalReport();

        GenericDriver[] driverArray = new GenericDriver[2];
        driverArray[0] = tom;
        driverArray[1] = lily;

        for(int i = 0 ; i < driverArray.length ; i++){
            System.out.println(driverArray[i].getName() + "'s licence is provisional: " + driverArray[i].getIsProvisional());
            System.out.println(driverArray[i].getName() + " has " + driverArray[i].getPoints() + " points");

        }

    }
}
