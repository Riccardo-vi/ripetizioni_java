package ripetizioni_java.Prova3;

public abstract class Veicolo {
    protected double velocitaMassima;
    protected double velocitaAttuale;

    public Veicolo(double velocitaMassima) {
        this.velocitaMassima = velocitaMassima;
        this.velocitaAttuale = 0;
    }

    public double getVelocitaMassima() {
        return velocitaMassima;
    }

    // Metodi astratti per la gestione della velocità da implementare nelle sottoclassi
    public abstract void accelerare(double incremento);
    public abstract void decelerare(double decremento);
}