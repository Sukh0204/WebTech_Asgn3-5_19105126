// Question 3. We want to calculate the total marks of each student of a class in Physics,
// Chemistry and Mathematics and the average marks of the class. The number of students in
// the class are entered by the user. Create a class named Marks with data members for roll
// number, name and marks. Create three other classes inheriting the Marks class, namely

// Physics, Chemistry and Mathematics, which are used to define marks in individual subject of
// each student. Roll number of each student will be generated automatically.

import java.util.Scanner;
import java.lang.Math;   

class Marks{
    int rollNumber;
    String name;
    double marks;
    int num_marks;

    // int totalMarks=0;
    // int numStudents= rollNumber; 
    // public void avgMarks(){
    //     System.out.println(totalMarks/ numStudents);
    // }
    
}
class Physics extends Marks{
    Physics(int rollNumber, double marks){
        this.marks = marks;
        this.rollNumber = rollNumber;
        // totalMarks+=marks;
    }
    public double getMarks(){
        return marks;
    }
}
class Chemistry extends Marks{
    Chemistry(int rollNumber, double marks){
        this.marks = marks;
        this.rollNumber = rollNumber;
        // totalMarks+=marks;
    }
    public double getMarks(){
        return marks;
    }
}
class Mathematics extends Marks{
    Mathematics(int rollNumber, double marks){
        this.marks = marks;
        this.rollNumber = rollNumber;
        // totalMarks+=marks;
    }
    public double getMarks(){
        return marks;
    }
} 

public class q3 {
    public static void main(String args[]){
  
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int numStudents = myObj.nextInt();
        Marks objMarks = new Marks();

        int max = 100;
        int min = 0;
        int range = max - min + 1;
        double marksPhy = 0, marksChem = 0, marksMath = 0;

        for(int i=1; i<=numStudents; i++){           
              double ScorePhy = (Math.random()*range) + min;
              Physics objPhysics = new Physics(i, ScorePhy);
              marksPhy += ScorePhy;
              double ScoreChem = (Math.random()*range) + min;
              Chemistry objChemistry = new Chemistry(i, ScoreChem);
              marksChem += ScoreChem;
              double ScoreMath = (Math.random()*range) + min;
              Mathematics objMathematics = new Mathematics(i, ScoreMath);
              marksMath += ScoreMath;
              double totalMarks = ScoreChem + ScoreMath + ScorePhy;
              System.out.println("Overall Score of roll number " + i + " is: " + totalMarks);
        }

        double avgPhy = marksPhy/numStudents;
        double avgChem = marksChem/numStudents;
        double avgMath = marksMath/numStudents;

        System.out.println("Average marks in Physics are : "+ avgPhy + " Chemistry are: " + avgChem + " Mathematics are : " + avgMath);
    }


}
