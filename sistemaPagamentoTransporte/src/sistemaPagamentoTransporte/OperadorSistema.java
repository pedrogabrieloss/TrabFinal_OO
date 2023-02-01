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
		
		//*********** CRIAR UMA NOVA INFRAESTRUTURA ***********//
		
		Infraestrutura Infra = new Infraestrutura(local, tipoVeiculosAtendidos, linhasAtendidas, idInfraestrutura);
		
		return Infra;

	}

	public void desativaInfraestrutura(int codigo) {
		//************************ VARIÁVEIS LOCAIS ************************//
		int idInfraestrutura, confirmacao, qntdInfraestrutura;
		boolean busca = false;
		
		//*********** OBTER AS INFORMAÇÕES DA NOVA INFRAESTRUTURA ***********//
		
		Scanner input = new Scanner(System.in);
		
		//qntdInfraestrutura = infra.size();
		
		System.out.printf("%nDigite o codigo da Infraestrutura a ser desativada.%n");
		idInfraestrutura = input.nextInt();
		
		//Procurar a Infra pelo número do código
		
		
		
		
		System.out.printf("%nDeseja realmente excluir a Infraestrutura %d?%n", idInfraestrutura);
		//System.out.printf("%nxxxxxxxxx%n"); EXIBIR OS DADOS DA INFRA A SER EXCLUIDA
		System.out.printf("%n[1] Sim%n[2] Nao.%n");
		confirmacao = input.nextInt();
		//Excluir ela do banco de dados
	}
	
	/*public Empresa criaEmpresa() {
		// ************************ VARIÁVEIS LOCAIS ************************ //
		String nome, cnpj;
		
		// *********** CONFIRMAR INFRAESTRUTURA A SER DESATIVADA *********** //
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o nome da Empresa.%n");
		nome = input.nextLine();
		
		System.out.printf("%nDigite o CNPJ da Empresa.%n");
		cnpj = input.nextLine();
		
		Empresa Emp = new Empresa(nome, cnpj);
		
		return Emp;
	} /*
	
	/*public void descadastraEmpresa() {
		// ************************ VARIÁVEIS LOCAIS ************************ //
		String cnpj;
		int confirmacao;
		
		// *********** CONFIRMAR INFRAESTRUTURA A SER DESATIVADA *********** //
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o CNPJ da Empresa que deseja descadastrar.%n");
		cnpj = input.nextLine();
		
		// Procurar nas empresas pelo CNPJ e excluir
		
		System.out.printf("%nDeseja realmente excluir a Empresa %s?%n", cnpj);
		//System.out.printf("%nxxxxxxxxx%n"); EXIBIR OS DADOS DA INFRA A SER EXCLUIDA
		System.out.printf("%n[1] Sim%n[2] Nao.%n");
		confirmacao = input.nextInt();
	}
	
	/*public int verificaQntdUsuarios() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int abrangencia, aux, codigo, passageiros;
		
		// *********** EXECUÇÃO *********** //
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDeseja pesquisar a quantidade de usuarios em linhas específicas ou de todo o sistema?%n"
				+ "[1] Linhas específicas.%n[0] Todo o sistema.");
		abrangencia = input.nextInt();
		
		if (abrangencia == 1) {
			System.out.printf("%nDigite em quantas linhas deseja realizar a pesquisa%n");
			abrangencia = input.nextInt();
			
			for (aux = 0; aux < abrangencia; aux++) {
				System.out.printf("%nDigite o codigo da linha%n");
				codigo = input.nextInt();
				
				// passageiros = buscaUsuarios(codigo);
				// Vai no vetor de Linhas e pesquisa pelo código, retornando o número de usuários
				
				System.out.printf("%nA linha %d possui %d passageiros diarios%n", codigo, passageiros);
			};
		}
		
		else {
			// Somatório do usuarios de todas as linhas. Percorrer o vetor e ir somando esse atributo
		}
	}/*
	
	/*public void alteraAtributoLinha() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int codigo, selecao;
		String escolha;
		
		// *********** EXECUÇÃO *********** //
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nQual linha você gostaria de alterar?%n");
		codigo = input.nextInt();
		
		do {
			System.out.printf("%nQual atributo você gostaria de alterar?%n[1] Horario.%n[2] Trajeto.%n[3] Empresa autorizada.%n"
				+ "[4] Tarifa.%n[5] Quantidade de passageiros.%n");
			selecao = input.nextInt();
			
			switch (selecao) {
			case 1:
				//
			case 2:
				//
			case 3:
				//
			case 4:
				//
			case 5:
				//
			default:
				System.out.printf("%nNenhum atributo foi alterado.%n");
			}
			
			input.nextLine(); // Para limpar o Scanner
			
			System.out.printf("%nDeseja alterar algum outro atributo?%n[S] Sim.%n[N] Nao.%n");
			escolha = input.nextLine();
			
		} while (escolha.equals("S") || escolha.equals("s"));
	}*/
	
	/*public Usuario cadastraUsuario() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		String id, email, nome;
		double contato;
//		private Date dataNascimento;
		// Se for muito complicado manipular as variáveis com Date, usar int e quebrar em dd, mm e ano.
		
		// *********** EXECUÇÃO *********** //
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nInsira o CPF do novo usuário.%n");
		id = input.nextLine();
		
		//System.out.printf("%nInsira a data de nascimento do usuário.%n");
		//dataNascimento = ???;
		
		System.out.printf("%nInsira o nome do novo usuário.%n");
		nome = input.nextLine();
		
		System.out.printf("%nInsira o e-mail do novo usuário.%n");
		email = input.nextLine();
		
		System.out.printf("%nInsira o número de telefone (somente numeros) do novo usuário.%n");
		contato = input.nextDouble();
		
		Usuario user = new Usuario(id/*, dataNascimento* /, nome, email, contato);
		
		return user;
	}*/
	
	/*public BilheteUnico criaBilheteUnico() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		String tipo, status;
		double codigo,saldo;
		
		// *********** EXECUÇÃO *********** //
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nInsira o tipo do Bilhete Unico a ser criado.%n"); // Talvez usar int e fazer essa pergunta como múltipla escolha
		tipo = input.nextLine();
		
		System.out.printf("%nInsira o codigo do Bilhete Unico.%n");
		codigo = input.nextDouble();
		
		status = "Ativo";
		
		System.out.printf("%nInsira o valor a ser adicionado ao Bilhete.%n");
		saldo = input.nextDouble();
		
		BilheteUnico bilhete = new BilheteUnico(tipo, codigo, status, saldo);
		
		return bilhete;
	}*/
	
	/*public void cancelaBilheteUnico() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		double codigo;
		
		// *********** EXECUÇÃO *********** //
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nInsira o codigo do Bilhete Unico a ser cancelado.%n");
		codigo = input.nextDouble();
		
		// Procura e seleciona o bilhete unico com o código informado
		
		BilheteUnicoXX.setStatus("Bloqueado");
	}*/
	
	/*public void addSaldo() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		double codigo, valor;
		
		// *********** EXECUÇÃO *********** //
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nInsira o codigo do Bilhete.%n");
		codigo = input.nextDouble();
		
		System.out.printf("%nInsira o valor a ser adicionado ao Bilhete.%n");
		valor = input.nextDouble();
		
		// Procura e seleciona o bilhete unico com o código informado
		
		BilheteUnicoXX.setSaldo(valor); //LEMBRAR QUE NA CLASSE TEM QUE SER SALDO+VALOR QUE ENTRAR
	}*/
	
	/*public Linha criaLinha() {
		
		// ************************ VARIÁVEIS LOCAIS ************************ //
		int codigo, qntdPassageiros, pontos, aux, cont;
		String empresa;
		ArrayList<Integer> traj = new ArrayList<Integer>();
		double tarifa;
		
		// *********** OBTER AS INFORMAÇÕES DA NOVA INFRAESTRUTURA *********** //
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o codigo da Linha.%n");
		codigo = input.nextInt();
		
		System.out.printf("%nDigite a tarifa dessa Linha.");
		tarifa = input.nextDouble();
		
		input.nextLine(); // Para limpar o Scanner
		
		System.out.printf("%nDigite a(s) empresa(s) responsável(is) por essa Linha.%n");
		empresa = input.nextLine();
				
		System.out.printf("%nQuantas Infraestruturas estão incluídas no trajeto?%n");
		pontos = input.nextInt();
			
		for(cont = 0; cont <= pontos; cont++) {
			System.out.printf("%nDigite o ID da %dª Infraestrutura.%n", cont+1);
			aux = input.nextInt();
			
			traj.add(aux);
		}
		
		
		// *********** CRIAR UMA NOVA LINHA *********** //
		
		Linha linha = new Linha(codigo, tarifa, empresa, pontos, traj);
		
		return linha;
	}*/
}