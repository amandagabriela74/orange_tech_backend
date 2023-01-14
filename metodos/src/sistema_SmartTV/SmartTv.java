package sistema_SmartTV;

public class SmartTv {
	
	boolean ligada = false;
	int canal = 1;
	int volume = 15;
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void passarCanal() {
		canal++;
		System.out.println("Você passou para o canal: " + canal);
	}
	
	public void voltarCanal() {
		canal--;
		System.out.println("Você voltou para o canal: " + canal);
	}
	
	//alterar canal definindo o número correspondente.
	public void alterarCanal(int novoCanal) {
		canal = novoCanal;
		System.out.println("Você alterou o canal para: " + canal);
	}
}