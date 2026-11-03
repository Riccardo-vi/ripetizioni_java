package ripetizioni_java.Prova3;

public class Auto extends VeicoloTerrestre {
    private String modello;
    private String colore;
    private int numeroPosti;

    public Auto(double velocitaMassima, int numeroRuote, String modello) {
        super(velocitaMassima, numeroRuote);
        this.modello = modello;
    }

    public void suonaClacson() {
        System.out.println("Bip Bip! Suono il clacson del modello " + modello);
    }

    public void accendiLuci() {
        System.out.println("Luci accese per l'auto " + modello);
    }

    public void setNumeroPosti(int numeroPosti) {
        if (numeroPosti <= 0) {
            throw new IllegalArgumentException("Il numero di posti deve essere maggiore di 0.");
        }
        this.numeroPosti = numeroPosti;
    }

    public void setColor(String colore) {
        if (colore == null || colore.trim().isEmpty()) {
            throw new IllegalArgumentException("Il colore non può essere nullo o vuoto.");
        }
        this.colore = colore;
    }

    @Override
    public void accelerare(double incremento) {
        this.velocitaAttuale += incremento;
        if (this.velocitaAttuale > this.velocitaMassima) this.velocitaAttuale = this.velocitaMassima;
    }

    @Override
    public void decelerare(double decremento) {
        this.velocitaAttuale -= decremento;
        if (this.velocitaAttuale < 0) this.velocitaAttuale = 0;
    }
}
