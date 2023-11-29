public class CImposto extends Conta {
    private double _taxaDesconto;
    public CImposto(String numero, double saldo, double taxaDesconto) {
        super(numero, saldo);
        _taxaDesconto = taxaDesconto;
    }
    public double getTaxaDesconto() {
        return _taxaDesconto;
    }
    public void setTaxaDesconto(double taxaDesconto) {
        _taxaDesconto = taxaDesconto;
    }
    public void debitar(double valor) {
        double saldo = getSaldo();
        if (saldo >= valor) {
            saldo -= valor;
            saldo -= valor * _taxaDesconto;
            setSaldo(saldo);
        }
    }
    
}
