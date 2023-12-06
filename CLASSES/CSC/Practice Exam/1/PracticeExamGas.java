import java.util.Scanner;

public class PracticeExamGas{

    public static void main(String[] args){
        //declare variables here

        //prices based on brand
        final double    discountGasoline = 2.49;
        final double    premiumGasoline = 2.99;

        //conversion factor from liters to gallons
        final double    gallons_per_litter = .264172;

        int     brandType, octaneRating;
        double  gasolineLitters, gasolineGallons, costGasoline, brandSelected = 0;

        Scanner myObj = new Scanner(System.in);

    //menu options

    //display a menu for gas type and read the user's choice
    System.out.println("CPCC Gasoline Services\n");
    System.out.println("1. Discount");
    System.out.println("2. Premium\n");

    System.out.print("\nEnter the brand type: ");
    brandType = myObj.nextInt();

    //figure out cost of gas based on brand and octane amount
    if  (brandType == 1)
        brandSelected = discountGasoline;
    else if  (brandType == 2)
        brandSelected = premiumGasoline;
        
    //get the octane rating    
    System.out.print("\nEnter the octane rating: ");
    octaneRating = myObj.nextInt();

    //get the amount of gas in liters
    System.out.print("\nEnter the amount of gasoline in liters: ");
    gasolineLitters = myObj.nextDouble();

    //convert liters to gallons
    gasolineGallons = gasolineLitters * gallons_per_litter;

    //calculate the total cost
    costGasoline = (brandSelected - (100 - octaneRating)* 0.01) * gasolineGallons;

    //print out the total cost, making sure to format it as currency
    System.out.printf("\nThe cost of the gasoline is $%.2f\n", costGasoline);
    }

}