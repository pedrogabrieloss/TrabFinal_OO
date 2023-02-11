package sistemaPagamentoTransporte;

import java.time.*;
import java.util.*;

public class Usuario extends Pessoa {
	
    //************** ATRIBUTOS **************//
    private String cpf;
    private LocalDate dataDeNascimento;
    private ArrayList<BilheteUnico> bilhete;
    
    
    //************** CONSTRUTORES **************//
    public Usuario(String cpf, String nome, String endereço, Double contato, String email, char sexo) {
        super(nome, endereço, contato, email, sexo);
        this.cpf = cpf;
        this.dataDeNascimento = LocalDate.now(); 
        this.bilhete = new ArrayList<BilheteUnico>();
    }
    
    //************** SETTERS E GETTERS **************//
    public void setCpf(String cpf) {
    	this.cpf = cpf;
    }
    
    public ArrayList<BilheteUnico> getBilhete() {
		return bilhete;
	}

	public void setBilhete(ArrayList<BilheteUnico> bilhete) {
		this.bilhete = bilhete;
	}
	
    public String getCpf() {
        return this.cpf;
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

    public LocalDate getDataDeNascimento() {
    	return this.dataDeNascimento;
    }
    
    public BilheteUnico atrelaBilheteUsuario(double codigo, double saldo, String tipo, String status) {
    
    	BilheteUnico bilhete1 = new BilheteUnico(codigo, saldo, tipo, status);
    	bilhete.add(bilhete1);
    	
    	return bilhete1;
    }
    
    public void removeBilhete(double codigo) {
        
    	int aux;
    	int flag = 0;
    	String confirmacao;
    	
    	Scanner input = new Scanner(System.in);
    	
    	for (aux = 0; aux < bilhete.size(); aux++) {			
			if (codigo == bilhete.get(aux).getCodigo()) {
				
				flag = 1;
				
				System.out.printf("Deseja realmente cancelar o Bilhete abaixo?%n");
				System.out.printf("Codigo: %.0f.%nTipo: %s.%nSaldo: %.2f.%n", bilhete.get(aux).getCodigo(),
						bilhete.get(aux).getTipo(), bilhete.get(aux).getSaldo());
				System.out.printf("%n[S] Sim%n[N] Nao%n");
				confirmacao = input.nextLine();
				
				if(confirmacao.equals("S") || confirmacao.equals("s")) {
					System.out.printf("Bilhete %.0f excluida com sucesso!%n", bilhete.get(aux).getCodigo());
					
					bilhete.remove(bilhete.get(aux));
				}
				else {
					System.out.printf("Operacao abortada!%n");
				}
				break;
			}
		}
    	if(flag == 0)
    		System.out.printf("Codigo nao encontrado! Operacao abortada!%n");
    }
    
    public void addSaldoBilhete() {
    	
		int i;
		int flag = 0;
		double codigo, recarga;
		String confirmacao;
		
		Scanner input = new Scanner(System.in);
    	
    	System.out.printf("%nDigite o codigo do Bilhete a ser recarregado.%n");
		codigo = input.nextDouble();
		
		for (i = 0; i < bilhete.size(); i++) {			
			if (codigo == bilhete.get(i).getCodigo()) {

				flag = 1;
				
				System.out.printf("%nQual o valor da recarga?%n");
				recarga = input.nextDouble();
				
				System.out.printf("%nDeseja realmente adicionar %.2f ao bilhete abaixo?%n", recarga);
				System.out.printf("Codigo: %.0f.%nTipo: %s.%nSaldo: %.2f.%n", bilhete.get(i).getCodigo(), 
						bilhete.get(i).getTipo(), bilhete.get(i).getSaldo());
				System.out.printf("%n[S] Sim%n[N] Nao.%n");
				input.nextLine(); // Para limpar o Scanner
				confirmacao = input.nextLine();
				
				if(confirmacao.equals("S") || confirmacao.equals("s")) {
					bilhete.get(i).setSaldo(bilhete.get(i).getSaldo() + recarga);
					
					System.out.printf("Valor adicionado com sucesso!%nNovo saldo: %.2f.%n", bilhete.get(i).getSaldo());
				}
				
				else {
					System.out.printf("Operacao cancelada!%nSaldo: %.2f.%n", bilhete.get(i).getSaldo());
				}
			}
		}
		
		if (flag == 0)
			System.out.printf("Bilhete nao encontrado!");
    }
    
public void consBilhete() {
    	
		int i;
		int flag = 0;
		double codigo;
		
		Scanner input = new Scanner(System.in);
    	
    	System.out.printf("%nDigite o codigo do Bilhete a ser consultado.%n");
		codigo = input.nextDouble();
		
		for (i = 0; i < bilhete.size(); i++) {			
			if (codigo == bilhete.get(i).getCodigo()) {
				flag = 1;
	
				System.out.printf("Codigo: %.0f.%nTipo: %s.%nSaldo: %.2f.%n", bilhete.get(i).getCodigo(),
						bilhete.get(i).getTipo(), bilhete.get(i).getSaldo());
			}
		}
		
		if (flag == 0)
			System.out.printf("Bilhete nao encontrado!");
    }
}
