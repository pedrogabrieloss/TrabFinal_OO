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
			
			System.out.printf("%nDeseja adicionar mais linhas que operam aqui?%n");
			escolha = input.nextLine();
			
		} while (escolha.equals("S") || escolha.equals("s"));
		
		System.out.printf("%nDigite a quantidade de passageiros que utilizam essa Infraestrutura.%n");
		qntdPassageiros = input.nextInt();
		
		//*********** CRIAR UMA NOVA INFRAESTRUTURA ***********//
		
		Infraestrutura XX = new Infraestrutura(local, tipoVeiculosAtendidos, linhasAtendidas, idInfraestrutura, qntdPassageiros);
	}
	
}
