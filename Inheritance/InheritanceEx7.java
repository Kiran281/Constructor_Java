class Employee{
String name;
double basicSal;

Employee(String name ,double basicSal){
this.name = name;
this.basicSal = basicSal;
}
}

class RegularEmployee extends Employee{
RegularEmployee(String name, double basicSal) {
   super(name, basicSal); 
    }

double calculateNetSal(){
 double hra = 0.10 * basicSal; 
  return basicSal + hra;
}
void display() {
    System.out.println("Regular Employee: " + name + ", Net Salary = " + calculateNetSal());
    }
}

class ContractEmployee extends Employee{
ContractEmployee(String name, double basicSal) {
    super(name, basicSal); 
    }

double calculateNetSal(){
 double allowance = 0.05 * basicSal; 
  return basicSal + allowance;
}

void display() {
        System.out.println("Regular Employee: " + name + ", Net Salary = " + calculateNetSal());
    }
}
class InheritanceEx7{
public static void main(String[] args){
ContractEmployee c = new ContractEmployee("kiran" , 89776);
c.calculateNetSal();
c.display();

RegularEmployee c1 = new RegularEmployee("karan" , 87665);
c1.calculateNetSal();
c1.display();

}
}