package sistemaPagamentoTransporte;

import java.time.*;

public class Usuario extends Pessoa {
	
    //************** ATRIBUTOS **************//
    private String cpf;
    private LocalDate dataDeNascimento;
    
    //************** CONSTRUTORES **************//
    public Usuario(String cpf, String nome, String endereço, int contato, String email, char sexo) {
        super(nome, endereço, contato, email, sexo);
        this.cpf = cpf;
        this.dataDeNascimento = LocalDate.now();   
    }
    
    //************** SETTERS E GETTERS **************//
    public void setCpf(String cpf) {
        
    	this.cpf = cpf;
    }
    
    public void setDataDeNascimento(int diaN, int mesN, int anoN) {
        int aux;
        LocalDate dataN; 

        dataN= LocalDate.now(); 
        aux = anoN - dataN.getYear(); 
        dataN= LocalDate.now().plusYears(aux);

        aux = mesN - dataN.getMonthValue(); 
        dataN= LocalDate.now().plusMonths(aux);
        
        aux = diaN - dataN.getDayOfMonth(); 
        dataN= LocalDate.now().plusDays(aux);
        
        this.dataDeNascimento = dataN;      
    }

    public String getCpf() {
        return this.cpf;
    }

    public LocalDate getDataDeNascimento() {
    	return this.dataDeNascimento;
    	}
}
