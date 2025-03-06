class Station{
	 void static send(String item){
		System.out.println("Run send in Station");
		DeliveryGuy.accept(item);
	}
}