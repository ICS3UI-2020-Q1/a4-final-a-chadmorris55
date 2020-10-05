import java.util.Scanner;
/**
 * prints out a numbers factors
 * @Chad 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner for user input
    Scanner input = new Scanner(System.in);
    
    // asks user for a number and records it for later
    System.out.println("Enter a positive integer to determine its factors:");
    int number = input.nextInt();
    //variables here
    int count = 0;
    int quotientCheck = 10;
    //Prints the starting message to the screen
    System.out.println("The factors of " + number + " are:");
    //does the loop while the numbers that have to be checked go up until they reach the user inputted number
    while (count < number){ 
      count = count + 1;
      quotientCheck = number % count;
     if (quotientCheck == 0){
       System.out.println(count);
      } 
    } 
  } 
}
