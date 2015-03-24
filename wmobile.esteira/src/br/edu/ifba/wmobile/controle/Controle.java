package br.edu.ifba.wmobile.controle;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifba.wmobile.esteira.Classes.Desligar;
import br.edu.ifba.wmobile.esteira.Classes.Esteira;
import br.edu.ifba.wmobile.esteira.Classes.Ligar;
import br.edu.ifba.wmobile.esteira.Contexto.Contexto;
import br.edu.ifba.wmobile.esteira.Intefaces.IComando;
import br.edu.ifba.wmobile.esteira.Intefaces.IDispositivoEsteira;

@ManagedBean (name = "ester") 
@SessionScoped
public class Controle {

	private Esteira esteira = new Esteira();

	private IComando ligar = new Ligar();
	private IComando desligar = new Desligar(); 
	
	private Contexto contexto = new Contexto();
	
	private void ligar(IDispositivoEsteira dispositivo) throws InterruptedException{
		Thread.sleep(5000);
		ligar.setDispositivo(dispositivo);
		contexto.executar(ligar);
		
	}
	
	private void desligar(IDispositivoEsteira dispositivo) throws InterruptedException{
			
		Thread.sleep(5000);
		desligar.setDispositivo(dispositivo);
		contexto.executar(desligar);
		
	}
	
	private String getUltimoHistorico(){
		String historico = "";
		
		List <String> histData = contexto.getHistoricoData();
		List <String> histEstado = contexto.getHistoricoEstado();
		List <String> histVelocidade = contexto.getHistoricoVelocidade();
		
		if(!contexto.getHistoricoData().isEmpty()){
			historico = histData.get(histData.size()-1);
		}		
		if(!contexto.getHistoricoData().isEmpty()){
			historico = histEstado.get(histEstado.size()-1);
		}	
		if(!contexto.getHistoricoVelocidade().isEmpty()){
			historico =""+ histVelocidade.get(histVelocidade.size()-1);
		}	
		return historico;
	}
	
	public void aumentarVelocidade(){
		int temp = esteira.getVelocidade();
		if(temp<30){		
		esteira.setVelocidade(temp+1);		
		}
		
	}
	
	public void diminuirVelocidade(){
		int temp = esteira.getVelocidade();
		if(temp>1){		
		esteira.setVelocidade(temp-1);
		}
		
	}
	
	public int getVelocidade(){
		return esteira.getVelocidade();
	}
	
	public void ligarEsteira() throws InterruptedException{
		ligar(esteira);
	}
	
	public void desligarEsteira() throws InterruptedException{
		desligar(esteira);
	}
	
	public String getEstadoEsteira(){
		return getUltimoHistorico();
	}
	public String getNome(){
		return esteira.getNome();
	}
}
