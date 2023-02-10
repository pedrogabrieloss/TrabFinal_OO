package sistemaPagamentoTransporte;

import java.time.*;

public class Usuario extends Pessoa {
	
    //************** ATRIBUTOS **************//
    private String cpf;
    private LocalDate dataDeNascimento;
    
    //************** CONSTRUTORES **************//
    public Usuario(String cpf, String nome, String endereço, Double contato, String email, char sexo) {
        super(nome, endereço, contato, email, sexo);
        this.cpf = cpf;
        this.dataDeNascimento = LocalDate.now();   
    }
    
    //************** SETTERS E GETTERS **************//
    public void setCpf(String cpf) {
            this.cpf = cpf;
    }
    
    public void setDataDeNascimento(int diaN, int mesN, int anoN) {
        int aux1, aux2, aux3;
        LocalDate dataN; 

        dataN= LocalDate.now(); 
        aux1 = anoN - dataN.getYear(); 
        aux2 = mesN - dataN.getMonthValue(); 
        aux3 = diaN - dataN.getDayOfMonth(); 
        dataN= LocalDate.now().plusYears(aux1).plusMonths(aux2).plusDays(aux3);
        
        this.dataDeNascimento = dataN;      
    }

    public String getCpf() {
        return this.cpf;
    }

    public LocalDate getDataDeNascimento() {
    	return this.dataDeNascimento;
    	}
}
