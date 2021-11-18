class Mobile
{
static int ram,cam,price;
static String name,brandname;
static void bestone()
{
ram=6;
cam=48;
price=15000;
name="Redmi";
brandname="Redmi 9 Power";
display();
bestestone();
}
static void bestestone()
{
ram=6;
cam=12;
price=140000;
name="iPhone";
brandname="iPhone 13 Pro Max";
display();
}
static void display()
{
System.out.println("Config , RAM : " +ram+ "Camera : " +cam+ " Price : " +price+ "Name : " +name+ "Brandname : " +brandname);
}
public static void main(String args[])
{
bestone();
}
}