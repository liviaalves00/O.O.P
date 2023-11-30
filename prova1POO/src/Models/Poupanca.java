package Models;

import Exceptions.ValorInvalidoException;

public class Poupanca extends Conta {
    private double _taxaPoupanca;

    public Poupanca(String numero, double saldo, double taxaPoupanca) throws ValorInvalidoException {
        super(numero, saldo);
        this._taxaPoupanca = taxaPoupanca;
    }

    public double getTaxaPoupanca() {
        return this._taxaPoupanca;
    }
    public void setTaxaPoupanca(double taxaPoupanca) {
        this._taxaPoupanca = taxaPoupanca;
    }

    public void renderJuros() throws ValorInvalidoException {
        double valorComJuros = this.getSaldo() + (this.getSaldo() * this._taxaPoupanca);
        this.depositar(valorComJuros);
    }
    
}
