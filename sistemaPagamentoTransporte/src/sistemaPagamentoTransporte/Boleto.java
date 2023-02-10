package sistemaPagamentoTransporte;

import java.time.*;

public class Boleto {
	
	//****************************************** ATRIBUTOS ******************************************//

	private int idBoleto;
	private LocalDate dataEmissao;
	private LocalDate dataVencimento;
	private Double valorCobrado;
	private Double valorPago; 
	private boolean status;
	
	//****************************************** CONSTRUTORES ******************************************//	
	
	public Boleto(int idBoleto, LocalDate dataEmissao, LocalDate dataVencimento, Double valorCobrado, Double valorPago, boolean status) {
		super();
		this.idBoleto = idBoleto;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
		this.valorCobrado = valorCobrado;
		this.valorPago = valorPago;
		this.status = status;
	}
	
	//*************************************** SETTERS & GETTERS ***************************************//
	
	public int getIdBoleto() {
		return idBoleto;
	}

	public void setIdBoleto(int idBoleto) {
		this.idBoleto = idBoleto;
	}

	public LocalDate getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(Double valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public Double getValorPago() {
		return valorPago;
	}

	public void setValorPago(Double valorPago) {
		this.valorPago = valorPago;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}   
}