package sistemaPagamentoTransporte;

public class Corrida {
	
	//************** ATRIBUTOS **************//
	   private String horario;
	   private int codigo;
	   private String empresa; 
	   private double tarifa;
	   private String localDeEmbarque;
	   private String localDeDesembarque;

	   //************** CONSTRUTORES **************//
	    Corrida(String horario, int codigo, String empresa, double tarifa, String localDeEmbarque, String localDeDesembarque) {
	        this.horario = horario;
	        this.codigo = codigo;
	        this.empresa = empresa;
	        this.tarifa = tarifa;
	        this.localDeEmbarque = localDeEmbarque;
	        this.localDeDesembarque = localDeDesembarque;
	    }
	    
	    
	//************** SETTERS E GETTERS **************//
	    public void setHorario(String horario) {
	        this.horario = horario;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public void setEmpresa(String empresa) {
	        this.empresa = empresa;
	    }

	    public void setTarifa(double tarifa) {
	        this.tarifa = tarifa;
	    }

	    public void setLocalDeEmbarque(String localDeEmbarque) {
	        this.localDeEmbarque = localDeEmbarque;
	    }

	    public void setLocalDeDesembarque(String localDeDesembarque) {
	        this.localDeDesembarque = localDeDesembarque;
	    }

	    public String getHorario() {
	        return horario;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public String getEmpresa() {
	        return empresa;
	    }

	    public double getTarifa() {
	        return tarifa;
	    }

	    public String getLocalDeEmbarque() {
	        return localDeEmbarque;
	    }

	    public String getLocalDeDesembarque() {
	        return localDeDesembarque;
	    }
	    //************** METODOS **************//
	    void status() {
	        System.out.println("horario" + this.horario);
	        System.out.println("codigo" + this.codigo);
	        System.out.println("empresa" + this.empresa);
	        System.out.println("tarifa" + this.tarifa);
	        System.out.println("localDeEmbarque" + this.localDeEmbarque);
	        System.out.println("localDeDesembarque" + this.localDeDesembarque);
	        }
}
