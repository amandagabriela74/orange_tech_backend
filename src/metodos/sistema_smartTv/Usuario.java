package metodos.sistema_smartTv;

public class Usuario {

	public static void main(String[] args) {
		
		SmartTv smartTv = new SmartTv(); 
		
			System.out.println("Tv Ligada?" + smartTv.ligada);
			System.out.println("Canal: " + smartTv.canal);
			
			
			smartTv.ligar();
			System.out.println("Novo Status ->Tv Ligada?" + smartTv.ligada);
	
			smartTv.passarCanal();
			System.out.println("Status atual do canal: " + smartTv.canal);
			
			smartTv.alterarCanal(10); 
	}

}
