class Park{
    String name;
    String garden;
    int games;
    String tree;
    String location;
    String elderGame;
    String field;
    String hut;
    String distance;


Park()
{
    super();
    System.out.println("Invoking no arg in Park");
}

Park(String name,String garden)
{
	super();
	System.out.println("Invoking name and garden");
	this.name=name;
	this.garden=garden;
	
}

Park(String name,String garden,int games)
{
	this(name,garden);
	System.out.println("Invoking name,garden of Park");
	this.games=games;
}

Park(String name,String garden,int games,String tree)
{
	this(name,garden,games);
	System.out.println("Invoking name,garden, games  and tree");
	this.tree=tree;
}

Park(String name,String garden,int games,String tree,String location)
{
	this(name,garden,games,tree);
	System.out.println("Invoking name,garden, games  and tree and location");
	this.location=location;
		
}
Park(String name,String garden,int games,String tree,String location,String elderGame)
{
	this(name,garden,games,tree,location);
	System.out.println("Invoking name,garden, games, tree,location and elderGame");
	this.elderGame=elderGame;
}
Park(String name,String garden,int games,String tree,String location,String elderGame,String field)
{
	this(name,garden,games,tree,location,elderGame);
	System.out.println("Invoking name,garden, games, tree,location and elderGame,field");
	this.field=field;
}
Park(String name,String garden,int games,String tree,String location,String elderGame,String field,String hut)
{
	this(name,garden,games,tree,location,elderGame,field);
	System.out.println("Invoking name,garden, games, tree,location and elderGame,field,hut");
	this.hut=hut;
}
Park(String name,String garden,int games,String tree,String location,String elderGame,String field,String hut,String distance)
{
	this(name,garden,games,tree,location,elderGame,field,hut);
	System.out.println("Invoking name,garden, games, tree,location and elderGame,field,hut,distance");
	this.distance=distance;
}


}
