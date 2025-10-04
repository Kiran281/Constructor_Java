class Person{
private String name;
private int age;

public String getname(){
return name;
}
public void setname(String name){
this.name =  name;
}

public String getage(){
return age;
}
public void setage(int age){
this.age = age;
}

}

public class EncapsulationDemo2{
public static void main(String[] args){
Person p = new Person();
p.setage(24);
p.setname("kiran");

System.out.println( "age: " + p.getage() +  " Name:"  + p.getname());
}
}

