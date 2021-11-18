class FurnRunner
{
public static void main(String args[])
{
Furniture1 furn=new Furniture1();
furn.Soft();
furn.Hard();
furn.details("square","black",4);
System.out.println("IT FEELS :"+ furn.HOWITFEELSTOSIT);
}
}