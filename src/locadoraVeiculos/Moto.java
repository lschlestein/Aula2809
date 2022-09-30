package locadoraVeiculos;

public class Moto {
	String marca;
	String modelo;
	String cc;

	public void atrbuirValores(String marcaMoto, String modeloMoto, String ccMoto) {
		marca = marcaMoto;
		modelo = modeloMoto;
		cc = ccMoto;
	}

	public void retornarValores() {
		System.out.println("Moto modelo: " + modelo + " Marca:" + marca + " Cilindrada:" + cc);
	}

}
