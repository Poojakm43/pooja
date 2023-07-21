class Mall
{
    String name;
    String owner;
    int shops;
    String mart;
    String location;
    String theatre;
    String game;


Mall()
{
    super();
    System.out.println("Invoking no arg in Mall");
}

Mall(String name,String owner)
{
	super();
	System.out.println("Invoking name and owner");
	this.name=name;
	this.owner=owner;
	
}

Mall(String name,String owner,int shops)
{
	this(name,owner);
	System.out.println("Invoking name,owner of wood");
	this.shops=shops;
}

Mall(String name,String owner,int shops,String mart)
{
	this(name,owner,shops);
	System.out.println("Invoking name,owner, shops  and mart");
	this.mart=mart;
}

Mall(String name,String owner,int shops,String mart,String location)
{
	this(name,owner,shops,mart);
	System.out.println("Invoking name,owner,shops,mart and location");
	this.location=location;
		
}
Mall(String name,String owner,int shops,String mart,String location,String theatre)
{
	this(name,owner,shops,mart,location);
	System.out.println("Invoking name,owner,shops,mart,location and theatre");
	this.theatre=theatre;
}
Mall(String name,String owner,int shops,String mart,String location,String theatre,String game)
{
	this(name,owner,shops,mart,location,theatre);
	System.out.println("Invoking name,owner,shops,mart,location and theatre,game");
	this.game=game;
}
}





