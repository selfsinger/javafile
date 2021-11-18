class Sports
{
public Sports()
{
System.out.println("invoking sports method");
}
public void cricket()
{
System.out.println("invoking create method");
}
public void football()
{
System.out.println("invoking football method");
}
public static void main(String args[])
{
Sports sport=new Sports();
sport.cricket();
sport.football();
}
}
