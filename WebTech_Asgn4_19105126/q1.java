import java.util.Vector;

// Write a java code to create user define size vector and store some values till user
// wants or vector is not full and display vector elements.
import java.util.Scanner;
//Sukhmanpreet Kaur- 19105126

class q1{
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = myObj.nextInt();
        Vector<Integer> v = new Vector<Integer>(size);
        int elementsStored = 0;
        for(int i=0; i<size; i++){
          System.out.println("Do you want to enter value? 0/1 0 for no, and 1 for yes");
          int choice = myObj.nextInt();
          if(choice==1){
            elementsStored++;
            System.out.println("Enter "+ i +"th element: ");
            int element = myObj.nextInt();
            v.add(i, element);
          }
          if(choice == 0){
             break;
          }
        }
        for(int i=0; i<elementsStored; i++){
            System.out.println(i+"th element is: "+v.get(i));
        }
    }
}