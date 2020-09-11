import java.io.*;
import java.util.*;

public class StringReverseBasic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*  
            Getting Input from the User
        */
        String orginalString =sc.next();
        /* 
           Using StringBuilder to store the character in the reversal order 
           Because String generates new String whenever a new Character is appended to it,
           and the old String goes into garbage collector.
           StringBuilder does not do that, it adds character to the existing string present.
        */        
        StringBuilder reversedString = new StringBuilder("");
        /*
            Iterating the String in reverse order and appending it to StringBuilder reversedString
        */
        for(int i=orginalString.length()-1;i>=0;i--){
            reversedString.append(orginalString.charAt(i));
        }  
        System.out.println(reversedString);
    }
}
