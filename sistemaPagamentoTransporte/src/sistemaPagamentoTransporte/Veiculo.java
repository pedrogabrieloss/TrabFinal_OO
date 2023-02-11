package sistemaPagamentoTransporte;

import java.util.*;

public class Veiculo {
//********ATRIBUTOS********//
	private String tipo;
    private int id;
    private int qntdPassageiros;
    private int linhaEmOperacao;
    
//*******CONSTRUTORES********//
    public Veiculo(String tipo, int id, int qntdPassageiros) {
        this.tipo = tipo;
        this.id = id;
        this.qntdPassageiros = qntdPassageiros;
    }
    
//********GETS&SETTERS********//
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQntdPassageiros() {
        return qntdPassageiros;
    }

    public void setQntdPassageiros(int qntdPassageiros) {
        this.qntdPassageiros = qntdPassageiros;
    }
    
    public int getLinhaEmOperacao() {
		return linhaEmOperacao;
	}

	public void setLinhaEmOperacao(int linhaEmOperacao) {
		this.linhaEmOperacao = linhaEmOperacao;
	}

	//********METODOS********//
    public void cobraPassagem(ArrayList<BilheteUnico> bilhete, ArrayList<Linha> linha) {
    	int codigoLinha, flagLinha, flagBilhete, aux1, aux2;
        double codigoBilhete;
        
        Scanner input = new Scanner(System.in);
        
        System.out.printf("%nDigite o codigo da Linha.%n");
		codigoLinha = input.nextInt();
		
		for (aux1 = 0; aux1 < linha.size(); aux1++) {			
			if (codigoLinha == linha.get(aux1).getCodigo()) {

				flagLinha = 1;
				
				System.out.printf("%nDigite o codigo do bilhete.%n");
				codigoBilhete = input.nextDouble();

				for (aux2 = 0; aux2 < bilhete.size(); aux2++) {			
					if (codigoBilhete == bilhete.get(aux2).getCodigo()) {
						flagBilhete = 1;
						bilhete.get(aux2).setSaldo(bilhete.get(aux2).getSaldo() - linha.get(aux1).getTarifa());
					}
					else {
						System.out.printf("Bilhete nao encontrado!");
					}
				}
			}
			else {
				System.out.printf("Linha nao encontrada!");
			}
		}
	}
    
      public void registrarQtndPassageiros(int novaQtnd) {
        this.qntdPassageiros = novaQtnd;
      }
}