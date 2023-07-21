class ParkRunner{
    public static void main (String[] args)
{

    Park park=new Park();
    System.out.println("Invoking no arguments");


    Park park1=new Park("publicPark","flower");
    System.out.println("-------------");

    Park park2=new Park("publicPark","flower",6);
    System.out.println("---------------");


    Park park3=new Park("publicPark","flower",6,"oak");
    System.out.println("-------------------");

    Park park4=new Park("publicPark","flower",6,"oak","banglore");
    System.out.println("-------------------");

    Park park5=new Park("publicPark","flower",6,"oak","banglore","excercise");
    System.out.println("-------------------");

    Park park6=new Park("publicPark","flower",6,"oak","banglore","excercise","indoor");
    System.out.println("-------------------");

    Park park7=new Park("publicPark","flower",6,"oak","banglore","excercise","indoor","sittingPlace");
    System.out.println("-------------------");


    Park park8=new Park("publicPark","flower",6,"oak","banglore","excercise","indoor","sittingPlace","2km");
}
}
