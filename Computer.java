class Computer
{
static int ram,harddisk,cam,screen,graphics;
static String processor;
static void deskTop()
{
ram=8;
harddisk=1;
cam=13;
screen=32;
graphics=2;
processor="AMD";
display();
laptop();
}
static void laptop()
{
ram=6;
harddisk=2;
cam=13;
screen=16;
graphics=1;
processor="Intel i5";
display();
}
static void display()
{
System.out.println("Config , RAM :" +ram+ "gb , Harddisk :" +harddisk+ "gb , Camera :" +cam+ " Screen :" +screen+ "Px , Graphic card :" +graphics+ "gb , Processor :" +processor);
}
public static void main(String args[])
{
deskTop();
}
}