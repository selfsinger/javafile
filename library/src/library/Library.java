package library;

public class Library {
public Library(String type,String works)
{
	this("In letters or in the block name",true,"Spread of education,Self development,Science & technology,etc");
	System.out.println("Type of library :" +type+ "\n Works done in library :" +works);
}
public Library()
{
	this("public library","reading books,writing and collection of information");
    System.out.println("default constructor");
}
public Library(String blocks,boolean books,String functions)
{
	System.out.println("Representation of blocks :" +blocks+ "\n plenty of books we can see in library :" +books+ "\n Functions of library :" +functions);
}
}
