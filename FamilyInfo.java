class FamilyInfo
{

public static void candidate(String fname,String lname)
{
//String candidateName=fname + lname;
System.out.println("fname and lname of candidate is : " +fname+" "+lname);
}
public static void family(String fatherName,String motherName)
{
//String family=fatherName + motherName;
System.out.println("father and mother name is : " +fatherName+" "+motherName);
}
public static void brother(String name,int age)
{
System.out.println("brother name is " + name + " and age is : " + age);
}
public static void sister(String name,int age)
{
System.out.println("sister name is " + name + " and age is : " + age);

}
public static void main(String args[])
{
candidate("pinku" ,"sharanya");
family("veerupaksha","mamatha");
brother("manju",25);
sister("megha",23);
}
}
