pkg esercizi.Prova4;

public abstract class DispositivoFisso extends Dispositivo {
    private int consumoEnergetico;

    public DispositivoFisso(double prezzoBase, int consumoEnergetico) {
        super(prezzoBase);
        this.consumoEnergetico = consumoEnergetico;
    }

    public int getConsumoEnergetico() {
        return this.consumoEnergetico;
    }
}