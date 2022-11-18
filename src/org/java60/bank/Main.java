package org.java60.bank;

public class Main {
	public static void main(String[] args) {
		Conto contoProva = new Conto(52201, "Pippo Franco" );
		
		System.out.println(contoProva);
		
		System.out.println("---------------------");
		
		contoProva.addMoney(1000);
		System.out.println(contoProva);
		
		System.out.println("---------------------");
		
		boolean res = contoProva.getMoney(150);
		System.out.println("risultato prelievo: " + res);
		System.out.println(contoProva);
		
		System.out.println("---------------------");
		
		res = contoProva.getMoney(950);
		System.out.println("risultato prelievo: " + res);
		System.out.println(contoProva);
	}
}
