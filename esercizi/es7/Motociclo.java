package esercizi.es7;

public class Motociclo extends Veicolo {
    private int cilindrata;

    public Motociclo(String targa, int annoImmatricolazione, double kmTotali, int cilindrata) {
        super(targa, annoImmatricolazione, kmTotali);
        this.cilindrata = cilindrata;
    }

    @Override
    public double getCostoManutenzione() {
        return 100.0 + (this.cilindrata * 0.1);
    }

    public int getCilindrata() { return cilindrata; }
}
