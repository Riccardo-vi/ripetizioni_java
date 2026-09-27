package esercizi.es7;

public class Furgone extends Veicolo {
    private double portataMassimaKg;

    public Furgone(String targa, int annoImmatricolazione, double kmTotali, double portataMassimaKg) {
        super(targa, annoImmatricolazione, kmTotali);
        this.portataMassimaKg = portataMassimaKg;
    }

    @Override
    public double getCostoManutenzione() {
        return 200.0 + (this.portataMassimaKg * 0.05);
    }

    public double getPortataMassimaKg() { return portataMassimaKg; }
}