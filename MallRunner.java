class MallRunner{
    public static void main (String[] args)
{

    Mall mall=new Mall();
    System.out.println("Invoking no arguments");


    Mall mall1=new Mall("orion","XYZ");
    System.out.println("-------------");

    Mall mall2=new Mall("orion","XYZ",20);
    System.out.println("---------------");


    Mall mall3=new Mall("orion","XYZ",20,"BigBazaar");
    System.out.println("-------------------");


    Mall mall4=new Mall("orion","XYZ",20,"BigBazaar","banglore");

}
}
