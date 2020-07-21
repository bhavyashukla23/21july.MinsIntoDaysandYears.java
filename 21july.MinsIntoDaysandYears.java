import java.util.Scanner;

public class mins {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // Prompt user for number of minutes
    System.out.println("Enter the number of minutes:");
    int mins = input.nextInt();

     // Number of minutes in a year
    int year = mins / 525600;
    int day = mins / 1440;
    int remainingMinutes = day % 525600;


    System.out.println(mins + " minutes is " + year + " years and "  +  remainingMinutes + " days ");
    }

   }
