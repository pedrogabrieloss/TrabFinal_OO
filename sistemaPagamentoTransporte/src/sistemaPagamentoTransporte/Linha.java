package sistemaPagamentoTransporte;

import java.util.*;

public class Linha {
	
	//************** ATRIBUTOS **************//
    private int codigo;
    private ArrayList<Integer> trajeto;
    private String empresasAutorizadas;
    private int qntdPassageiros;
    private double tarifa;
    

    //************** CONSTRUTORES **************//
    Linha(int codigo, ArrayList<Integer> trajeto, String empresasAutorizadas, int qntdPassageiros, double tarifa) {
        this.codigo = codigo;
        this.trajeto = trajeto;
        this.empresasAutorizadas = empresasAutorizadas;
        this.qntdPassageiros = qntdPassageiros;
        this.tarifa = tarifa;
    }

    
    //************** SETTERS E GETTERS **************//
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setTrajeto(ArrayList<Integer> trajeto) {
        this.trajeto = trajeto;
    }

    public void setEmpresasAutorizadas(String empresasAutorizadas) {
        this.empresasAutorizadas = empresasAutorizadas;
    }

    public void setQntdPassageirps(int qntdPassageiros) {
        this.qntdPassageiros = qntdPassageiros;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Integer> getTrajeto() {
        return trajeto;
    }

    public String getEmpresasAutorizadas() {
        return empresasAutorizadas;
    }

    public int getQntdPassageiros() {
        return qntdPassageiros;
    }

    public double getTarifa() {
        return tarifa;
    }
    //************** METODOS **************//
    void status() {
        System.out.println("codigo" + this.codigo);
        System.out.println("trajeto" + this.trajeto);
        System.out.println("empresasAutorizadas" + this.empresasAutorizadas);
        System.out.println("qntdPassageiros" + this.qntdPassageiros);
        System.out.println("tarifa" + this.tarifa);
    }

}
