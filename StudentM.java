class StudentM
{
String name,branch;
int roll_no,sem;
boolean result;
void display()
{
System.out.println("\n Name :" +name+ "\n Branch :" +branch+ "\n Roll_no :" +roll_no+ "\n Semister :" +sem+ "\n Result :" +result);
}
public static void main(String args[])
{
StudentM s=new StudentM();
s.display();
}
}