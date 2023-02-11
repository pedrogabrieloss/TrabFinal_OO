package com.mycompany.mavenproject1;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.System.Logger;
import static java.lang.System.getLogger;
import java.util.Scanner;
import java.util.logging.Level;
import javax.lang.model.SourceVersion;

public class Mavenproject1 {
	private static String endereço;
    private static int contato;
    private static String email;
    private static String nome;
    private static int horario;
    private static int codigo;
    private static String empresa;
    private static double tarifa;
    private static String Embarque;
    private static String Desembarque;
    private static String trajeto;
    private static String empresasAutorizadas;
    private static String qntsPassageiros;
    private static int Cpf;
    private static int dataDeNascimento;
    private static double saldo;
    private static String tipo;
    private static String status;
    public static void main (String[] arg) {
        
        
        Scanner leitura = new Scanner(System.in);
        -------------------------------------------------------------------------------
        Pessoa c1 = new Pessoa();
        System.out.print("Digite seu nome: ");
        nome = leitura.nextLine();
        
        System.out.print("Digite seu endereço: ");
        endereço = leitura.nextLine();
        
        System.out.print("Digite seu contato: ");
        contato = leitura.nextInt();
        
        System.out.print("Digite seu email: ");
        email = leitura.nextLine(); 
        
        System.out.printf(pessoa.get().getNome(), pessoa.get().getContato(), pessoa.get().getEmail(), pessoa.get().getEndereço);
        
        ----------------------------------------------------------------------------------------------
        
        Corrida c1 = new Corrida();
        
        System.out.print("Horario");
        horario = leitura.nextInt();
        
        System.out.print("codigo");
        codigo = leitura.nextInt();
        
        System.out.print("empresa");
        empresa = leitura.nextLine();
        
        System.out.print("tarifa");
        tarifa = leitura.nextDouble();
        
        System.out.print("LocalDeEmbarque");
        Embarque = leitura.nextLine();
        
        System.out.print("LocalDeDesmbarque");
        Desembarque = leitura.nextLine();
        
        ------------------------------------------------------------------------------------------
        Linha c1 = new Linha();
        
        System.out.print("codigo");
        codigo = leitura.nextInt();
        
        System.out.print("trajeto");
        trajeto = leitura.nextLine();
        
        System.out.print("Empresas Autorizadas");
        empresasAutorizadas = leitura.nextLine();
        
        System.out.print("qntdPassageiros");
        qntsPassageiros = leitura.nextInt();
        
         System.out.print("tarifa");
        tarifa = leitura.nextDouble();
        
        ---------------------------------------------------------------
        Usuario c1 = new Usuario();
        
        System.out.print("Digite o Cpf");
        Cpf = leitura.nextInt();
        
        System.out.print(" digite data De Nascimento");
        dataDeNascimento = leitura.nextInt();
        --------------------------------------------------------------------
        Bilhete c1 = new Bilhete();
        
        System.out.print("codigo");
        codigo = (int) leitura.nextDouble();
        
        System.out.print("saldo");
        saldo = leitura.nextDouble();
        
        System.out.print("tipo");
        tipo = leitura.nextLine();
        
        System.out.print("status");
        status = leitura.nextLine();
        
        
        
    }

    public Mavenproject1() {
    }
}
