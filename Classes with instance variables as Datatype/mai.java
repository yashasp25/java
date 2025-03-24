class Main{
	static int age ;
	static byte g;
	public static void dar(){
			System.out.println("Dar");
			
		}
		void br(){
			
			dar();
		}
	public static void main(String[] args){
		System.out.println("Hi");
		System.out.println(age);
		System.out.println(g);
		Main main=new Main();
		main.br();
		dar();
		
		}
		
		
		
}