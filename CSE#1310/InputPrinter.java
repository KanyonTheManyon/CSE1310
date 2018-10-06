
package inputprinter; //Coded by Kanyon Loyd
import java.util.Scanner; //Homework 00
public class InputPrinter {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your first name?");
        String firstName = input.nextLine();
        System.out.println("What is your last name?");
        String lastName = input.nextLine();
        System.out.println("What is your birthday? Please spell out month completely "
                + "and follow with two digits for the day followed by a comma, and 4 digits for the year."
                + " EX: December 09, 1990");
        String birthMonth = input.next();
        String birthDay = input.nextLine();
        String birthX = birthDay.substring(0,3);
        String combineBirth = birthMonth+birthX;
           System.out.println("How old are you now? Please use numerical values only");
        int age = input.nextInt();
      System.out.println("What is your favorite color?");
      String favColor = input.next();
                
        double martianAge = (age*0.530120481927711);
        int newAge = (age+1);        
        
        System.out.printf("Hi %-15s %20s! I am so glad you used my application "
                + "today. I see that your birthday is %30s. You will be turning "
                + "%-8d. That would make you %-12.2f on Mars! Looking Good! I "
                + "will make sure your birthday cake is %17s! I hope you have a "
                + "wonderful day Mr./Mrs./Ms. %20s!", firstName, lastName, combineBirth,
                newAge, martianAge, favColor, lastName);
        
        
        
       
    }
    
}
