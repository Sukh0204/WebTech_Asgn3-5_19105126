// Create class Number with only one private instance variable as a double primitive
// type. To include the following methods isZero( ), isPositive(), isNegative( ), isOdd( ),
// isEven( ), isPrime(), isAmstrong() the above methods return boolean primitive type.
// getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse() the above methods return
// double primitive type. void listFactor(), void dispBinary().
import java.lang.Math. *;
import java.lang.Number.*;
import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

//Sukhmanpreet-Kaur 19105126
class Number{
    private double db1;

    Number(Double num){
        this.db1 = num;
    }

    public Boolean isZero(){
       if(db1==0){
        return true; 
       }else{
        return false;
       }
    }

    public Boolean isPositive(){
        if(db1>=0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean isNegative(){
        if(db1<0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean isOdd(){
        if((int)db1%2 != 0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean isEven(){
        if((int)db1%2 == 0){
            return true;
        }else{
            return false;
        }
    }

    public Boolean isPrime(){
        boolean flag = false;
        for (int i = 2; i <= db1 / 2; ++i) 
        {
        if (db1 % i == 0) {
        flag = true;
        break;
        }
        }
        if (!flag){
        return true;}
        else{
        return false;
        }
    
    }

    public Boolean isArmstrong(){
        if (db1 == 0.0)
        {return true;}
        else 
        {return false;}
    }

    // getFactorial(), getSqrt(), getSqr(), sumDigits(), getReverse()
    public double getFactorial(){
     double fact = 1;
     for(int i=1; i<=db1; i++){
        fact*=i;
        // System.out.println(fact);
     }
     return fact;
    }

    public double getSqrt(){  
        double temp = db1;      
        return Math.sqrt(temp);
    }

    public double getSqr(){
        double temp = db1;
        return temp*temp;
    }

    public double sumDigits(){
        int sum=0;
        int temp = (int)db1;
        while(db1>1){
           int a = temp % 10;
           sum += a;
           temp = temp/10;
        }
        return sum;
    }

    public double getReverse(){
        double reverse =0;
        double temp;
        double newTemp = db1;
        while (newTemp>9){
         temp = newTemp%10;
         reverse = reverse * 10 + temp;
         newTemp = newTemp/10; 
        }
        reverse = reverse * 10 +newTemp;
        return reverse;
    }

    //void listFactor(), void dispBinary()

    public void listFactor(){
        // double sqrt = Math.sqrt(db1);
        double temp = db1;
        for(int i=1; i<=(int)temp; i++){
            if((int)temp%i == 0){
                System.out.print(i + " ");
            }
        }
    }

    public void dispBinary(){
        double temp = db1;
        System.out.println(Long.toBinaryString(Double.doubleToRawLongBits(temp)));
    }

}

public class q3 {
    public static void main(String args[]){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number: ");
        Double num = myObj.nextDouble();
        Number obj = new Number(num);
        obj.dispBinary();
        obj.listFactor();
        System.out.println(obj.getReverse());
        System.out.println(obj.sumDigits());
        System.out.println(obj.getSqrt());
        System.out.println(obj.getSqr());
        System.out.println(obj.getFactorial());
        System.out.println(obj.isArmstrong());
        System.out.println(obj.isPrime());
        System.out.println(obj.isEven());
        System.out.println(obj.isOdd());
        System.out.println(obj.isNegative());
        System.out.println(obj.isPositive());
        System.out.println(obj.isZero());
    }
}
