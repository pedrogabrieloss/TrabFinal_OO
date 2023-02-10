package sistemaPagamentoTransporte;
import java.time.*;

public class CartaoDebitoCredito {

	//****************************************** ATRIBUTOS ******************************************//
	
	private int id;
	private String tipoCartao;
	private String bandeira;
	private LocalDate codValidade; 
	private double limite = 500;
	private boolean situacaoCartao;
	private int cvv; 
		
	//****************************************** CONSTRUTORES ******************************************//	
	
	public CartaoDebitoCredito(int id, String tipoCartao, String bandeira, int cvv, int codValidade, double limite,
			boolean situacaoCartao) {
		super();
		this.id = id;
		this.tipoCartao = tipoCartao;
		this.bandeira = bandeira;
		this.codValidade = LocalDate.now();
		this.limite = limite;
		this.situacaoCartao = situacaoCartao;
		this.cvv = cvv; 
	}
	

	public CartaoDebitoCredito() {
		super();
	}


	//*************************************** SETTERS & GETTERS ***************************************//
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoCartao() {
		return tipoCartao;
	}

	public void setTipoCartao(int tipoCartao) {
		String aux;
		
		if(tipoCartao == 1) {
			aux = "Debito";
		}
		else {
			aux = "Credito";
		}
			
		this.tipoCartao = aux;
	}

	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public LocalDate getCodValidade() {
		return codValidade;
	}

	public void setCodValidade(int mesVc, int anoVc) {
		int aux;
		LocalDate dataVc; 
		
		dataVc= LocalDate.now(); 
		aux = anoVc - dataVc.getYear(); 
		dataVc= LocalDate.now().plusYears(aux);
		
		aux = mesVc - dataVc.getMonthValue(); 
		dataVc= LocalDate.now().plusMonths(aux);
		
		this.codValidade = LocalDate.now();	
	}

	public double getLimite() {
		return limite;
	}

	public boolean isSituacaoCartao() {
		return situacaoCartao;
	}

	public void setSituacaoCartao(boolean situacaoCartao) {
		this.situacaoCartao = situacaoCartao;
	}


	public int getCvv() {
		return cvv;
	}


	public void setCvv(int cvv) {
		this.cvv = cvv;
	}


	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}