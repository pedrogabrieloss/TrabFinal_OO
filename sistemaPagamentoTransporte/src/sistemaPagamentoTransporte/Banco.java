package sistemaPagamentoTransporte;

import java.util.*;
import java.time.*; 

public class Banco {

	//****************************************** ATRIBUTOS ******************************************//	

	private String nome; 
	private int codigo;
	
	
	//****************************************** CONSTRUTORES ******************************************//		
	public Banco(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
		
	}
	
	//*************************************** SETTERS & GETTERS ***************************************//

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	//******************************************** MÉTODOS ********************************************//	
	public void comprovantePagamento(ArrayList<Usuario> user) {
	 
	
		int i, formaPg, anoVc, mesVc;
		int flag = 0;
		int flagCPF = 0;
		double codigo, recarga;
		String confirmacao, cpf; 
		confirmacao = "N";
		boolean status;
		LocalDate dataEmissao, dataVencimento;
		
		Random random = new Random(); //Gerando numeros aleatorio para o boleto
		int max = 100; //gera número aleatório entre 0 e 100
		int count = 35; //quantidade de números aleatório a serem gerados 
		
		int[] codBoleto = new int[count];
		
		Scanner input=new Scanner(System.in);
		
		System.out.printf("%nDigite o CPF do Usuario proprietario do Bilhete Unico a ser recarregado.%n");
		cpf = input.nextLine();
		
		for (i = 0; i < user.size(); i++) {			
			if (cpf.equals(user.get(i).getCpf())) {
				flagCPF = 1;
				
				System.out.printf("%nQual o valor da recarga?%n");
				recarga = input.nextDouble();
				
				System.out.printf("%nQual a forma de pagamento?%n[1] Cartao de credito ou debito%n[2] PIX%n[3] Boleto%n[0] Sair%n");
				formaPg= input.nextInt();
				
				switch (formaPg) {
				    case 1:
				    	CartaoDebitoCredito cartao = new CartaoDebitoCredito();
				    	
					    System.out.printf("%nDigite o numero do cartao: ");
					    cartao.setId(input.nextDouble());
					    
					    System.out.printf("%nDigite o mes de validade do cartao:");							    
					    mesVc = input.nextInt();
					    
					    System.out.printf("%nDigite o ano de validade do cartao: ");							    
					    anoVc = input.nextInt();
					    
					    cartao.setCodValidade(mesVc, anoVc);
					    
					    System.out.printf("%nDigite o Codigo de segurança: ");
					    cartao.setCvv(input.nextInt());
					    
					    System.out.printf("%nQual o tipo do cartao?%n[1]Credito%n[2]Debito%n");
					    cartao.setTipoCartao(input.nextInt()); 
					    
					   		    
					    if (cartao.getLimite()>= recarga) {
					    	flag = user.get(i).addSaldoBilhete(recarga);
					    }
					    else  {
					    	System.out.printf("O cartao informado nao possui limite! Operacao cancelada.%n");						    	
					    }
					    
					    break;
				   
				    case 2:
				    	flag = user.get(i).addSaldoBilhete(recarga);							    								    	
				    	break;
				    	
				    case 3:		    	
				    	flag = user.get(i).addSaldoBilhete(recarga);
						
				    	dataEmissao = LocalDate.now();
				    	dataVencimento = LocalDate.now().plusDays(5);
				    	
				    	if(flag == 1) {
					    	System.out.printf("%nPagavel em qualquer agencia bancaria.%n");
					    	System.out.printf("Data de emissao %d/%d/%d.%n", dataEmissao.getDayOfMonth(), dataEmissao.getMonthValue(), dataEmissao.getYear());
					    	System.out.printf("Data de vencimento %d/%d/%d.%n", dataVencimento.getDayOfMonth(), dataVencimento.getMonthValue(),dataVencimento.getYear());
					    	System.out.printf("Valor do documento %.2f%n", recarga);
					    	System.out.printf("Nao receber apos  %d/%d/%d.%n", dataVencimento.getDayOfMonth(), dataVencimento.getMonthValue(),dataVencimento.getYear());
				    	}
				    	
				    	break;
				    
				    default:
				      System.out.printf("Escolha uma forma de pagamento");	
				} // Fim do Switch
				
				if(flag == 1) {
					System.out.printf("Codigo de transação:");
					for (i = 0; i < count; i++) {
			    	      codBoleto[i] = random.nextInt(max);
			    	      System.out.printf("%d", codBoleto[i]);	
					}
					System.out.printf("%n%n");
				}
			}
		}
		
		if(flagCPF == 0)
			System.out.printf("CPF nao encontrado!");
	} 
}