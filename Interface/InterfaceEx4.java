interface printable{
void print();
}
interface showable{
void show();
}

class Computer implements printable,showable{
  public void print(){
  System.out.println("printing data...");
  }    
  public void show(){
  System.out.println("showing data...");
  }    
}

public class InterfaceEx4{
public static void main(String[] args){
Computer c = new Computer();
c.print();
c.show();
}
}