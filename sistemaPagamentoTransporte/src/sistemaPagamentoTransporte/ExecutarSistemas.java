package sistemaPagamentoTransporte;

import java.util.*;
import java.time.*;

public class ExecutarSistemas {
	
	// ************************    ArrayLists    ************************ //
	
	static ArrayList<OperadorSistema> opSis = new ArrayList<OperadorSistema>();
	static ArrayList<Infraestrutura> infra = new ArrayList<Infraestrutura>();
	//static ArrayList<Empresa> emp = new ArrayList<Empresa>();
	static ArrayList<Linha> linha = new ArrayList<Linha>();
	static ArrayList<Usuario> user = new ArrayList<Usuario>();
	static ArrayList<BilheteUnico> bilhete = new ArrayList<BilheteUnico>();
	static ArrayList<Banco> bancos = new ArrayList<Banco>();

	public static void main(String[] args) {  // MAIN DO PROJETO INTEIRO
		
		// ************************    Variaveis    ************************ //
		
		int escolhaInterface, escolhaAmbiente, escolhaTarefa, aux;	
		
		// ************************    Execução    ************************ //
		
		OperadorSistema OpSis1 = new OperadorSistema(123654, "Gerente de Usuarios e Bilhetes");
		opSis.add(OpSis1);
		
		BilheteUnico bilhete1 = new BilheteUnico(456654, 20.50, "Especial", "Ativo");
		bilhete.add(bilhete1);
		
		BilheteUnico bilhete2 = new BilheteUnico(789987, 30, "Especial", "Ativo");
		bilhete.add(bilhete2);
		
		BilheteUnico bilhete3 = new BilheteUnico(123321, 120.50, "Especial", "Ativo");
		bilhete.add(bilhete3);
		
		
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
					System.out.printf("%nQual ambiente deseja acessar?%n[1] Gerenciamento de INFRAESTRUTURA.%n[2] Gerenciamento de LINHAS.%n"
							+ "[3] Gerenciamento de EMPRESAS.%n[4] Gerenciamento de USUARIOS e BILHETES.%n[0] Sair.%n");	
					escolhaAmbiente = input.nextInt();
					
					switch(escolhaAmbiente) {
					case 1: // Gerente de Infra
						do { // Prender no ambiente Gerente de Infra
			
							boolean existenciaGerenteInfra;
							existenciaGerenteInfra = false;
							
							for (aux = 0; aux < opSis.size(); aux++) {	// Verificar se já existe um operador do sistema com o cargo "Gerente de Infraestrutura"
								if (opSis.get(aux).getCargo().equals("Gerente de Infraestrutura")) {
									
									existenciaGerenteInfra = true; // Se já existir, existenciaGerenteInfra = true
									break; // O break é porque ao encontrar o primeiro Gerente de Infra, o for já é parado
								}
							}
							
							if(existenciaGerenteInfra == false) {
								System.out.printf("Ainda nao existem Gerentes de Infraestutura cadastrados. Para prosseguir, e necessario "
										+ "ao menos um. Transferindo para o ambiente de cadastro...%n");
								
								// Fazer o cadastro de um Gerente de Infra
								
								escolhaTarefa = 0;
							}
							
							else {
								System.out.printf("%nQue tarefa deseja realizar?%n[1] CRIAR Infraestrutura.%n[2] DESATIVAR Infraestrutura.%n[0] Sair.%n");	
								escolhaTarefa = input.nextInt();
								
								switch(escolhaTarefa) {
								case 1:
									opSis.get(aux).criaInfraestrutura();
									break;
									
								case 2:
									opSis.get(aux).desativaInfraestrutura(infra);
									break;
									
								default:
									break;
								} // Fim switch tarefas Gerente de Infra
							}
							
						}while(escolhaTarefa != 0);	
						
						break; // break do case 1 da escolha de ambiente (gerente de Infra)
						
					case 2:  // Gerente de Linhas
						do { // Prender no ambiente Gerente de Linhas
							
							boolean existenciaGerenteLinhas;
							existenciaGerenteLinhas = false;
							
							for (aux = 0; aux < opSis.size(); aux++) {	// 	Verificar se já existe um operador do sistema com o cargo "Gerente de Linhas"
								if (opSis.get(aux).getCargo().equals("Gerente de Linhas")) {
									
									existenciaGerenteLinhas = true; // Se já existir, existenciaGerenteLinhas = true
									break; // O break é porque ao encontrar o primeiro Gerente de Infra, o for já é parado
								}
							}
							
							if(existenciaGerenteLinhas == false) {
								System.out.printf("Ainda nao existem Gerentes de Linhas cadastrados. Para prosseguir, e necessario "
										+ "ao menos um. Transferindo para o ambiente de cadastro...%n");
								
								// Fazer o cadastro de um Gerente de Linha
								
								escolhaTarefa = 0;
							}
							
							else {
								System.out.printf("%nQue tarefa deseja realizar?%n[1] CRIAR Linha.%n[2] MODIFICAR / CONSULTAR uma Linha.%n[0] Sair.%n");
								escolhaTarefa = input.nextInt();
								
								switch(escolhaTarefa) {
								case 1:
									linha.add(opSis.get(aux).criaLinha());
									break;
									
								case 2:
									opSis.get(aux).alteraAtributoLinha(linha);
									break;
								
								default:
									break;
								} // Fim switch tarefas Gerente de Linha
							}
							
						}while(escolhaTarefa != 0);	// Prender no ambiente Gerente de Linha
						
						break; // break do case 2 da escolha de ambiente (gerente de Linha)
						
					case 3: // Gerente de Empresa
						do { // Prender no ambiente Gerente de Empresa
							
							boolean existenciaGerenteEmpresa;
							existenciaGerenteEmpresa = false;
							
							for (aux = 0; aux < opSis.size(); aux++) {	// 	Verificar se já existe um operador do sistema com o cargo "Gerente de Empresas"
								if (opSis.get(aux).getCargo().equals("Gerente de Empresas")) {
									
									existenciaGerenteEmpresa = true; // Se já existir, existenciaGerenteInfra = true
									break; // O break é porque ao encontrar o primeiro Gerente de Infra, o for já é parado
								}
							}
							
							if(existenciaGerenteEmpresa == false) {
								System.out.printf("Ainda nao existem Gerentes de Empresas cadastrados. Para prosseguir, e necessario "
										+ "ao menos um. Transferindo para o ambiente de cadastro...%n");
								
								// Fazer o cadastro de um Gerente de Empresa
								
								escolhaTarefa = 0;
							}
							
							else {
								System.out.printf("Que tarefa deseja realizar?%n[1] CADASTRAR Empresa.%n[2] DESCADASTRAR Empresa.%n[3] CONSULTAR "
										+ "FINCANCA de uma Empresa.%n[4] Estabelecer CONTRATO.%n[0] Sair.%n");	
								escolhaTarefa = input.nextInt();
								
								switch(escolhaTarefa) {
								case 1:
									
									//opSis.get(aux).criaEmpresa();
									break;
									
								case 2:
									
									//opSis.get(aux).descadastraEmpresa(emp);
									break;
									
								case 3:
									
									//opSis.get(aux).consultaFinanca();   ****************    ATENÇÃO!!!! MÉTODO AINDA NÃO IMPLEMENTADO   ***************
									break;
									
								case 4:
									
									//opSis.get(aux).fazContrato();  
									break;
									
								default:
									break;
								} // Fim switch tarefas Gerente de Empresa
							}
						
						}while(escolhaTarefa != 0);	// Prender no ambiente Gerente de Empresa
						
						break; // break do case 3 da escolha de ambiente (gerente de Empresa)
						
					case 4: //Gerente de Usuarios e Bilhetes
						do { // Prender no ambiente Gerente de Usuarios e Bilhetes

							boolean existenciaGerenteUsuarioBilhete;
							existenciaGerenteUsuarioBilhete = false;
							
							for (aux = 0; aux < opSis.size(); aux++) {	//Verificar se já existe um operador do sistema com o cargo "Gerente de Usuarios e Bilhetes"
								if (opSis.get(aux).getCargo().equals("Gerente de Usuarios e Bilhetes")) {
									
									existenciaGerenteUsuarioBilhete = true; // Se já existir, existenciaGerenteUsuarioBilhete = true
									break; // O break é porque ao encontrar o primeiro Gerente de Infra, o for já é parado
								}
							}
							
							if(existenciaGerenteUsuarioBilhete == false) {
								System.out.printf("Ainda nao existem Gerentes de Usuarios e Bilhetes cadastrados. Para prosseguir, e necessario "
										+ "ao menos um. Transferindo para o ambiente de cadastro...%n");
								
								// Fazer o cadastro de um Gerente de Usuarios e Bilhetes
								
								escolhaTarefa = 0;
							}
							
							else {
								System.out.printf("%nQue tarefa deseja realizar?%n[1] CADASTRAR Usuario.%n[2] CRIAR Bilhete Unico.%n[3] CANCELAR "
										+ "Bilhete Unico.%n[4] ADICIONAR RECARGA ao Bilhete Unico.%n[5] CONSULTA Bilhete Unico.%n[0] Sair.%n");	
								escolhaTarefa = input.nextInt();
								
								switch(escolhaTarefa) {
								case 1:	
									user.add(opSis.get(aux).cadastraUsuario());
									break;
									
								case 2:
									bilhete.add(opSis.get(aux).criaBilheteUnico());
									break;
									
								case 3:
									opSis.get(aux).cancelaBilheteUnico(bilhete);
									break;
									
								case 4:
									opSis.get(aux).addSaldo(bilhete);
									break;
									
								case 5:
									opSis.get(aux).consultaBilhete(bilhete);
									break;
									
								default:
									break;
								} // Fim switch tarefas Gerente de Usuario
							}
							
						}while(escolhaTarefa != 0);	// Prender no ambiente Gerente de Usuarios e Bilhetes
						
						break; // break do case 4 da escolha de ambiente (gerente de Usuarios e Bilhetes)
						
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

	}

}