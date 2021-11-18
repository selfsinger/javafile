class College
{
static int noofstudents,currentyear;
static void cse()
{
noofstudents=50;
currentyear=2;
System.out.println("this is cse method");
System.out.println("to know the current year and no of students");
//System.out.println("number of students in a class"+noofstudents);
//System.out.println("the current year"+currentyear+ "year");
ece();
}
static void ece()
{
noofstudents=45;
currentyear=1;
System.out.println("this is ece method");
System.out.println("to know the current year and no of students");
System.out.println("number of students in a class"+noofstudents);
System.out.println("the current year"+currentyear+ "year");
display();
}
static void display()
{
System.out.println("this is display method");
System.out.println("to know the current year and no of students");
System.out.println("number of students in a class"+noofstudents);
System.out.println("the current year"+currentyear+ "year");
}
public static void main(String args[])
{
cse();
}

}
