public class CPoupanca extends Conta {
    private double _taxaJuros;
    public CPoupanca(String numero, double saldo, double taxaJuros) {
        super(numero, saldo);
        _taxaJuros = taxaJuros;
    }
    public double getTaxaJuros() {
        return _taxaJuros;
    }
    public void setTaxaJuros(double taxaJuros) {
        _taxaJuros = taxaJuros;
    }
    public void renderJuros() {
        this.depositar(this.getSaldo() * (this._taxaJuros / 100));
    }
    
}
