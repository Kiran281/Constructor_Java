class Student{    
    int id;    
    String name;    
    
    Student(){
	System.out.println("you are depafult");
	}    
}  
  
public class DefaultConstructor{  
    public static void main(String args[]){    
        Student s1=new Student();    
        Student s2=new Student();    
        //displaying values of the object    
        //s1.display();    
       // s2.display();    
    }    
} 