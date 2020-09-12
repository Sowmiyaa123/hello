import java.until.Scanner;
public class Mins{
int year,day;
long m;
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("input the number of minutes:");
m=s.nextInt();
year=m/525600;
day=m/1440;
System.out.println(m+"minutes is approximately "+year+ "years and "+day+ "days");
}
}



