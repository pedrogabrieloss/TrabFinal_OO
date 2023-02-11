package Transporte;

import java.util.*;

public class Funcionario extends Pessoa {
	 private int matricula;
	 private String cargo;

	  public Funcionario(int matricula, String cargo, String nome, String endereco, int contato, String email, char sexo) {
		super(nome, endereco, contato, email, sexo);
		this.matricula = matricula;
		this.cargo = cargo;
	}
	
//*****GETTER&SETTERS/////
	public int getMatricula() {
	 return matricula;
	}

	public String getCargo() {
	 return cargo;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	  // ******************* METODOS **********************//
	public void cadastraFuncionario() {
		String nome;
		String endereco;
		int contato;
		String email;
		char sexo;
		int matricula;
		String cargo;
		
		Scanner input = new Scanner(System.in);
	    
	    System.out.print("Digite o nome: ");
	    nome = input.nextLine();
	    
	    System.out.print("Digite o endereco: ");
	    endereco = input.nextLine();
	    
	    System.out.print("Digite o contato: ");
	    contato = input.nextInt();
	    
	    System.out.print("Digite o email: ");
	    email = input.nextLine();
	    
	    System.out.print("Digite o sexo: ");
	    sexo = input.next().charAt(0);
	    
	    System.out.print("Digite a matricula: ");
	    matricula = input.nextInt();
	   
	    System.out.print("Digite o cargo: ");
	    cargo = input.nextLine();
	    
	    Funcionario func = new Funcionario(matricula, cargo, nome, endereco, contato, email, sexo);
	  }

//*****METODO*****//
	 public void excluirFuncionario(ArrayList<Funcionario> func) {
	        int matriculaFunc, flagMatricula, aux1;
	 		String cargo;
	 		String confirmacao;
	 		
	 		 Scanner input = new Scanner(System.in);
	 		
	 		//************************ EXECUÇÃO ************************//
	 		
	 		System.out.printf("%nDigite a matricula do Funcionario a ser excluido.%n");
	 		matriculaFunc = input.nextInt();
	 		
	 		for (aux1 = 0; aux1 < func.size(); aux1++) {			
	 			if (matriculaFunc == func.get(aux1).getMatricula()) {
	 				
	 				System.out.printf("Matricula encontrada!%n", func.get(aux1).getMatricula());

	 				flagMatricula = 1;
	 			
	 				System.out.printf("Deseja realmente excluir esse Funcionario?%n");
	 				System.out.printf("%n[S] Sim.%n[N] Nao.%n");
	 				input.nextLine(); // Para limpar o Scanner
	 				confirmacao = input.nextLine();
	 				
	 				if (confirmacao.equals("S") || confirmacao.equals("s")) {
	 					System.out.printf("Funcionario %d excluido com sucesso!%n", func.get(aux1).getMatricula());
	 					
	 					func.remove(aux1);
	 				}
	 				else {
	 					System.out.printf("Operacao abortada!%n");
	 				}
	 				break;
	 			}
	 		}
	 		
	 		if (flagMatricula == 0)
	 			System.out.printf("Funcionario nao encontrado!");
	 }
}
