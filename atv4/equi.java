public class equi {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento();
        
        equipamento.liga();
        equipamento.liga();
        System.out.println(equipamento.estaLigado());
        equipamento.desliga();
        System.out.println(equipamento.estaLigado());
        equipamento.desliga();
        System.out.println(equipamento.estaLigado());
        equipamento.inverte();
        System.out.println(equipamento.estaLigado());
    }
}

class Equipamento {
    private boolean ligado;

    public Equipamento() {
        this.ligado = false;
    }

    public void liga() {
        if (!ligado) {
            ligado = true;
            System.out.println("Equipamento ligado.");
        }
    }

    public void desliga() {
        if (ligado) {
            ligado = false;
            System.out.println("Equipamento desligado.");
        }
    }

    public void inverte() {
        ligado = !ligado;
        if (ligado) {
            System.out.println("Equipamento ligado.");
        } else {
            System.out.println("Equipamento desligado.");
        }
    }

    public boolean estaLigado() {
        return ligado;
    }
}
