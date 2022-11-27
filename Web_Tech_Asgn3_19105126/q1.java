import java.util.Scanner;
public class q1{
    //Write a java program to compare two strings lexicographically (without using library function).
    public static int stringCompare(String s1, String s2){
        // if lexicograohically same i.e. string1 == string2, o/p is 0
        // if string1 > string2, o/p is 1
        // if string1 < string 2, o/p is -1
        // this is for a specific char in  the string

        for(int i = 0; i < s1.length() && i < s2.length(); i++){
            if((int)s1.charAt(i) == (int)s2.charAt(i)){
                continue;
            }
            else{
                if((int)s1.charAt(i) > (int)s2.charAt(i)){
                    return 1;
                } else{
                    return -1;
                }
            }
        }
        if(s1.length() == s2.length()){
            return 0;
        }if(s1.length() > s2.length()){
            return 1;
        }if(s1.length() < s2.length()){
            return -1;
        }
        return 0;
    }
    public static void main(String[] args){
       
        Scanner sc = new Scanner(System.in);

        String string1 = sc.nextLine();

        Scanner sc2 = new Scanner(System.in);
 
        String string2 = sc2.nextLine();
        System.out.println("Your input is: " + string1 + " and " + string2);
     
        System.out.println(stringCompare(string1, string2)); 
        
  
    }
}