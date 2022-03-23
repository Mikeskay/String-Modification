package string.base;


public class Stringt {

    
    public static int printStringLength(String userInput){ 

        return userInput.length();
        
    }  
    public static String printStringUpper(String userInput) {

        return userInput.toUpperCase();
        
    }
    public static String printStringLower(String userInput) {

        return userInput.toLowerCase();
        
    }
    public static char printFirstChar(String userInput) {

        return userInput.charAt(0);
        
    }
    public static char printLastChar(String userInput) {

        return userInput.charAt(userInput.length() -1);
        
    }
    public static String printNoWhitespaces(String userInput) {

        return userInput.replaceAll("\\s+","");
        
    }
   
    
}
