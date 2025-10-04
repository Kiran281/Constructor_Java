/*   Encapsulation in Java is a process of wrapping code and data together into a single unit.
 A capsule is the perfect example of encapsulation because a capsule is a mixture of 
several medicines.  */

class BankSystem{
private long accNo;
private String name, email;
private float amount;

public long getaccNo(){
return accNo;
}
public void setaccNo(long accNo){
this.accNo = accNo;
}
 public String getname(){
 return name;
 }
 public void setname(String name){
 this.name = name;
 }
 
 public float getamount(){
 return amount;
 }
 public void  setamount(float amount){
 this.amount = amount;
 }
 public String getemail(){
 return email;
 }
 public void  setemail(String email){
 this.email = email;
 }

}

public class EncapsulationDemo1{
public static void main (String[] args){
BankSystem b = new BankSystem();
b.setaccNo(4748490789L);
b.setamount(56708.89f);
b.setemail("kiran@2810");
b.setname("kiran");

System.out.println(b.getaccNo() + " " +b.getamount() + " " +b.getemail() + "  " +b.getname());
}
}
