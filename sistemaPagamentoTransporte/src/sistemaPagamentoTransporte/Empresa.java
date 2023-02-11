package sistemaPagamentoTransporte;

import java.util.*;

public class Empresa {
//********ATRIBUTOS********//
	  private double valorArrecadadoPassagens;
	  private double valorManutencao;
	  private double valorSalarios;
	  private List<String> veiculosEmManutencao;
	  private List<String> veiculosEmUso;
	  private String cnpj;

	  private Financa fin;

//********METODOS********//	  
	  public Empresa() {
	    this.veiculosEmManutencao = new ArrayList<>();
	    this.veiculosEmUso = new ArrayList<>();
	    this.fin = new Financa();
	  }
	  
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	  public Financa getFin() {
		return fin;
	}

	public void setFin(Financa fin) {
		this.fin = fin;
	}

	public void addValorArrecadadoPassagens(double valor) {
	    this.valorArrecadadoPassagens += valor;
	  }

	  public void addValorManutencao(double valor) {
	    this.valorManutencao += valor;
	  }

	  public void addValorSalarios(double valor) {
	    this.valorSalarios += valor;
	  }

	  public void agendarVistoria(String veiculo) {
	    this.veiculosEmManutencao.add(veiculo);
	  }

	  public void atribuirVeiculosHorarios(String veiculo) {
	    this.veiculosEmUso.add(veiculo);
	  }

	  public void cobrarPassagem(double valor) {
	    addValorArrecadadoPassagens(valor);
	  }

	  public void retirarVeiculoEmManutencao(String veiculo) {
	    this.veiculosEmManutencao.remove(veiculo);
	  }

	  public void registrarDespesas() {
	    System.out.println("Valor arrecadado com passagens: " + this.valorArrecadadoPassagens);
	    System.out.println("Valor gasto com manutenção: " + this.valorManutencao);
	    System.out.println("Valor gasto com salários: " + this.valorSalarios);
	  }

	  public void confirmarSaidaEntradaOnibus(String veiculo) {
	    if (this.veiculosEmUso.contains(veiculo)) {
	      this.veiculosEmUso.remove(veiculo);
	    } else {
	      this.veiculosEmUso.add(veiculo);
	    }
	  }

	  public void contabilizarLucros() {
	    double lucro = this.valorArrecadadoPassagens - (this.valorManutencao + this.valorSalarios);
	    System.out.println("Lucro da empresa: " + lucro);
	  }
}