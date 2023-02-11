package sistemaPagamentoTransporte;

import java.util.*;

public class OperadorSistema extends Funcionario {
	
//****************************************** ATRIBUTOS ******************************************//
	
//****************************************** CONSTRUTORES ******************************************//
	OperadorSistema(int matricula, String cargo, String nome, String endereco, double contato, String email, char sexo) {
		super(matricula, cargo, nome, endereco, contato, email, sexo);
	}

//*************************************** SETTERS & GETTERS ***************************************//
	
//******************************************** MÉTODOS ********************************************//

	public Infraestrutura criaInfraestrutura() {
		
		//************************ VARIÁVEIS LOCAIS ************************//
		String local, tipoVeiculosAtendidos, escolha;
		ArrayList<Integer> linhasAtendidas = new ArrayList<Integer>();
		int idInfraestrutura;
		
		//*********** OBTER AS INFORMAÇÕES DA NOVA INFRAESTRUTURA ***********//
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o numero identificador da Infraestrutura.%n");
		idInfraestrutura = input.nextInt();
		
		input.nextLine(); // Para limpar o Scanner
		
		System.out.printf("%nDigite o local da Infraestrutura.%n");
		local = input.nextLine();
				
		System.out.printf("%nDigite o(s) tipo(s) de veiculo(s) que opera(m) nessa Infraestrutura.%n");
		tipoVeiculosAtendidos = input.nextLine();
			
		do {
			
			System.out.printf("%nDigite uma linha que opera nessa Infraestrutura.%n");
			linhasAtendidas.add(input.nextInt());
			
			input.nextLine(); // Para limpar o Scanner
			
			System.out.printf("%nDeseja adicionar mais linhas que operam aqui?%n[S] Sim.%n[N] Nao.%n");
			escolha = input.nextLine();
			
		} while (escolha.equals("S") || escolha.equals("s"));
		
		// Criando um objeto Infraestrutura
		
		Infraestrutura infra = new Infraestrutura(local, tipoVeiculosAtendidos, linhasAtendidas, idInfraestrutura);
		
		System.out.printf("Infraestrutura criada com sucesso!%nID: %d.%nLocal: %s.%nTipos de Veiculos: %s.%n",
				infra.getIdInfraestrutura(), infra.getLocal(), infra.getTipoVeiculosAtendidos());
		System.out.printf("Linhas atendidas: " + Arrays.toString(infra.getLinhasAtendidas().toArray()).replaceAll("[\\[\\]]", "") + ".%n");
		
		return infra;
	}

	
	public void desativaInfraestrutura(ArrayList<Infraestrutura> infra) { 
		
		//************************ VARIÁVEIS LOCAIS ************************//
		int idInfraestrutura, i;
		int flag = 0;
		String confirmacao;
		
		//************************ EXECUÇÃO ************************//
		
		Scanner input = new Scanner(System.in);

		System.out.printf("Tamanho do vetor infra e de %d", infra.size());
		
		System.out.printf("%nDigite o codigo da Infraestrutura a ser desativada.%n");
		idInfraestrutura = input.nextInt();
		
		for (i = 0; i < infra.size(); i++) {			
			if (idInfraestrutura == infra.get(i).getIdInfraestrutura()) {
				
				System.out.printf("Infraestrutura encontrada!%nID: %d.%n", infra.get(i).getIdInfraestrutura());

				flag = 1;
			
				System.out.printf("Deseja realmente excluir essa Infraestrutura?%nID: %d.%nLocal: %s.%nTipos de Veiculos: %s.%n",
						infra.get(i).getIdInfraestrutura(), infra.get(i).getLocal(), infra.get(i).getTipoVeiculosAtendidos());
				System.out.printf("Linhas atendidas: " + Arrays.toString(infra.get(i).getLinhasAtendidas().toArray()).replaceAll("[\\[\\]]", "") + ".%n");
				System.out.printf("%n[S] Sim.%n[N] Nao.%n");
				input.nextLine(); // Para limpar o Scanner
				confirmacao = input.nextLine();
				
				if (confirmacao.equals("S") || confirmacao.equals("s")) {
					System.out.printf("Infraestrutura %d excluida com sucesso!%n", infra.get(i).getIdInfraestrutura());
					
					infra.remove(i);
				}
				else {
					System.out.printf("Operacao abortada!%n");
				}
				break;
			}
		}
		
		if (flag == 0)
			System.out.printf("Infraestrutura nao encontrada!");

	}
	
	/*public Empresa criaEmpresa() {

		// ************************ VARIÁVEIS LOCAIS ************************ //
		String nome, cnpj;
		
		// *********** OBTER AS INFORMAÇÕES DA NOVA EMPRESA *********** //
		
		Scanner input = new Scanner(System.in);
		
		input.nextLine(); // Para limpar o Scanner
		
		System.out.printf("%nDigite o nome da Empresa: ");
		nome = input.nextLine();
		
		System.out.printf("%nDigite o CNPJ da Empresa: ");
		cnpj = input.nextLine();
		
		Empresa emp = new Empresa(nome, cnpj);
		
		System.out.printf("Empresa cadastrada com sucesso!%nNome: %s.%nCNPJ: %s.%n", emp.getNome(), emp.getCnpj());
		
		return emp;
	} /*
	
	/*public void descadastraEmpresa(ArrayList<Empresa> emp) {

		// ************************ VARIÁVEIS LOCAIS ************************ //
		//int i;
		//int flag = 0;
		flag = 0;
		//String confirmacao, cnpj;
		
		// ************************ DESCADASTRAR EMPRESA ************************ //
		
		System.out.printf("Tamanho do vetor emp e de %d", emp.size());
		
		input.nextLine(); // Para limpar o Scanner
		
		System.out.printf("%nDigite o CNPJ da Empresa a ser retirada do sistema.%n");
		cnpj = input.nextLine();
		
		for (i = 0; i < emp.size(); i++) {			
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
	}*/
	
	public void verificaQntdUsuarios(ArrayList<Linha> linha) { 
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int abrangencia, codigo, i;
		int passageiros = 0;
		int flag = 0;
		String confirmacao;
		
		// *********** EXECUÇÃO *********** //
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDeseja pesquisar a quantidade de passageiros de uma linha especifica ou de todo o sistema?%n"
				+ "[1] Linha especifica.%n[0] Todo o sistema.");
		abrangencia = input.nextInt();
		
		if (abrangencia == 1) {
			do {
				System.out.printf("%nDigite o codigo da Linha%n");
				codigo = input.nextInt();
				
				for (i = 0; i < linha.size(); i++) {			
					if (codigo == linha.get(i).getCodigo()) {
						
						System.out.printf("Quantidade de passageiros da linha %i: %i.%n", linha.get(i).getCodigo(), linha.get(i).getQntdPassageiros());
		
						flag = 1;
						break;
					}
				}
			
				if (flag == 0)
					System.out.printf("Linha nao encontrada!");
				
				System.out.printf("Deseja  pesquisar a quantidade de passageiros de outra linha especifica?%n[S] Sim.%n[N] Nao.%n");
				input.nextLine(); // Para limpar o Scanner
				confirmacao = input.nextLine();	
			}while(confirmacao.equals("S") || confirmacao.equals("s"));
		}
		
		else {
			for (i = 0; i < linha.size(); i++) {			
				passageiros = passageiros + linha.get(i).getQntdPassageiros();
			}
			System.out.printf("Quantidade de passageiros do sistema: %i.%n", passageiros);
		}
	}
	
	public void alteraAtributoLinha(ArrayList<Linha> linha) {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int codigo, pontos, i, aux;
		int flag = 0, escolha;
		String confirmacao;
		ArrayList<Integer> traj = new ArrayList<Integer>();
		
		// *********** EXECUÇÃO *********** //
		
		Scanner input = new Scanner(System.in);
		
		//System.out.printf("Tamanho do vetor Linha e de %d", linha.size());
		
		System.out.printf("%nDigite o codigo da Linha.%n");
		codigo = input.nextInt();
		
		for (i = 0; i < linha.size(); i++) {			
			if (codigo == linha.get(i).getCodigo()) {

				flag = 1;
				
				do {
					System.out.printf("%nEscolha um valor para alterar algum atributo ou [0] para SAIR.%n[1] CODIGO.   (Atual: %d).%n"
							+ "[2] EMPRESAS AUTORIZADAS a operar essa linha.   (Atual: %s).%n[3] TARIFA.   (Atual: %.2f).%n", 
							linha.get(i).getCodigo(), linha.get(i).getEmpresasAutorizadas(), linha.get(i).getTarifa());
					System.out.printf("[4] TRAJETO.    (Atual: " + Arrays.toString(linha.get(i).getTrajeto().toArray()).replaceAll(""
							+ "[\\[\\]]", "") + ").%n");
					escolha = input.nextInt();
					
					switch(escolha) {
						case 1:
							System.out.printf("Digite o novo codigo%n");
							linha.get(i).setCodigo(input.nextInt());
							
							System.out.printf("Codigo alterado com sucesso!%n");	
							input.nextLine(); // Para limpar o Scanner
							break;
							
						case 2:
							input.nextLine(); // Para limpar o Scanner
							System.out.printf("Digite a(s) nova(s) empresa(s) autorizada(s) a operar nessa Linha%n");
							linha.get(i).setEmpresasAutorizadas(input.nextLine());

							System.out.printf("Empresas alteradas com sucesso!%n");
							break;
					
						case 3:
							System.out.printf("Digite o novo valor da tarifa%n");
							linha.get(i).setTarifa(input.nextInt());

							System.out.printf("Tarifa alterada com sucesso!%n");
							input.nextLine(); // Para limpar o Scanner
							break;
							
						case 4:	
							System.out.printf("%nQuantas Infraestruturas estao incluidas no trajeto?%n");
							pontos = input.nextInt();
							
							for(i = 0; i < pontos; i++) {
								System.out.printf("%nDigite o ID da %da Infraestrutura.%n", i+1);
								aux = input.nextInt();
								
								// Verificar se essa Infra existe
								
								traj.add(aux);
							}
							linha.get(i).setTrajeto(traj);
							break;
							
						default:
							System.out.printf("Operacao abortada!%n");
					}
					
					System.out.printf("%nDeseja alterar algum outro atributo?%n[S] Sim%n[N] Nao.%n");
					confirmacao = input.nextLine();
					
				}while(confirmacao.equals("S") || confirmacao.equals("s"));
			}
		}
		
		if (flag == 0)
			System.out.printf("%nLinha nao encontrada!%n");
	}
	
	// PENSAR NO MÉTODO consultaFinanca()
	
	public Contrato fazContrato(){
		
		//************************ VARIÁVEIS LOCAIS ************************//
		String cnpjEmp, tipoVeic;
		int qntdVeic, anos;
		double valorCont, numCont;
		
		//*********** OBTER AS INFORMAÇÕES DA NOVA INFRAESTRUTURA ***********//
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o numero do Contrato.%n");
		numCont = input.nextDouble();
		
		input.nextLine(); // Para limpar o Scanner
		
		System.out.printf("%nDigite o CNPJ da Empresa.%n");
		cnpjEmp = input.nextLine();
		
		System.out.printf("%nDigite o valor do Contrato.%n");
		valorCont = input.nextDouble();
		
		System.out.printf("%nDigite o tempo de vigencia do Contrato (em anos).%n");
		anos = input.nextInt();
				
		System.out.printf("%nDigite o tipo de veiculo alvo do Contrato.%n");
		tipoVeic = input.nextLine();
		
		System.out.printf("%nDigite a quantidade contratual de veiculos da frota.%n");
		qntdVeic = input.nextInt();
		
		// Criando um objeto Contrato
		
		Contrato cont = new Contrato(cnpjEmp, tipoVeic, qntdVeic, numCont, valorCont, anos);
		
		System.out.printf("%nContrato estabelecido com sucesso!%nNumero do Contrato: %.0f.%nCNPJ da Empresa: %s.%n"
				+ "Valor: %.2f.%nTipo de veiculo: %s.%nQuantida de veiculos da frota: %d.%n",
				cont.getNumContrato(), cont.getCnpjEmpresa(), cont.getValorContrato(), cont.getTipoVeiculo(), cont.getQntdVeiculos());
		
		System.out.printf("Data de vencimento: %d/%d/%d", cont.getDataVencimento().getDayOfMonth(), 
				cont.getDataVencimento().getMonthValue(), cont.getDataVencimento().getYear());
		
		return cont;	
	}
	
	public Usuario cadastraUsuario() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		String cpf, email, nome, endereco;
		char sexo;
		int diaN, mesN, anoN;
		Double contato;
		
		// *********** EXECUÇÃO *********** //
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nInsira o CPF do novo usuario: ");
		cpf = input.nextLine();
		
		System.out.printf("%nInsira o nome do novo usuario: ");
		nome = input.nextLine();
		
		System.out.printf("%nInsira o genero do usuario.%n[F] Feminino.%n[M] Masculino.%n");
		sexo = input.next().charAt(0);
		
		System.out.printf("%nInsira o DIA DE NASCIMENTO do novo usuario: ");
		diaN = input.nextInt();
		
		System.out.printf("%nInsira o MES DE NASCIMENTO desse usuario (por favor, utilize numeros): ");
		mesN = input.nextInt();
		
		System.out.printf("%nInsira o ANO DE NASCIMENTO desse usuario: ");
		anoN = input.nextInt();
		
		System.out.printf("%nInsira agora o endereco: ");
		input.nextLine(); // Limpeza do buffer
		endereco = input.nextLine();
		
		System.out.printf("%nInsira o e-mail do novo usuario: ");
		email = input.nextLine();
		
		System.out.printf("%nInsira o numero de telefone do novo usuario (somente numeros): ");
		contato = input.nextDouble();
		
		Usuario user = new Usuario(cpf, nome, endereco, contato, email, sexo);
		
		user.setDataDeNascimento(diaN, mesN, anoN);
		
		System.out.printf("%nUsuario cadastrado com sucesso!%nCPF: %s.%nNome: %s.%nGenero: %c.%nEndereco: %s.%n"
				+ "E-mail: %s.%nContato %.0f.%n", user.getCpf(), user.getNome(), user.getSexo(), user.getEndereco(),
				user.getEmail(), user.getContato());
		System.out.printf("Data de nascimento: %d/%d/%d%n", user.getDataDeNascimento().getDayOfMonth(),
				user.getDataDeNascimento().getMonthValue(), user.getDataDeNascimento().getYear());
		
		return user;
	}
	
	public void criaBilheteUnico(ArrayList<Usuario> user) {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		String tipo, status, cpf;
		double codigo, saldo;
		int i;
		int flag = 0;
		ArrayList<BilheteUnico> bilhete = new ArrayList<BilheteUnico>();
		
		// *********** EXECUÇÃO *********** //
		Scanner input = new Scanner(System.in);
		//
		System.out.printf("%nDigite o CPF do Usuario proprietario do novo Bilhete Unico.%n");
		cpf = input.nextLine();
		
		for (i = 0; i < user.size(); i++) {			
			if (cpf.equals(user.get(i).getCpf())) {
				flag = 1;

				System.out.printf("%nInsira o tipo do Bilhete Unico a ser criado.%n"); // Talvez usar int e fazer essa pergunta como múltipla escolha
				tipo = input.nextLine();
				
				System.out.printf("%nInsira o codigo do Bilhete Unico.%n");
				codigo = input.nextDouble();
				
				status = "Ativo";
				
				System.out.printf("%nInsira o valor a ser adicionado ao Bilhete.%n");
				saldo = input.nextDouble();
				
				bilhete.add(user.get(i).atrelaBilheteUsuario(codigo, saldo, tipo, status));
				
				System.out.printf("%nBilhete criado com sucesso!%n");	
				
				System.out.printf("Codigo: %.0f.%nSaldo: %.2f.%nTipo: %s.%n", bilhete.get(0).getCodigo(), bilhete.get(0).getSaldo(), bilhete.get(0).getTipo());
			}
		}
		if (flag == 0)
			System.out.printf("%nCPF nao encontrado!.%n");
	}
	
	public void cancelaBilheteUnico(ArrayList<Usuario> user) {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int i, aux;
		int flagCPF = 0;
		int flagBilhete = 0;
		double codigo;
		String confirmacao, cpf;
		
		// *********** EXECUÇÃO *********** //
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o CPF do Usuario proprietario do Bilhete Unico a ser cancelado.%n");
		cpf = input.nextLine();
		
		for (i = 0; i < user.size(); i++) {			
			if (cpf.equals(user.get(i).getCpf())) {
				flagCPF = 1;
				
				System.out.printf("%nDigite o codigo do Bilhete Unico a ser cancelado.%n");
				codigo = input.nextDouble();

				user.get(i).removeBilhete(codigo);
			}
		}
		
		if(flagCPF == 0)
			System.out.printf("CPF nao encontrado!");
	}
	
	public void addSaldo(ArrayList<Usuario> user) {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int i, aux;
		int flagCPF = 0;
		int flagBilhete = 0;
		String confirmacao, cpf;
		
		// *********** EXECUÇÃO *********** //
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o CPF do Usuario proprietario do Bilhete Unico a ser recarregado.%n");
		cpf = input.nextLine();
		
		for (i = 0; i < user.size(); i++) {			
			if (cpf.equals(user.get(i).getCpf())) {
				flagCPF = 1;
				
				user.get(i).addSaldoBilhete();
			}
		}
		
		if(flagCPF == 0)
			System.out.printf("CPF nao encontrado!");
	}
	
	public void consultaBilhete(ArrayList<Usuario> user) {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int i;
		int flag = 0;
		double codigo;
		String cpf;
		
		// *********** EXECUÇÃO *********** //
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o CPF do Usuario proprietario do Bilhete Unico a ser consultado.%n");
		cpf = input.nextLine();
		
		for (i = 0; i < user.size(); i++) {			
			if (cpf.equals(user.get(i).getCpf())) {
				flag = 1;
				
				user.get(i).consBilhete();
			}
		}
		
		if(flag == 0)
			System.out.printf("CPF nao encontrado!");
	}
	
	public Linha criaLinha() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int codigo, pontos, aux, cont;
		String empresa;
		ArrayList<Integer> traj = new ArrayList<Integer>();
		double tarifa;
		
		// *********** OBTER AS INFORMAÇÕES DA NOVA INFRAESTRUTURA *********** //
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o codigo da Linha.%n");
		codigo = input.nextInt();
		
		System.out.printf("%nDigite a tarifa dessa Linha.%n");
		tarifa = input.nextDouble();
		
		input.nextLine(); // Para limpar o Scanner
		
		System.out.printf("%nDigite a(s) empresa(s) responsavel(is) por essa Linha.%n");
		empresa = input.nextLine();
				
		System.out.printf("%nQuantas Infraestruturas estao incluidas no trajeto?%n");
		pontos = input.nextInt();
			
		for(cont = 0; cont < pontos; cont++) {
			System.out.printf("%nDigite o ID da %da Infraestrutura.%n", cont+1);
			aux = input.nextInt();
			
			// Verificar se essa Infra existe
			
			traj.add(aux);
		}
		
		// *********** CRIAR UMA NOVA LINHA *********** //
		
		Linha linha = new Linha(codigo, traj, empresa, 0, tarifa);
		
		return linha;
	}
	
}