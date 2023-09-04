// class Conta {
// numero: String;
// saldo: number;

// constructor(numero: String, saldo: number) {
//     this.numero = numero
//     this.saldo = saldo
// }

// sacar(valor: number): void {
// this.saldo = this.saldo - valor;
// }

// depositar(valor: number): void {
// this.saldo = this.saldo + valor;
// }

// consultarSaldo(): number {
// return this.saldo;
// }

// transferir(contaDestino: Conta, valor: number): void {
// this.sacar(valor);
// contaDestino.depositar(valor);
// }

// }

// let c1: Conta = new Conta("1",100);
// let c2: Conta = new Conta("2",100);
// let c3: Conta;
// c1 = c2; 
// c3 = c1; 
// c1.sacar(10); 
// c1.transferir(c2,50);
// console.log(c1.consultarSaldo());//90
// console.log(c2.consultarSaldo());//90
// console.log(c3.consultarSaldo());//90

public class conta {
    public static void main(String[] args) {
        Conta conta1 = new Conta("1", 100);
        Conta conta2 = new Conta("2", 100);
        Conta conta3 = new Conta("3", 100);
        conta1 = conta2;
        conta3 = conta1;
        conta1.sacar(10);
        conta1.transferir(conta2,50);
        System.out.println(conta1.consultarSaldo());
        System.out.println(conta2.consultarSaldo());
        System.out.println(conta3.consultarSaldo());
        
    }
}

class Conta {
    private String numero;
    private double saldo;
    
    public Conta(String numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }
    
    public boolean sacar(double valor) {
        if (valor > saldo) {
            return false;
        } return true;
        
    }
    
    public void depositar(double valor) {
        saldo = saldo + valor;
        
    }
    
    public double consultarSaldo() {
        return saldo;
    }
    
    public  boolean transferir(Conta destino, double valor) {
        if (sacar(valor)) {
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}