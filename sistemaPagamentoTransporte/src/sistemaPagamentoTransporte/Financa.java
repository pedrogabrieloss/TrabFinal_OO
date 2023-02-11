package sistemaPagamentoTransporte;

public class Financa {
	private double saldo;
	private double entradas;
	private double saidas;

	public Financa(double saldo) {
		super();
		this.saldo = saldo;
		this.entradas = 0;
		this.saidas = 0;
	}
	
	  public Financa() {
	    this.saldo = 0.0;
	    this.entradas = 0.0;
	    this.saidas = 0.0;
	  }

	  public void adicionarEntrada(double valor) {
	    this.entradas += valor;
	    this.saldo += valor;
	  }

	  public void adicionarSaida(double valor) {
	    this.saidas += valor;
	    this.saldo -= valor;
	  }

	  public void fazRelatorio() {
	    System.out.println("Relatório Financeiro");
	    System.out.println("Entradas: " + entradas);
	    System.out.println("Saidas: " + saidas);
	    System.out.println(" Saldo: " + saldo);
	  }

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getEntradas() {
		return entradas;
	}

	public void setEntradas(double entradas) {
		this.entradas = entradas;
	}

	public double getSaidas() {
		return saidas;
	}

	public void setSaidas(double saidas) {
		this.saidas = saidas;
	}

}
