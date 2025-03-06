class Courier{
	static void pickup(String item){
		System.out.println("Run pickup in Courier");
		Station.send(item);
	}
}