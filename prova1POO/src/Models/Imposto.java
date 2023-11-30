package Models;

import Exceptions.ValorInvalidoException;

public class Imposto extends Conta {
    private double _taxaImposto;

    public Imposto(String numero, double saldo, double taxaImposto) throws ValorInvalidoException {
        super(numero, saldo);
        this._taxaImposto = taxaImposto;
    }

    public double getTaxaImposto() {
        return this._taxaImposto;
    }

    public void setTaxaImposto(double taxaImposto) {
        this._taxaImposto = taxaImposto;
    }

    public void debitar(double valor) throws ValorInvalidoException {
        double valorComImposto = valor + (valor * this._taxaImposto);
        this.sacar(valorComImposto);
    }
    
}
