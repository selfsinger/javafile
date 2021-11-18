class Vehicles
{
static int price,noofseats;
static String type,name,color;
static void bike()
{
name="Royal Enfield";
type="Classic";
color="Black";
price=200000;
noofseats=2;
display();
car();
}
static void car()
{
name="BMW";
type="Classic";
color="Blue";
price=4000000;
noofseats=4;
display();
}
static void display()
{
System.out.println("Name of vehicles : " +name+ "Type : " +type+ "Color : " +color+ "Price : " +price+ "Noofseats : " +noofseats);
}
public static void main(String args[])
{
bike();
}
}