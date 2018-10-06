
package numlisthomework3; //Kanyon Loyd
import java.util.Scanner;
public class NumListHomework3 {
    
    public static void main(String[] args) {
        int[] numbers = input();
        evenInd(numbers);
        evenNum(numbers);
        reverse(numbers);
        average(numbers);
        firstLast(numbers);
         
    }
    
      public static int[] input(){
        Scanner in = new Scanner(System.in);
            int arr[] = new int[10]; 
             for(int i=0; i<10; i++){
              System.out.print("Please enter a number: ");
             arr[i] = in.nextInt();
         }
       return arr;
         }
   
      
      
   public static void evenInd(int[] numbers){
     int arrEven[] = new int[5];
        for(int i=0; i<numbers.length/2; i++){ //Even index
             arrEven[i] = (numbers[2*i]);
            }
            System.out.println("Elements at an even index: "+arrEven[0]+" "
                    +arrEven[1]+ " "+arrEven[2]+" "+arrEven[3]+" "
                        +arrEven[4]+" ");
        }
   
   public static void average(int[] numbers){
     int sum=0;
         for(int i=0; i<numbers.length; i++){
            sum=sum+numbers[i];
             }
        double average = sum/(numbers.length);
             System.out.println("The average of the elements is "+average);
         }
   
   
   public static void reverse(int[] numbers){
       System.out.print("Numbers in Reverse Order: ");
            for(int i=9; i>=0; i--){
                 System.out.print(numbers[i]+" ");
            }
        System.out.println("");
         }
   
   public static void firstLast(int[] numbers){
        System.out.println("The first element is "+numbers[0]+
           ". The last element is "+numbers[9]+".");
         }
   
   public static void evenNum(int[] numbers){
       System.out.print("Even elements: ");
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]%2==0)
            System.out.print(numbers[i]+" ");
            }
             System.out.println("");
         }
    
    }
    
    
    
    

