import java.util.*;
public class q3 {
    // Write a program to sort strings (using library function).
    public static void main(String[] args){
        String s = "sukhmanpreet kaur"; //string input
        char []charArray = s.toCharArray();//converted to character array to apply inbuilt func
        Arrays.sort(charArray);//sorted the character array
        System.out.println(String.valueOf(charArray));//print string output
    }
}
