class Meghs
{
static int values;
static float values1;
static byte values3;

static void values()
{
values=24;
}

static void values1()
{
values1=240.348f;
}

static void values3()
{
values3=44;
}
static void display()
{
System.out.println(values);
System.out.println(values1);
System.out.println(values3);
}
public static void main(String args[])
{
values();
values1();
values3();
display();
}
}

