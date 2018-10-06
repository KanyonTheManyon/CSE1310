
package calculator2; //Kanyon Loyd
import java.util.Scanner;
public class Calculator2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ans;
        do{
int operation = Operation();
switch(operation){
    case 1:
        adder();
        break;
    case 2:
        subtracter();
        break;
    case 3:
        multiplier();
        break;
    case 4:
        divider();
        break;
    case 5: 
        power();
        break;
    case 6:
        root();
        break;
    case 7:
        modulus();
        break;
    default:
        System.out.println("Error! Please select a number of 1-7 only");
        
       }
    System.out.println("Would you like another calculation? Y/N?");
    ans = in.next();
 
}while(ans.equalsIgnoreCase("Y"));

System.out.println("Thank you! Calc you later!");
        }
    
    
       public static int Operation(){
Scanner in = new Scanner(System.in);
System.out.println("1. Add");
System.out.println("2. Subtract");
System.out.println("3. Multiply");
System.out.println("4. Divide");
System.out.println("5. Power");
System.out.println("6. Root");
System.out.println("7. Modulus");
System.out.println("Please enter the number for the operation you'd like to perform:");
int operation = in.nextInt();
return operation;
    }
       
public static void root(){
    int i;
    double num, sum=1;
Scanner in = new Scanner(System.in);
System.out.println("Please enter the number to take the root of: ");
double rootValue = in.nextDouble();
System.out.println("How many roots would you like to take of "+rootValue+"?");
int n = in.nextInt();
System.out.println("Please enter "+n+" roots to take of "+rootValue);
for(i=0; i<n; i++){
num=in.nextDouble();
sum=sum*num;
}
double result = Math.pow(rootValue, (1./sum));
System.out.println("The answer is equal to "+result);

}

public static void power(){
    int i;
    double sum=1;
    double num;
Scanner in = new Scanner(System.in);
System.out.println("What number would you like to raise to a power?");
double num1 = in.nextDouble();
System.out.println("How many powers would you like to raise "+num1+" to?");
int n = in.nextInt();
System.out.println("Please enter "+n+" numbers");
for(i=0; i<n; i++){
num=in.nextDouble();
sum=sum*num;
}
double result = Math.pow(num1, sum);
System.out.println("The answer is equal to: "+result);
}
       

public static void adder(){
int i;
double sum=0;
double num;
Scanner in = new Scanner(System.in);
System.out.println("How many different numbers would you like to add?");
int n = in.nextInt();
System.out.println("Please enter "+n+" numbers");
for(i=0; i<n; i++){
num=in.nextDouble();
sum=sum+num;
}
System.out.println("The sum of all "+n+" numbers is: "+sum);
}
    
public static void subtracter(){
int i; 
double num, diff=0;
Scanner in = new Scanner(System.in);
System.out.println("Please enter a number to start with");
double num1 = in.nextDouble();
System.out.println("How many different numbers would you like to subtract from "+num1+"?");
int n = in.nextInt();
System.out.println("Please enter "+n+" numbers");
for(i=0; i<n; i++){
    num=in.nextDouble();
    diff+=num; 
}
num1-=diff;
System.out.println("The difference is: "+num1);
}

public static void multiplier(){
int i;
double num, multi=1;
Scanner in = new Scanner(System.in);
System.out.println("How many different numbers would you like to multiply?");
int n = in.nextInt();
System.out.println("Please enter "+n+" numbers");
for(i=0; i<n; i++){
num=in.nextDouble();
multi=multi*num;
}
System.out.println("The product of all "+n+" numbers is: "+multi);
}

public static void divider(){
int i;
double num, denom=1;
Scanner in = new Scanner(System.in);
System.out.println("Please enter a number to start with");
double num1 = in.nextDouble();
System.out.println("How many different numbers would you like to divide "+num1+" by?");
int n = in.nextInt();
System.out.println("Please enter "+n+" numbers");
for(i=0; i<n; i++){
num=in.nextInt();
denom=denom*num;
}
num1=num1/denom;
System.out.println("The quotient is: "+num1);
}

public static void modulus(){
int i;
double num, mod1, denom=1;
Scanner in = new Scanner(System.in);
System.out.println("Please enter a number to start with");
double num1 = in.nextDouble();
System.out.println("How many different numbers would you like to divide "+num1+" by?");
int n = in.nextInt();
System.out.println("Please enter "+n+" numbers");
for(i=0; i<n-1; i++){
num=in.nextDouble();
denom*=num;
}
mod1=in.nextDouble();
num1=(num1/denom)%mod1;
System.out.println("The remainder is: "+num1);
}

 }
 

