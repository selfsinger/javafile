class BusStation
{
static String source;
static String destination;
static int ticketPrice;

static void source()
{
source="Mysore";
}

static void destination()
{
destination="Manglore";
}
static void ticket()
{
ticketPrice=250;
}
static void display()
{
source();
destination();
ticket();
System.out.println(source);
System.out.println(destination);
System.out.println(ticketPrice);
}
public static void main(String bus[])
{
display();
}
}