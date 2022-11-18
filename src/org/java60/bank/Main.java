package org.java60.bank;

public class Main {
	public static void main(String[] args) {
		Conto contoProva = new Conto(52201, "Pippo Franco" );
		
		System.out.println(contoProva);
		
		contoProva.addMoney(1000);
		System.out.println("Il tuo nuovo saldo è: " + contoProva.getSaldo() + " " + "€");
		
		contoProva.getMoney(150);
		System.out.println("Il tuo nuovo saldo è: " + contoProva.getSaldo() + " " + "€");
		
		contoProva.getMoney(950);
		System.out.println("Il tuo nuovo saldo è: " + contoProva.getSaldo() + " " + "€");
	}
}
