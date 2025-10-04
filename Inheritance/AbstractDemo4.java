abstract class Bank{
String bankName;  

   Bank(String bankName) {
    this.bankName = bankName;
    }
abstract int getRateOfInterest(); 
abstract void Welcome(){
System.out.println("Welcome in our" +bankName  + "bank" );
}
}

class SBI extends Bank{
SBI(){
super("SBI");
// bankName = "SBI";
}
@Override
int getRateOfInterest(){
return 7;
}
}
class BOI extends Bank {
    BOI() {
        super("BOI"); 
		// bankName = "BOI";
    }

    @Override
    int getRateOfInterest() {
        return 8;
    }
}

public class AbstractDemo4{
public static void main(String[] args){
 Bank b = new SBI(); 
 b.Welcome();
   System.out.println("Rate of Interest is: " + b.getRateOfInterest() + " %");
   
   System.out.println("-------------------");

        Bank b1 = new BOI();
        b1.welcomeMessage();
        System.out.println("Rate of Interest is: " + b1.getRateOfInterest() + " %")
 
}
}