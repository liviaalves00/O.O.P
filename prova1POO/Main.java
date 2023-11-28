public class TestesMetodos {
    public static void main(String[] args) {    
        Banco banco = new Banco();
        Conta conta = new Conta("123", 100);
        Conta cona2 = new Conta("123", 100);
        banco.adicionarConta(conta);
        banco.adicionarConta(cona2);
        System.out.println(conta.transferir(cona2, 50));
        System.out.println(conta.getSaldo());
        System.out.println(cona2.getSaldo());
       
        
    }
    
}
