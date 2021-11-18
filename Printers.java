class Printers
{
public Printers()
{
System.out.println("default constructor");
}
Printers(String speed)
{
String SpeedRange=speed;
System.out.println("SpeedRange " +speed);
}
Printers(String machine,String color)
{
String Machinequa=machine;
String Colors=color;
System.out.println("Machinequa " +machine+ " Color " +color);
}
public static void main(String args[])
{
Printers p=new Printers();
Printers p1=new Printers("per minute");
Printers p2=new Printers("qualityone","black");
}
}
