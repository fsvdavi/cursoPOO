package br.com.cursoPOO.lampada;

public class TesteLampada {

	public static void main(String[] args) {
		Lampada l1 = new Lampada();
		l1.tipo = "LED";
		l1.formato = "Bulbo";
		l1.ligada = true;
		l1.preco = 17.99;
		l1.potencia = 9;
		
		Lampada l2 = new Lampada();
		l2.tipo = "Fluorescente";
		l2.formato = "Tubo";
		l2.ligada = false;
		l2.preco = 40.99;
		l2.potencia = 15;
		
		Lampada l3 = new Lampada();
		l3.tipo = "Incandescente";
		l3.formato = "Vela";
		l3.ligada = true;
		l3.preco = 8.99;
		l3.potencia = 60;
		
		//CONSTRUTORES
		
		Lampada l11 = new Lampada();
		
		Lampada l21 = new Lampada("LED", "bulbo");
		
		Lampada l31 = new Lampada(true, 17.99, 9);
		
		
	}

}
