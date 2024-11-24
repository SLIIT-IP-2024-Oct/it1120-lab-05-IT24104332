import java.util.Scanner;

public class IT24104332Lab5Q3{

    public static void main(String[] args) {

        //Declare and Initialise Constatns
        final double ROOM_CHARGE_PER_DAY = 48000.00;
        final double DISCOUNT_3_TO_4_DAYS = 0.1;
        final double DISCOUNT_5_OR_MORE_DAYS = 0.2;

        //Declare the variables
        int startDate , endDate , numberOfDaysReserved;
        double totalAmountBeforeDiscount , discountAmount , totalAmountToBePaid;

        //Declare and Initialise variables
        double discountRate = 0;

        //Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        //Prompt user for startDates
        System.out.print("Enter Start Date (1-31): ");
        startDate = input.nextInt();

        //Prompt user for endDates
        System.out.print("Enter End Date (1-31): ");
        endDate = input.nextInt();

        //Validation Checks
        if ((startDate < 1 || startDate > 31) || (endDate < 1 || endDate > 31)) {
            System.out.println("Error Days must be between 1 and 31.");

            return;	//Exit the program

        }

        if (startDate >= endDate){
            System.out.println("Error Days must be between 1 and 31.");

            return; //Exit the program

        }

        //Calculate number of days reserved
        numberOfDaysReserved = endDate - startDate;

        //Check if the reservation is eligible for discount
        if (numberOfDaysReserved >= 3 && numberOfDaysReserved <= 4) {
            discountRate = DISCOUNT_3_TO_4_DAYS;

        }
        else if (numberOfDaysReserved >= 5) {
            discountRate = DISCOUNT_5_OR_MORE_DAYS;
        }

        // Calculate total amount to be paid
        totalAmountBeforeDiscount = numberOfDaysReserved *  ROOM_CHARGE_PER_DAY;
        discountAmount = totalAmountBeforeDiscount * discountRate;
        totalAmountToBePaid = totalAmountBeforeDiscount - discountAmount;

        //Display Results
        System.out.println();
        System.out.println("Room Charge Per Day: Rs. " + ROOM_CHARGE_PER_DAY + "/=");
        System.out.println("Number of DayS Reserved: " + numberOfDaysReserved);
        System.out.println("Total Amount to be paid: " + totalAmountToBePaid);

    }

}
