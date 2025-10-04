interface Drawable{
void draw();
}
class Ractangle implements Drawable{
public void draw(){
System.out.println("drawing ractangle ");
}
}
class circle implements Drawable{
	
public void draw(){
System.out.println("drawing circle ");
}
}
public class InterfaceEx2{
public static void main (String[] args){
Drawable d = new circle();
 d.draw();   
 Drawable d1 = new Ractangle();
 d1.draw(); 
}
}

