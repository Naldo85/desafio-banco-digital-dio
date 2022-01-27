package br.com.dio.pilaresOO;

public class ContaCorrente extends Conta{

    @Override
    public void imprimirExtrato() {
        System.out.println(" \nEXTRATO CONTA CORRENTE ");
        super.imprimirInfoComuns();
    }

}
