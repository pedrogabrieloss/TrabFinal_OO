package sistemaPagamentoTransporte;

import java.util.*;

public class OperadorSistema extends Funcionario {
	
//****************************************** ATRIBUTOS ******************************************//
	
	
//****************************************** CONSTRUTORES ******************************************//
	

//*************************************** SETTERS & GETTERS ***************************************//
	

//******************************************** MÉTODOS ********************************************//

	public void criaInfraestrutura() {
		//************************ VARIÁVEIS LOCAIS ************************//
		String local, tipoVeiculosAtendidos, escolha;
		ArrayList<Integer> linhasAtendidas = new ArrayList<Integer>();
		int idInfraestrutura, qntdPassageiros;
		
		//*********** OBTER AS INFORMAÇÕES DA NOVA INFRAESTRUTURA ***********//
		
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%nDigite o numero identificador da Infraestrutura.%n");
		idInfraestrutura = input.nextInt();
		
		input.nextLine(); // Para limpar o Scanner
		
		System.out.printf("%nDigite o local da Infraestrutura.%n");
		local = input.nextLine();
				
		System.out.printf("%nDigite o(s) tipo(s) de veículo(s) que opera(m) nessa Infraestrutura.");
		tipoVeiculosAtendidos = input.nextLine();
			
		do {
			
			System.out.printf("%nDigite uma linha que opera nessa Infraestrutura.%n");
			linhasAtendidas.add(input.nextInt()); // PODE SER QUE ISSO NÃO SEJA VÁLIDO
			
			input.nextLine(); // Para limpar o Scanner
			
			System.out.printf("%nDeseja adicionar mais linhas que operam aqui?%n [S] Sim.%n[N] Nao.");
			escolha = input.nextLine();
			
		} while (escolha.equals("S") || escolha.equals("s"));
		
		System.out.printf("%nDigite a quantidade de passageiros que utilizam essa Infraestrutura.%n");
		qntdPassageiros = input.nextInt();
		
		//*********** CRIAR UMA NOVA INFRAESTRUTURA ***********//
		
		Infraestrutura XX = new Infraestrutura(local, tipoVeiculosAtendidos, linhasAtendidas, idInfraestrutura, qntdPassageiros);
		//Como nomear a nova Infraestrutura para que eu possa criar várias com esse método?
		//A intenção pe criar uma nova Infraestrutura sempre que o Op. do Sistema quiser.
	}
	
	public void desativaInfraestrutura(int codigo) {
		//************************ VARIÁVEIS LOCAIS ************************//
		//??????????????????????//
		
		//*********** CONFIRMAR INFRAESTRUTURA A SER DESATIVADA ***********//
		
		//Procurar a Infra pelo número do código
		//Confirmar se deseja excluir a parada de código tal, informações tal e tal
		//Excluir ela do banco de dados
	}
	
	public int verificaQntdUsuarios() {
		
		//************************ VARIÁVEIS LOCAIS ************************//
		int abrangencia, aux, codigo, passageiros;
		
		//*********** EXECUÇÃO ***********//
		
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
	}
	
	public void alteraAtributoLinha() {
		
		//************************ VARIÁVEIS LOCAIS ************************//
		int codigo, selecao;
		String escolha;
		
		//*********** EXECUÇÃO ***********//
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
		
		
	}
}
