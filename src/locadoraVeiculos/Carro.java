package locadoraVeiculos;

public class Carro {
	String fabricante = "VW";
	String modelo = "Fusca";
	
	void ligar() {
		System.out.println("Carro ligado");
	}
	
	public void desligar() {
		System.out.println("Carro desligado");
	}
	
	public void retornarValores() {
		System.out.println("Dados do carro: " + fabricante + " " + modelo);
	}
	
	public void atribuirValores(String fabricanteCarro, String modeloCarro) {
		fabricante = fabricanteCarro;
		modelo = modeloCarro;
	}

}
