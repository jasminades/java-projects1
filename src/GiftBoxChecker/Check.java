package GiftBoxChecker;

import java.util.ArrayList;

public class Check {
    public static void main(String[] args){
        ArrayList<GiftBox> boxes = new ArrayList<GiftBox>();
        double[] biscuitsWeights1 = {200.0 , 100.0};
        double[] chocolateWeights1 = {200.0 , 100.0};
        String[] chocolateFlavors1 = {"mint", "orange"};

        boxes.add(new GiftBox(biscuitsWeights1, chocolateWeights1, chocolateFlavors1));

        double[] biscuitsWeights2 = {300.0 , 100.0, 100.0};
        double[] chocolateWeights2 = {200.0 , 100.0, 300.0};
        String[] chocolateFlavors2 = {"mint", "orange", "coffee"};

        boxes.add(new GiftBox(biscuitsWeights2, chocolateWeights2, chocolateFlavors2));

        for(GiftBox box : boxes){
            if(box.getWeight() > 1000.0){
                System.out.println("The box with " + box.getNumBiscuits() + " biscuits and " + box.getNumChocolates() + " chocolates is overweight!");
                System.out.println();

                System.out.println("The biscuits weights are: ");
                box.showBisicuitsWeights();
                System.out.println();

                System.out.println("The chocolate weights are: ");
                box.showChocolateWeights();
                System.out.println();

                System.out.println("The chocolate flavors are: ");
                box.showFlavors();
            }

        }



    }
}
