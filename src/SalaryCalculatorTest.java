// Ex. 4.20: SalaryCalculatorTest
// Demonstrates class SalaryCalculator's capabilities

import java.util.Scanner;

public class SalaryCalculatorTest {

   public static void main(String[] args){

      SalaryCalculator mySalaryCalculator = new SalaryCalculator("Ben", 45, 18.20);
      int employee = 0;

      //create a Scanner object to obtain input from the command window
      Scanner input = new Scanner(System.in);

      //get an input from user
      while (employee < 3)
            {System.out.println("Please enter the employee's name: ");
            String theName = input.nextLine();
            mySalaryCalculator.setName(theName);

            System.out.println("Please enter the number of hours worked last week: ");
            int theHours = Integer.parseInt(input.nextLine());
                  while (theHours < 0)
                  {System.out.println("The number of hours worked cannot be negative. Please enter a valid number: ");
                   theHours = Integer.parseInt(input.nextLine());}
            mySalaryCalculator.setHours(theHours);

            System.out.println("Please enter the hourly rate: ");
            double theRate = Double.parseDouble(input.nextLine());
                 while (theRate < 0)
                 {System.out.println("The hourly rate cannot be negative. Please enter a valid number: ");
                  theRate = Integer.parseInt(input.nextLine());}
            mySalaryCalculator.setRate(theRate);

            //display the results
            System.out.printf("%s's gross pay: $%s%n", mySalaryCalculator.getName(),mySalaryCalculator.getGrossPay());
            System.out.println();

            employee ++;}

      System.out.println("Thank you for using Salary Calculator!");
   }
}
