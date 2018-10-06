
package homework4arrayfun; //Kanyon Loyd

import java.util.Scanner;
import java.util.Arrays;

public class Homework4ArrayFun {

  
    public static void main(String[] args) {
        int[] numbers = new int[1];
       int cs = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter all integers and then type done when finished: ");
        while(in.hasNextInt()){   //Must type a non integer type to stop loop
            if(cs<numbers.length){
             numbers[cs]=in.nextInt();
            cs++;
            }else if(cs>=numbers.length){ //Increases the size of the array to take in infinity numbers
            numbers = Arrays.copyOf(numbers, numbers.length+1);
            numbers[cs] = in.nextInt();
            cs++;
            }
        }
        
        //run methods for display
    firstLast(numbers);
    shiftR(numbers);
    evenZero(numbers);
    neighbor(numbers);
    evenRemove(numbers);
    evenFront(numbers);
    secLarge(numbers);
    sortOrder(numbers);
    adjElement(numbers);
    duplicate(numbers);
    }
    
   
     
      public static void firstLast(int [] arr){
          int cs = arr.length;
         int [] arr2 = Arrays.copyOf(arr, cs); 
         arr2[0]=arr[cs-1]; //Took elements from original array and assigned them to copy
         arr2[cs-1]=arr[0]; //instead of creating a temp variable
         System.out.print("First and last elements swapped: ");
                  for(int i = 0; i<arr2.length; i++){
         int value = arr2[i];
         System.out.print(value+" ");
      }
                  System.out.println("");
      }
      
      public static void shiftR(int[] arr){
          int cs = arr.length;
          int[] arr2 = Arrays.copyOf(arr, cs);
          System.out.print("Elements shifted one to the right: ");
          arr2[0]=arr[cs-1]; //Takes last element and assigns it to first
          System.out.print(arr2[0]+" ");
          for(int i=0; i<cs-1; i++){
            arr2[i+1]=arr[i]; //Assigns the next position to the original position in the original array
            System.out.print(arr2[i+1]+" "); //Thus, shifting it "right"
      }
          System.out.println("");
      }
      
      public static void evenZero(int [] arr){
            int cs = arr.length;
          int[] arr2 = Arrays.copyOf(arr, cs);
        int i = 1;
        while(i<cs){
            arr2[i]=0;
            i=i+2;
          }
        System.out.print("Even elements replaced with zero: ");
                for(int j = 0; j<arr2.length; j++){
         int value = arr2[j];
         System.out.print(value+" ");
      }
                  System.out.println("");
          
      }
      
      public static void neighbor(int [] arr){
          int cs = arr.length;
          int[] arr2 = Arrays.copyOf(arr, cs);
          for(int i=1; i<cs-1; i++){
              if(arr[i-1]>arr[i+1]){
                  arr2[i]=arr[i-1];
              }else{
                  arr2[i]=arr[i+1];
              }
          }
          System.out.print("Each element replaced by the largest neighbor: ");
          for(int j=0; j<cs; j++){
              int value = arr2[j];
              System.out.print(value+" ");
          }
          System.out.println("");
      }
      
      
      public static void evenRemove(int [] arr){
          int cs = arr.length;
          int [] arr2 = Arrays.copyOf(arr, cs);
          int position = 0;
          if(cs%2==1){ //odd number of elements
              position=cs/2; //finds position of middle element
              for(int i = position; i<cs-1; i++){
                  arr2[i]=arr[i+1]; //shifts all values based on the next position
                      }
          }else{
              position=(cs/2)-1; //even number of elements
              for(int i = position; i<cs-1; i++){
                  arr2[i]=arr[i+1];
              }
              cs--; //removed 1st middle element
              for(int i = position; i<cs-1; i++){
                  arr2[i]=arr[i+2]; //removed 2nd middle element
              }
          }
          cs--;
          System.out.print("Middle element(s) removed: ");
          for(int i = 0; i<cs; i++){
             System.out.print(arr2[i]+" ");
          }
          System.out.println("");
                  
      }
      
      
      public static void evenFront(int [] arr){
          int cs = arr.length;
                  int [] arr2 = Arrays.copyOf(arr, cs+1);
                  int temp = 0;
                  int temp2 = 0;
                  int front = 0;
                    int position = 0;
                    for(int i = 1; i<cs; i++){
                        if(arr2[i]%2==0){
                            position=i; //finds position of even number
                            temp = arr2[i]; //saves the value of evenn number
                            temp2 = arr2[front]; //saves the value of the first number
                            arr2[front]=temp; //assigns first value as even number
                            arr2[position]=temp2; //swaps the odd number with the position of the even number
                            front++;
                        }
                        for(int j = front; j<cs-1;j++){ //sorts the numbers from least to greatest
                            if(arr2[j]>arr2[j+1]){
                                temp = arr2[j];
                                arr2[j]=arr2[j+1];
                                arr2[j+1]=temp;
                            }
                            
                        }
                        
                    }
                  System.out.print("Even numbers to the front: ");
          for(int i = 0; i<cs; i++){
             System.out.print(arr2[i]+" ");
          }
          System.out.println("");
                           
      }
      
      
     public static void secLarge(int[] arr){
         int cs = arr.length;
         int position = 0;
         int [] arr2 = Arrays.copyOf(arr, cs);
         int temp1 = arr2[0];
       
         for(int i=0; i<cs-1; i++){  //finds largest value
             if(arr2[i]>arr2[i+1]){
                 if(temp1<arr2[i]){
                 temp1=arr2[i];
                 position=i;
                 }
             }else if(arr2[i]<arr2[i+1]){
                 if(temp1<arr2[i+1]){
                 temp1=arr2[i+1];
                 position=i+1;
                 }
             } 
         }
          arr2[position]=0;  //removes largest value
          temp1=0;           //resets from largest value
             for(int i=0; i<cs-1; i++){
             if(arr2[i]>arr2[i+1]){  //finds second largest value
                 if(temp1<arr2[i]){
                 temp1=arr2[i];
                 }
             }else if(arr2[i]<arr2[i+1]){
                 if(temp1<arr2[i+1]){
                 temp1=arr2[i+1];
                 }
             } 
         }   
         
         System.out.println("Second largest number: "+temp1);
     }
     
     
     
     
     public static void sortOrder(int[] arr){
         boolean flag = true;
         int cs=arr.length;
         int [] arr2 = Arrays.copyOf(arr, cs);
         for(int i = 0; i<cs-1; i++){
             if(arr2[i]>arr2[i+1]){
               flag=false;
         }
             
     }
         if(flag){
             System.out.println("The array is sorted in increasing order");
         }else{
             System.out.println("The array is not sorted in increasing order");
         }
     }
      
      
    public static void adjElement(int[] arr){
        boolean flag = false;
        int cs = arr.length;
        int [] arr2 = Arrays.copyOf(arr, cs);
        for(int i = 0; i<cs-3; i++){
            if(arr2[i]==arr2[i+1]){
               if(arr2[i+2]==arr2[i+3]){
                flag=true; 
                }
            }
        }
        if(flag){
             System.out.println("The array does contain two adjacent duplicate elements");
        }else{
            System.out.println("The array does not contain two adjacent duplicate elements");
        }
        
      
        
    }
    
    
    
    
    
    public static void duplicate(int [] arr){
        boolean flag = true;
        int cs = arr.length;
        int [] arr2 = Arrays.copyOf(arr, cs);
        int temp = 0;
            for(int i = 0; i<cs; i++){
                temp=arr2[i]; //assigns value to check for duplicates
                arr2[i]=(int) 1.715342342;
                for(int j = 1; j<cs; j++){
                    if(temp==arr2[j]){
                        flag=false;
                    }
                }
                arr2[i]=temp;
                temp=(int) 0.92131231; //resets value for next check for duplicates
            }
        if(flag){
            System.out.println("The array does not contain any duplicate elements");
        }else{
            System.out.println("The array does contain duplicate elements");
        }
}  
      
      
      
      
}
