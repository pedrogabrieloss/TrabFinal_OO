package Transporte;
import java.util.*;

public class Executar221007733 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

	    System.out.print("Qual o tipo de veiculo? ");
	    String tipo = input.nextLine();
	    System.out.print("Qual a ID do veiculo? ");
	    int id = input.nextInt();
	    System.out.print("Quantos passageiros o veiculo suporta? ");
	    int qtndPassageiros = input.nextInt();
	    

	    Veiculo veiculo = new Veiculo(tipo, id, qtndPassageiros);
	    System.out.print("Entre o preco da passagem: ");
	    double ticketPrice = input.nextDouble();
	    veiculo.cobrarPassagem(tarifa);
	    System.out.print("Entre o numero de passageiros que embarcaram: ");
	    int registeredPassengers = input.nextInt();
	    veiculo.registrarQtndPassageiros(qtndPassageiros);

	    Empresa empresa = new Empresa();
	    System.out.print("Entre o valor arrecadado com as passagens: ");
	    double valorArrecadadoPassagens = input.nextDouble();
	    double lucro = qtndPassageiros * valorArrecadadoPassagens;
	    System.out.println("O lucro com passagens foi de: " + lucro);

	    empresa.addValorArrecadadoPassagens(valorArrecadadoPassagens);
	    System.out.print("Entre o valor de manutencao: ");
	    double valorManutencao = input.nextDouble();
	    empresa.addValorManutencao(valorManutencao);
	    System.out.print("Entre o valor dos salarios: ");
	    double valorSalarios = input.nextDouble();
	    empresa.addValorSalarios(valorSalarios);
	    empresa.agendarVistoria();
	    empresa.atribuirVeiculosHorarios();
	    empresa.retirarVeiculoEmManutencao();
	    empresa.registrarDespesas();
	    empresa.confirmarSaidaEntradaOnibus();

	    Financa financa = new Financa();
	    financa.addEntradas(empresa.getValorArrecadadoPassagens());
	    financa.addSaidas(empresa.getValorManutencao() + empresa.getValorSalarios());
	    financa.fazRelatorio();

	    Funcionario funcionario = new Funcionario(matricula, cargo, nome, endereco, contato, email, sexo);
	    funcionario.cadastraFuncionario();
	    System.out.print("Entre o cargo: ");
	    String newCargo = input.nextLine();
	    funcionario.excluirFuncionario();

	    System.out.print("Entre a matricula: ");
	    int matricula = input.nextInt();
	    System.out.print("Entre o cargo: ");
	    input.nextLine();
	    String Cargo = input.nextLine();

	  }


}
