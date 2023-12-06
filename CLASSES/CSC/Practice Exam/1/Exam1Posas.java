import java.util.Scanner;

public class Exam1Posas{

    public static void main(String[] args){
        //Declare variables
        String legalServices, retainerType;
        int    legalHours = 0, dayService = 0, individualHours = 0;
        double hourlyRate = 0, retainerAmount = 0, legalServicesCharges = 0, amountDue = 0;
        //Set constants for set amounts
        final int       oneDay = 8;
        final double    intProperty = 453.00; 
        final double    perInjury = 262.00;
        final double    longTermRetainer = 50000.00;
        final double    standardTermRetainer = 10000.00;
        final double    shortTermRetainer = 5000.00;
        //Create Scanner for user input
        Scanner myObj = new Scanner(System.in);

    
    System.out.println("Welcome to Central Piedomont Legal Services");
    //Ask the user to enter the type of legal service
    System.out.println("Choose from one of the following types of legal services: ");
    System.out.println("    A - Intellectual Property");
    System.out.println("    B - Personal Injury");
    System.out.print("Enter your choice (A or B): ");
    legalServices = myObj.nextLine();
    
    //Determine the hourly rate of service
    if (legalServices.equalsIgnoreCase("A")){
        System.out.println("\nIntellectual Property Legal Services rate: $453.00 per hour");
        hourlyRate = intProperty;
    }
    else if (legalServices.equalsIgnoreCase("B")) 
    {
        System.out.println("\nPersonal Injury Legal Services rate: $262.00 per hour");
        hourlyRate = perInjury;
    }
    //If an invalid legal service is entered, the Intellectual Property charge will be applied
    else {
        legalServices = "A";
        hourlyRate = intProperty;
        System.out.println("\nInvalid choice. Intellectual Property Legal Services rate applied");
        System.out.println("\n\nIntellectual Property Legal Services rate: $453.00 per hour");
        
    }

    //Ask the user to enter the type of retainer
    System.out.print("\nEnter the type of retainer type: 'long-term', 'standard', 'short-term': ");
    retainerType = myObj.nextLine();

    //Determine the the retainer term
    if (retainerType.equalsIgnoreCase("long-term")){
        System.out.println("\nLong Term retainer of $50000.00 applied for services.");
        retainerAmount = longTermRetainer;
    }
    else if (retainerType.equalsIgnoreCase("standard")){
        System.out.println("\nStandard retainer of $10000.00 applied for services.");
        retainerAmount = standardTermRetainer;
    }
    else if (retainerType.equalsIgnoreCase("short-term")){
        System.out.println("\nShort Term retainer of $5000.00 applied for services.");
        retainerAmount = shortTermRetainer;
    }
    //If the retainer type is invalid, the short-term retainer will be applied
    else {
        retainerType = "short-term";
        System.out.println("\nINVALID ENTRY. Short Term retainer of $5000.00 applied for services.");
        retainerAmount = shortTermRetainer;
    }
    
    //Ask the user to enter the total number of hours of legal services used
    System.out.print("Enter the total number of hours of legal services: ");
    legalHours = myObj.nextInt();

    //Calculate the number of days and individual hours from the number of legal hours
    dayService = legalHours / oneDay;
    individualHours = legalHours % oneDay;

    //Calculate the legal services charges from the number of legal hours
    legalServicesCharges = hourlyRate * legalHours;

    //Display information to the user
    System.out.println("\n\n---------------------------------------------------------");
    System.out.println("Duration of Service: " + dayService + " day(s), " + individualHours + " hour(s)");
    System.out.printf("Hourly Rate: $%.2f\n", hourlyRate);
    System.out.printf("Retainer amount: $%.2f\n", retainerAmount);
    System.out.printf("Legal Services Charges: $%.2f\n", legalServicesCharges);

    //Calculate the amount due by subtracting the retainer amount from the legal services charges.
    if (legalServicesCharges > retainerAmount){
        amountDue = legalServicesCharges - retainerAmount;
        System.out.printf("Amount Due: $%.2f\n", amountDue);
    }
    //If the legal services charges do not exceed the retainer amount, the amount due is $0.00
    else {
        System.out.println("Amount Due: $0.00");
    }
    System.out.println("---------------------------------------------------------");

    }
    
}