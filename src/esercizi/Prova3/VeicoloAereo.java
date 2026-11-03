package ripetizioni_java.Prova3;

public abstract class VeicoloAereo extends Veicolo {
    protected double altezzaMassima;

    public VeicoloAereo(double velocitaMassima, double altezzaMassima) {
        super(velocitaMassima);
        this.altezzaMassima = altezzaMassima;
    }
}

