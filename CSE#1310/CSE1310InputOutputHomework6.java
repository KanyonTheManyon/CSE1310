
package cse1310inputoutputhomework6; //KanyonLoyd
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;


public class CSE1310InputOutputHomework6 {

 
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList <String> data = new ArrayList<String>();
       File song = new File("C:\\Users\\Kanyon\\Desktop\\Shape of You Lyrics.txt");
       Scanner in = new Scanner(song);
       String line;
       
       while(in.hasNextLine()){
           data.add(in.nextLine());
       }
       
       for(int i = 0; i<data.size(); i++){
           line = data.get(i);
           line = line.toUpperCase();
           data.set(i, line);
       }
       
       
       PrintWriter out = new PrintWriter("C:\\Users\\Kanyon\\Desktop\\Shape of You Lyrics.txt");
       for(String entry : data){
           out.println(entry);
       }
       
       in.close();
       out.close();
       
    }      
      
           
      
    }
    

