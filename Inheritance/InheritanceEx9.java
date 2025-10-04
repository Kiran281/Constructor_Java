class Staff{
String name;
double sal;
 Staff (String name, double sal){
 this.name = name;
 this.sal = sal;
 }
}
class TeachingStaff extends Staff {
String sub;
TeachingStaff(String name , double sal ,String sub){
super(name ,sal);
this.sub = sub;
}
void display(){
System.out.println("Name:" +name + ",Salary:" +sal + ",Subject:" +sub);
}
}

class NonTeachingStaff extends Staff {
String department;
NonTeachingStaff(String name , double sal ,String department){
super(name ,sal);
this.department = department;
}
void display(){
System.out.println("Name:" +name + ",Salary:" +sal + ",Department:" +department);
}
}
class InheritanceEx9{
public static void main(String[] args){
TeachingStaff t = new TeachingStaff("Kiran" ,60000,"java");
t.display();
NonTeachingStaff nt = new NonTeachingStaff("prajakta" , 89000,"Accountant");
nt .display();
}
}
