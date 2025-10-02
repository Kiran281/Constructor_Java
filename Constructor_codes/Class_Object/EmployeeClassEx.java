// Class is collection of object or we can say that is a blueprint. class can contain  feilds,constructor ,methods blocks, superclass, sub class .
// object is a instance of class  and we can said that object is a real time, run time entity . it cobtain  state ,identity and behaviour

class EmployeeClassEx{
// data member or feilds
int id = 101;
float salary = 78000;
String name = "kiran";
String company = "Capgemine";


public static void main(String[] args){
	
EmployeeClassEx  e = new EmployeeClassEx();   // e - object of EmployeeClassEx class
System.out.println(e.id);
System.out.println(e.name);
System.out.println(e.salary);
System.out.println(e.company);

}}