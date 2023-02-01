package sistemaPagamentoTransporte;

import java.util.*;

public class ExecutarPedro {
	
	static ArrayList<OperadorSistema> opSis = new ArrayList<OperadorSistema>(); // Talvez vire Funcionario ou Pessoa
	static ArrayList<Infraestrutura> infra = new ArrayList<Infraestrutura>();

	public static void main(String[] args) {
		
		// ************************    ArrayLists    ************************ //
		
/*		ArrayList<Linha> linha = new ArrayList<Linha>();
		ArrayList<Empresa> emp = new ArrayList<Empresa>();
		ArrayList<Veiculo> veic = new ArrayList<Veiculo>(); */
		
		Scanner input = new Scanner(System.in);
				
		// ************************    Teste Inicial    ************************ //
		
		OperadorSistema OpSis1 = new OperadorSistema(123654, "Analista");
		
		opSis.add(OpSis1);
		
		//System.out.printf("A matricula do Operador e %d e o cargo e %s.", opSis.get(0).getMatricula(), opSis.get(0).getCargo());
		
		//Alterar o cargo do operador
		opSis.get(0).setCargo("Engenheiro Junior");
		
		//System.out.printf("A matricula do Operador e %d e o cargo e %s.", opSis.get(0).getMatricula(), opSis.get(0).getCargo());

		
		// ************************    Implementacao    ************************ //
		
		// INICIO Criar uma Infra
		
		infra.add(opSis.get(0).criaInfraestrutura());
		
		//System.out.printf("Infraestrutura criada com sucesso!%nID: %d.%nLocal: %s.%nTipos de Veiculos: %s.%n",
		//		infra.get(0).getIdInfraestrutura(), infra.get(0).getLocal(), infra.get(0).getTipoVeiculosAtendidos());
		//System.out.printf("Linhas atendidas: " + Arrays.toString(infra.get(0).getLinhasAtendidas().toArray()).replaceAll("[\\[\\]]", "") + ".%n");
		
		infra.add(opSis.get(0).criaInfraestrutura());
		
		//infra.add(opSis.get(0).criaInfraestrutura());
		
		// FIM Criar uma Infra
		
		// INICIO Desativa Infra
		
		int tamanho, i;
		int flag = 0;
		String confirmacao;
		
		tamanho = infra.size();
		System.out.printf("Tamanho do vetor infra e de %d", tamanho);
		
		System.out.printf("%nDigite o codigo da Infraestrutura a ser desativada.%n");
		int idInfraestrutura = input.nextInt();
		
		for (i = 0; i < tamanho; i++) {			
			if (idInfraestrutura == infra.get(i).getIdInfraestrutura()) {
				
				System.out.printf("Infraestrutura encontrada!%nID: %d.%n", infra.get(i).getIdInfraestrutura());

				flag = 1;
			
				//System.out.printf("Deseja realmente excluir essa Infraestrutura?%nID: %d.%nLocal: %s.%nTipos de Veiculos: %s.%n",
				//infra.get(i).getIdInfraestrutura(), infra.get(i).getLocal(), infra.get(i).getTipoVeiculosAtendidos());
				//System.out.printf("Linhas atendidas: " + Arrays.toString(infra.get(i).getLinhasAtendidas().toArray()).replaceAll("[\\[\\]]", "") + ".%n");
				System.out.printf("%n[S] Sim%n[N] Nao.%n");
				input.nextLine(); // Para limpar o Scanner
				confirmacao = input.nextLine();
				
				if (confirmacao.equals("S") || confirmacao.equals("s")) {
					System.out.printf("Infraestrutura %d excluida com sucesso!%n", infra.get(i).getIdInfraestrutura());
					
					infra.remove(i);
				}
				else {
					System.out.printf("Operacao abortada!%n", infra.get(i).getIdInfraestrutura());
				}
				break;
			}
		}
		
		if (flag == 0)
			System.out.printf("Infraestrutura nao encontrada!");
		
		// FIM Desativa Infra
	}

}
