package DrivingLicenceSystem;

public class CommercialDriver extends GenericDriver{
    private String materialsType;
    private String carType;


    public CommercialDriver(String name, boolean isProvisional, String materialType, String car){
        super(name, isProvisional);
        materialType = materialType;
        carType = car;
    }

    public String getMaterialsType(){
        return materialsType;
    }

    public void setMedicalReport(){
        medicalReport = "Approved to drive " + carType;
    }


}
