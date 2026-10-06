package src.esercizi.es7;

public abstract class Veicolo {
    private String targa;
    private int annoImmatricolazione;
    private double kmTotali;

    public Veicolo(String targa, int annoImmatricolazione, double kmTotali) {
        this.targa = targa;
        this.annoImmatricolazione = annoImmatricolazione;
        this.kmTotali = kmTotali;
    }

    // Metodo astratto: obbliga le sottoclassi a implementare il calcolo del costo
    public abstract double getCostoManutenzione();

    // Getter comuni
    public String getTarga() { return targa; }
    public int getAnnoImmatricolazione() { return annoImmatricolazione; }
    public double getKmTotali() { return kmTotali; }
}