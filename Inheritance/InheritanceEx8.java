class Vehicle{
String brand;
int speed;
String modelType;

Vehicle(String brand ,int speed,String modelType){
this.brand =brand;
this.speed =speed;
this.modelType = modelType;
}
}
class car extends Vehicle{
car(String brand ,int speed,String modelType){
super(brand ,speed ,modelType);
}
void display(){
System.out.println("Brand :" +brand + ",speed:" +speed + ",modelType:" +modelType);
}
}

class bike extends Vehicle{
bike(String brand ,int speed,String modelType){
super(brand ,speed ,modelType);
}
void display(){
System.out.println("Brand :" +brand + ",speed:" +speed + ",modelType:" +modelType);
}
}

class InheritanceEx8{
public static void main(String[] args){
bike b = new bike("Honda" , 130 , "Civic");
b.display();
car c = new car("Mahindra" ,120 ,"R15");
c.display();

}
}
