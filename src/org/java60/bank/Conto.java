package org.java60.bank;

public class Conto {
	
	//Variabili ambiente
	
	private int numConto;
	private int saldo;
	private String nomeProprietario;
	
	//Costruttore
	
	public Conto (int numConto, String nomeProprietario) {
		saldo = 0;
		this.numConto = numConto;
		this.nomeProprietario = nomeProprietario;
	}
	
	//Setter and Getter
	
	public int getSaldo() {
		return saldo;
	}
	
	public int getNumConto() {
		return numConto;
	}
	
	public String getNomeProprietario() {
		return nomeProprietario;
	}
	
	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}
	
	//Metodi
	
	public void addMoney(int money) {
		saldo += money;
	}
	
	public void getMoney( int money) {
		if((saldo- money) < 0) {
			System.out.println("Il tuo saldo non può essere meno di 0");
		} else {
			saldo -= money;
		}
	}
	
	
	
	@Override
	public String toString() {
	
		return "nomeProprietario: " + getNomeProprietario() + "\nNumero Conto: " + getNumConto() + "\nSaldo: " + getSaldo() + " " + "€";
	}
	
	
	
	
}
