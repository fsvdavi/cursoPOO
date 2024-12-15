package br.com.cursoPOO.carro;

public class TesteCarro {

	public static void main(String[] args) {
		Carro uno = new Carro();
		System.out.println(uno);
		uno.marca = "fiat";
		uno.modelo = "Uno way";
		uno.placa = "XXX-999";
		uno.capacidadePassageiro = 5;
		uno.capacidadeCombustivel = 40.4;
		uno.consumoCombustivel = 5.3;
		
		Carro hilux = new Carro();
		System.out.println(hilux);
		hilux.marca = "Toyota";
		hilux.modelo = "hilux";
		hilux.placa = "YYY-123";
		hilux.capacidadePassageiro = 3;
		hilux.capacidadeCombustivel = 53.4;
		hilux.consumoCombustivel = 3.3;
		
		Carro civic = new Carro();
		System.out.println(civic);
		civic.marca = "Honda";
		civic.modelo = "civic";
		civic.placa = "ZZZ-321";
		civic.capacidadePassageiro = 5;
		civic.capacidadeCombustivel = 42.1;
		civic.consumoCombustivel = 4.0;	
		
		//CONSTRUTORES
		
		Carro uno1 = new Carro();
		System.out.println(uno1.capacidadePassageiro);
		
		Carro hillux1 = new Carro("Toyota", "Hilux", "YYY-123", 3, 53.4, 3.3);
		
		Carro civic1 = new Carro("Honda", "Civic", 2015);
		
		
	}
	
		
	
}
