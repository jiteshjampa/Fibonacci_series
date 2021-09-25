import java.util.Scanner;
public class Fib{
static int fib(int a,int b,int c,int n)
{
c=a+b;
if(n>1)
{
System.out.print(c+" ");
return fib(b,c,c,n-1);
}
else
{
return c;
}
}
public static void main(String args[])
{
int a=0,b=1,c=0,n;
Scanner obj=new Scanner(System.in);
System.out.println("Enter the number:");
n=obj.nextInt();
System.out.println(fib(a,b,c,n));
}
}