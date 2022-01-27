package br.com.dio.pilaresOO;

public class Main {

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        cc.depositar(500);
        cc.transferir(190, cp);
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

