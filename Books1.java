class Books1
{
static String price,title,authorname,publishinghouse;
public static void main(String args[])
{
library(args[0],args[1],args[2],args[3]);
display();
}
static void library(String prc,String tl,String an,String ph)
{
price=prc;
title=tl;
authorname=an;
publishinghouse=ph;
}
static void display()
{
System.out.println (" Price :" +price+ " Title :" +title+ " Authorname :" +authorname+ " Publishinghouse :" +publishinghouse);
}

}