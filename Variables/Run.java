class Run{
	public static void main(String[] args){
		System.out.println("Mobile : "+Mobile.getName(5432109876L));
		System.out.println("CompanyOwner : "+CompanyOwner.getCompany("Reliance"));
		System.out.println("Food : "+Food.getFoodItem("Coke"));
		System.out.println("AccountBalance : "+AccountBalance.getBalance(1505));
		System.out.println("AliveCheck : "+AliveCheck.checkAlive("Bob"));
	}
}