package br.edu.ifba.wmobile.esteira.Contexto;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ifba.wmobile.esteira.Intefaces.IComando;

public class Contexto {

	private List<String> historicoEstado = new ArrayList<String>();
	private List<String> historicoVelocidade = new ArrayList<String>();
	private List<String> historicoData = new ArrayList<String>();	
	
	public void executar(IComando manipula){
		
		manipula.comando();
		historicoEstado.add(manipula.getEstado());
		historicoVelocidade.add(manipula.getVelocidade());
		
		historicoData.add(hora());
		
	}
	
	public List<String> getHistoricoEstado(){
		return historicoEstado;
	}
	
	public List<String> getHistoricoVelocidade(){
		return historicoVelocidade;
	}
	

	public List<String> getHistoricoData() {
		return historicoData;
	}

	public void setHistoricoData(List<String> historicoData) {
		this.historicoData = historicoData;
	}

	private String hora(){
		String saida="";
		int temp=0;
		Calendar data = Calendar.getInstance();
		saida+=""+data.get(Calendar.DAY_OF_MONTH);
		temp=data.get(Calendar.MONTH);
		temp+=1;
		saida+="/ "+temp;
		saida+="/ "+data.get(Calendar.YEAR);
		saida+=" - "+data.get(Calendar.HOUR_OF_DAY);
		saida+=":"+data.get(Calendar.MINUTE);
		saida+=":"+data.get(Calendar.SECOND);
		
		return saida;
	}
	
}
