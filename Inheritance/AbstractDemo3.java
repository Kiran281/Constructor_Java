abstract class Animal{
abstract void MakeSound();
}
class Dog extends Animal{
String name;
Dog(String name){
this.name = name;
}
@Override
public void MakeSound(){
System.out.println(name + " is barking");
}
}
class Cat extends Animal{
String name;
Cat(String name){
this.name = name;
}
@Override
public void MakeSound(){
System.out.println(name + " is Meows");
}

}

class AbstractDemo3{
public static void main(String[] args){
Animal a = new Dog("Ronny");
a.MakeSound();
Animal a1 = new Cat("tommy");
a1.MakeSound();
}
}