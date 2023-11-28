class Conta {
    private String _numero;
    private double _saldo;
    public Conta(String numero, double saldo) {
        _numero = numero;
        _saldo = saldo;
    }
    public String getNumero() {
        return _numero;
    }
    public void setNumero(String numero) {
        _numero = numero;
    }
    public double getSaldo() {
        return _saldo;
    }
    public void setSaldo(double saldo) {
        _saldo = saldo;
    }
    public Boolean sacar(double valor) {
        if (this._saldo >= valor) {
            this._saldo -= valor;
            return true;
        }
        return false;
    }
    public void  depositar(double valor) {
        this._saldo += valor;
    }
    public double consultarSaldo() {
        return this._saldo;
    }
    public Boolean transferir(Conta conta, double valor) {
        if (this.sacar(valor)) {
            conta.depositar(valor);
            return true;
        }
        return false;
    }

}
