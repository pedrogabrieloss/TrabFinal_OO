package sistemaPagamentoTransporte;

import java.util.*;
import java.time.*;

public class ExecutarPedro {
	
	// TENHO QUE CRIAR UM METODO "ESTABELECER CONTRATO"
	// SE PAH, ROLA UMA COMPOSIÇÃO ENTRE EMPRESA E CONTRATO
	
	// ************************    ArrayLists    ************************ //
	
	static ArrayList<OperadorSistema> opSis = new ArrayList<OperadorSistema>(); // Talvez vire Funcionario ou Pessoa
	static ArrayList<Infraestrutura> infra = new ArrayList<Infraestrutura>();
	//public static ArrayList<Empresa> emp = new ArrayList<Empresa>();
	//public static ArrayList<Linha> linha = new ArrayList<Linha>();
	//public static ArrayList<Usuario> user = new ArrayList<Usuario>();
	//public static ArrayList<BilheteUnico> bilhete = new ArrayList<BilheteUnico>();

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		// ************************    Teste Inicial    ************************ //
		
		OperadorSistema OpSis1 = new OperadorSistema(123654, "Gerente de Infraestrutura");
		opSis.add(OpSis1);
		
		OperadorSistema OpSis2 = new OperadorSistema(123987, "Gerente de Empresa");
		opSis.add(OpSis2);
		
		OperadorSistema OpSis3 = new OperadorSistema(123753, "Gestor de Usuarios");
		opSis.add(OpSis3);
		
		OperadorSistema OpSis4= new OperadorSistema(123951, "Gerente de Bilhetes");
		opSis.add(OpSis4);
		
		OperadorSistema OpSis5 = new OperadorSistema(123951, "Gerente de Linhas");
		opSis.add(OpSis5);
		
		//System.out.printf("A matricula do Operador e %d e o cargo e %s.", opSis.get(0).getMatricula(), opSis.get(0).getCargo());
		
		//Alterar o cargo do operador
		//opSis.get(0).setCargo("Engenheiro Junior");
		
		//System.out.printf("A matricula do Operador e %d e o cargo e %s.", opSis.get(0).getMatricula(), opSis.get(0).getCargo());
		
		// CRIANDO UMA LISTA DE INFRAESTRUTURAS PRA EU NÃO PRECISAR DIGITAR ENQUANTO FAÇO OS TESTES
		
		ArrayList<Integer> linhasAtendidas = new ArrayList<Integer>();
		
		Collections.addAll(linhasAtendidas, 810, 818, 823);
		Infraestrutura infra1 = new Infraestrutura("Park Shopping", "Onibus e metro", linhasAtendidas, 123);
		infra.add(infra1);
		linhasAtendidas.clear();
		
		Collections.addAll(linhasAtendidas, 205, 2051);
		Infraestrutura infra2 = new Infraestrutura("FGA", "Onibus", linhasAtendidas, 456);
		infra.add(infra2);
		linhasAtendidas.clear();
		
		Collections.addAll(linhasAtendidas, 8078, 87, 870, 8701);
		Infraestrutura infra3 = new Infraestrutura("Galenos", "Onibus", linhasAtendidas, 789);
		infra.add(infra3);
		linhasAtendidas.clear();
		
		Collections.addAll(linhasAtendidas, 809, 805, 205);
		Infraestrutura infra4 = new Infraestrutura("Recanto", "Onibus", linhasAtendidas, 741);
		infra.add(infra4);
		linhasAtendidas.clear();
		
		// ************************    Implementacao    ************************ //
		
//OK	// INICIO Criar uma Infra
		
		//infra.add(opSis.get(0).criaInfraestrutura());
		
		// FIM Criar uma Infra
		
		
//OK	// INICIO Desativa Infra

		// opSis.get(0).desativaInfraestrutura(infra);
		
		// FIM Desativa Infra
		
		
//OK_T	// INICIO Criar uma Empresa
		
		//emp.add(opSis.get(1).criaEmpresa());
		
		// FIM Criar uma Empresa
		
		
//OK_T	// INICIO Descadastrar uma Empresa
		
		// opSis.get(1).descadastraEmpresa(emp);
		
		/* !!!!!!!!!!!!!!!!!!!         TEORICAMENTE JÁ ESTÁ IMPLEMENTADA. PRECISO DA CLASSE EMPRESA PARA TESTAR       !!!!!!!!!!!!!!
		//int tamanho, i;
		//int flag = 0;
		flag = 0;
		//String confirmacao, cnpj;
		
		tamanho = emp.size();
		System.out.printf("Tamanho do vetor emp e de %d", tamanho);
		
		input.nextLine(); // Para limpar o Scanner
		
		System.out.printf("%nDigite o CNPJ da Empresa a ser retirada do sistema.%n");
		cnpj = input.nextLine();
		
		for (i = 0; i < tamanho; i++) {			
			if (cnpj == emp.get(i).getCnpj()) {
				
				//System.out.printf("Empresa encontrada!%nCNPJ: %s.%n", emp.get(i).getCnpj());

				flag = 1;
			
				System.out.printf("Deseja realmente excluir essa Empresa?%nCNPJ: %s.%nNome: %s.%n", emp.get(i).getCnpj(), emp.get(i).getNome());
				System.out.printf("%n[S] Sim%n[N] Nao.%n");
				confirmacao = input.nextLine();
				
				if (confirmacao.equals("S") || confirmacao.equals("s")) {
					System.out.printf("Empresa excluida com sucesso!%n");
					
					emp.remove(i);
				}
				else {
					System.out.printf("Operacao abortada!%n");
				}
				break;
			}
		}
		
		if (flag == 0)
			System.out.printf("Empresa nao encontrada!");
		*/
		// FIM Descadastrar uma Empresa
		
		
		// INICIO Verificar qntd de usuarios em uma linha
		
		// opSis.get(4).verificaQntdUsuarios(linha);
		
		// FIM Verificar qntd de usuarios em uma linha
		
		
		// INICIO Alterar atributos de Linha
		
		//opSis.get(4).alteraAtributoLinha(linha);
		/* !!!!!!!!!!!!!!!!!!!         TEORICAMENTE JÁ ESTÁ IMPLEMENTADA. PRECISO DA CLASSE LINHA PARA TESTAR       !!!!!!!!!!!!!!
		int tamanho, i;
		int flag = 0, escolha;
		String confirmacao;
		
		tamanho = linha.size();
		System.out.printf("Tamanho do vetor linha e de %d", tamanho);
		
		System.out.printf("%nDigite o codigo da Linha a ser alterada.%n");
		int codigo = input.nextInt();
		
		for (i = 0; i < tamanho; i++) {			
			if (codigo == linha.get(i).getCodigo()) {

				flag = 1;
				
				do {
					System.out.printf("Qual atributo deseja alterar?%n[1] Codigo   (Atual: %d).%n[2] Empresas autorizadas a operar essa linha:   (Atual: %s)."
							+ "%n[3] Tarifa:   (Atual:%d).%n", linha.get(i).getCodigo(), linha.get(i).getEmpresasAutorizadas(), linha.get(i).getTarifa());
					System.out.printf("[4] Trajeto:    (Atual:" + Arrays.toString(linha.get(i).getTrajeto().toArray()).replaceAll("[\\[\\]]", "") + ").%n[0] Cancelar.");
					escolha = input.nextInt();
					
					switch(escolha) {
						case 1:
							System.out.printf("Digite o novo codigo%n");
							linha.get(i).setCodigo(input.nextInt());
							break;
							
						case 2:
							input.nextLine(); // Para limpar o Scanner
							System.out.printf("Digite a(s) nova(s) empresa(s) autorizada(s) a operar nessa Linha%n");
							linha.get(i).setEmpresasAutorizadas(input.nextLine());
							break;
					
						case 3:
							System.out.printf("Digite o novo valor da tarifa%n");
							linha.get(i).setTarifa(input.nextInt());
							break;
							
						//case 4:    // VERIFICAR COM O RESPONSAVEL PELA CLASSE LINHAS COMO ELA CONSTRUIU O CODIGO PARA RECEBER O TRAJETO
							//System.out.printf("Digite a(s) nova(s) empresa(s) autorizada(s) a operar nessa Linha%n");
							//linha.get(i).setEmpresasAutorizadas(input.nextLine());
							//break;
							
						default:
							System.out.printf("Operacao abortada!%n");
					}
					
					input.nextLine(); // Para limpar o Scanner
					
					System.out.printf("%nDeseja alterar algum outro atributo?%n");
					System.out.printf("%n[S] Sim%n[N] Nao.%n");
					confirmacao = input.nextLine();
					
				}while(confirmacao.equals("S") || confirmacao.equals("s"));
			}
		}
		
		if (flag == 0)
			System.out.printf("Linha nao encontrada!");
		*/
		// FIM Alterar atributos de Linha
		
		
		// INICIO Criar um Usuario
		
		//user.add(opSis.get(2).criaUsuario());
		
		//System.out.printf("Usuario cadastrado com sucesso!%nCPF: %s.%nNome: %s.%nData de Nascimento: %date.%nContato: %d.%nEndereco: %s.%nE-mail: %s.%n",
		//		user.get(0).getCpf(), user.get(0).getDataNascimento(), user.get(0).getContato(), user.get(0).getEndereco(), user.get(0).getEmail());
		
		// FIM Criar um Usuario
		
		
		// INICIO Criar um Bilhete Unico
		
		//bilhete.add(opSis.get(4).criaBilheteUnico());
		
		//System.out.printf("Bilhete Unico criado com sucesso!%nCodigo: %d.%nTipo: %s.%nSaldo: %d.%n", 
		//		bilhete.get(0).getCodigo(), bilhete.get(0).getTipo(), bilhete.get(0).getSaldo());
		
		// FIM Criar um Bilhete Unico
		
		
		// INICIO Cancelar um Bilhete Unico
		
		//opSis.get(3).cancelaBilheteUnico(bilhete);
			
		// FIM Cancelar um Bilhete Unico
		
		
		// INICIO Add saldo a um Bilhete Unico
		
		//opSis.get(3).addSaldo(bilhete);
		
		/*
		int tamanho, i;
		int flag = 0;
		double codigo, recarga;
		String confirmacao;
		
		tamanho = bilhete.size();
		System.out.printf("Tamanho do vetor bilhete e de %d", tamanho);
		
		System.out.printf("%nDigite o codigo do Bilhete a ser recarregado.%n");
		codigo = input.nextDouble();
		
		for (i = 0; i < tamanho; i++) {			
			if (codigo == bilhete.get(i).getCodigo()) {

				flag = 1;
				
				System.out.printf("Qual o valor da recarga?%n");
				recarga = input.nextDouble();
				
				System.out.printf("Deseja realmente adicionar %d ao bilhete abaixo?%n", recarga);
				System.out.printf("Codigo: %d.%nTipo: %s.%nSaldo: %d.%n", bilhete.get(i).getCodigo(), 
						bilhete.get(i).getTipo(), bilhete.get(i).getSaldo());
				System.out.printf("%n[S] Sim%n[N] Nao.%n");
				input.nextLine(); // Para limpar o Scanner
				confirmacao = input.nextLine();
				
				if(confirmacao.equals("S") || confirmacao.equals("s")) {
					bilhete.get(i).setSaldo(bilhete.get(i).getSaldo() + recarga);
					
					System.out.printf("Valor adicionado com sucesso!%nNovo saldo: %d.%n", bilhete.get(i).getSaldo());
				}
				
				else {
					System.out.printf("Operacao cancelada!%nSaldo: %d.%n", bilhete.get(i).getSaldo());
				}
			}
		}
		
		if (flag == 0)
			System.out.printf("Bilhete nao encontrado!");
		*/
		
		// FIM Add saldo a um Bilhete Unico
		
		
		// INICIO Criar uma Linha
		
		//infra.add(opSis.get(4).criaLinha());
		
		//System.out.printf("Linha criada com sucesso!%nCodigo: %d.%nEmpresas autorizadas a operarem essa linha: %s.%nTarifas: %d.%n",
		//		linha.get(0).getCodigo(), linha.get(0).getEmpresasAutorizadas(), linha.get(0).getTarifa());
		//System.out.printf("Trajeto: " + Arrays.toString(linha.get(0).getTrajeto().toArray()).replaceAll("[\\[\\]]", "") + ".%n");
		
		// FIM Criar uma Linha
		
		
		
		// ************************    VALIDAÇÃO DE DADOS INSERIDOS PELO USUÁRIO   ************************ //
		
		// INICIO Não aceitar String sem texto
		/*
		public void setCargo(String cargo) {
			if(cargo.equals("")) {
				do {
					System.out.println("Esse campo nao pode ser vazio! Por favor, insira um texto valido.");
					cargo = input.nextLine();
				} while(cargo.equals(""));
			}
			this.cargo = cargo;
		}
		*/
		// FIM Não aceitar String sem texto
		
		
		/*public boolean valida(Aluno aluno) {

			String nome = aluno.getNome();

			return nome.matches("[A-Z][a-z]{1,}");

			}*/
		
		// opSis.get(0).testePassarClasse(infra);
		
	}

}
