



class Studentme
{
String name,branch;
int roll_no,sem;
boolean result;
Studentme()
{
name="megha";
branch="BCA";
roll_no=345;
sem=6;
result=true;
}
void display()
{
System.out.println("Details of the student: \n Name :" +name+ "\n Branch :" +branch+ "\n Roll_no :" +roll_no+ "\n Semester :" +sem+ "\n Result :" +result);
}
public static void main(String args[])
{
Studentme s=new Studentme();
s.display();
}
}