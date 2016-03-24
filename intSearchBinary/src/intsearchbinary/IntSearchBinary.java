
package intsearchbinary;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Zach Murphy
 */
public class IntSearchBinary {

  
    public static void main(String[] args) {
        //scanner for input
        Scanner keyboard = new Scanner (System.in);
        //array of strings 2 different ones
        String [] searchData = {"Java", "C++", "JavaScript", "Swift", "HTML", "CSS", "Ruby", "Phython"};
        String [] searchMore = {"Swing", "SOLID", "DRY", "Framework", "Library", "Object", "Boom"};
        //must be sorted to be searched, since using binary search algorithm 
        Arrays.sort(searchData);
        Arrays.sort(searchMore);
        
        //prints out array
        System.out.println("Programming Languages: ");
        System.out.println(Arrays.asList(searchData));
        System.out.println("Programming Terms: ")
        System.out.println(Arrays.asList(searchMore));
        //loop as for user search and then searches array until it is found or nothing is found and outputs result
        for(int x = 1; x <=3; x ++){
            System.out.println("Enter a programming term or language to search for to search for: (Case Sensitive) ");
            String str = keyboard.nextLine();
            System.out.println("You entered " + str);
            
            int position = search(searchData, str);
            int positionMore = search(searchMore,str);
            //will test for both arrays first, if not then it will give else out on second instance of for loop
            if(position != -1 || positionMore != -1){
                //testing out individual array searches as you go
            if(position != -1){
                System.out.println(str + " is found at position " + position + " in the programming langauge array.");
            }if(positionMore != -1){
                System.out.println(str + " is found at position " + positionMore + " in the popular programming terms array.");
                //when all else fails 
            }}else {
                System.out.println(str + " is not in the array, sorry :( but maybe you can create this langauge");
            }}
    }
    // this will use two variales that will work with
    //part of array being searched, lower starts at beginning
    //upper is at end of array
    public static int search(Comparable[] array, Comparable value){
        int lower = 0;
        int upper  = array.length-1;
        
        
        
        while(lower<=upper){
        
            int middle = (lower + upper)/2;
            //if equal to then element has been found
            if (value.compareTo(array[middle])==0)
               return middle;
            //if less than 0 element has been found
            if(value.compareTo(array[middle])<0)
                upper = middle -1;
           //this elemenates part of array
            else 
                lower = middle +1;
        }//if nothing is found lower will be greater than upper and loop will end
        return -1;
    }
}
