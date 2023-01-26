package sistemaPagamentoTransporte;

public class Vistoria {

//****************************************** ATRIBUTOS ******************************************//

	//private Date data; 
	//Se for muito complicado manipular as variáveis com Date, usar int e quebrar em dd, mm e ano.
	private int idVeiculo;
	private String tipoVeiculo, observacoes;
	private boolean resultado;
	
	
//****************************************** CONSTRUTORES ******************************************//
	
	Vistoria(/* Data,*/ int idV, String tV, String obs, boolean r) {
		
		this.idVeiculo = idV;
		this.tipoVeiculo = tV;
		this.observacoes = obs;
		this.resultado = r;
		
	}

//*************************************** SETTERS & GETTERS ***************************************//
	
	public int getIdVeiculo() {
		return idVeiculo;
	}


	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}


	public String getTipoVeiculo() {
		return tipoVeiculo;
	}


	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}


	public String getObservacoes() {
		return observacoes;
	}


	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}


	public boolean isResultado() {
		return resultado;
	}


	public void setResultado(boolean resultado) {
		this.resultado = resultado;
	}

//******************************************** MÉTODOS ********************************************//		
}
