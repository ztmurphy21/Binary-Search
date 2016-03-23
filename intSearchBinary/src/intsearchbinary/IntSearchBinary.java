/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intsearchbinary;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author zacha
 */
public class IntSearchBinary {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //scanner for input
        Scanner keyboard = new Scanner (System.in);
        //array of strings
        String [] searchData = {"Jack", "Bob", "Esther", "Zoe", "Al", "Katy"};
        //must be sorted to be searched
        
        Arrays.sort(searchData);
        //prints out array
        System.out.println(Arrays.asList(searchData));
        //loop as for user search and then searches array until it is found or nothing is found and outputs result
        for(int x = 1; x <=3; x ++){
            System.out.println("Enter a string to search for: ");
            String str = keyboard.nextLine();
            System.out.println("You entered " + str);
            
            int position = search(searchData, str);
            if(position != -1)
                System.out.println(str + " is found at position " + position);
            else 
                System.out.println(str + " is not in the array, sorry :(");
        }
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
