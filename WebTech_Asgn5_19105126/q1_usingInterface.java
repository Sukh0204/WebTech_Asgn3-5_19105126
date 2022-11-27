// Question 1. 1. Create two classes named Mammals and MarineAnimals. Create another
// class named BlueWhale which inherits both the above classes. Now, create a function in each
// of these classes which prints "I am mammal", "I am a marine animal" and "I belong to both
// the categories: Mammals as well as Marine Animals" respectively. Now, create an object for
// each of the above class and try calling

// 1-function of Mammals by the object

// of Mammal

// 2-function of MarineAnimal by the object of MarineAnimal

// 3-function of Blue Whale by the object of BlueWhale

// 4-function of each of its parent by

// the object of BlueWhale

// Sukhmanpreet Kaur - 19105126

interface Mammals {

    default void print()
    {
        System.out.println("I am mammal");
    }
}
 
interface MarineAnimals {

    default void print()
    {
        System.out.println("I am a marine animal");
    }
}

class BlueWhale implements Mammals, MarineAnimals {
 
      @Override
    public void print()
    {
 
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    
        // Mammals.super.print();

        // MarineAnimals.super.print();
    }
   
      public void PrintOfMammals() {
        Mammals.super.print();
    }
   
      public void PrintOfMarineAnimals() {
        MarineAnimals.super.print();
    }
}

public class q1_usingInterface {
    public static void main(String args[]){
        BlueWhale obj = new BlueWhale();
        obj.print();
        obj.PrintOfMammals();
        obj.PrintOfMarineAnimals();
    }   
}
