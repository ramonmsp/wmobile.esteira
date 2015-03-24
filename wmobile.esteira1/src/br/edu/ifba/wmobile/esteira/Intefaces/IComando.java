package br.edu.ifba.wmobile.esteira.Intefaces;

public interface IComando {
	
	public void setDispositivo(IDispositivoEsteira dispositivo);
	public void setVelocidade(int nivel);
	public String getVelocidade();
	public void comando();
	public String getEstado();
	

}
