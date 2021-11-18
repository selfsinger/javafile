class Calc34
{
static int a,b,c,d,e,g,h,i;
public static void add(int a,int b)
{
int sum=a+b;
int sub=c-d;
int multiplication=e*g;
int division=h/i;
}
public static void add1(int a,int b)

{
a=a;
b=b;
int sum=a+b;
System.out.println("sum of two numbers:"+sum);
}
public static void sub(int c,int d)
{
c=c;
d=d;
int sub=c-d;
System.out.println("subtraction of two numbers:"+sub);
}
public static void mul(int e,int g)
{
e=e;
g=g;
int mul=e*g;
System.out.println("multiplication of two numbers:"+mul);
}
public static void div(int h,int i)
{
h=h;
i=i;
int div=h/i;
System.out.println("division of two numbers:"+div);
}
public static void main(String cal[])
{
System.out.println("we are learning parametersmethod");
add1(20,25);
sub(40,25);
mul(25,25);
div(40,20);
}
}
