class person{
String name;
int age;

void showinfo(){
System.out.println("Name:" + name + ",age:" + age);
}
}
class Student extends person{
int roll_no;
 void showStudentInfo() {
        System.out.println("Roll No: " + roll_no);
    }
}

public class InheritanceEx6{
public static void main(String[] args){
s.name = "Alice";
        s.age = 20;
        s.roll_no = 101;
Student s = new Student();
s.showStudentInfo();
s.showinfo();
}
}