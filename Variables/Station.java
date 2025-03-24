class Station{
	 static void send(String item){
		System.out.println("Run send in Station");
		DeliveryGuy.accept(item);
	}
}