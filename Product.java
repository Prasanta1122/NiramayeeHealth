class  Product{

  int x=10;
	{
		System.out.println("NSB 1");
    }
	Product(){
		System.out.println("NPC");
    }
	Product(int x){
		System.out.println("ipc");
    }
    {	
		System.out.println("NSB 2");
    }
	int y=20;
 	public static void main(String[] args){
	  Product p1=new Product();
	  Product p2=new Product(20);
	  System.out.println(p2.x);
	}
}
