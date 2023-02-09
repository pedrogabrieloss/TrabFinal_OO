package sistemaPagamentoTransporte;

import java.util.*;
import java.time.*;

public class ExecutarSistemas {
	
	// ************************    ArrayLists    ************************ //
	
	//static ArrayList<OperadorSistema> opSis = new ArrayList<OperadorSistema>();
	//static ArrayList<Infraestrutura> infra = new ArrayList<Infraestrutura>();
	//static ArrayList<Empresa> emp = new ArrayList<Empresa>();
	//static ArrayList<Linha> linha = new ArrayList<Linha>();
	//static ArrayList<Usuario> user = new ArrayList<Usuario>();
	//static ArrayList<BilheteUnico> bilhete = new ArrayList<BilheteUnico>();
	

	public static void main(String[] args) {  // MAIN DO PROJETO INTEIRO
		
		// ************************    Variaveis    ************************ //
		
		int escolhaInterface, escolhaAmbiente, escolhaTarefa;
		
		
		// ************************    Execução    ************************ //
		
		Scanner input = new Scanner(System.in);
		
		// Definindo que interface vai simular, pois o sistema embora seja um só, possui vários entes que pode manipulá-lo.
		do {
			System.out.printf("Qual interface deseja simular?%n[1] Usuario utilizando o Bilhete Unico.%n[2] Usuario inserindo "
					+ "creditos no Bilhete Unico por um banco.%n[3] Op. do Sistema.%n[4] Empresa.%n[0] Sair.%n");	
			escolhaInterface = input.nextInt();
			
			switch(escolhaInterface) {  // Switch de interface
			case 1:
				System.out.printf("Aperte ENTER para simular o passageiro aproximando o Bilhete Unico de um validador.");
				input.nextLine(); // Limpar o buffer
				input.nextLine();
				
				// Código retirando o saldo do usuario
				// Se for em um transporte publico registrando um usuario na linha
				// registrar o horario que o usuario passou o cartao
				// ETC
				
				break;
				
			case 2:
				
				break;
				
			case 3:
				do { // Prender na interface o Op. do Sistema
					System.out.printf("Qual ambiente deseja acessar?%n[1] Gerenciamento de INFRAESTRUTURA.%n[2] Gerenciamento de LINHAS.%n"
							+ "[3] Gerenciamento de EMPRESAS.%n[4] Gerenciamento de USUARIOS e BILHETES.%n[0] Sair.%n");	
					escolhaAmbiente = input.nextInt();
					
					switch(escolhaAmbiente) {
					case 1: // Gerente de Infra
						do { // Prender no ambiente Gerente de Infra
							System.out.printf("Que tarefa deseja realizar?%n[1] CRIAR Infraestrutura.%n[2] DESATIVAR Infraestrutura.%n[0] Sair.%n");	
							escolhaTarefa = input.nextInt();
							
							switch(escolhaTarefa) {
							case 1:
								
								break;
								
							case 2:
								
								break;
								
							default:
								break;
							} // Fim switch tarefas Gerente de Infra
							
						}while(escolhaTarefa != 0);	
						
						break; // break do case 1 da escolha de ambiente (gerente de Infra)
						
					case 2:  // Gerente de Linhas
						do { // Prender no ambiente Gerente de Linhas
							System.out.printf("Que tarefa deseja realizar?%n[1] CRIAR Linha.%n[2] MODIFICAR uma Linha.%n[0] Sair.%n");	// NÃO DEVERIA TER UM DESATIVA LINHA?
							escolhaTarefa = input.nextInt();
							
							switch(escolhaTarefa) {
							case 1:
								
								break;
								
							case 2:
								
								break;
								
							default:
								break;
							} // Fim switch tarefas Gerente de Linha
							
						}while(escolhaTarefa != 0);	// Prender no ambiente Gerente de Linha
						
						break; // break do case 2 da escolha de ambiente (gerente de Linha)
						
					case 3: // Gerente de Empresa
						do { // Prender no ambiente Gerente de Empresa
							System.out.printf("Que tarefa deseja realizar?%n[1] CADASTRAR Empresa.%n[2] DESCADASTRAR Empresa.%n[3] CONSULTAR "
									+ "FINCANCA de uma Empresa.%n[4] Estabelecer CONTRATO.%n[0] Sair.%n");	
							escolhaTarefa = input.nextInt();
							
							switch(escolhaTarefa) {
							case 1:
								
								break;
								
							case 2:
								
								break;
								
							case 3:
								
								break;
								
							case 4:
								
								break;
								
							default:
								break;
							} // Fim switch tarefas Gerente de Empresa
						
						}while(escolhaTarefa != 0);	// Prender no ambiente Gerente de Empresa
						
						break; // break do case 3 da escolha de ambiente (gerente de Empresa)
						
					case 4: //Gerente de Usuario e Bilhetes
						do { // Prender no ambiente Gerente de Usuario e Bilhete
							System.out.printf("Que tarefa deseja realizar?%n[1] CADASTRAR Usuario.%n[2] CRIAR Bilhete Unico.%n[3] CANCELAR "
									+ "Bilhete Unico.%n[4] ADICIONAR RECARGA ao Bilhete Unico.%n[0] Sair.%n");	
							escolhaTarefa = input.nextInt();
							
							switch(escolhaTarefa) {
							case 1:
								
								break;
								
							case 2:
								
								break;
								
							case 3:
								
								break;
								
							case 4:
								
								break;
								
							default:
								break;
							} // Fim switch tarefas Gerente de Usuario
							
						}while(escolhaTarefa != 0);	// Prender no ambiente Gerente de Usuario e Bilhete
						
						break; // break do case 4 da escolha de ambiente (gerente de Usuario e Bilhete)
						
					default:
						
						break;
						
					} // Fim switch de ambiente do Op do Sistema
					
				}while(escolhaAmbiente != 0);	// Prender na interface o Op. do Sistema
				
				break; // Fim da interface do Op do Sistema (case 3 do switch de interface)

			case 4:
				
				break;
			
			default:
				break;
			} // Fim switch de interface
			
		}while(escolhaInterface != 0);
		//System.out.printf("SAIU DO DO-WHILE.");

	}

}