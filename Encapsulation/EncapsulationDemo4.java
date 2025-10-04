class MovieTicket {
private  String title;
private int price;
private int duration;
private String Director;



public String gettitle(){
return title;
}
public void settitle(String title){
this. title = title;
}

public int getprice(){
return price;
}
public void  setprice(int price){
this. price = price;
}

public int getduration(){
return duration;
}
public void setduration(int duration){
this. duration = duration;
}
public String getDirector(){
return Director;
}
public void setDirector(String Director){
this. Director = Director;
}

public String getMovieDetails() {
        return "Title: " + title + ", Director: " + Director + ", Duration: " + duration + " minutes" + ", Price: " + price;
    }

}
public class EncapsulationDemo4{
public static void main(String[] args){
MovieTicket p = new MovieTicket();
p.settitle("Arrival");
p.setDirector("Christopher Nolan");
p.setprice(345);
p.setduration(126);

System.out.println(p.getMovieDetails());
}
}