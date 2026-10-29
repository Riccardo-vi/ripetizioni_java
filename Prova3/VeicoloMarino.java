package ripetizioni_java.Prova3;

public abstract class VeicoloMarino extends Veicolo {
    protected double capacitaGalleggiamento;

    public VeicoloMarino(double velocitaMassima, double capacitaGalleggiamento) {
        super(velocitaMassima);
        this.capacitaGalleggiamento = capacitaGalleggiamento;
    }
}
