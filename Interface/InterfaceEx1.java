/* An interface in Java is a blueprint of a class. It has static constants and abstract methods.
The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods 
in the Java interface,not a method body. It is used to achieve abstraction and multiple inheritance in Java. */

interface Main{
void print();
}
class Drawing implements Main{

public void print(){
System.out.println("what are u drawing");
}

}
class InterfaceEx1 {
public static void main(String[] args){
Main m = new Drawing();
m.print();
}
}
