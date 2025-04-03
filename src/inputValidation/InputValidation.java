package src.inputValidation;

import java.util.Scanner;

public class InputValidation {
  public static int validatingMenuInput(Scanner input, int maxOption){
    // Initialise number to have a value stored and eventually returned
    int selectedNumber;

    // While loop that keeps running until user quits (6)
    while(true){
      System.out.print("Please enter a whole number from 1 - " + maxOption + ": ");
      // Checks if user input is of a (int) type or not
      if(input.hasNextInt()){
        selectedNumber = input.nextInt();
        // If of int type, then a check is ran to see if input is from 1 to 6
        if(selectedNumber >= 1 && selectedNumber <= maxOption){
          return selectedNumber;
        }
        else{
          System.out.println("Error. Input entered was not a whole number from 1 - " + maxOption + ".\n");
        }
      }
      else{
        System.out.println("Error. Input entered was not a whole number.\n");
        input.next();
      }
    }
  }
}
