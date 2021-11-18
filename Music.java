class Music
{
static String writername,songname,notes,type,language;
public static void main(String args[])
{
release(args[0],args[1],args[2],args[3],args[4]);
display();
}
static void release(String wn,String sn,String n,String t,String l)
{
writername=wn;
songname=sn;
notes=n;
type=t;
language=l;
}
static void display()
{
System.out.println("writername :" +writername+ " songname :" +songname+ " notes :" +notes+  " type :" +type+ " language :" +language);
}

}