// Question 2. All the banks operating in India are controlled by RBI. RBI has set a well
// defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum
// withdrawal limit etc) which all banks must follow. For example, suppose RBI has set
// minimum interest rate applicable to a saving bank account to be 4% annually; however,
// banks are free to use 4% interest rate or to set any rates above it.

// Write a program to implement bank functionality in the above scenario. Note: Create few
// classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI,
// PNB etc). Assume and implement required member variables and functions in each class.

//Sukhmanpreet Kaur- 19105126
class RBI{
    int minimumInterestRate;
    int minimumBalanceAllowed;
    int maximumWithdrawalLimit;
  public RBI(){
    this.setMaximumWithdrawalLimit();
    this.setMinimunBalanceAllowed();
    this.setMinimunInterestRate();
    this.print();
  }
  private void setMinimunInterestRate(){
      this.minimumInterestRate = 4;
  }
  private void setMinimunBalanceAllowed(){
    this.minimumBalanceAllowed = 0;
  }
  private void setMaximumWithdrawalLimit(){
    this.maximumWithdrawalLimit = 40000;
  }
  public void print(){
    System.out.println("RBI: " + minimumInterestRate + " " + minimumBalanceAllowed + " " + maximumWithdrawalLimit);
  }
  public int getMinimunInterestRate(){
  return minimumInterestRate;
  }
  public int getMinimunBalanceAllowed(){
  return minimumBalanceAllowed;
  }
  public int getmaximumWithdrawalLimit(){
  return maximumWithdrawalLimit;
 }
}
class SBI extends RBI{
    int minimumInterestRate;
    int minimumBalanceAllowed;
    int maximumWithdrawalLimit;

    int rbi_minimumInterestRate = super.getMinimunInterestRate();
    int rbi_minimumBalanceAllowed = super.getMinimunBalanceAllowed();
    int rbi_maximumWithdrawalLimit = super.getmaximumWithdrawalLimit();

    public SBI(){
    this.setMaximumWithdrawalLimit();
    this.setMinimunBalanceAllowed();
    this.setMinimunInterestRate();
    this.print();
    }

  private void setMinimunInterestRate(){
      this.minimumInterestRate = 5;
  }
  private void setMinimunBalanceAllowed(){
    this.minimumBalanceAllowed = 10000;
  }
  private void setMaximumWithdrawalLimit(){
    this.maximumWithdrawalLimit = 35000;
  }
  public void print(){
    System.out.println("SBI: " + minimumInterestRate + " " + minimumBalanceAllowed + " " + maximumWithdrawalLimit);
  }
  public int getMinimunInterestRate(){
    if(minimumInterestRate < rbi_minimumInterestRate){
        this.minimumInterestRate = rbi_minimumInterestRate;
    }
    return minimumInterestRate;
  }
  public int getMinimunBalanceAllowed(){
    if(minimumBalanceAllowed < rbi_minimumBalanceAllowed){
        this.minimumBalanceAllowed = rbi_minimumBalanceAllowed;
    }
  return minimumBalanceAllowed;
  }
  public int getmaximumWithdrawalLimit(){
    if(maximumWithdrawalLimit > rbi_maximumWithdrawalLimit){
        this.maximumWithdrawalLimit = rbi_maximumWithdrawalLimit;
    }
  return maximumWithdrawalLimit;
 }

}
class ICICI extends RBI{
    int minimumInterestRate;
    int minimumBalanceAllowed;
    int maximumWithdrawalLimit;

    int rbi_minimumInterestRate = super.getMinimunInterestRate();
    int rbi_minimumBalanceAllowed = super.getMinimunBalanceAllowed();
    int rbi_maximumWithdrawalLimit = super.getmaximumWithdrawalLimit();

    public ICICI(){
        this.setMaximumWithdrawalLimit();
    this.setMinimunBalanceAllowed();
    this.setMinimunInterestRate();
    this.print();
    }

  private void setMinimunInterestRate(){
      this.minimumInterestRate = 6;
  }
  private void setMinimunBalanceAllowed(){
    this.minimumBalanceAllowed = 0;
  }
  private void setMaximumWithdrawalLimit(){
    this.maximumWithdrawalLimit = 5000;
  }
  public void print(){
    System.out.println("ICICI: " + minimumInterestRate + " " + minimumBalanceAllowed + " " + maximumWithdrawalLimit);
  }
  public int getMinimunInterestRate(){
    if(minimumInterestRate < rbi_minimumInterestRate){
        this.minimumInterestRate = rbi_minimumInterestRate;
    }
    return minimumInterestRate;
  }
  public int getMinimunBalanceAllowed(){
    if(minimumBalanceAllowed < rbi_minimumBalanceAllowed){
        this.minimumBalanceAllowed = rbi_minimumBalanceAllowed;
    }
  return minimumBalanceAllowed;
  }
  public int getmaximumWithdrawalLimit(){
    if(maximumWithdrawalLimit > rbi_maximumWithdrawalLimit){
        this.maximumWithdrawalLimit = rbi_maximumWithdrawalLimit;
    }
  return maximumWithdrawalLimit;
 }
}
class PNB extends RBI{
    int minimumInterestRate;
    int minimumBalanceAllowed;
    int maximumWithdrawalLimit;

    int rbi_minimumInterestRate = super.getMinimunInterestRate();
    int rbi_minimumBalanceAllowed = super.getMinimunBalanceAllowed();
    int rbi_maximumWithdrawalLimit = super.getmaximumWithdrawalLimit();

    public PNB(){
        this.setMaximumWithdrawalLimit();
    this.setMinimunBalanceAllowed();
    this.setMinimunInterestRate();
    this.print();
    }
  private void setMinimunInterestRate(){
      this.minimumInterestRate = 2;
  }
  private void setMinimunBalanceAllowed(){
    this.minimumBalanceAllowed = 2000;
  }
  private void setMaximumWithdrawalLimit(){
    this.maximumWithdrawalLimit = 350000;
  }
  public void print(){
    System.out.println("PNB: " + minimumInterestRate + " " + minimumBalanceAllowed + " " + maximumWithdrawalLimit);
  }
  public int getMinimunInterestRate(){
    if(minimumInterestRate < rbi_minimumInterestRate){
        this.minimumInterestRate = rbi_minimumInterestRate;
    }
    return minimumInterestRate;
  }
  public int getMinimunBalanceAllowed(){
    if(minimumBalanceAllowed < rbi_minimumBalanceAllowed){
        this.minimumBalanceAllowed = rbi_minimumBalanceAllowed;
    }
  return minimumBalanceAllowed;
  }
  public int getmaximumWithdrawalLimit(){
    if(maximumWithdrawalLimit > rbi_maximumWithdrawalLimit){
        this.maximumWithdrawalLimit = rbi_maximumWithdrawalLimit;
    }
  return maximumWithdrawalLimit;
 }
}
class Customer{
    Account obj = new Account("Prabh", 1234, 5678);
   String name = obj.getaccountHolder();
   int AccountNumber = obj.getaccountNumber() ;
   int IFSCNumber = obj.getIFSCNumber();
   public Customer(){
         System.out.println("Name of Customer is: "+ name +"Acc Number is: " + AccountNumber + "IFSCNumber is :" + IFSCNumber);
   }
}
class Account{
   String accountHolder;
   int accountNumber;
   int IFSCNumber;
   public Account(String name, int accountNumber, int IFSCNumber){
    this.accountHolder = name;
    this.accountNumber = accountNumber;
    this.IFSCNumber = IFSCNumber;
   }
   public String getaccountHolder(){
    return accountHolder;
   }
   public int getaccountNumber(){
    return accountNumber;
   }
   public int getIFSCNumber(){
    return IFSCNumber;
   }
}
public class q2 {
    public static void main(String args[]){
          Customer objCustomer =  new Customer();
          RBI objRbi = new RBI();
          objRbi.getMinimunInterestRate();
          objRbi.getMinimunBalanceAllowed();
          objRbi.getmaximumWithdrawalLimit();
          objRbi.print();

          SBI objSbi = new SBI();
          objSbi.getMinimunInterestRate();
          objSbi.getMinimunBalanceAllowed();
          objSbi.getmaximumWithdrawalLimit();
          objSbi.print();

          ICICI objIcici = new ICICI();
          objIcici.getMinimunInterestRate();
          objIcici.getMinimunBalanceAllowed();
          objIcici.getmaximumWithdrawalLimit();
          objIcici.print();

          PNB objPnb = new PNB();
          objPnb.getMinimunInterestRate();
          objPnb.getMinimunBalanceAllowed();
          objPnb.getmaximumWithdrawalLimit();
          objPnb.print();

    }
}
