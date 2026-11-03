package ripetizioni_java.Prova3;

public abstract class VeicoloTerrestre extends Veicolo {
    protected int numeroRuote;

    public VeicoloTerrestre(double velocitaMassima, int numeroRuote) {
        super(velocitaMassima);
        this.numeroRuote = numeroRuote;
    }
}
