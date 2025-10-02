class Student{    
    int id;    
    String name;    
    int age;    
	
   Student(int id,String name, int age){    //(int i,string n,int a)
    this.id = id;       //this .id =i;
    this.name = name;   // this.name=n;
    this.age= age;	   //this.age =a
    }    
   
        
    
    void display(){System.out.println(id+" "+name+" "+age);}    
}  

public class ConstructorOverloadThis{  
    public static void main(String args[]){    
    Student s1 = new Student(111,"Karan" ,23);    
    Student s2 = new Student(222,"Aryan",25);    
    s1.display();    
    s2.display();    
   }    
}    