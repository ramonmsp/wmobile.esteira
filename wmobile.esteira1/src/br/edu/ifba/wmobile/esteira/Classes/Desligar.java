package br.edu.ifba.wmobile.esteira.Classes;

import br.edu.ifba.wmobile.esteira.Intefaces.IComando;
import br.edu.ifba.wmobile.esteira.Intefaces.IDispositivoEsteira;

public class Desligar implements IComando {

	private IDispositivoEsteira esteira = null;
	
	public void setDispositivo(IDispositivoEsteira dispositivo) {
		this.esteira = dispositivo;
	}

	public void setVelocidade(int nivel) {
		

	}

	public void comando() {
		esteira.desligar();

	}

	public String getEstado() {
		return esteira.getNome()+ " Não está funcionando.";
	}


	public String getVelocidade() {
		return "Velocidade atual: " + esteira.getVelocidade();
	}

}
