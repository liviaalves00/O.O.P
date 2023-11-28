import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> _contas;
    
    public Banco() {
        _contas = new ArrayList<Conta>();
    }
    
    public Conta getConta(String numero) {
        for (Conta conta : _contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }
    
    public Boolean adicionarConta(Conta conta) {
        if (getConta(conta.getNumero()) == null) {
            this._contas.add(conta);
            return true;
        }
        return false;
    }
    
    public Conta consultarConta(String numero) {
        Conta contaProcura = null;
        for (Conta conta : _contas) {
            if (conta.getNumero().equals(numero)) {
                contaProcura = conta;
                return contaProcura;
            }
        }
        return contaProcura;
    }
    
    public int consultarPorIndice(String numero) {
        for (int i = 0; i < _contas.size(); i++) {
            if (_contas.get(i).getNumero().equals(numero)) {
                return i;
            }
        }
        return -1;
    }
    public void alterarConta(Conta conta) {
        int indice = consultarPorIndice(conta.getNumero());
        if (indice != -1) {
            _contas.set(indice, conta);
        }
    }
    public void removerConta(String numero) {
        int indice = consultarPorIndice(numero);
        if (indice != -1) {
            _contas.remove(indice);
        }
    }
}


