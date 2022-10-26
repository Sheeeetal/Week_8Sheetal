package methoddoverriding24;
//Java program to demonstrate the real scenario of java Method Overriding

 class Bank {
  public int getRateOfInterest() {return 0;}

 }
 //Creating child classes.
class SBI extends Bank{
  public int getRateOfInterest(){return 8;}
 }
class ICICI extends Bank{
  public int getRateOfInterest(){return 7;}
}
class AXIS extends Bank{
 public int getRateOfInterest(){return 9;}
}
//Test class to create objects and call the methods
class Test2{
  public static void main (String args[]){
   SBI s=new SBI();
   ICICI i=new ICICI();
   AXIS a=new AXIS();
   System.out.println("SBI rate of interest:"+s.getRateOfInterest());
   System.out.println("ICICI rate of interest:"+i.getRateOfInterest());
   System.out.println("AXIS rate of interest:"+a.getRateOfInterest());
  }
}