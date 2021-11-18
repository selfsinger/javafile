class WaterFilter
{


public WaterFilter()
{
System.out.println("default constructor");
}
WaterFilter(String name)
{
String brandname=name;
System.out.println("Brandname :" +name);
}
WaterFilter(String color,int cost)
{
String Outsidecolor=color;
int Price=cost;
System.out.println(" Outsidecolor :" +color+ "Price :" +cost);
}
WaterFilter(String quality)
{
String Filterquality=quality;
System.out.println("Filterquality :" +quality);
}
}
 class Water
{
public static void main(String filters[])
{
WaterFilter w=new WaterFilter();
WaterFilter w1=new WaterFilter("purifywater");
WaterFilter w2=new WaterFilter("blue",15000);
WaterFilter w3=new WaterFilter("bestone");
}
}


