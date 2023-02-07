package sistemaPagamentoTransporte;

//import java.util.*;

public class Contrato {

	
//****************************************** ATRIBUTOS ******************************************//
	private String nomeEmpresa, tipoVeiculo;
	private int qntdVeiculos;
	private double numContrato, valorContrato;
//	private Date dataAssinatura, dataInicio, dataVencimento;
// Se for muito complicado manipular as variáveis com Date, usar int e quebrar em dd, mm e ano.
	
	
//****************************************** CONSTRUTORES ******************************************//
	
	Contrato(String nE, String tV, int qntdV, double numC, double vC/*, DATA*/) {
		
		this.nomeEmpresa = nE;
		this.tipoVeiculo =	tV;
		this.numContrato = numC;
		this.valorContrato = vC;
	}

//*************************************** SETTERS & GETTERS ***************************************//
	
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}


	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}


	public String getTipoVeiculo() {
		return tipoVeiculo;
	}


	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}


	public int getQntdVeiculos() {
		return qntdVeiculos;
	}


	public void setQntdVeiculos(int qntdVeiculos) {
		this.qntdVeiculos = qntdVeiculos;
	}


	public double getNumContrato() {
		return numContrato;
	}


	public void setNumContrato(double numContrato) {
		this.numContrato = numContrato;
	}


	public double getValorContrato() {
		return valorContrato;
	}


	public void setValorContrato(double valorContrato) {
		this.valorContrato = valorContrato;
	}

//******************************************** MÉTODOS ********************************************//
}
