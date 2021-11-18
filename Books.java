class Books
{
static int price;
static String title,authorname,publishinghouse;
static void mythology()
{
title="wings Of Fire";
authorname="APJ abdul kalaam";
price=300;
publishinghouse="Subhas";
display();
stories();
}
static void stories()
{
title="fairy tales";
authorname="Andrew Lang";
price=400;
publishinghouse="Penguin Books USA";
display();
}
static void display()
{
System.out.println("Title of book: " +title+ "Authorname : " +authorname+ "Price : " +price+ "PublishingHouse : " +publishinghouse);
}
public static void main(String args[])
{
mythology();
}
}