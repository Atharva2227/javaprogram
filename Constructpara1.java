public class Constructpara1{
 int modelYear;  
 String fname;


public Constructpara1(int year, String name){
 modelYear= year;
 fname=name;
}

public static void main(String[] args){
Constructpara1 Mycar = new Constructpara1(2002, "Audi");
System.out.println(Mycar.modelYear + " " + Mycar.fname);
}
}