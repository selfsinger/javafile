class Mixer
{
String type;
Mixer()
{
System.out.println("Mixer here");
}
public void veera()
{
type="classic";
System.out.println("invoking veera");
}
public static void main(String args[])
{
Mixer mix=new Mixer();
mix.veera();
}
}