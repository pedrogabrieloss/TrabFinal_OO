package sistemaPagamentoTransporte;

import java.util.*;
import java.time.*; 

public class Banco {

	//****************************************** ATRIBUTOS ******************************************//	

	private String nome; 
	private int codigo;
	
	
	//****************************************** CONSTRUTORES ******************************************//		
	private Banco(String nome, int codigo) {
		this.nome = nome;
		this.codigo = codigo;
		
	}
	
	//*************************************** SETTERS & GETTERS ***************************************//

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private int getCodigo() {
		return codigo;
	}

	private void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	//******************************************** MÉTODOS ********************************************//	
	public void comprovantePagamento(ArrayList<BilheteUnico> bilhete) {
	 
	
		int tamanho, i, formaPg, anoVc, mesVc;
		int flag = 0;
		double codigo, recarga;
		String confirmacao; 
		confirmacao = "N";
		boolean status;
		LocalDate dataEmissao, dataVencimento;
		
		Random random = new Random(); //Gerando numeros aleatorio para o boleto
		int max = 100; //gera número aleatório entre 0 e 100
		int count = 35; //quantidade de números aleatório a serem gerados 
		
		int[] codBoleto = new int[count];
		
		Scanner input=new Scanner(System.in);
		
		System.out.printf("%nDigite o codigo do Bilhete a ser recarregado.%n");
		codigo = input.nextDouble();
		
		for (i = 0; i < 10; i++) {			
			if (codigo == bilhete.get(i).getCodigo()) {
				flag = 1;
				
				System.out.printf("Qual o valor da recarga?%n");
				recarga = input.nextDouble();
				
				System.out.printf("Qual a forma de pagamento?%n[1] Cartao de credito ou debito%n[2] PIX%n[3] Boleto%n[0] Sair");
				formaPg= input.nextInt();
				
				switch (formaPg) {
					    case 1:
					    	CartaoDebitoCredito cartao = new CartaoDebitoCredito();
					    	
						    System.out.printf("Digite o numero do cartao");
						    cartao.setId(input.nextInt());
						    
						    System.out.printf("Digite o mes de validade do cartao");							    
						    mesVc = input.nextInt();
						    
						    System.out.printf("Digite o ano de validade do cartao");							    
						    anoVc = input.nextInt();
						    
						    cartao.setCodValidade(mesVc, anoVc);
						    
						    System.out.printf("Digite o Codigo de segurança");
						    cartao.setCvv(input.nextInt());
						    
						    System.out.printf("Qual o tipo do cartao?%n[1]Credito%n[2]Debito%n");
						    cartao.setTipoCartao(input.nextInt()); 
						    
						   		    
						    if (cartao.getLimite()>= recarga) {
						    	System.out.printf("Deseja realmente adicionar %.2f ao bilhete abaixo?%n", recarga);
								System.out.printf("Codigo: %d.%nTipo: %s.%nSaldo: %.2f.%n", bilhete.get(i).getCodigo(), 
										bilhete.get(i).getTipo(), bilhete.get(i).getSaldo());
								System.out.printf("%n[S] Sim%n[N] Nao.%n");
								input.nextLine(); // Para limpar o Scanner
								confirmacao = input.nextLine(); 
						    }
						    else  {
						    	System.out.printf("O cartao informado nao possui limite! Operacao cancelada.%n");						    	
						    }
						    
						    break;
					   
					    case 2:
							System.out.printf("Deseja realmente adicionar %.2f ao bilhete abaixo?%n", recarga);
							System.out.printf("Codigo: %d.%nTipo: %s.%nSaldo: %.2f.%n", bilhete.get(i).getCodigo(), 
									bilhete.get(i).getTipo(), bilhete.get(i).getSaldo());
							System.out.printf("[S] Sim%n[N] Nao.%n");
							input.nextLine(); // Para limpar o Scanner
							confirmacao = input.nextLine();
												
					    	System.out.printf("Pagamento realizado com sucesso no valor %d", recarga);							    								    	
					    	break;
					    	
					    case 3:
							System.out.printf("Deseja realmente adicionar %.2f ao bilhete abaixo?%n", recarga);
							System.out.printf("Codigo: %d.%nTipo: %s.%nSaldo: %.2f.%n", bilhete.get(i).getCodigo(), 
									bilhete.get(i).getTipo(), bilhete.get(i).getSaldo());
							System.out.printf("[S] Sim%n[N] Nao.%n");
							input.nextLine(); // Para limpar o Scanner
							confirmacao = input.nextLine();
							
					    	dataEmissao = LocalDate.now();
					    	dataVencimento = LocalDate.now().plusDays(5);
					    	
					    	System.out.printf("Pagavel em qualquer agencia bancaria.%n");
					    	System.out.printf("Data de emissao %d / %d / %d.%n", dataEmissao.getDayOfMonth(), dataEmissao.getMonthValue(), dataEmissao.getYear());
					    	System.out.printf("Data de vencimento %d / %d / %d.%n", dataVencimento.getDayOfMonth(), dataVencimento.getMonthValue(),dataVencimento.getYear());
					    	System.out.printf("Valor do documento %.2f%n", recarga);
					    	System.out.printf("Nao receber apos  %d / %d / %d.%n", dataVencimento.getDayOfMonth(), dataVencimento.getMonthValue(),dataVencimento.getYear());
					
					    	break;
					    
					    default:
					      System.out.printf("Escolha uma forma de pagamento");	
					} // Fim do Switch
				
				if(confirmacao.equals("S") || confirmacao.equals("s")) {
					System.out.printf("Codigo de transação:");
					for (i = 0; i < count; i++) {
			    	      codBoleto[i] = random.nextInt(max);
			    	      System.out.printf("%d", codBoleto[i]);	
					}
					
					bilhete.get(i).setSaldo(bilhete.get(i).getSaldo() + recarga);
				   	System.out.printf("Valor adicionado com sucesso!%nNovo saldo: %.2f.%n", bilhete.get(i).getSaldo());
				}
				else {
					System.out.printf("Operacao cancelada!");
				}
			}
		}
		if(flag == 0) {
			System.out.printf("Bilhete nao encontrado!");
		}
	} 
}