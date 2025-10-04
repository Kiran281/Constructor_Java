interface hello{
void msg();
}
interface byy extends hello{
void msg1();
}
class InterfaceEx6 implements byy{
public void  msg(){
System.out.println("hello guys");
}
public void  msg1(){
System.out.println("byy guys");
}
public static void main(String[] args){
InterfaceEx6 i = new InterfaceEx6();
i.msg();
i.msg1();
}
}