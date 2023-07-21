class Wood{
String name;
String type;
int noOfPiece;
int price;
String use;


Wood()
{
super();
System.out.println("Invoking no arg in wood");
}

Wood(String name,String type)
{
	super();
	System.out.println("Invoking name and type of wood");
	this.name=name;
	this.type=type;
	
}

Wood(String name,String type,int noOfPiece)
{
	this(name,type);
	System.out.println("Invoking name,type and noOfPiece of wood");
	this.noOfPiece=noOfPiece;
}

Wood(String name,String type,int noOfPiece,int price)
{
	this(name,type,noOfPiece);
	System.out.println("Invoking name,type, noOfPiece  and price of wood");
	this.price=price;
}

Wood(String name,String type,int noOfPiece,int price,String use)
{
	this(name,type,noOfPiece,price);
	System.out.println("Invoking name,type,noOfPiece,price and useof wood");
	this.use=use;
	
	
}

}