package locadoraVeiculos;
import java.util.Scanner;

public class LocadoraVeiculos {

	public static void main(String[] args) {
		var leitura = new Scanner(System.in);
		Carro carro = new Carro();
		String fabricante, modelo, cc;
		System.out.println("Insira o fabricante do carro:");
		fabricante = leitura.nextLine();
		System.out.println("Insira o modelo do carro:");
		modelo = leitura.nextLine();
		carro.atribuirValores(fabricante, modelo);

		Moto moto1 = new Moto();
		System.out.println("Insira o fabricante da moto:");
		fabricante = leitura.nextLine();
		System.out.println("Insira o modelo da moto:");
		modelo = leitura.nextLine();
		System.out.println("Insira a cilindrada da moto:");
		cc = leitura.nextLine();
		moto1.atrbuirValores(fabricante, modelo, cc);

		Moto moto2 = new Moto();
		System.out.println("Insira o fabricante da moto:");
		fabricante = leitura.nextLine();
		System.out.println("Insira o modelo da moto:");
		modelo = leitura.nextLine();
		System.out.println("Insira a cilindrada da moto:");
		cc = leitura.nextLine();
		
		leitura.close();
		moto2.atrbuirValores(fabricante, modelo, cc);
		
		carro.retornarValores();
		moto1.retornarValores();
		moto2.retornarValores();

	}

}
