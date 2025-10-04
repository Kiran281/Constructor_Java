abstract class Shape{
abstract double area();
abstract void display();
}

class ractangle extends Shape{
double length;
double width;
double result;
ractangle (double length , double width){
this.length = length;
this.width = width;
}
@Override
double area(){
result = length* width;
return result;
}

@Override
public void display(){
System.out.println("Ractangle:" +result);
}
}
class circle extends Shape{
double result;	
int radius;
circle(int radius){
this.radius =  radius;
}
@Override
double area(){
result = Math.PI * radius * radius;
return result;
}

@Override
public void display(){
System.out.println("Ractangle:" +result);
}
}

class AbstractDEmo2{
public static void main(String[] args){
Shape s = new ractangle(10,5);
s.area();
s.display();

Shape s2 = new circle(7);
s2.area();
s2.display();
}
}