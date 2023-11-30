package Models;
import Exceptions.ContaInexistenteException;
import Exceptions.PoupancaInvalidaException;
import Exceptions.ValorInvalidoException;

public class Banco {
    private Conta[] _contas;
    int indicie;

    public Banco() {
        this._contas = new Conta[10];
        this.indicie = 0;
    }
   
    public void inserir(Conta continha) {
        // Questao 13
        try {
            consultar(continha.getNumero()); // Consultar retorna ContaInexistente se não achar
            System.out.println("Conta já existe. Não pode ser registrada novamente.");
        
            // Eba, não achei uma conta igual, posso cadastrar essa continha
        } catch (ContaInexistenteException e) {
            this._contas[indicie] = continha;
            indicie++;
        }
    }
    public Conta consultar(String numero) throws ContaInexistenteException {
        for (Conta conta : this._contas) {
            if( conta == null ) continue;
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        throw new ContaInexistenteException("ERRO: Essa conta não existe!");
    }
    //Questao 9
    public int consultarIndicie(String numero) throws ContaInexistenteException {
        int pos = -1;
        
        for (int i = 0; i < this.indicie; i++) {
            pos = this._contas[i].getNumero().equals(numero) ? i : pos;
        }
        return pos;
       
    }
    //Questao 9
    public void alterar(Conta continha) throws ContaInexistenteException{
        int indice = consultarIndicie(continha.getNumero());
        this._contas[indice] = (indice != -1) ? continha : this._contas[indice];
        return;
    }
    public void excluir(String numero) throws ContaInexistenteException {
        int pos = consultarIndicie(numero);
        if (pos != -1) {
            for(int i = pos; i < this.indicie; i++) {
                this._contas[i] = this._contas[i+1];
            }
            this.indicie--;
        }
    }
    public void debitar(String numero, double valor) throws ContaInexistenteException, ValorInvalidoException{
        Conta continha = consultar(numero);
        if (continha != null) {
            continha.sacar(valor);
        }
        else {
            return ;
        }
    }
    //Questao 9
    public void transferir(String conta1, String conta2, double valor) throws ContaInexistenteException, ValorInvalidoException {
        Conta c1 = consultar(conta1);
        Conta c2 = consultar(conta2);
        c1.transferir(valor, c2);
    }
    //Questao 9
    public void depositar(String numero, double valor) throws ContaInexistenteException, ValorInvalidoException {
        Conta contaDepositar = consultar(null);
        contaDepositar.depositar(valor);

    }
    //Questao 9
    public void renderJuros(String numero) throws PoupancaInvalidaException, ContaInexistenteException, ValorInvalidoException{
        //Questao 12
        Conta conta = consultar(numero);
        if (conta instanceof Poupanca) {
            Poupanca poupanca = (Poupanca) conta;
            poupanca.renderJuros();
        } else {
            throw new PoupancaInvalidaException("Conta não é uma conta poupança.");
        }
    }

    // public static void main(String[] args) throws ContaInexistenteExeption, ValorInvalidoException {
   //Questao 4 o debitar com saldo insuficiente lança a exeção da classe conta no metodo sacar, onde trata de saques com valores inválidos/negativos
    // Questao 5 
   //     Banco b = new Banco();
    //     Conta c = new Conta("123", 0);
    //     Conta c2 = new Conta("234", 10);
    //     b.inserir(c);
    //     b.inserir(c2);
    //     c.transferir(20, c2);
    //     System.out.println(c.getSaldo());
    //     System.out.println(c2.getSaldo());
    //     b.transferir("123", "234", 20);
        // b.debitar(c.getNumero(), 100);
        // System.out.println(c.getSaldo());
       
        // b.excluir("123");
        // System.out.println(b.consultar("123"));
        
    // }

    // public void inserir(String numero, double saldo) {
    // }
    

}
