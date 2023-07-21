class WoodKiller{
public static void main (String[] args)
{

Wood wood=new Wood();
System.out.println("Invoking no arguments");


Wood wood1=new Wood("teaTree","timber");
System.out.println("-------------");

Wood wood2=new Wood("teaTree","timber",5);
System.out.println("---------------");


Wood wood3=new Wood("teaTree","timber",5,560);
System.out.println("-------------------");


Wood wood4=new Wood("teaTree","timber",5,560,"construction");

}
}
