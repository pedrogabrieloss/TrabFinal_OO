package sistemaPagamentoTransporte;

public class BilheteUnico {
	
	//************** ATRIBUTOS **************//
    private double codigo;
    private double saldo;
    private String tipo;
    private String status;
    
    
    //************** CONSTRUTORES **************//
    BilheteUnico(double codigo, double saldo, String tipo, String status) {
        this.codigo = codigo;
        this.saldo = saldo;
        this.tipo = tipo;
        this.status = status;
    }
    
    public BilheteUnico() {
		super();
	}


	//************** SETTERS E GETTERS **************//
    public void setCodigo(double codigo) {
        this.codigo = codigo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void setStatus(String status) {
        this.tipo = status;
    }

    public double getCodigo() {
        return codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getStatus() {
        return status;
    }
        //************** ATRIBUTOS **************//
    void status() {
        System.out.println("codigo" + this.codigo);
        System.out.println("saldo" + this.saldo);
        System.out.println("tipo" + this.tipo);
        System.out.println("status" + this.status);
        }
}
