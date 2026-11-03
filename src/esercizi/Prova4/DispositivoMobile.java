
pkg esercizi.Prova4;
public abstract class DispositivoMobile extends Dispositivo {
    private int capacitaBatteria;

    public DispositivoMobile(double prezzoBase, int capacitaBatteria) {
        super(prezzoBase);
        this.capacitaBatteria = capacitaBatteria;
    }

    public int getCapacitaBatteria() {
        return this.capacitaBatteria;
    }
}