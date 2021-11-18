class Mobile1
{
static String ram,cam,price,name,brandname;
public static void main(String args[])
{
offer(args[0],args[1],args[2],args[3],args[4]);
display();
}
static void offer(String rm,String cm,String prc,String n,String bn)
{
ram=rm;
cam=cm;
price=prc;
name=n;
brandname=bn;
}
static void display()
{
System.out.println("RAM :" +ram+ " CAM :" +cam+ " Price :" +price+  " Name :" +name+ " Brandname :" +brandname);
}

}