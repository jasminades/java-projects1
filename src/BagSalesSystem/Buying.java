package BagSalesSystem;

public class Buying {
    public static void main(String[] args){
        PaperBag paperBag = new PaperBag();

        paperBag.setLength(10.0);
        paperBag.setWidth(10.0);

        System.out.println("The price of the paper bag is " + paperBag.getPrice());

        PlasticBag plasticBag = new PlasticBag();

        plasticBag.setLength(40.0);
        plasticBag.setWidth(10.0);
        plasticBag.setTax(0.2);

        System.out.println("The tax for the plastic bag is " + plasticBag.getTax());
        System.out.println("The price of the plastic bag is " + plasticBag.getPrice());
    }
}
