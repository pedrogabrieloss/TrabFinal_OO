package sistemaPagamentoTransporte;

public class PIX {
	
	//****************************************** ATRIBUTOS ******************************************//
	
	private String chavePix; 
	private String nome;
	private float valor; 
	private String tipoPix;
	
	//***************************************** CONSTRUTORES ******************************************//	
	
	public String getChavePix() {
		return chavePix;
	}
	public PIX(String chavePix, String nome, float valor, String tipoPix) {
		super();
		this.chavePix = chavePix;
		this.nome = nome;
		this.valor = valor;
		this.tipoPix = tipoPix;
	}	
		
	public PIX() {
		super();
	}
	
	//*************************************** SETTERS & GETTERS ***************************************//
		
	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
	public String getTipoPix() {
		return tipoPix;
	}
	public void setTipoPix(String tipoPix) {
		this.tipoPix = tipoPix;
	}
}