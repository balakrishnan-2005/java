import java.util.*;
interface Bank{
    void calculateinterest();
}
class SBI implements Bank{
    double r,amt,interest;
   public  void calculateinterest()
    {
        interest=amt*r;
        System.out.println("interest ="+interest);
        
    }
} 
class Axis implements Bank{
     double r,amt,interest;
    public  void calculateinterest() {
         r=0.12;amt= 10000;
         interest=amt*r;
         System.out.println("interest ="+ interest);
     }
}
class Driver {
     public static void main (String[] args) {
        SBI sbi=new SBI();
        sbi.calculateinterest();
        Axis a = new Axis();
        a.calculateinterest();
        
    }
}