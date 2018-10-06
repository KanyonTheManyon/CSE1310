
package calculator; //Kanyon Loyd
import java.util.Scanner; //Homework 01

public class Calculator {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

String ans;
double fv = 0;
double sv = 0;
double sq = 0;

do{
System.out.println("1. Add");
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Divide");
System.out.println("5. Power");
System.out.println("6. Root");
System.out.println("7. Modulus");

System.out.println("Please enter the number of the menu option that corresponds "
        + "to the operation you'd like to perform");
double Operation = input.nextInt();

if (Operation==6){
System.out.println("What number would you like to take the square root of?");
    sq = input.nextDouble();
}else{
        
System.out.println("Please enter the first value");
fv = input.nextDouble();
System.out.println("Please enter the second value");
sv = input.nextDouble();
        }
    

double add = fv+sv;
double sub = fv-sv;
double mul = fv*sv;
double div = fv/sv;
double pow = (int) Math.pow(fv, sv);
double root = (int) Math.sqrt(sq);
double mod = fv%sv;


        switch ((int) Operation) {
            case 1:
                System.out.println(add);
                break;
            case 2:
                System.out.println(sub);
                break;
            case 3:
                System.out.println(mul);
                break;
            case 4:
                System.out.println(div);
                break;
            case 5:
                System.out.println(pow);
                break;
            case 6:
                System.out.println(root);
                break;
            case 7:
                System.out.println(mod);
                break;
            default:
                System.out.println("Please select an operation of 1-7 only");
                break;
        }
        System.out.println("Would you like another calculation? Y/N?");
    ans = input.next();
 
}while(ans.equalsIgnoreCase("Y"));

System.out.println("Thank you! Calc you later!");

}
}
        
      


    
    

