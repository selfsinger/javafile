class Vehicles1
{
static String price,noofseats,type,name,color;
public static void main(String args[])
{
speed(args[0],args[1],args[2],args[3],args[4]);
display();
}
static void speed(String prc,String ns,String t,String n,String c)
{
price=prc;
noofseats=ns;
type=t;
name=n;
color=c;
}
static void display()
{
System.out.println("Price :" +price+ " Noofseats :" +noofseats+ " Type :" +type+  " Color :" +color);
}

}