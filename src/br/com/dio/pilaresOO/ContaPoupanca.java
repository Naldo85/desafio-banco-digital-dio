package br.com.dio.pilaresOO;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println(" \nEXTRATO CONTA POUPANCA ");
        super.imprimirInfoComuns();
    }

}
