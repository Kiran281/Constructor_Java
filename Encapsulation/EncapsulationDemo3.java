class product {
private  String productName;
private int productCode;
private float  productPrice;


public String getproductName(){
return productName;
}
public void setproductName(String productName){
this. productName = productName;
}

public int getproductCode(){
return productCode;
}
public void  setproductCode(int productCode){
this. productCode = productCode;
}

public float getproductPrice(){
return productPrice;
}
public void setproductPrice(float productPrice){
this. productPrice = productPrice;
}

}
public class EncapsulationDemo3{
public static void main(String[] args){
product p = new product();
p.setproductName("earbuds");
p.setproductCode(123);
p.setproductPrice(899.10f);

System.out.println("Name:" + p.getproductName() + ",Code:" + p.getproductCode() + ",Price:" + p.getproductPrice());
}
}