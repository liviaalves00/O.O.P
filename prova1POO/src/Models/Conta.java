package Models;
import Exceptions.ValorInvalidoException;

public class Conta {
    private String _numero;
    private double _saldo;
    //Questao 6
    public Conta(String numero, double saldo) throws ValorInvalidoException {
        this._numero = numero;
        //Questao 10
        depositar(saldo);
    }
    public String getNumero() {
        return this._numero;
    }
    public void setNumero(String numero) {
        this._numero = numero;
    }
    public double getSaldo() {
        return this._saldo;
    }
    public void setSaldo(double saldo) {
        this._saldo = saldo;
    }
    
    //Questao 3 da atividade: tratar saques negativos/inválidos usando exeção
    public void sacar(double valor) throws ValorInvalidoException {
        if (this._saldo < valor) {
            throw new RuntimeException("Saldo insuficiente");
        }
        this._saldo -= valor;
    }
    public void depositar(double valor) throws ValorInvalidoException {
        //Questao 10
        if (valor < 0) {
            throw new ValorInvalidoException("Valor inválido");
        }
        this._saldo += valor;
    }
    //ignorar esta função
    // public void depositarEntreContas(String conta1, String conta2, double valor) throws ValorInvalidoException { 
    //     if (valor < 0) {
    //         throw new ValorInvalidoException("Valor inválido");
    //     }
    //     Conta c1 = consultar(conta1);
    //     Conta c2 = consultar(conta2);
    //     if (c1 != null && c2 != null) {
    //         if (c1.getSaldo() >= c2.getSaldo()) {
    //             c2.transferir(valor, c1);
                
    //         }
    //         else {
    //             c1.transferir(valor, c2);
    //         }
    //     }
    
    //     this._saldo += valor;
    // }

    public void transferir(double valor, Conta contaDestino) throws ValorInvalidoException {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public double consultarSaldo() {
        return getSaldo();
    }
   //Questao 4 de testes de contas antes dos tratamentos

    // public static void main(String[] args) {
    //     Conta conta = new Conta("123", 0);
    //     // conta.depositarEntreContas("123", "234", 0);
    //     System.out.println(conta.consultarSaldo());
    //     // conta.sacar(300);
    //     // System.out.println(conta.consultarSaldo());
    //     // Conta c2 = new Conta("234", 100);
        
    //     // conta.transferir(100, c2);
    //     // System.out.println(conta.consultarSaldo());
    //     // System.out.println(c2.consultarSaldo());

    // }
    @Override
    public String toString() {
        return String.format("========\nConta: %s\nSaldo: R$%.2f\n========", getNumero(), getSaldo());
    }




    public void alterar(double valor) {
        
    }
  
}
