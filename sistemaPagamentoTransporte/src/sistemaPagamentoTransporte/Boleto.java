package sistemaPagamentoTransporte;
import java.time.LocalDateTime;
public class Boleto {
	
	//****************************************** ATRIBUTOS ******************************************//

	private int idBoleto;
	private LocalDateTime dataEmissao;
	private LocalDateTime dataVencimento;
	private LocalDateTime valorCobrado;
	private LocalDateTime dataPagamento;
	private LocalDateTime valorPago; 
	private boolean status;
	
	//****************************************** CONSTRUTORES ******************************************//	
	
	public Boleto(int idBoleto, LocalDateTime dataEmissao, LocalDateTime dataReferencia,
			LocalDateTime dataProcessamento, LocalDateTime dataVencimento, LocalDateTime valorCobrado,
			LocalDateTime dataPagamento, LocalDateTime valorPago, boolean status) {
		super();
		this.idBoleto = idBoleto;
		this.dataEmissao = dataEmissao;
		this.dataVencimento = dataVencimento;
		this.valorCobrado = valorCobrado;
		this.dataPagamento = dataPagamento;
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

	public LocalDateTime getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(LocalDateTime dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public LocalDateTime getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDateTime dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public LocalDateTime getValorCobrado() {
		return valorCobrado;
	}

	public void setValorCobrado(LocalDateTime valorCobrado) {
		this.valorCobrado = valorCobrado;
	}

	public LocalDateTime getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(LocalDateTime dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public LocalDateTime getValorPago() {
		return valorPago;
	}

	public void setValorPago(LocalDateTime valorPago) {
		this.valorPago = valorPago;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}   
}



			
		
		