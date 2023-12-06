import java.util.Scanner;

public class PracticeExam2{

    public static void main(String[] args)
    {
        final int       dozen = 12;
        final double    dozenPrice = 5;
        final double    individualPrice = 0.5;
        final double    deliveryFee = 0.05;
        String      nameOrder, orderType, enjoyAnswer;
        int         numberEggs, numberMiles, individuals, eggDozens;
        double      subtotal, total;

        Scanner myObj = new Scanner(System.in);


    System.out.println("Welcome to Sally's Coop !\n");
    System.out.print("Please enter the number of eggs you would like to order: ");
    numberEggs = myObj.nextInt();

    eggDozens = (numberEggs / dozen);
    individuals = numberEggs % 12;

    myObj.nextLine();
    System.out.print("\nEnter the name for the order: ");
    nameOrder = myObj.nextLine();
    
    System.out.print("\nPlease type \"Delivery\" or \"Pickup\": ");
    orderType = myObj.nextLine();

    subtotal = (eggDozens * dozenPrice) + (individuals * individualPrice);
    total = subtotal;

    if (orderType.equalsIgnoreCase("Delivery"))
    {
        System.out.print("\nHow many miles away are you from our location? ");
        numberMiles = myObj.nextInt();
        orderType = "Delivery";

        if (numberMiles > 5){
            System.out.println("\nA 5% fee has been added to your order.\n");
            total = (total * deliveryFee) + total;
        }
    }
    else
        {
            orderType = "Pickup";
            System.out.println("\nNo fee has been added to your order");
        }
        
        

    System.out.println("\nPlease review your receipt\n");
    System.out.println("Name of order: " + nameOrder);
    System.out.print("\nNumber of eggs: " + eggDozens + 
                            " Dozens and " + individuals + " individual(s)\n" );
    System.out.printf("\nSubtotal: $%.2f\n", subtotal);
    System.out.println("\nDelivery/Pickup: " + orderType);
    System.out.printf("\nFinal Total $%.2f\n",total );
     myObj.nextLine();
    System.out.print("\nDid you enjoy using our program? Type Y or N: ");
    enjoyAnswer = myObj.nextLine();
    
    if (enjoyAnswer.equalsIgnoreCase("y")){
        System.out.println("\nWe are happy to hear that! Please use our program again soon!");
    }
        else{
            System.out.println("\nWe are sorry to hear that. We will continue to make improvements to our program.");
        }
    
    }

}