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
class InheritanceEx3{
public static void main(String[] args){
Dog d = new Dog();
d.eat();
d.bark();
}
}