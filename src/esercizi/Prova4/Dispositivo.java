package esercizi.Prova4;

public abstract class Dispositivo {
    private double prezzoBase;

    public Dispositivo(double prezzoBase) {
        this.setPrezzoBase(prezzoBase);
    }

    public void accendere() {
        System.out.println("Il dispositivo si sta accendendo...");
    }

    public void spegnere() {
        System.out.println("Il dispositivo si sta spegnendo...");
    }

    public double getPrezzoBase() {
        return this.prezzoBase;
    }

    public void setPrezzoBase(double prezzo) {
        if (prezzo < 0) {
            throw new IllegalArgumentException("Il prezzo base non può essere negativo.");
        }
        this.prezzoBase = prezzo;
    }
}