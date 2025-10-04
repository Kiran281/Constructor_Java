class  Encapsulation1{
private String name;
private int id;
private double Salary;
 //getter
public int getid(){
return id;
}
public String getname(){
return name;
}
public double getSalary(){
return Salary;
}

// setter

public void setid(int id){
this .id =id;
}
public void setSalary(double Salary){
if( Salary > 0){
this .Salary = Salary;
}else{
System.out.println("salary must be possitive");
}
}
public void setname(String name){
this.name = name;
}

public static void main(String[] args){
Encapsulation1 e = new Encapsulation1();
e.setid(1);
e.setname("kiran");
e.setSalary(50000);
System.out.println(e.getid() +  "id" + " "  + e.getname() + "'s salary: " + e.getSalary());
e.setSalary = -100;
}



}