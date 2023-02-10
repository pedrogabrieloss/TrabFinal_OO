package sistemaPagamentoTransporte;

import java.util.*;

//public class OperadorSistema extends Funcionario {
public class OperadorSistema {
	
//****************************************** ATRIBUTOS ******************************************//
	int matricula;
	String cargo;
	
//****************************************** CONSTRUTORES ******************************************//
	OperadorSistema(int m, String c) {
		this.matricula = m;
		this.cargo = c;
	}

//*************************************** SETTERS & GETTERS ***************************************//
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
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
					System.out.printf("%nEscolha um valor para alterar algum atributo ou [0] para SAIR.%n[1] CODIGO.   (Atual: %d).%n[2] EMPRESAS AUTORIZADAS a operar essa linha.   (Atual: %s)."
							+ "%n[3] TARIFA.   (Atual: %.2f).%n", linha.get(i).getCodigo(), linha.get(i).getEmpresasAutorizadas(), linha.get(i).getTarifa());
					System.out.printf("[4] TRAJETO.    (Atual: " + Arrays.toString(linha.get(i).getTrajeto().toArray()).replaceAll("[\\[\\]]", "") + ").%n");
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
	
	// PENSAR NO MÉTODO fazContrato()
	
	/*public Usuario cadastraUsuario() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		String cpf, email, nome, endereco;
		char sexo;
		int contato, diaN, mesN, anoN;
		
		// *********** EXECUÇÃO *********** //
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nInsira o CPF do novo usuario: ");
		cpf = input.nextLine();
		
		System.out.printf("%nInsira o nome do novo usuario: ");
		nome = input.nextLine();
		
		System.out.printf("%nInsira o genero do usuario.%n[F] Feminino.%n%n[M] Masculino.%n");
		sexo = input.next().charAt(0);
		
		System.out.printf("%nInsira o DIA DE NASCIMENTO do novo usuario: ");
		diaN = input.nextInt();
		
		System.out.printf("%nInsira o MES DE NASCIMENTO desse usuario (por favor, utilize numeros): ");
		mesN = input.nextInt();
		
		System.out.printf("%nInsira o ANO DE NASCIMENTO desse usuario: ");
		anoN = input.nextInt();
		
		System.out.printf("%nInsira agora o endereco: ");
		endereco = input.nextLine();
		
		System.out.printf("%nInsira o e-mail do novo usuario: ");
		email = input.nextLine();
		
		System.out.printf("%nInsira o numero de telefone do novo usuário (somente numeros): ");
		contato = input.nextInt();
		
		Usuario user = new Usuario(cpf, nome, endereco, contato, email, sexo);
		
		user.setDataDeNascimento(diaN, mesN, anoN);
		
		return user;
	}*/
	
	public BilheteUnico criaBilheteUnico() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		String tipo, status;
		double codigo, saldo;
		
		// *********** EXECUÇÃO *********** //
		Scanner input = new Scanner(System.in);
		
		// TODO BILHETE UNICO DEVE PERTENCER A UM USUARIO. LOGO DEVERIA PERGUNTAR A QUEM ESSE BILHETE PERTENCE
		
		System.out.printf("%nInsira o tipo do Bilhete Unico a ser criado.%n"); // Talvez usar int e fazer essa pergunta como múltipla escolha
		tipo = input.nextLine();
		
		System.out.printf("%nInsira o codigo do Bilhete Unico.%n");
		codigo = input.nextDouble();
		
		status = "Ativo";
		
		System.out.printf("%nInsira o valor a ser adicionado ao Bilhete.%n");
		saldo = input.nextDouble();
		
		BilheteUnico bilhete = new BilheteUnico(codigo, saldo, tipo, status);
		
		System.out.printf("%nBilhete criado com sucesso!%n");	
		
		System.out.printf("Codigo: %.0f.%nSaldo: %.2f.%nTipo: %s.%n", bilhete.getCodigo(), bilhete.getSaldo(), bilhete.getTipo());	
		
		return bilhete;
	}
	
	public void cancelaBilheteUnico(ArrayList<BilheteUnico> bilhete) {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int i;
		int flag = 0;
		double codigo;
		String confirmacao;
		
		// *********** EXECUÇÃO *********** //
		
		Scanner input = new Scanner(System.in);
		//System.out.printf("Tamanho do vetor bilhete e de %d", bilhete.size());
		
		System.out.printf("%nDigite o codigo do Bilhete a ser cancelado.%n");
		codigo = input.nextDouble();
		
		for (i = 0; i < bilhete.size(); i++) {			
			if (codigo == bilhete.get(i).getCodigo()) {

				flag = 1;
				
				System.out.printf("Deseja realmente cancelar o Bilhete abaixo?%n");
				System.out.printf("Codigo: %d.%nTipo: %s.%nSaldo: %d.%n", bilhete.get(i).getCodigo(), 
						bilhete.get(i).getTipo(), bilhete.get(i).getSaldo());
				System.out.printf("%n[S] Sim%n[N] Nao.%n");
				input.nextLine(); // Para limpar o Scanner
				confirmacao = input.nextLine();
				
				if(confirmacao.equals("S") || confirmacao.equals("s")) {
					System.out.printf("Bilhete %.0f excluida com sucesso!%n", bilhete.get(i).getCodigo());
					
					bilhete.remove(i);
				}
				else {
					System.out.printf("Operacao abortada!%n");
				}
				break;
			}
		}
		
		if (flag == 0)
			System.out.printf("Bilhete nao encontrado!");
	}
	
	public void addSaldo(ArrayList<BilheteUnico> bilhete) {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int i;
		int flag = 0;
		double codigo, recarga;
		String confirmacao;
		
		// *********** EXECUÇÃO *********** //
		
		Scanner input = new Scanner(System.in);
		//System.out.printf("Tamanho do vetor bilhete e de %d", bilhete.size());
		
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
	
	public void consultaBilhete(ArrayList<BilheteUnico> bilhete) {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int i;
		int flag = 0;
		double codigo;
		
		// *********** EXECUÇÃO *********** //
		
		Scanner input = new Scanner(System.in);
		//System.out.printf("Tamanho do vetor bilhete e de %d", bilhete.size());
		
		System.out.printf("%nDigite o codigo do Bilhete a ser consultado.%n");
		codigo = input.nextDouble();
		
		for (i = 0; i < bilhete.size(); i++) {			
			if (codigo == bilhete.get(i).getCodigo()) {

				flag = 1;
		
				System.out.printf("Codigo: %.0f.%nTipo: %s.%nSaldo: %.2f.%nSituacao: %s.%n", bilhete.get(i).getCodigo(), 
						bilhete.get(i).getTipo(), bilhete.get(i).getSaldo(), bilhete.get(i).getStatus());
			}
		}
		
		if (flag == 0)
			System.out.printf("Bilhete nao encontrado!");
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