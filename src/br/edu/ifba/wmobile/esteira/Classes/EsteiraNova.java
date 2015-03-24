package br.edu.ifba.wmobile.esteira.Classes;

import br.edu.ifba.wmobile.esteira.Intefaces.IDispositivoEsteira;

public class EsteiraNova implements IDispositivoEsteira {

	private int velocidade=2;
	public String getNome() {
		
		return null;
	}

	public void Ligar() {
		System.out.println("Esteira Ligada!");

	}

	public void desligar() {
		System.out.println("Esteira Desligada!");

	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;

	}

	public int getVelocidade() {
		return velocidade;
	
	}

}
