// multiple inheritance

// single inhitance

class Animal{
void eat(){
System.out.println("animal is eating");
}
}
class Dog extends Animal {
void bark(){
System.out.println("dog is barking");
}
}
class Cat extends Dog{
void sound(){
	System.out.println("the cat doing meeow");
}
}
class InheritanceEx4{
public static void main(String[] args){
Cat c = new Cat();
c.eat();
c.bark();
c.sound();
}
}