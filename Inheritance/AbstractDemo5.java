abstract class Person{
abstract void eat();
abstract void exercise();
}
class Player extends Person{
@Override
public void eat(){
System.out.println("Player:Include foods full of calcium, iron, potassium, and fiber.");
}
@Override
public void exercise(){
System.out.println("Training allows the body to gradually build up strength and endurance, improve skill levels and build motivation, ambition and confidence.");
}
}

class LazyPerson extends Person {

  @Override
  public void eat() {
  
    System.out.println(" Eating while watching TV also prolongs the time period that we're eating.");
  }

 
  @Override
  public void exercise() {
    System.out.println(" Rarely exercising or being physically active.");
  }
}
  
  class AbstractDemo5{
  public static void main(String[] args){
  Person p = new Player();
  p.eat();
  p.exercise();
  
  Person l = new LazyPerson();
  l.eat();
  l.exercise();
  }
  }