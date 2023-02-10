package sistemaPagamentoTransporte;

//import java.util.*;
import java.time.*;

public class Contrato {

//****************************************** ATRIBUTOS ******************************************//
	private String cnpjEmpresa, tipoVeiculo;
	private int qntdVeiculos;
	private double numContrato, valorContrato;
	private LocalDate dataInicio, dataVencimento;
	
//****************************************** CONSTRUTORES ******************************************//
	
	Contrato(String cnpjE, String tV, int qntdV, double numC, double vC, int anos) {
		
		this.cnpjEmpresa = cnpjE;
		this.tipoVeiculo =	tV;
		this.qntdVeiculos = qntdV;
		this.numContrato = numC;
		this.valorContrato = vC;
		this.dataInicio = LocalDate.now();
		this.dataVencimento = LocalDate.now().plusYears(anos);	
	}

//*************************************** SETTERS & GETTERS ***************************************//
	
	public String getCnpjEmpresa() {
		return cnpjEmpresa;
	}


	public void setCnpjEmpresa(String nomeEmpresa) {
		this.cnpjEmpresa = nomeEmpresa;
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

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
}
