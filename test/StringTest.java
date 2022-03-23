package string.test;

import string.base.Stringt;
import java.util.Scanner;


public class StringTest {

    

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Enter String: ");
        String userInput = reader.nextLine();

       
        System.out.println(userInput);
        System.out.println(Stringt.printStringLength(userInput));
        System.out.println(Stringt.printStringUpper(userInput));
        System.out.println(Stringt.printStringLower(userInput));
        System.out.println(Stringt.printFirstChar(userInput));
        System.out.println(Stringt.printLastChar(userInput));
        System.out.println(Stringt.printNoWhitespaces(userInput));
        
       

    }


}
