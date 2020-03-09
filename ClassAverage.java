import java.util.Arrays;
import java.util.Random;
/**
* This program calculates the overall average of a class.
*
* @author  Christina Ngwa
* @version 1.0
* @since   2020-03-06
*/

public class ClassAverage {
  /**
  * This method generates random marks for students.
  */
  public static void main(String[] args) {
  
    // variables
    int [][] grades = new int[4][6]; 
    Random rand = new Random();

    // process
    for (int i = 0; i < grades.length; i++) {
      System.out.print("Student " + (i + 1) + ": ");

      for (int j = 0; j < grades[i].length; j++) {
        // generate random numbers
        grades[i][j] = rand.nextInt(101 - 75) + 75; // high marks only
        // print marks
        System.out.print(grades[i][j]);
        System.out.print(" ");
      }

      // add a new line
      System.out.println();
    }

    // call medthod
    double avg = calculator(grades);

    // output
    System.out.println("\nThe overall class average is: " + avg);
  }
  
  /**
  * This method calculates the average.
  */
  public static int calculator(int[][] grades) {
  
    // variables
    int avg = 0; // int bc I want the rounded value
    int sum = 0;
    int numOfEements = 24; // 4 x 6
    
    // calculate sum
    for (int i = 0; i < grades.length; i++) {
      for (int j = 0; j < grades[i].length; j++) {
        sum = sum + grades[i][j];
      }
    }

    // calculate average
    avg = sum / numOfEements;
    
    return avg;
  }
}