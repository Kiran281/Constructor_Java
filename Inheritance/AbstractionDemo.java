/* Abstraction in Java is the process of hiding internal implementation details and showing only essential functionality
 to the user.It focuses on what an object does rather than how it does it. */
 
 abstract class TestLight{
 abstract void turnOn();
 abstract void turnOff();
 }
 
 class remote extends TestLight{
 @Override
 void turnOn(){
 System.out.println("Tv is turned on");
 }
 
 void turnOff(){
 System.out.println("Tv is turned off");
 }
 }
 
 public class AbstractionDemo{
 public static void main(String[] args){
 TestLight t = new remote();
 t.turnOff();
 t.turnOn();
 }
 }