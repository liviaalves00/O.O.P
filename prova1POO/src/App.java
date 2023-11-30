import Exceptions.ContaInexistenteException;
import Exceptions.ValorInvalidoException;
import Models.Banco;
import Models.Conta;
import Utils.IO;

public class App {
    Banco banco = new Banco();

    public String menu() {
        return ("Selecione uma opção:" + "1 - Cadastrar\t 2 - Consultar\t 3 - sacar" + 
        "\n4 - 4 - Depositar\t 5 - Transferir\t 6 - Excluir\t 7 - Alterar" + 
        "\n0 - SAIR" + "\n");
        
    }
    // o exception da conta retorna a q13
    void inserirConta(){
        String numero = IO.getString("Digite o número da conta: ");
        double saldo = IO.getDouble("Digite o saldo da conta: ");
        Conta conta;
        try{

            conta = new Conta(numero, saldo);

        } catch(ValorInvalidoException e){
            System.out.println("O saldo da conta deve ser positivo! ");
            return;
        }
        
        banco.inserir(conta);
    }

    
    void consultarConta(){
        String numero = IO.getString("Digite o número da conta: ");
        Conta conta;
        try {
            conta = banco.consultar(numero);
        } catch (ContaInexistenteException e) {
            IO.println("Conta não existe, meu parceiro...");
            return;
        }
       
        IO.println(conta.toString());
    }

    void sacarConta(){
        String numero = IO.getString("Digite o número da conta: ");
        Conta conta;
        try {
            conta = banco.consultar(numero);
        } catch (ContaInexistenteException e) {
            IO.println("Essa conta não existe!");
            return;
        }
        double valor = IO.getDouble("Digite o valor a ser sacado: ");

        try {
            conta.sacar(valor);
            IO.println("Saque realizado com sucesso");
        } catch (ValorInvalidoException e) {
            IO.println(e.getMessage());
        }
    }

    void depositarConta(){
        String numero = IO.getString("Digite o número da conta: ");
        Conta conta;
        try {
            conta = banco.consultar(numero);
        } catch (ContaInexistenteException e) {
            IO.println("Essa conta não existe!");
            return;
        }
        
        double valor = IO.getDouble("Digite o valor a ser depositado: ");
        
        try {
            conta.depositar(valor);
            IO.println("Depósito realizado com sucesso");
        } catch (ValorInvalidoException e) {
            IO.println(e.getMessage());
        }
       
    }
    void transferirConta(){
        String numero = IO.getString("Digite o número da conta: ");
        Conta conta;
        try {
            conta = banco.consultar(numero);
        } catch (ContaInexistenteException e) {
            IO.println("Essa conta não existe!");
            return;
        }
        double valor = IO.getDouble("Digite o valor a ser transferido: ");
        try {
            conta.transferir(valor, conta);
            IO.println("Transferência realizada com sucesso");
        } catch (ValorInvalidoException e) {
            IO.println(e.getMessage());
        }
    }

    void excluirConta(){
        String numero = IO.getString("Digite o número da conta: ");
        Conta conta;
        try {
            conta = banco.consultar(numero);
            banco.excluir(numero);
            IO.println("Conta excluída com sucesso");
        } catch (ContaInexistenteException e) {
            IO.println("Essa conta não existe!");
            return;
        }
    }
    void alterarConta(){
        String numero = IO.getString("Digite o número da conta: ");
        Conta conta;
        try {
            conta = banco.consultar(numero);
            // Só nas manha
        } catch (ContaInexistenteException e) {
           IO.println("Essa conta não existe!");
           return;
        }

        double valor = IO.getDouble("Digite o valor a ser alterado: ");
        conta.alterar(valor);
        IO.println("Alteração realizada com sucesso");
    }
    //Questao 14
    public void run() {
        int opcao = -1;
        
        do {
            //Questao 15
            try {
            opcao = IO.getInt(menu());
            switch (opcao) {
                case 1:
                //opcao inserir
                    inserirConta();
                    break;
                case 2:
                //opcao consultar
                    consultarConta();
                    break;
                case 3:
                //opcao sacar
                    sacarConta();
                    break;
                case 4:
                //opcao depositar
                    depositarConta();
                    break;
                case 5:
                //opcao transferir
                    transferirConta();
                    break;
                case 6:
                //opcao excluir
                    excluirConta();
                    break;
                case 7:
                //opcao alterar
                    alterarConta();
                    break;
                default:
                    break;
            } 
        }catch( NumberFormatException e) {
            IO.println("Insira um valor válido!");
        }

    } while (opcao !=0);
    IO.closeScanner();
    
    }
}