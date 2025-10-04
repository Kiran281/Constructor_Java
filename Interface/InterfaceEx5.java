interface Printable{    
void print();    
}    
interface Showable{    
void print();    
}    
    
public class InterfaceEx5 implements Printable, Showable{    
public void print()  
{  
  System.out.println("Hello");  
  }    
public static void main(String args[]){    
InterfaceEx5 obj = new InterfaceEx5();    
obj.print();    
 }    
}   
