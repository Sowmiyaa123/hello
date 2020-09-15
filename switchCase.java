package SwitchCase;
public class Switchcase{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int a,b,c;
a=sc.nextInt();
b=sc.nextInt();
char ch;
do{
System.out.println("1.addition\t 2.subtraction\t");
ch=sc.next().charAt(0);
switch(ch){
case 'A':
case 'a':
System.out.println(a+b);
break;
case 'B':
case 'b':
System.out.println(a-b);
break;
default:
system.out.println("invalid");
}
}while(ch!='c');
}
}
