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

class Mammals{
    public void print(){
        System.out.println("I am mammal");
    }
}
class MarineAnimals extends Mammals{
    public void print(){
        System.out.println("I am a marine animal");
    }
    public void ParentPrint(){
        super.print();
    }
}
class BlueWhale extends MarineAnimals{
    public void print(){
        System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }
    public void ParentPrint(){
        super.print();
    }
    public void GrandParentPrint(){
        super.ParentPrint();
    }
}
class q1_usingClasses{
    public static void main(String args[]){
           Mammals objMammals = new Mammals();
           MarineAnimals objMarineAnimals = new MarineAnimals();
           BlueWhale objBlueWhale = new BlueWhale();
           objMammals.print();
           objMarineAnimals.print();
           objBlueWhale.print();
           objBlueWhale.ParentPrint();
           objBlueWhale.GrandParentPrint();
    }
}