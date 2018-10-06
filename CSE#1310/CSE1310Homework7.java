
package cse1310homework7; //Kanyon Loyd

import java.io.FileNotFoundException;
import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class CSE1310Homework7 {
    
    public static void main(String[] args){
        
        File problems = new File("C:\\Users\\Kanyon\\Desktop\\problems.txt");
        Scanner reader = new Scanner(System.in);
        PrintWriter out = null;
        
        try{
        out = new PrintWriter("C:\\Users\\Kanyon\\Desktop\\Solutions.txt");
        reader = new Scanner(problems);
        
          while(reader.hasNextLine()){
            String one = reader.nextLine(); //absorbs entire line of file as a string
            String two[] = one.split(" "); //splits string into an array
            double sum = Double.parseDouble(two[0]); //saves the first value of array
                                        //as the starting value for the operations
            
           for(int i = 1; i<two.length-1; i++){
               String operation = two[i]; //saves the operation
               double num = Double.parseDouble(two[i+1]); //saves second value
               
                switch(operation){ //performs operation of the first value vs second value
                     case "+": sum = sum+num;
                            break;
                     case "-" : sum = sum-num;
                            break;
                     case "*" : sum = sum*num;
                            break;
                     case "/" : sum = sum/num;
                            break;
                     case "^" : sum = Math.pow(sum, num);
                            break;
                     case "%" : sum = sum%num;
                            break; 
                    }
                i++;
                }
          
          for(int i = 0; i<two.length; i++){ 
              System.out.print(two[i]+" "); //prints out to netbeans
              out.print(two[i]+" "); //prints to file
              
             }
          
          System.out.printf(" = %.3f", sum); //formatted to 3 decimal places
          out.printf(" = %.3f", sum);
          System.out.println();
             out.println();

             }
                
          }
        
        catch(FileNotFoundException first){
            System.out.println("We are having trouble accessing your file");
                    }
        
        catch(NumberFormatException second){
            System.out.println("Value is not an integer");
                    }

        finally{
          reader.close();
          out.close();
        }         
            
    } 
        
}
    

