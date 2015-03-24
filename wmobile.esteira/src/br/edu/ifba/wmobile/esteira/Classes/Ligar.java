package br.edu.ifba.wmobile.esteira.Classes;

import br.edu.ifba.wmobile.esteira.Intefaces.IComando;
import br.edu.ifba.wmobile.esteira.Intefaces.IDispositivoEsteira;

public class Ligar implements IComando {

	private IDispositivoEsteira esteira = null;
	private int velocidade = 2;
	
	public void setDispositivo(IDispositivoEsteira esteira) {
		this.esteira = esteira;

	}

	public void setVelocidade(int nivel) {
		this.velocidade = velocidade;

	}

	public void comando() {
		esteira.Ligar();
		esteira.setVelocidade(velocidade);

	}

	public String getEstado() {
		return esteira.getNome()+" - Ligada!";
		
	}

	public String getVelocidade() {
		return "Velocidade atual: " + esteira.getVelocidade();
	}

}
