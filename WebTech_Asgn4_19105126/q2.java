

// Write a program that would print the information (name, year of joining, salary,
// address) of three employees by creating a class named 'Employee'. The output should
// be as follows:
// Name        Year of joining        Address
// Robert            1994                64C- WallsStreat
// Sam                2000                68D- WallsStreat
// John                1999                26B- WallsStreat


class Employee{
    String Name;
    int YearOfJoining;
    String Address;
    Employee(String Name, int YearOfJoining, String Address){
        this.Name = Name;
        this.YearOfJoining = YearOfJoining;
        this.Address = Address;
        print();
    }
    public void print(){
        System.out.println(Name + "  " + YearOfJoining + "  " + Address);
    }
}
public class q2 {
   
    public static void main(String args[]){
       System.out.println("Name   Year Of Joining   Address");
    Employee obj1 = new Employee("Robert", 1994, "64C- WallsStreat");
    Employee obj2 = new Employee("Sam", 2000, "68D- WallsStreat");
    Employee obj3 = new Employee("John", 1999, "26B- WallsStreat");
    }
}
