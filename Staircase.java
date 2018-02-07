import java.io.*;
import java.util.*;

public class Staircase {

    public static void main(String[] args) {
    	System.out.println("Welcome.\n Enter how many stairs the staircase has: ");
        Scanner scan = new Scanner(System.in);
        int numberOfLines = scan.nextInt();

        for(int i=0; i<numberOfLines; i++){
            int lineNumber = i;
            int numberOfSpaces = (numberOfLines-lineNumber) - 1; 
            int numberOfTree = (lineNumber)+1;
            
            while(numberOfSpaces>0){
                printSpace();
                numberOfSpaces--;
            }
            while(numberOfTree>0){
                printTree();
                numberOfTree--;
            }
            printEndOfLine();
            
            
        }
        
        
        
    }
    
    
    public static void printSpace(){
                      System.out.print(" ");
    }
    public static void printTree(){
         System.out.print( "#");
    }
    public static void printEndOfLine(){
        System.out.println();
    }
    
}