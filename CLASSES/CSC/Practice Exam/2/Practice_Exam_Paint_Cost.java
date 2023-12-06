import java.util.Scanner;

public class Practice_Exam_Paint_Cost{

    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        int paintedRooms;
        double lengthRoom, widthRoom, heightRoom, paintCost, laborCost, wallSpace, totalCost = 0;


        System.out.print("Enter the number of rooms to be painted: ");
        paintedRooms = keyboard.nextInt();

        for (int i = 0; i < paintedRooms; i++)
            {
                System.out.print("\nEnter the legnth of the rooom: ");
                lengthRoom = keyboard.nextDouble();

                System.out.print("Enter the width if the room: ");
                widthRoom = keyboard.nextDouble();

                System.out.print("Enter the height of the room: ");
                heightRoom = keyboard.nextDouble();

                wallSpace = calcWallSpace(lengthRoom, widthRoom,heightRoom);
                paintCost = calculatePaintCost(wallSpace);
                laborCost = calculateLaborCost(wallSpace);

                totalCost += laborCost;
                totalCost += paintCost;


                System.out.println();
                displayData(paintCost, laborCost);
                System.out.println();


    
            }
 
            System.out.printf("The total cost of painting "+paintedRooms+" rooms " + "is $%,.2f\n", totalCost);

        }

        public static double calcPerimeter(double lengthRoom, double widthRoom)
        {
            return (lengthRoom + widthRoom) * 2;
        }

        public static double calcWallSpace(double lengthRoom, double widthRoom, double heightRoom)
        {
            return calcPerimeter(lengthRoom, widthRoom) * heightRoom;
        }

        public static double calculatePaintCost(double squareFtwallspace)
        {
            final double gallonPaint = 60.0;
            final double squareFTgallon = 250.0;

            return Math.ceil(squareFtwallspace / squareFTgallon) * gallonPaint;
        }

        public static double calculateLaborCost(double squareFtwallspace)
        {
            final double sqftHrLabor = 4.00;
            final double sqftLaborPrice = 35.00;
            final double squareFTgallon = 250.0;

            return ((squareFtwallspace / squareFTgallon)*sqftHrLabor) * sqftLaborPrice;
        }

        public static void displayData(double paintCost, double laborCost)
        {
            System.out.printf("Paint Cost: $%,.2f\n", paintCost);
            System.out.printf("Labor Cost: $%,.2f\n", laborCost);
        }

    }