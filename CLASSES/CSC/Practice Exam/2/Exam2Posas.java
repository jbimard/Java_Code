import java.util.Scanner;//for getting user input

public class Exam2Posas
{
   public static void main(String[] args)
    {
        // Scanner for user input
        Scanner keyboard = new Scanner(System.in);
        char keepGoing;
        String typeMembership, towingService;
        double membershipCost, freeTowingMiles = 0.0 , towingServiceAdd = 0.0, towingChargeAdd = 0.0 , mileageRate = 0.0;


        System.out.println("Welcome to the CPCC Roadside Service!");
        // Get membership type from user
        System.out.print("Enter your type of Membership: 'basic', 'plus', or 'premier': ");
        typeMembership = keyboard.nextLine();

        membershipCost = membershipBaseCost(typeMembership);
        // Calculate and display membership information 
        displayInformation(typeMembership, freeTowingMiles, towingServiceAdd, membershipCost);
        System.out.println("-------------------------------------------------------------");
        System.out.printf("Membership base cost: $%,.2f\n", membershipCost);
        System.out.println("-------------------------------------------------------------");
            

        

        System.out.print("Enter y or yes to add towing services. Enter no or n to stop and process your invoice: ");
        towingService = keyboard.nextLine();

      

        
       
        do
{
        keyboard.nextLine();
         System.out.print("\nWould you like to enter information about another parcel (Y/N)?");
         keepGoing = keyboard.nextLine().toUpperCase().charAt(0);
         System.out.println();
        }
         while(keepGoing == 'Y');
        

   
    }

    //Create a function to validate and return the user's towing distance input based on membership details.
    public static double membershipBaseCost(String membershipType)
    {
        final double BASIC = 64.50;
        final double PLUS = 95.95;
        final double PREMIER = 124.00;

        if (membershipType.equalsIgnoreCase("basic")) {
            return BASIC;
        } else if (membershipType.equalsIgnoreCase("plus")) {
            return PLUS;
        } else if (membershipType.equalsIgnoreCase("premier")) {
            return PREMIER;
        }
        else
        {
            return 0.0;
        }

        
    }    
    // Create a function to get and return the free towing miles based on membership type.
    public static double freeTowingMiles(String membershipType)
    {
        final double BASIC = 50.00;
        final double PLUS = 100.00;
        final double PREMIER  = 200.00;

        if (membershipType.equalsIgnoreCase("basic")) {
            return BASIC;
        } else if (membershipType.equalsIgnoreCase("plus")) {
            return PLUS;
        } else if (membershipType.equalsIgnoreCase("premier")) {
            return PREMIER;
        }
        else
        {
            return 0.0;
        }
        
        
    }
    // Create a function to get and return the mileage rate based on membership type.
    public static double mileageRate(String membershipType)
    {
        final double BASIC = 7.95;
        final double PLUS = 5.75;
        final double PREMIER  = 3.55;

         if (membershipType.equalsIgnoreCase("basic")) {
            return BASIC;
        } else if (membershipType.equalsIgnoreCase("plus")) {
            return PLUS;
        } 
            else if (membershipType.equalsIgnoreCase("premier")) {
            return PREMIER;
        }
        else
        {
            return 0.0;
        }
        
        
    }
     // Display additional information about remaining free towing miles and mileage rate
    public static void displayInformationAdd(String membershipType, double restfreeTowingMiles, double restmileageRate)
    {
        restfreeTowingMiles = freeTowingMiles(membershipType);
        restmileageRate = mileageRate(membershipType);

        System.out.println("Note: You have " + restfreeTowingMiles + " remaing free towing miles with your " + membershipType + " membership." +
        "\nYou will be charge at a rate of " + restmileageRate + " per mile for towing if you exceed the free miles.");

    }
    // Display basic information about the membership type, free towing miles, and mileage rate.
    public static void displayInformation(String membershipType, double freeTowingMiles, double mileageRate, double membershipBaseCost )
    {
         if (membershipType.equalsIgnoreCase("basic"))
        {
            System.out.print("Membership Type: basic\n");
            System.out.print("Total Free Towing Miles included: 50.00 miles \n");
            System.out.print("Towing milage rate after free towing miles: $7.95 per mile\n");
        }
         else if (membershipType.equalsIgnoreCase("plus"))
        {
            System.out.print("Membership Type: plus\n");
            System.out.print("Total Free Towing Miles included: 100.00 miles \n");
            System.out.print("Towing milage rate after free towing miles: $5.75 per mile\n");
        }
         else if (membershipType.equalsIgnoreCase("premier"))
        {
            System.out.print("Membership Type: premier\n");
            System.out.print("Total Free Towing Miles included: 200.00 miles \n");
            System.out.print("Towing milage rate after free towing miles: $3.55 per mile\n");
        }

    }
    // Function to get towing miles and calculate towing charge
    public static double towingMiles(double freeTowingMiles, double mileageRate)
    {
      
        Scanner keyboard = new Scanner(System.in);
        double towingVehicle, towingCharge;

        System.out.print("How many miles are you towing your vehicle on this request? (min 1 mile): ");
        towingVehicle = keyboard.nextInt();

        if (towingVehicle >= freeTowingMiles) {
            freeTowingMiles = 0.0;
            System.out.println("Total charge: $0.00");
        } else {
            freeTowingMiles -= towingVehicle;
            towingCharge = freeTowingMiles * mileageRate;

            System.out.print("Towing charge: " + towingCharge);
        }
        return 0.0;
    }

  

}
 


