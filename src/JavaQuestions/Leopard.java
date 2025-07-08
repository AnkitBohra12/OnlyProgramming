package JavaQuestions;

public class Leopard implements Cat, Tiger{
	
	@Override
	public void watchF() {
		System.out.println("Carefully watching at the target");
	}
	
	@Override
	public void runF() {
		System.out.println("Running faster with focused");
	}
	
	@Override
	public void hunt() {
		System.out.println("Hunting human");
	}
	
	public static void main(String[] args) {
		Leopard l = new Leopard();
		l.hunt();
		l.runF();
		l.runF();		
	}
}
