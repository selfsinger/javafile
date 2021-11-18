class FanRunner
{
public static void main(String args[])
{
Fan fan=new Fan();
fan.fanon();
fan.fanoff();
fan.details("USHA","table_fan","blue",5);
System.out.println("It Is In :" + fan.whereItIS);
}
}
